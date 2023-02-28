
import java.util.Scanner;
class scan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println(10 / (2 + 2) + 4 * 8);// Create a Scanner object
        //System.out.println((-5) * (-10) * (-20));
       // System.out.println(-10 * (3 + 4) / 2);
        //int number = 12241;
        //int digit = ((number % 100) / 10) % 10;
       //System.out.println(digit);
        long Squirrel = scanner.nextLong();
        long nuts = scanner.nextLong();
        System.out.println(nuts/Squirrel);//https://hyperskill.org/learn/step/2212#comment
       // String firstName = scanner.next();
       // String yearsOfExperience = scanner.next();
       // String cuisinePreference = scanner.next();

       // String line1 = scanner.nextLine();//The form for
       // String line2 = scanner.nextLine();// is completed. We will contact you if we need a chef who cooks
       // String line3 = scanner.nextLine();
       // String line4 = scanner.nextLine();
        //System.out.println("The form for "+firstName+" is completed. We will contact you if we need a chef who cooks "+cuisinePreference+" dishes and has "+yearsOfExperience+"years of experience." );
//We will contact you if we need a chef who cooks fusion dishes and has 8 years of experience.
        /*String word1 = scanner.next(); // "Java
        String word2 = scanner.next(); // "Programming"
        String word3 = scanner.next(); // "Language"
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
        String name = scanner.nextLine();
        String yearsOfExperience = scanner.nextLine();
        String cuisinePreference = scanner.nextLine();

        System.out.println(String.format("The form for %s is completed. " +
                "We will contact you if we need a chef who cooks %s dishes " +
                "and has %s years of experience.", name, cuisinePreference, yearsOfExperience));

*/
    }
}
