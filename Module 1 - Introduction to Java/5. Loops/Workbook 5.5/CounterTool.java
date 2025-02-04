import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...\n");

       // See detailed instructions on Learn the Part.
        System.out.print("1. Pick a number to count by: ");
        int count_step = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int count_start = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int count_end = scan.nextInt();

        for (int i=count_start; i<=count_end; i+=count_step ){
            System.out.print(i + " ");
        }

        scan.close();
    }
}
