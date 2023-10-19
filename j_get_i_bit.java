import java.util.*;
public class j_get_i_bit
{
    public static void main(String[] args) {
        System.out.println(getibit(10, 3));
        // 10=1010
    }
    static int getibit(int n,int i)
    {
        int bitMask=1<<i;
        if((n & bitMask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
