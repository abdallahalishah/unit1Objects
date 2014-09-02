import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random num = new Random();
        num = num.nextInt(6);
        
        
        System.out.println(num);
    }
}
