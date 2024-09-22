import java.util.Scanner;

public class sumarray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;
        for(int x:A)
        {
            sum=sum+x;
        }
        System.out.println("sum is "+sum);
    }
    
}
