// import java.util.Random; 
// 
// public class RandomNumbers
// {
//    public static void main(String[] args)
//    {
//        Random numbers= new Random(); 
//        int rnum= numbers.nextInt(6); 
//        rnum+=1; 
//        System.out.println(rnum); 
//      
//        
//       
//    }
// } 

// option a.)another way to do it 

// import java.util.Random; 
// 
// public class DieSimulator 
// { 
//     public static void main(String[] args) 
//     { 
//         Random generator= new Random(); 
//         int dieValue= generator.nextInt(6); //returns number between 0 and 5, inclusive
//         dieValue +=1; 
//         
//         System.out.println(dieValue); 
//     }
// }     
//         

//option b.) using math class 

import java.util.Random; 

public class DieSimulator
{
    public static void main(String[] args)
    {
        double dieValue2= Math.random(); // returns a double between 0 
        dieValue2  *= 6; //range [0,6] 
        dieValue2 +=1; 
        
        System.out.println((int) dieValue2); 
        
    }    
}    
        