
import java.util.Scanner;

public class triangleXORCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            long xValue = scanner.nextLong();
            long bestY = -1;
            
            for (long candidateY = xValue - 1; candidateY >= 1; candidateY--) {
                long zValue = xValue ^ candidateY;
                if (zValue > 0 && zValue < xValue && xValue + candidateY > zValue 
                    && xValue + zValue > candidateY && candidateY + zValue > xValue) {
                    bestY = candidateY;
                    break;  
                }
            }
            
            System.out.println(bestY);
        }
        
        scanner.close();
    }
}
