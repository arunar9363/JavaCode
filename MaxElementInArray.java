public class  MaxElementInArray{
    static int arr[]={4,2,6,9,8,11,66,33,45,};
    static int largest(){
        int i;
        int max=arr[0];
        for (i = 1; i < arr.length; i++) 
        if (arr[i] > max) 
            max = arr[i]; 
            
        return max; 
    } 
     
    public static void main(String[] args) 
    { 
        System.out.println("Largest in given array is " + largest()); 
    }
}