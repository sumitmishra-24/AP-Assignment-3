import java.util.Scanner;

public class PascalsTriangle {
    // Function to generate and print Pascal's Triangle
    public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;
            // Print spaces for formatting
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print Pascal's Triangle numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        printPascalsTriangle(rows);
        scanner.close();
    }
}

/*
Example Output:

Enter number of rows for Pascal's Triangle: 5
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

*/