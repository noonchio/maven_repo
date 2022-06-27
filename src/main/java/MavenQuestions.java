import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MavenQuestions {
    public static void main(String[] args) {
        int input =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sometheing: ");
        if (sc.hasNextInt()){
            input = sc.nextInt();
            System.out.println("You entered a number!\nYour number is: " + input );
        } else {

            String input1 = sc.nextLine();
            System.out.println("You entered: " + input1);
            System.out.println("Flipped Case: " + StringUtils.swapCase(input1));
            System.out.println("Reversed: " + StringUtils.reverse(input1));

        }

    }
}
