import java.util.*;

public class Con {
    public static String posneg(int num) { 
        if (num > 0) {
            return "POSITIVE";
        }
        return "NEGATIVE";
    }

    public static String week(int num) { 
        switch (num) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "NONE";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(posneg(num));
        System.out.println(week(num)); 

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = num; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Do while loop: ");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (num >= i);
        
        s.close(); 
    }
}
