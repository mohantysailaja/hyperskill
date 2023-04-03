import java.util.Scanner;
import java.util.ArrayList;
class jobOffer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean knowJava = true;
        boolean knowPython=true;
        int yearsOfExperienceInJava=scanner.nextInt();
        int yearsOfExperienceInPython=scanner.nextInt();


        String candidate1 = scanner.next();///"John";
        String candidate2 = scanner.next();//"Mary";
        String candidate3 = scanner.next();//"Olivia";
        String candidate4 = scanner.next();//"Alexander";
        String candidate5 = scanner.next();//"Andrew";
        String candidate6 = scanner.next();//"Emily";
       // boolean skill1 = (knowJava = true) && (yearsOfExperienceInJava = 1 );
        //https://github.com/gonaumov/jobOffer/blob/master/src/Main.java
        //https://stepik.org/lesson/77876/step/1
        boolean offerAJob =
                (knowJava && yearsOfExperienceInJava >= 1) ||
                        (knowPython && yearsOfExperienceInPython >= 3);
        if(offerAJob) {
          //  System.out.println(candidatename);
        }else{
           // System.out.println(offerAJob);
        }


    }

}
