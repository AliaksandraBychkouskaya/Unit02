package by.tr.mod2;

public class Number10 {
    public static void main (String [] args){
        double a,b,c,d,min1,min2,max;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        if(a <= b)
            min1 = a;
        else
            min1 = b;
        if(c <= d)
            min2 = c;
        else
            min2 = d;
        if (min1 >= min2)
            max = min1;
        else
            max = min2;
        System.out.println(max);

    }
}
// Не опускайте в коду { } (фигурные скобки), даже если синтаксис это позволяет, то code convention запрещает
// и солюдайте количество уровней пакетов, не менее 4-х
// других каки-нибудь значимых замечаний нет
