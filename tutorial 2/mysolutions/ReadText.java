import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        String inString = i.nextLine();
        String[] inArray = inString.split(" ", 2);
        System.out.printf("Length of input: %d\n",inString.length());
        System.out.printf("First word: %s\n",inArray[0]);
        System.out.printf("Rest of input: %s",inArray[1]);

        i.close();
    }
}