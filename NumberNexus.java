import java.util.Scanner;

public class NumberNexus{
    public static void main(String[] args){
        boolean ON = true;
        Scanner input = new Scanner(System.in);

        while(ON == true){

            System.out.print("Input your Number: ");
            
            int number = input.nextInt();

            System.out.println("You entered:"+ " " + number);
            if(number < 1){
                System.out.println("It is not a natural number");
                break;
            }

            BuzzNumber(number);

            input.nextLine();

            System.out.print("Go Again ? ");
            System.out.println("Y OR N ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                ON = true;
            }else{
                ON = false;
            }

            System.out.println();
        }  

        input.close();
    }

    private static void BuzzNumber(int number){
        if(number % 2 == 0) {
            System.out.println(number +" "+ "is even");
        }else{
            System.out.println(number +" "+ "is odd");
        }

        if((number % 10) == 7 || (number % 7) == 0){
            System.out.println(number + "is a Buzz number");
        }
    }
}