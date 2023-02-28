
package bot;

        import java.util.Scanner;

public class workonprojectage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");

        String name = scanner.next();
        //int age=scanner.nextInt();
        int remainder3 = scanner.nextInt();
        int remainder5=scanner.nextInt();
        int remainder7=scanner.nextInt();
        //int remainder3 = (age % 3);//scanner.nextInt();
        //int remainder5=(age % 5);//scanner.nextInt();
        //int remainder7=(age % 7);//scanner.nextInt();
        int age1 = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        //System.out.println(age1);

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders

        System.out.println("Your age is " + age1 + "; that's a good time to start programming!");
    }
}