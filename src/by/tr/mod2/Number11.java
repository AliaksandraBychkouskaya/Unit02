package by.tr.mod2;

public class Number11 {
    public static void main (String [] args){
        int a,b;
        a = 516704;
        b = 4301;
        int x, y, a2,b2;
        a2 = a;
        b2 = b;
        boolean flag = false;
        do {
            x = a2 % 10;
            a2 = (a2 -x) / 10;
            b2 = b;
            do {
                y = b2 % 10;
                b2 = (b2 -b2 % 10) / 10;
                if (x == y)
                {
                    System.out.println("Общая Цифра = "+ x);
                    flag = true;
                }
                // System.out.println(b/10);
            }
            while (b2 != 0);
        }
        while (a2 != 0);
        if (flag == false){
            System.out.println("Нет общих цифр");
        }
    }

}

