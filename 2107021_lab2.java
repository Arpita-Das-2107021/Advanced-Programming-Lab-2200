import java.util.Scanner;

public class ElementOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to count: ");
        int element = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == element) {
                count++;
            }
        }

        System.out.println("The element " + element + " occurs " + count + " time(s).");

        scanner.close();
    }
}
