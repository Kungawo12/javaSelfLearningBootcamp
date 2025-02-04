import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.
        Scanner scan = new Scanner(System.in);
        System.out.print("Learn The Part >>: java ");
        String Purpose = scan.nextLine();

        for (int i =0; i < 20 ; i++){
            evenOdd(i);
        }
    }
    public static void evenOdd(int i ){
        if(i % 2 ==0){
            System.out.println(i + ": even");
        }
        else{
            System.out.println(i + ": odd");
        }
    }
}
