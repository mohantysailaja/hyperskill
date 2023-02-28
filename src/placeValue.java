import java.util.Scanner;
class placeValue {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int placeValuetens = (number/10)%10;
        int placeValuehth = (number/100)%100;
        System.out.println("the input number is :"+number+"");
        System.out.println("the placevalue of tens is :"+placeValuetens+"");
        System.out.println("the placevalue of hundreth is :"+placeValuehth+"");
        //System.out.println("the input number is :"+placeValue+"");
       /* for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

    }
}
