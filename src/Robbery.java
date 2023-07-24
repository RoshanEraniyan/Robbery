import java.util.*;


class Robbery
{
    public static void rob(int n,int[] array)
    {
        int odd_sum=0,even_sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                odd_sum+=array[i];
            }
            else
            {
                even_sum+=array[i];
            }
        }
        if(odd_sum > even_sum)
        {
            System.out.println(odd_sum);
        }
        else
        {
            System.out.println(even_sum);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        rob(n,array);
    }
}
