public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        String message = article;
        message = message.concat(" ").concat(animal2).concat(" ").concat(action).concat(" ");
        message = message.concat(animal1);
        System.out.println(message);
    }
}