import java.awt.Color; 

public class poopballsack 
{ 
    public static void main(String args[]) 
    { 
        World turtleWorld= new World(2000,1000); 
        Turtle turtle= new Turtle(turtleWorld); 
        turtle.setPenColor(Color.GREEN);
        turtle.setShellColor(Color.BLUE);
        int num = 0;
        while (num < 100000)
        {   
           
            turtle.forward(num); 
            turtle.turn(60);
            num+=1;
        
        }
    }
}    
    