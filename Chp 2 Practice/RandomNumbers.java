import java.util.Random; 

public class RandomNumbers
{
   public static void main(String[] args)
   {
       Random numbers= new Random(); 
       int rnum= numbers.nextInt(6); 
       rnum+=1; 
       System.out.println(rnum); 
     
       
      
   }
} 