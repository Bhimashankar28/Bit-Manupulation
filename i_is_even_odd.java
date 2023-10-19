import java.util.*;
public class i_is_even_odd
{
    public static void main(String[] args) {
        iseven(1);
        iseven(2);
        iseven(3);
    }
    static void iseven(int n)
    {
        int num=1;
        if((num & n)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
