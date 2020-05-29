public class percentage
{
    public static void main (int p, int m, int h, int g, int b)
    {
       int ans = ((p + m + h + g + b)* 100)/500;
       System.out.println( ans);
       if ( ans >= 90)
       {
           System.out.println( " Science with Computers");
        }
        else if ( (ans > 79) && ( ans <90))
        {
            System.out.println(" Science without Computers");
        }
        else if (( ans > 69) &&( ans < 80))
        {
            System.out.println(" Commerce with Maths");
        }
        else if (( ans > 59) && ( ans < 70))
        {
            System.out.println( " Commerce without Maths");
        }
        else
    {
        System.out.println( " nothing");
    }
}
}
        
            
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       