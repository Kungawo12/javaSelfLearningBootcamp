import java.util.Scanner;

public class diceJack {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        
        System.out.println("Pick three numbers between 1 to 6:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        if(isLessThan1(num1, num2, num3) || isMoreThan1(num1,num2,num3)){
            System.out.println("You have gone beyond the limit");
            System.exit(0);
        }

        int sumNumbers = (num1 + num2 + num3);
        int sumDiceRolls= (roll1 + roll2 + roll3);

        if (userWon(sumNumbers,sumDiceRolls)){
            System.out.println("congratulations, you won!");
        }else{
            System.out.println("Better luck next time!");
        }



    }

    public static boolean isLessThan1(int num1, int num2, int num3){
        return (num1 <1 || num2 < 1 || num3 <1 );
    }
    public static boolean isMoreThan1(int num1, int num2, int num3){
        return (num1 > 6 || num2 > 6 || num3 > 6 );

    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls ){
        return(sumNumbers > sumDiceRolls && (sumNumbers -sumDiceRolls)< 3 );
    }
    public static int rollDice(){
        double randomNumber = (Math.random() * 6) + 1;
        return (int)randomNumber;
    }
}
