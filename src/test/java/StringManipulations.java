import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {

        textCheck();

        String casetest = "Howdy Yall";
        System.out.println(StringUtils.swapCase(casetest));

        String input = "Howdy Yall";

        System.out.println(StringUtils.reverse(input));


    }

    public static void textCheck(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me some input please.");

        String userInput = scanner.nextLine();

        if(StringUtils.isNumeric(userInput)){
            System.out.println("That is not a text input");
        }else{
            System.out.println("userInput = " + userInput);
        }
    }

}
