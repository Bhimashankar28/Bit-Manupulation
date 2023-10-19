import java.util.*;
public class m_clear_bit
{
    public static int updateBit(int n, int i, int newBit)
    {
        n=clearBit(n,i);
        int BitMask=newBit<<i;
        return n | BitMask;
    }
    static int clearBit(int n, int i)
    {
        int bitMask=~(1<<i);
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(updateBit(10,2,1));
    }
}
