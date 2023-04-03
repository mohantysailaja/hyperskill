
import java.util.Scanner;
class relationalopearator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = (h1 >= h2) && (h2 >= h3);

        System.out.println(descOrdered);

/*
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        boolean oneIsOne = one == one; // true

        boolean res1 = two <= three; // true
        boolean res2 = two != four;  // true
        boolean res3 = two > four;   // false
        boolean res4 = one == three; // false
        int number = 1000;
        boolean result = number + 10 > number + 9; // 1010 > 1009 is true
        //number > 100 && number < 200; // it means 100 < number < 200
        int number1 = 78 ;            // it has a value
        int low = 100, high = 200;   // borders

        boolean inRange = number1 > low && number1 < high;  // joining two expressions using AND.
        //System.out.println((h1 >= h2) && (h2 >= h3));
        */

    }

}
