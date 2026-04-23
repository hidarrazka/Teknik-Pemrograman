import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Tantangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String cString = input1.concat(input2);
        System.out.println(cString.length());
        System.out.println(input1.equals(input2));
        System.out.println(cString);
    }
}