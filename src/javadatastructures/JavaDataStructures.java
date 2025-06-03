package javadatastructures;
import java.util.Scanner;

public class JavaDataStructures {

   
    public static void main(String[] args) {
        // Hard coded
        Scanner scanner = new Scanner(System.in);
        int[] first_array = {1, 2, 3, 4, 5};
        
        //Input based Array
        System.out.println("-> Input array size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[size];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input element #" + i + ":");
            int tempVal = scanner.nextInt();
            
            array[i] = tempVal;
        }
        
        System.out.println("Your array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        
    }
}
