public class MathodeOverloading {
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static float max(byte x,byte y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        byte a=10,b=5;
        System.out.println(max(10,5));
    }
}
