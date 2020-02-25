package by.tr.mod2;

public class Number16 {
    public static void main (String [] args){
        int y = 1;
        double mul = 1;
        for (int i = 2; i <= 10; i++){
            y = y + i;
            mul *= y;
        }
        System.out.println(mul);
    }
}
