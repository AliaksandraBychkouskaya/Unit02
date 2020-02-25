package by.tr.mod2;

public class Number8 {
    public static void main(String [] args){
        double s1,s2;
        s1 = 3.5;
        s2 = 7.1;
        if (s1 == s2){
            System.out.println("Площади треугольников равны");
        }
        else {
            if (s1 < s2) {
                System.out.println("Площадь второго треугольника больше");
            }
            else {
                System.out.println("Площадь первого треугольника больше");
            }
        }
    }
}
