public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = "quick brown fox";
      String animal2 = "lazy dog";
      String article = "the";
      String action = "jumps over";
      String message= article.concat(animal1);
      message= message.concat(animal2);
      message= message.concat(action);
      
      System.out.println(message);
   }
}