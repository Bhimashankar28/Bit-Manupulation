import java.util.*;
public class b_unique_duplicate
{
    public static void main(String[] args) {
        int a[]={2,3,3,2,4,6,4};
        System.out.println(uniqueans(a));
    }
    static int uniqueans(int a[])
    {
        int unique=0;
        for(int n:a) {
            unique ^= n;
        }
     return unique;
    }
}
