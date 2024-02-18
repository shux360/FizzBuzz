import java.util.Scanner;

public class Main {
    // If the number is divicible by 5 without remainders program should output "Fizz".
    // If the number is divicible by 3 without remainders program should output "Buzz".
    // If the number is divicible by 3 and 5 without remainders program should output "FizzBuzz".
    // If the number is not divicible by neither 3 nor 5 program should output the number what user already input to the program

    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = new String();

        if(number % 5 == 0 && number % 3 == 0)
            result = "FizzBuzz";
        else if (number % 5 == 0)
            result = "Fizz";
        else if (number % 3 == 0)
            result = "Buzz";
        else
            result = String.valueOf(number);

        System.out.println(result);
    }

}