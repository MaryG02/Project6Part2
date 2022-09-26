import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        print();

    }
    public static int[] Array(){
        System.out.println("Hello, enter the number of elements in the array");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("The array is: ");

        return arr;

    }
    public static void print() { // Task 2.3 method for array printing
        for (int value : Array()) {
            System.out.print(value + " ");
        }
    }
}
