/*  Filename: BubbleSortDemo.java 
    Author: Tom Date: 8/6/18*/

import java.util.*;
public class BubbleSortDemo 
{
    public static void main(String[] args) 
    {
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        // A loop that prompts user for 5 numbers one at a time
        // The numbers will be the value of the array elements
        for(a = 0; a < someNums.length; ++a)
        {
            System.out.print("Enter number " + (a +1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }
        keyboard.close();
        // Calls the method that accepts the full array and the number of iterations of the sort process 
        display(someNums, 0);

        // Nested loops that perform the bubble sort process
        for (a = 0; a < someNums.length - 1; ++a) 
        {
            for (b = 0; b < comparisonsToMake; ++b) 
            {
                if (someNums[b] > someNums[b + 1])
                {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }
            display(someNums, (a + 1));
            --comparisonsToMake;
        }
        
    }
    // Defines display method which outputs the iteration number and the value of the array at that point
    public static void display(int[] someNums, int a)
    {
        System.out.print("Iteration " + a + ": ");
        for (int x = 0; x < someNums.length; x++) 
            System.out.print(someNums[x] + " ");
        System.out.println();
    }
}