import java.util.Arrays;

public class CheckString {

    public boolean checkNumeric(String str) throws Exception {

        char[] elements = str.toCharArray();
        char[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(char chr : elements) {
            if(chr) {
                throw new Exception("Символ является числом");
            }

        }
        return true;

    }
}
