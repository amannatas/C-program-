import java.util.Scanner; // Import the Scanner class for user input
// This is a simple Java program that prints "Hello, World!" and another message to the console
class Helo {
    public static void main(String[] args){
        
        // Create a Scanner object to read input from the console
        Scanner Sc = new Scanner(System.in); // Initialize the Scanner object
        // Prompt the user for input
        System.out.println("Enter two numbers: "); // Print a message to the console

        int a = Sc.nextInt(); // Read an integer from the console
        int b = Sc.nextInt(); // Read another integer from the console
        // Print the sum of the two numbers to the console
        System.out.println("The multiplication is: " + (a * b)); // Print the sum of a and b
        System.out.println("Hello, World!"); // Print "Hello, World!" to the console
        System.out.println("This is a Java program."); // Print "This is a Java program." to the console
        

    }
}