package by.tr.mod2;

public class Number13 {
    public static void main(String [] args){
      //  int a, b, max;
        double a,b,max;
        max = 0;
        a = 96;
        b = a;
        System.out.println("Цифры, входящие в состав первого числа:");
        do {
            if (max < b % 10){
                max = b % 10;
            }
            b = (b -b % 10) / 10;
        }
        while (b/10 != 0);
        System.out.println("Наибольшая цифра натурального числа "+ a + " равна "+max);
    }
}
