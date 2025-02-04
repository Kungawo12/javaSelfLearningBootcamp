import java.util.Scanner;

public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
        Scanner scan =  new Scanner(System.in);
        System.out.print("Learn The Part >> ");
        String song = scan.nextLine();
        
        for(int i = 99; i >=1; i --){
            sing(i);
        }
    }

    public static void sing(int i) {
        System.out.println(i +" bottles of beer on the wall," + i + " bottles of beer! ");
        System.out.println("take one down, pass it around " + (i-1) + ", bottles of beer on the wall!");

    }
}
