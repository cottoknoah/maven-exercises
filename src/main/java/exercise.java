import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

    public class exercise {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            String userInput = sc.nextLine();
//            System.out.println(userInput);
            System.out.println(StringUtils.isNumeric(userInput));
        }
}