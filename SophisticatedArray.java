import java.util.Random;

/*
 * Lab0 main file
 */
public class SophisticatedArray {
    // Implemented functionality:
    /**
     * Menu functionality (Done in {@link Menu.java}): Display the menu options, get the user’s choice, 
     * and call the required methods to print out the result. Until the user chooses to exit,
     * the menu should be displayed. DONE
     * 
     * {@link #SophisticatedArray()}: Given an array size, create an 
     * integer array that contains random integers in the range [1,100]. DONE
     * 
     * {@link #findMin()}: Find the minimum of an array. DONE
     * 
     * {@link #findMax()}:Find the maximum of an array. DONE
     * 
     * {@link #findAverage()}: Find the average of an array. DONE
     * 
     * {@link #diffFromAv()}: Return an array
     * such that newArr[i] = arr[i] - findAvg(arr)). DONE
     * 
     * {@link #findOddSum()}: Find the sum of odd-indexed integers of
     * an array. DONE
     * 
     * {@link #findEvenSum()}: Find the sum of even-indexed integers of
     * an array. DONE
     * 
     */

    private int[] array;

    /**
     * Creates an array of size arrSize, which is filled with random numbers from 1
     * to 100 (inclusive).
     * 
     * @author Sukru Eren Gokirmak
     * @param arrSize the size of the array that will be created.
     * @return a reference to an array of size arrSize.
     */
    public SophisticatedArray(int arrSize) {
        int[] randArray = new int[arrSize];
        Random rand = new Random();
        for (int i = 0; i < arrSize; i++) {
            randArray[i] = (int) (rand.nextDouble() * 100 + 1);
        }
        array = randArray;
    }
    
     /**
     * Finds the maximum of the array.
     * 
     * @author Mehmet Anıl Yeşil
     * @return maximum value of array.
     */
    public int findMax() {
        int max = this.array[0];
        for (int i = 1; i < this.array.length; i++)
        {
            if (this.array[i] > max)
            {
                max = this.array[i];
            }
        }
        return max;
    }
    
    /**
     * Finds the minimum of the array.
     * 
     * @author Mehmet Anıl Yeşil
     * @return minimum value of array.
     */
    public int findMin()
    {
        int min = this.array[0];
        for(int i = 1; i < this.array.length; i++)
        {
            if(this.array[i] < min)
            {
                min = this.array[i];
            }
        }
        return min;
    }
    
    /**
     * Finds the average of an array.
     * 
     * @author Emir Ensar Sevil
     * @return the average of the array.
     */
    public double findAverage()
    {
        double av = 0;
        for( int i = 0; i < this.array.length; i++)
        {
            av += this.array[i]; 
        }
        av = av / this.array.length;
        return av;  
    }
    
    /**
     * Finds the difference between the elements of an array and its average. 
     * 
     * @author Emir Ensar Sevil
     * @return the reference to an array that contains the difference of the elements from its average.
     */
    public double[] diffFromAv()
    {
        double av = this.findAverage();
        double [] diffOfArray = new double [this.array.length];
        for( int i = 0; i < this.array.length; i++)
        {
            diffOfArray[i] = this.array[i] - av;
        }
        return diffOfArray;
    }


    /**
     * Finds the sum of even indexed elements.
     * 
     * @author Erfan FarhangKia
     * @return sum of even indexed elements
     */
    public int findEvenSum ()
    {
        int sumOdd = 0;
        for (int i = 0; i < this.array.length; i++)
        {
            if (i % 2 == 0)
            {
                sumOdd += this.array[i];
            }
        }
        return sumOdd;
    }
    
    /**
     * Finds the sum of odd indexed elements.
     * 
     * @author Erfan FarhangKia
     * @return sum of odd indexed elements
     */
    public int findOddSum ()
    {
        int sumEven = 0;
        for (int i = 0; i < this.array.length; i++)
        {
            if (i % 2 == 1)
            {
                sumEven += this.array[i];
            }
        }
        return sumEven;
    }
}
