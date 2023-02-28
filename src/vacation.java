import java.util.Scanner;
public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationinDays = scanner.nextInt();
        int totalfoodCosts = scanner.nextInt();
        int onewayflightCost = scanner.nextInt();;
        int costofonenightHotel = scanner.nextInt();
        int totalCost = (totalfoodCosts*durationinDays)+(onewayflightCost * 2)+
                +costofonenightHotel*(durationinDays-1);
        //System.out.println(durationinDays);
        //System.out.println(totalfoodCosts*durationinDays);
        //System.out.println(onewayflightCost * 2);
        //System.out.println(costofonenightHotel*(durationinDays-1));
        System.out.println(totalCost);

    }
}
