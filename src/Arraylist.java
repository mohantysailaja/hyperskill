import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int count = 3;
        List<String> list = new ArrayList<>();
        while (list.size() < count) {
            list.add(scanner.nextLine());
        }
        System.out.printf("The form for %s is completed." +
                        " We will contact you if we need a chef who cooks %s dishes and has %s years of experience.",
                list.get(0), list.get(2), list.get(1));
    }
}