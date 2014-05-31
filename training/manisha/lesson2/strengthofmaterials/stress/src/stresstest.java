import java.util.Scanner;

public class stresstest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("P = ");
        float P = scan.nextFloat();
        
        System.out.print("A = ");
        float A = scan.nextFloat();
   
        float stress = P/A;
   
        System.out.println("Your stress is "+ stress);
    }
}
