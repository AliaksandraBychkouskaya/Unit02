package by.tr.mod2;

public class Number14 {
    public static void main(String [] args){
        for (int i = 1000; i < 10000; i++){
            int sum = 0;
            int x = i;
            do {
                sum += x % 10;
                x = (x - x % 10) / 10;
            }
            while (x != 0);
            sum +=x/10;
            if (sum == 15)
                System.out.println(i);
        }
    }
}
