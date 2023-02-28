import java.util.Scanner;
public class exception {
    public static void main(String[] args){
       /* String str = "just a text";
        //char res = str.charAt(3);//result:t
        String res = str.substring(5, 6);//result :a
               // char res = str.get(0);//the code can not be compiled
        //char res = str.charAt(12);//an exception occurs
        System.out.println(res);
        */
        String str = "a simple string";

        str = str.replace("a", "A SIMPLE").substring(2, 8);
        System.out.println(str);

       /*
       Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        for (int i = int1; i <= int2; i++) {
            System.out.print(str1.charAt(i));
        }
        */

        // String s = null;
       // int length = s.length(); // it throws NullPointerException
        //System.out.println(length);
       // String s1 = "ab";
       // char c = s1.charAt(2); // it throws StringIndexOutOfBoundsException because indexing starts with 0
        //String r = "All robots speak Java";
        //int length1 = r.length();
        //System.out.println(length1);
       // String ex = scanner.next();//"java"
        //int l = ex.length();
       // char find =ex.charAt(2);
       // String  find = ex.substring(0,3);
       // System.out.println(find);


    }
}
