package by.tr.mod2;

public class Number04 {
    public static void main(String [] args){
        double x;
        x = 3;
        if (x <= -3){
            double f = 9;
            System.out.println(f);
        }
        else if (x >= 3){
            double f = 1 / (Math.pow(x,2)+1);
            System.out.println(f);
        }
        else {
            System.out.println("Function is undefined");
        }
    }
}
