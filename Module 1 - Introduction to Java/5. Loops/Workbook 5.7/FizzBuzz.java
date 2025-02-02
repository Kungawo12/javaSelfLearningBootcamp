

public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.
        System.out.println("Learn The Part >>: java FizzBuzz");


        for(int i= 0; i < 19; i++){
            printingText(i);
        }
    }
    public static void printingText(int i){
        if ((i % 5 == 0) && ( i % 3 == 0 )){
            System.out.println(i + " FizzBuzz");
        }else if(i % 5 == 0){
            System.out.println(i + " Buzz");
        }else if(i % 3 ==0) {
            System.out.println(i + " Fizz");
        }else{
            System.out.println(i);
        }

        
    }

}
