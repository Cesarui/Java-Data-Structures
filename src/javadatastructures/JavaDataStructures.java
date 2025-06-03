package javadatastructures;
import java.util.Scanner;

public class JavaDataStructures {

   
    public static void main(String[] args) {
        
        
        // Hard coded
        Scanner scanner = new Scanner(System.in);
        int[] temp_array = {1, 2, 3, 4, 5};
        
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
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tempElement = array[j];
                    array[j] = array[i];
                    array[i] = tempElement;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
}
