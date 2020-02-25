package by.tr.mod2;

public class Number03 {
    public static void main (String [] args){
        double a,b,h;
        a = 0;
        h = 0.5;
        b = 5;

        for(int i = 0; i <= (b - a) / h; i++){
            double arg = a+i*h;
            double f = 2 * Math.tan(arg / 2) + 1;
            System.out.println(arg +" "+ f);
        }
    }
}
