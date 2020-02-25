package by.tr.mod2;

public class Number15 {
    public static void main(String [] args){
        int a = 223456780;
        int n = 0;
        do {
            int i = a % 10;
            if (i % 2 == 0)
                n++;
            a = (a -a % 10) / 10;
        }
        while (a != 0);
        System.out.println(n);
    }
}
