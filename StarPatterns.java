import java.util.*;
public class StarPatterns {
    public static void printpattern(int n) {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++);
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int n=4;
        printpattern(n);
    }
}
