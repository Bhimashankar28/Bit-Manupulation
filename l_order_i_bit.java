import java.util.*;
public class l_order_i_bit {
    public static void main(String[] args) {
        System.out.println(orderbit(10, 2));
        // 1010,  0010, ~(1<<i)= 1101,               1010 & 1101 = 1000
    }
    static int orderbit(int n, int i)
    {
        int bitMask=~(1<<i);
        return n & bitMask;

    }
}
