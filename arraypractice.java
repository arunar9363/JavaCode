public class arraypractice {
    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        int C[];
        C=new int[10];

        B[2]=15;
        for (int element : B) {
            System.out.println(element);
        }
    }
    
}

