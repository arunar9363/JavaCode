public class Multiplying2dArray {
    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};

        int c[][]=new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]=c[i][j]+a[i][j]*b[i][j];
                }
            }
        }
        for( int x[]:c)
        {
            for(int y:x)
           {
            System.out.print(y+" ");
           }
           System.out.println("");
        }
    }
    
}
