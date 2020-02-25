package by.tr.mod2;

public class Number9 {
    public static void main (String [] args){
        double a,b,c;
        a = 2;
        b = -3;
        c = 0;
        if (a >= 0){
            System.out.println("Квадрат неотрицательного числа a равен "+ Math.pow(a,2));
        }
        else
            System.out.println("Четвертая степень отрицательного числа a равна "+ Math.pow(a,4));
        if (b >= 0){
            System.out.println("Квадрат неотрицательного числа b равен "+ Math.pow(b,2));
        }
        else
            System.out.println("Четвертая степень отрицательного числа b равна "+ Math.pow(b,4));
        if (c >= 0){
            System.out.println("Квадрат неотрицательного числа c равен "+ Math.pow(c,2));
        }
        else
            System.out.println("Четвертая степень отрицательного числа c равна "+ Math.pow(c,4));
    }
}
