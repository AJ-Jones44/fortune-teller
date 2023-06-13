import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

    // User inputs first name
    System.out.println("What is your name?");
        String name = userInput.nextLine();

    // User inputs last name
        System.out.println("Hello," + name + ", what is your last name?");
        String lastName = userInput.nextLine();

    // User inputs age
        System.out.println("How old are you " + name +" " + lastName);
        int number = userInput.nextInt();

    // User inputs birth month (int)
        System.out.println("What is your birth month (1-12)?");
        int month = userInput.nextInt();
        userInput.nextLine();
        
    // User inputs favorite ROYGBIV color, with "help" to define
        System.out.println("Which color in ROYGBIV is your favorite? Need help type 'Help'");
        String ROYGBIV = userInput.nextLine();
        if(ROYGBIV.equals("Help"))
            System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
            userInput.nextLine();
            {
        }
    // Ask for number of siblings
        System.out.println("How many siblings do you have?");
        int siblings = userInput.nextInt();

    // [First Name] [Last Name] will retire in [# of years] with [bank balance] in the bank, a vacation home in [location], and travel by [mode of transportation].
        int retirementYear;
        if(number % 2 == 0){
        retirementYear = 2035;
        } else{
            retirementYear = 2037;
        }
        
        double bankAccount;
        if(month <= 4 ){
            bankAccount = 256000.76d;
        } else if(month > 4 && month <= 8 ){
            bankAccount = 3687105.42d;
        } else if(month > 8 && month <= 12){
            bankAccount = 86.23d;
        } else{
            bankAccount = 0;
        }

        String location;
        if(siblings == 0){
            location = "Boca Raton FLA";
        }else if(siblings == 1){
            location = "Nassau Bahamas";
        } else if(siblings == 2){
            location = "Ponta Negra Brazil";
        } else if(siblings == 3){
            location = "Portland Oregon";
        } else if(siblings >= 3){  
            location = "Baton Rouge,LA";
        } else{
            location = "Chernobyl Ukraine";
        }

        String car;
        if(ROYGBIV == "red"){
            car = "Maserati";
        } else if(ROYGBIV == "orange"){
            car = "stallion";
        } else if(ROYGBIV == "yellow"){
            car = "taxi";
        } else if(ROYGBIV == "green"){
            car = "rickshaw";
        } else if(ROYGBIV == "indigo"){
            car = "motor scooter";
        } else{
            car = "Flying Saucer";
        }

        System.out.println(name+" " + lastName + " will retire in year" + retirementYear +" with" + bankAccount +" in the bank, a vacation home in" + location +" and travel by " + car);
        userInput.close();
    }
}






// User inputs favorite ROYGBIV color
// Ask for number of siblings

// [First Name] [Last Name] will retire in [# of years] with [bank balance] in the bank, a vacation home in [location], and travel by [mode of transportation].
// Stretch tasks
// Ability to quit
