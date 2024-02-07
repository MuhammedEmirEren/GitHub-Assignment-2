
import java.util.Random;

public class ListOperation
{
    private Random rand;
    private int[] list;
    public ListOperation(int sizeOfList)
    {
        rand = new Random();
        list = new int[sizeOfList];
        for(int i = 0; i < sizeOfList; i++)
        {
            list[i] = rand.nextInt(101); 
        }        
    }
/**
 * 
 * @return the list 
 */
    public int[] getList()
    {
        return this.list;
    }
    /**
     * 
     * 
     * @return the sum of indexes of the list
     */
    public int sumOfOddIndexes()
    {
        int sumOfOdds= 0;
        
        for(int i = 1; i < this.list.length; i = i + 2)
        {
            sumOfOdds = sumOfOdds + this.list[i];
        }

        return sumOfOdds;
    }
    /**
     * 
     * 
     * @return the sum of even indexes of the list
     */
    public int sumOfEvenIndexes()
    {
        int sumOfEvens = 0;

        for(int i = 0; i < this.list.length; i = i + 2)
        {
            sumOfEvens = sumOfEvens + this.list[i];
        }

        return sumOfEvens;
    }
    /**
     * Finds the average of the list 
     * @return a new list consist of the differences of elements of list and average
     */
    public int[] averageFinding(){
        int sum=0;
        for(int i=0; i<list.length; i++){
            sum+=list[i];
        }
        int average=sum/list.length;
        int[] newlist= new int[list.length];
        for(int i=0;i<list.length;i++){
            newlist[i] = list[i]-average;
        }
        
        return newlist ;
    }
    /**
     * 
     * @return the max value of te list
     */
    public int getMax()
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < this.list.length; i++)
        {
            if (this.list[i] > max)
            {
                max = this.list[i];
            }
        }
        return max;
    }
/**
 * 
 * 
 * @return the min value of te list
 */
    public int getMin()
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.list.length; i++)
        {
            if (this.list[i] < min)
            {
                min = this.list[i];
            }
        }
        return min;
    }
    

}
