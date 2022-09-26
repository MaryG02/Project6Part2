import java.util.Scanner;
import java.util.Random;
public class part2_2 {
    public static void main(String[] args) {
        print();
    }

    public static int[] Random() {
        System.out.println("Hello, please, enter the number of elements");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        Random rand = new Random();
        int upperbound = 100;
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upperbound);
        }
        System.out.println("Array is:");
        return arr;
    }

    public static void print() { // Task 2.3 method for array printing
        for (int value : Random()) {
            System.out.print(value + " ");
        }
    }
}
