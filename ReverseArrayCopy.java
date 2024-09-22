class reverseArray{
    public void reverse(int[] A)
    {
        for(int i=0,j=A.length-1;i<j;i++,j--)
        {
            int temp=A[j];
            A[j]=A[i];
            A[i]=temp;
        }
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+"");
    }
}
class reverse2{
    public void reverse2(int[] A,int[] B)
    {
        for(int i=0;i<A.length;i++)
            {
                B[i]=A[i];
            }
            System.out.println("Element of A[] ");
            for(int i=0;i<A.length;i++)
            System.out.print(A[i]+"");

            System.out.println("Copy Element B[] ");
            for(int i=A.length-1,j=0;i>=0;i--,j++)
            System.out.print(B[i]+"");
    }
}
public class ReverseArrayCopy {
    public static void main(String[] args) {
        int A[]={4,2,7,9,2};
        int B[]=new int[A.length];
        reverseArray rev=new reverseArray();
        rev.reverse(A);
        reverse2 rev2=new reverse2();
        rev2.reverse2(A, B);
    }
}
