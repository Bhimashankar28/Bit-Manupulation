public class a_even_or_odd
{
    public static void main(String[] args)
    {
        int n=69;
        System.out.println(isodd(n));
    }
     static boolean isodd(int n)
    {
        return (n & 1) == 1;
    }
}
