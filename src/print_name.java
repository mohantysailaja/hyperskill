package bot;

import java.util.Scanner;

public class print_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  String name = "John";
        String name = scanner.next();
        String name1 = "Max";

        System.out.println("Hello! My name is "+name+"");
        System.out.println("I was created in 2018.");

        System.out.println("Please, remind me your "+name1+".");

        // reading a name

        System.out.println("What a great name you have, "+name+"!");
    }
}
