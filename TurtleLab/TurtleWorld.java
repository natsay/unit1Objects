//Natalie Tse
//Turtle Lab 
//9/2/15

import java.awt.Color; 

public class TurtleWorld 
{ 
    public static void main(String args[]) 
    { 
        World turtleWorld= new World(); 
        Turtle turtle= new Turtle(turtleWorld); 
        turtle.setPenColor(Color.GREEN);
        turtle.setShellColor(Color.BLUE);  
        
        Turtle turtle2= new Turtle(turtleWorld); 
        turtle2.setPenColor(Color.PINK);
        turtle2.setShellColor(Color.BLUE);  
       
        turtle.penDown();dfgddgfgf
        turtle.forward(50);
        turtle.turn(90);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90); 
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90);
        turtle.penUp();
        
       
        turtle2.penDown();
        turtle2.forward(100);
        turtle2.turn(90);
        turtle2.penDown();
        turtle2.forward(100);
        turtle2.turn(90);
        turtle2.penDown();
        turtle2.forward(100);
        turtle2.turn(90); 
        turtle2.penDown();
        turtle2.forward(100);
        turtle2.turn(90);
        turtle.penUp(); 
        
    }
}    
        