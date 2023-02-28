public class incrementdecrement {
    public static void main(String[] args){
       // int n = 10;
       // n++; // 11
        //n--; // 10
       // System.out.println(n);
        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);
        int a = -1;
        System.out.println(1 - a++);
        char ch = '\u0031' + '\u0035';
        System.out.println(ch);
        char ch1 = '\u0040'; // it represents '@'
        System.out.println(ch1); // @
        char ch2 = 64;
        System.out.println(ch2); // @
        char ch3 = 'b';
        ch3 += 1; // 'c'
        ch3 -= 2; // 'a'
        char ch4 = 'b';
        ch4 += 'a';
        ch4 -= 'b';
        System.out.println(ch4); // prints 'a' without quotes
        char ch5 = 'A';
        ch5 += 10;
        System.out.println(ch5);   // 'K'
        System.out.println(++ch5); // 'L'
        System.out.println(++ch5); // 'M'
        System.out.println(--ch5); // 'L'
        System.out.print('\t'); // makes a tab
        System.out.print('a');  // prints 'a'
        System.out.print('\n'); // goes to the new line
        System.out.print('c');  // prints 'c'
        char c = '1' + '3';
        System.out.println(c);//d is the answer, hints :unicode for 1 is \u0031, for 3 is \u0033, do the calculation and it will print out the unicode CHAR
    }
}
