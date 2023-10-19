public class k_set_i_bit
{
    public static void main(String[] args) {
        System.out.println(setbit(10, 2));
        // 10=1010  ,or function  ,1110  ,output=14
    }
    public static int setbit(int n, int i)
    {
        int bitMask=1<<i;
        return n | bitMask;
    }
}
