import java.util.Random;

/*
 * Lab0 main file
 */
public class Main {
    // Needed functionality:
    /**
     * int[] fillArray(int arrSize): Given an array size, create an int array that
     * contains random integers in the range [0,100]. DONE
     * 
     * void displayMenu(): Display the menu options, get the user’s choice, and call
     * the required methods to print out the result. Until the user chooses to exit,
     * you should display the menu again.
     * 
     * int findMin(int[] arr): Find the minimum of an array.
     * 
     * int findMax(int[] arr): Find the maximum of an array.
     * 
     * double findAvg(int[] arr): Find the average of an array.
     * 
     * String diffOfArray(int[] arr): Return a string representation of an array
     * such that newArr[i] = arr[i] - findAvg(arr)).
     * 
     * int findSumOfOddIndexes(int[] arr): Find the sum of odd-indexed integers of
     * an array.
     * 
     * int findSumOfEvenIndexes(int[] arr): Find the sum of even-indexed integers of
     * an array.
     */

    /**
     * Creates an array of size arrSize, which is filled with random numbers from 1
     * to 100 (inclusive).
     * 
     * @author Sukru Eren Gokirmak
     * @param arrSize the size of the array that will be created.
     * @return a reference to an array of size arrSize.
     */
    public static int[] fillArray(int arrSize) {
        int[] randArray = new int[arrSize];
        Random rand = new Random();
        for (int i = 0; i < arrSize; i++) {
            randArray[i] = (int) (rand.nextDouble() * 100 + 1);
        }
        return randArray;
    }
    /**
     * Finds the maximum of the array.
     * @author Mehmet Anıl Yeşil
     * @param arr is array that searching for the maximum value.
     * @return maximum value of array.
     */
    public static int maxArray(int[] arr) {
    int max = arr[0];
    for(int i = 1; i < arr.length; i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
    }
    /**
        * Finds the minimum of the array.
        * @author Mehmet Anıl Yeşil
        * @param arr is array that searching for the minimum value.
        * @return minimum value of array.
        */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        // Creating the array that will be worked on
        int[] mainArray = fillArray(100);

    }

}