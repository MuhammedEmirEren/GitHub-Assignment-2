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

    public int[] getList()
    {
        return this.list;
    }
    public int sumOfOddIndexes()
    {
        int sumOfOdds= 0;
        
        for(int i = 1; i < this.list.length; i = i + 2)
        {
            sumOfOdds = sumOfOdds + this.list[i];
        }

        return sumOfOdds;
    }
    public int sumOfEvenIndexes()
    {
        int sumOfEvens = 0;

        for(int i = 0; i < this.list.length; i = i + 2)
        {
            sumOfEvens = sumOfEvens + this.list[i];
        }

        return sumOfEvens;
    }
}
