package by.tr.mod2;

public class Number7 {
    public static void main(String [] args){
        double r1,r2,x;
        r1 = 3.5;
        r2 = 7.1;
        if (r1 == r2){
            x = Math.PI * Math.pow(r1, 2) / 2;
            System.out.println("Площади кругов равны между собой и равны " + x);
        }
        else {
        if (r1 < r2) {
            x = Math.PI * Math.pow(r1, 2) / 2;
            System.out.println("Площадь первого круга меньше и равна " + x);
        }
        else {
            x = Math.PI * Math.pow(r2, 2) / 2;
            System.out.println("Площадь второго круга меньше и равна " + x);
        }
        }
    }
}
