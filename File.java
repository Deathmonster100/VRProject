public class File
{

    interface PQuotient
    {
        void printQuotient(float x, float y);
    }

    public File()
    {

        PQuotient run = (x,y)-> System.out.printf("The quotient of %.3f and %.3f is : %.3f.",x,y,x/y);
        run.printQuotient(4.0f,6.0f);
        System.out.println();
    }
    public static void main(String[]args)
    {
        File app = new File();
    }

}