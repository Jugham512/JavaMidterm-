package math.problems;
import java.util.Scanner;
public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */
    public static int Recursion(int num) {
        if(num==0 || num==1)
        return 1;
        else
            return(num * Recursion(num-1));
    }

    public static int Iteration(int n) {

        if(n == 0)
            return 1;
        int i = n, fact = 1;
        while (n / i != n) {
            fact = fact * i;
            i--;
        }
        return fact;
    }





    public static void main(String[] args) {
       int[] array= {5,4,3,2,1};
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
      int num = sc.nextInt();
int i = 5;
        Recursion(num);
        Iteration(i);
        System.out.println(Iteration(5));
        System.out.println(Recursion(num));

    }
}