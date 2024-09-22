import java.util.*;
public class deletingarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A[]=new int[10];
            A[0]=5;
            A[1]=9;
            A[2]=6;
            A[3]=10;
            A[4]=12;
            A[5]=6;
            int n=6;
            
            for(int i=0;i<n;i++)
            System.out.print(A[i]+",");

            System.out.println("Enter the pos");
            int pos=sc.nextInt();
            int temp=A[pos];
            for(int i=pos+1;i<n;i++)
            {
               A[i-1]=A[i];
            }
            n--;
            for(int i=0;i<n;i++)
             System.out.print(A[i]+",");
        }
    
    }
    
}
