public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("You can wear a shirt"); break;
            case "cloudy": System.out.println("You should wear a sweater"); break;
            case " rainy": System.out.println("You should wear raincoat"); break;
            case "snowy": System.out.println("You should wear jacket"); break;
            default: System.out.println("You can wear whatever you want");
        }
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1: System.out.println("You are an admin"); break;
            case 2: System.out.println("you are an editor"); break;
            case 3: System.out.println("You are a user"); break;
            default:System.out.println("Please contact HR"); break;
        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        if (temperature >= 80 && humidity >= 60){
            System.out.println("It's too hot and humid\n");
        }else if (temperature >= 80) {
            System.out.println("It's too hot\n");
        }else if (temperature <= 60 && humidity >= 60) {
            System.out.println("It's too cold and humid\n");
        }else if (temperature <= 60) {
            System.out.println("It's too cold\n");
        }else{
            System.out.println("It's comfortable\n");
        }


        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if (age >= 18 && age <= 60 && income >= 30000){
            System.out.println("Congrats! you are eligible for credit cards.\n");
        }else{
            System.out.println("Sorry, you are not eligible.");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        switch (lightColor) {
            case "green": System.out.println("Go ahead!");break;
            case "yellow" : System.out.println("Get ready!");break;
            case "red" : System.out.println("Stop!!");break;
            default: System.out.println("Power Outage");
        }

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        if (grade > 80){
            System.out.println("You got an A!");
        }
        else if (grade >= 70) {
            System.out.println("You got a B! ");
        }
        else if (grade >= 60) {
            System.out.println("You got a C! ");
        }
        else if (grade >= 50) {
            System.out.println("You got a D! ");
        }else if (grade >=40) {
            System.out.println("You got a E");
        }else if (grade >= 30) {
            System.out.println("You got a F");
        }
        else{
            System.out.println("You failed :(");
        }
        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari
        // Decide whether to use if-else or switch
        switch (browser) {
            case "Chrome" :System.out.println("Enjoy your  Chrome Extensions! ");
                break;
            case "Firefox" :System.out.println("Best non profit browser");
                break;
            case "Safari" :System.out.println("I sww you're a proud Apple user");
                break;
        
            default: System.out.println("curious, What browser you use");;
        }
        

    }
}
