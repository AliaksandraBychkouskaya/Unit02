package by.tr.mod2;

public class Number4 {
    public static void main (String [] args){
        double a,b,c,x,y;
        a = 1;
        b = -20;
        c = 3;
        x = 4;
        y = a*x*x + b*x + c;
        if (y >= 0)
            System.out.println(y);
        else
            System.out.println(-y);
    }
}
