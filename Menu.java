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

        System.out.println(Arrays.toString(list.getList()));

        System.out.println(list.getMax());
        System.out.println(list.getMin());
        System.out.println(Arrays.toString(list.averageFinding()));
    }
}
