import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String option;
        
        do {
            // Prompt the user to input two numbers
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();

            // Prompt the user to select one of the 4 operations
            System.out.println("Select an operation:"
            		+ "\n1. Addition"
            		+ "\n2. Subtraction"
            		+ "\n3. Multiplication"
            		+ "\n4. Division");
            System.out.print("Enter your choice: ");
            
            int operation = input.nextInt();

            double result = 0;

            // Switch case for the selected operation
            switch (operation) {
                case 1:
                    //Todo addition //// this is done Wai Moe
                    result = number1 + number2;
                    break;

                case 2:
                    //Todo subtraction
                    //code here
                    break;

                case 3:
                    //Todo multiplication
                    //code here
                    break;

                case 4:
                    //Todo division
                    if (number2 != 0)
                        result = (double) number1 / number2;
                    else
                        System.out.println("Cannot divide numbers by zero!");
                    break;

                default:
                    System.out.println("This is not an operation choice!");
            }
            // Print result
            if (operation >= 1 && operation <= 4) {
                System.out.println("Result: " + result);
            }

            // Prompt the user on whether or not they want to continue using the calculator
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            option = input.next();
        } while (!option.equals("no"));
        
        System.out.println("Goodbye!");
        input.close();
		
	}

}
