import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();

        String lower_cases = "qwertzuiopasdfghjklyxcvbnm";
        String upper_cases = "QWERTZUIOPASDFGHJKLYXCVBNM";

        String password = "";

        for(int i = 0; i < digit; i++) {
            int rand = (int)(2 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    rand = (int) (lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(rand));
                    break;
                case 2:
                    rand = (int) (upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(rand));
                    break;
            }
        }
        System.out.println(password);
    }
}