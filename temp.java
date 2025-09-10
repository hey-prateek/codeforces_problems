import java.util.*;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            
            long totalCakes = 0;
            
            if (m <= 2 * n) {
                // For small m, a direct simulation is fast enough.
                long[] lastCollected = new long[n];
                long[] cakes = new long[n];
                for (int time = 1; time <= m; time++) {
                    long maxCakes = 0;
                    int maxIndex = -1;
                    for (int i = 0; i < n; i++) {
                        cakes[i] = a[i] * (time - lastCollected[i]);
                        if (cakes[i] > maxCakes) {
                            maxCakes = cakes[i];
                            maxIndex = i;
                        }
                    }
                    totalCakes += maxCakes;
                    if (maxIndex != -1) {
                        lastCollected[maxIndex] = time;
                    }
                }
            } else {
                // For large m, we simulate for a fixed number of steps
                // to find a stable state, then use a mathematical approach
                // to sum the rest.
                int simulationSteps = Math.min(2 * n, (int)m);
                long[] lastCollected = new long[n];
                long[] cakes = new long[n];
                for (int time = 1; time <= simulationSteps; time++) {
                    long maxCakes = 0;
                    int maxIndex = -1;
                    for (int i = 0; i < n; i++) {
                        cakes[i] = a[i] * (time - lastCollected[i]);
                        if (cakes[i] > maxCakes) {
                            maxCakes = cakes[i];
                            maxIndex = i;
                        }
                    }
                    totalCakes += maxCakes;
                    if (maxIndex != -1) {
                        lastCollected[maxIndex] = time;
                    }
                }

                long remainingM = m - simulationSteps;
                if (remainingM <= 0) {
                    System.out.println(totalCakes);
                    continue;
                }
                
                // Represent the cakes as a set of linear functions of time: y = a_i * t - a_i * lastCollected_i
                // We need to sum the maximum of these functions over the remaining time.
                // This is the sum of the upper envelope of the lines.
                // The slopes are a_i, which are sorted.
                // We can use the Convex Hull Trick.
                
                List<Line> lines = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    lines.add(new Line(a[i], -a[i] * lastCollected[i]));
                }
                
                // Sort lines by slope (descending)
                lines.sort((l1, l2) -> Long.compare(l2.a, l1.a));
                
                List<Line> upperEnvelope = new ArrayList<>();
                for (Line newLine : lines) {
                    while (upperEnvelope.size() >= 2) {
                        Line lastLine = upperEnvelope.get(upperEnvelope.size() - 1);
                        Line secondLastLine = upperEnvelope.get(upperEnvelope.size() - 2);
                        // Check if the intersection of secondLastLine and lastLine is after
                        // the intersection of secondLastLine and newLine
                        // (y1 - y2)/(x2 - x1)
                        if (intersectionX(secondLastLine, lastLine) >= intersectionX(secondLastLine, newLine)) {
                            upperEnvelope.remove(upperEnvelope.size() - 1);
                        } else {
                            break;
                        }
                    }
                    upperEnvelope.add(newLine);
                }

                long currentTime = simulationSteps;
                for (int i = 0; i < upperEnvelope.size() - 1; i++) {
                    Line line1 = upperEnvelope.get(i);
                    Line line2 = upperEnvelope.get(i + 1);
                    
                    long intersectionTime = intersectionX(line1, line2);
                    if (intersectionTime <= currentTime) {
                        continue;
                    }
                    
                    long endTime = Math.min(intersectionTime - 1, m);
                    long start = currentTime + 1;
                    
                    if (start <= endTime) {
                        long numTerms = endTime - start + 1;
                        long sumOfTimes = (start + endTime) * numTerms / 2;
                        totalCakes += line1.a * sumOfTimes + line1.b * numTerms;
                    }
                    currentTime = endTime;
                    if (currentTime >= m) {
                        break;
                    }
                }
                
                if (currentTime < m) {
                    Line lastLine = upperEnvelope.get(upperEnvelope.size() - 1);
                    long start = currentTime + 1;
                    long end = m;
                    long numTerms = end - start + 1;
                    long sumOfTimes = (start + end) * numTerms / 2;
                    totalCakes += lastLine.a * sumOfTimes + lastLine.b * numTerms;
                }
            }
            
            System.out.println(totalCakes);
        }
    }
    
    static class Line {
        long a, b;
        Line(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }
    
    // Calculates the x-coordinate of the intersection of two lines
    private static long intersectionX(Line l1, Line l2) {
        long numerator = l2.b - l1.b;
        long denominator = l1.a - l2.a;
        return numerator / denominator;
    }
}