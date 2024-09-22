

public class copyarray {
    public static void main(String[] args) {
        int A[]={4,2,7,9,2};
        int B[]=new int[A.length];
            for(int i=0;i<A.length;i++)
            {
                B[i]=A[i];
            }

            System.out.println("Element of A[] ");
            for(int i=0;i<A.length;i++)
            System.out.println(A[i]+"");

            System.out.println("Copy Element B[] ");
            for(int i=0;i<B.length;i++)
            System.out.println(B[i]+"");
        }
    }
