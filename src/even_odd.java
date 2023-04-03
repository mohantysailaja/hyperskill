import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args){
        int num1;
        System.out.println("Enter any integer number");
        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        // If number is divisible by 2 then it's an even number
        //else it is an odd number
        if(num1 % 2 == 0){
            System.out.println(num1 +" is an even number.");}

            else
            System.out.println(num1 +" is an odd number.");
        }
    }

