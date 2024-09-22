import java.util.Scanner;
public class MilestoKilometer {
   public static void main(String[] args) {
    double Miles;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter Miles");
    Miles = in.nextDouble();
    double kilometer = Miles*1.6;

    System.out.println(kilometer + "kilometer");
   } 
    
}
