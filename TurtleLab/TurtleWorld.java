//Natalie Tse
//Turtle Lab 
//9/2/15

import java.awt.Color; 

public class TurtleWorld 
{ 
    public static void main(String args[]) 
    { 
        World turtleWorld= new World(4000,1000); 
        Turtle turtle= new Turtle(turtleWorld); 
        turtle.setPenColor(Color.GREEN);
        turtle.setShellColor(Color.BLUE);  
        
        Turtle turtle2= new Turtle(turtleWorld); 
        turtle2.setPenColor(Color.RED);
        turtle2.setShellColor(Color.BLUE);  
       
        Turtle turtle3= new Turtle(turtleWorld); 
        turtle3.setPenColor(Color.PINK);
        turtle3.setShellColor(Color.RED);
        
        Turtle turtle4= new Turtle(turtleWorld); 
        turtle4.setPenColor(Color.BLUE);
        turtle4.setShellColor(Color.YELLOW);
        
        Turtle turtle5= new Turtle(turtleWorld); 
        turtle5.setPenColor(Color.ORANGE);
        turtle5.setShellColor(Color.YELLOW);
        
        
       
        
        turtle.penDown();
        int num = 0;
        int num2= 0; 
        int num3= 0;
        int num4= 0;
        int num5= 0;
        int num6=0;
        
        while (num < 100000)
        {
            turtle.forward(num);
            turtle2.forward(num2);
            turtle3.forward(num3);
            turtle4.forward(num4);
            turtle5.forward(num5);
            
            
        
        
           
            turtle.turnRight();
            turtle2.turn(60);
            turtle3.turnRight();
            turtle4.turn(60);
            turtle5.turnRight();
            
           
            num+= 1;
            num2+=2;
            num3+=3;
            num4+=4;
            num5+=5;
            
           
        }
            
      
        
       
     
        
    }
}    
        