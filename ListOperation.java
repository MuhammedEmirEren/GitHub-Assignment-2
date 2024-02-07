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
