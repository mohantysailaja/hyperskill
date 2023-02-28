public class string {
    public static void main(String[] args){
        String simpleString = "It is a simple string"; // a simple string
        System.out.println(simpleString);  // it prints "It is a simple string"

        String anotherString = "This is\na multiline\nstring"; // a string with escape sequences
        System.out.println(anotherString); // it prints the result in several lines

        String strangeText = "aaaaaaaaaaaassssssssssss gggggggggggggggggggg ddddddddddd qqqqqq ffff";

        String emptyString = "";

        String y = "s"; // a string consisting of one character
        String nullString = null; // it is null
        String str = new String("my-string"); // it creates an object and assigns it to the variable
        String s = "Hi, all";

        int len = s.length(); // the len is 7

        char theFirstChar = s.charAt(0);  // 'H' has the index 0

        char theFifthChar = s.charAt(4); // 'a' has the index 4

        char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6
        String text = "The simple text string";

        boolean empty = text.isEmpty(); // false

        String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"

        boolean startsWith = textInUpperCase.startsWith("THE"); // true

        /* replace all space characters with empty strings */
        String noSpaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"

        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";

        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
        String c1 = null;
        int length = c1.length(); // it throws NullPointerException
        String firstName = "John";
        String lastName = "Smith";

// concatenation using the "+" operator
        String fullName1 = firstName + " " + lastName; // "John Smith"

// concatenation using the concat method
        String fullName2 = firstName.concat(" ").concat(lastName); // "John Smith"
        String str1 = "str1" + 10 + false; // the result is "str10false"
        String shortString = "str";
        int number = 100;

        String result1 = shortString + number + 50; // the result is "str10050"
        String result2 = number + 50 + shortString; // what is the result2?

        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second)); // false, the strings have different values
        System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

        System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases
        /*To extract a single character from a string you can invoke ....WE USE charAt(...)*/
    }
}
