import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Number:");
            int n=scanner.nextInt();

            for(int i=0;i<10;i++)
            {
                System.out.println(n+"*"+i+"="+(n*i));
            }
        }
    }
    
}
