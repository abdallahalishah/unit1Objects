import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        Turtle t3 = new Turtle(turtleWorld);
        Turtle t4 = new Turtle(turtleWorld);
        Turtle t5 = new Turtle(turtleWorld);
        Turtle t6 = new Turtle(turtleWorld);
        Turtle t7 = new Turtle(turtleWorld);
        Turtle t8 = new Turtle(turtleWorld);
        Turtle t9 = new Turtle(turtleWorld);
        
        t1.setPenColor(Color.RED);
        t2.setPenColor(Color.BLUE);
        t3.setPenColor(Color.YELLOW);
        t4.setPenColor(Color.BLACK);
        t5.setPenColor(Color.GREEN);
        t6.setPenColor(Color.CYAN);
        t7.setPenColor(Color.ORANGE);
        t8.setPenColor(Color.PINK);
        t9.setPenColor(Color.MAGENTA);
        
        t9.turn(270);
        t9.forward(50);
        t9.hide();
    }
}
