public class File
{
    interface PerfectSquare
    {
        boolean isPerfectSquare(double n);
    }

    public File()
    {
        PerfectSquare ps = (double x)->
        {
            double num = Math.sqrt(x);
            if(num%1==0)
                return true;
            return false;
        };
        System.out.println(ps.isPerfectSquare(64));
        System.out.println(ps.isPerfectSquare(5));
    }
    public static void main(String[]args)
    {
        File app = new File();
    }

}