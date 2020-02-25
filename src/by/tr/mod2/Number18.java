package by.tr.mod2;

public class Number18 {
    public static void main (String [] args){
        double a,b,h;
        a = 1;
        b = 10;
        h = 0.5;
        for(int i = 0; i <= (b - a) / h; i++){
            double arg = a+i*h;
            double f = Math.pow(Math.sin(arg),2);
            System.out.println(arg +" "+ f);
        }
    }
}
