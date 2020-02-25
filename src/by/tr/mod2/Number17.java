package by.tr.mod2;

public class Number17 {
    public static void main (String [] args){
        int n = 4;
        double a = 0.5;
        double x = 1;
        for ( int i = 0; i < n; i++ )
        {
            x*=a+i;
        }
        System.out.println(x);
    }
}
