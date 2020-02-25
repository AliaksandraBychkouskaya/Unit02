package by.tr.mod2;

public class Number5 {
    public static void main(String [] args){
        double a,b,c;
        a = -3;
        b = 2;
        if (a == b){
            c = Math.pow(a,2);
        }
        else {
        if (a*a > b*b)
            c = Math.pow(b,2);

        else
            c = Math.pow(a,2);
        }
        System.out.println(c);
    }


}
