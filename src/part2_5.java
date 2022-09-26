import java.util.Scanner;

public class part2_5 {
    public static void main(String[] args) {
        print();

    }
    public static int Array(){
        System.out.println("Hello, enter the number of elements in the array");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i <length; i++)
            arr[i] = scan.nextInt();
        int largest, i;
        largest = arr[0];
        for(i=1; i<length; i++)
        {
            if(largest<arr[i])
                largest = arr[i];
        }
        System.out.print("The largest value in the array is: ");

        return largest;

    }
    public static void print() { // Task 2.3 method for array printing
        System.out.println(Array());
        }
    }

