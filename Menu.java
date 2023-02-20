/**
 * Menu
 */

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = 0;

        do
        {
            System.out.print("Please enter the length of the array : ");
            if (in.hasNextInt())
            {
                length = in.nextInt();
            }
            else
            {
                in.next();
            }
        }
        while (length < 1);

        SophisticatedArray arr = new SophisticatedArray(length);

        int option = 0;

        while (option != 5)
        {
            System.out.println("\n*******************************************************************\n" + 
            "1- Find the minimum\n" +
            "2- Find the maximum\n" +
            "3- Find the average and the difference of each element from average\n" +
            "4- Find the sum of odd and even numbered indexes\n" +
            "5- Exit\n"+
            "*******************************************************************");

            do
            {
                System.out.print("\nPlease choose an option 1-5 : ");
                if (in.hasNextInt())
                {
                    option = in.nextInt();
                }
                else
                {
                    in.next();
                }
            }
            while (option < 1 && option > 5);

            if (option == 1)
            {
                System.out.println("\nMinimum of the elements is : " + arr.findMin());
            }
            else if (option == 2)
            {
                System.out.println("\nMaximum of the elements is : " + arr.findMax());
            }
            else if (option == 3)
            {
                System.out.println("\nAverage of the elements is : " + arr.findAverage());
                System.out.print("\nDifference of the each element from average is : ");
                for (double i : arr.diffFromAv())
                {
                    System.out.printf("%.2f ", i);
                }
                System.out.println();
            }
            else if (option == 4)
            {
                System.out.println("\nThe sum of odd indexed elements is: " + arr.findOddSum());
                System.out.println("\nThe sum of even indexed elements is: " + arr.findEvenSum());
            }
        }
    }
}