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
            Duck(number);
            Palindrome(number);

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
       System.out.println("        even: " + (number % 2 == 0));
       System.out.println("        odd: " + (number % 2 != 0));
       System.out.println("        buzz: " + (number % 7 == 0 || number % 10 == 7));
    }

    private static void Duck(int number) {
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                System.out.println("        duck: true");
                return;
            }
            temp = temp / 10; 
        }
        System.out.println("        duck: false");
   }

   private static void Palindrome(int number){
        int temp = number;
        int rev = 0;
        while(temp > 0 ){
            int digit = temp % 10;
            rev = rev *10 + digit;
            temp /= 10;
        }
        System.out.println("        Palindrome: " + (number == rev) );
    }

    
}