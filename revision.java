public class revision {
    //Adding two Dimentional Array

    public void Adding2DArray() {
    }
    public static void main(String[] var0){
        int[][] var1 = new int[][] {{123},{456},{789}};
        int[][] var2 = new int[][] {{123},{456},{789}};
        int[][] var3 = new int[3][3];

        for(int var4=0;var4<var1.length;++var4){
            for(int var5=0;var5<var1[0].length;++var5){
                var3[var4][var5]=var1[var4][var5]+var2[var4][var5];
                System.out.println(var3[var4][var5]+" ");
            }
            System.out.println();
        }
        }   
        
        
//
}
