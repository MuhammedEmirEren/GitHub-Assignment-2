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

    

}
