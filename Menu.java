import java.util.Scanner;
import java.util.Arrays;

public class Menu {

    /**
     * main method
     * 
     * 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        ListOperation list = new ListOperation(size);


        int choice = 0;

        while (choice != -1)
        {
            System.out.println();
            System.out.println("Enter 1 to find the minimum and the maximum of the array");
            System.out.println("Enter 2 to find the average of the array");
            System.out.println("Enter 3 to find the sum of elements with odd- and even-numbered indexes");
            System.out.println("Enter -1 to exit");

            System.out.print("Choice: ");

            choice = input.nextInt();
            System.out.println();

            if (choice == 1)
            {
                System.out.println("The minimum of the array is: " + list.getMin());
                System.out.println("The maximum of the array is: " + list.getMax());
            }
            else if (choice == 2)
            {
                System.out.println("Average of the array i: " + list.averageFinding());
            }
            else if (choice == 3)
            {
                System.out.println("The sum of elements with even-numbered indexes: " + list.sumOfEvenIndexes());
                System.out.println("The sum of elements with odd-numbered indexes: " + list.sumOfOddIndexes());
            }
        }
    }
}
