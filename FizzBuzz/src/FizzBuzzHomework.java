import java.util.Scanner;

public class FizzBuzzHomework  {

    public static void FizzBuzz(int a){
        for (int i = 1; i <= a; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how high to count: ");
        int a = input.nextInt();
        FizzBuzz(a);
    }
}