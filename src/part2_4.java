import java.util.Scanner;

public class part2_4 {
    public static void main(String[] args) {
        print();

    }
    public static int Array(){
        System.out.println("Hello, enter the number of elements in the array");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of Array");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.print("The sum of the array is:");

        return sum;

    }
    public static void print() { // Task 2.3 method for array printing
        System.out.println(Array());
        }
    }



