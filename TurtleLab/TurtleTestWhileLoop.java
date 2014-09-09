import java.awt.Color;
import java.util.Random;

public class TurtleTestWhileLoop
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        
        //Turtle t1 = new Turtle(turtleWorld);
        int num = 0;
        int num2 = 60;
        while (num < num2)
        {
            Turtle t1 = new Turtle(turtleWorld);
            t1.hide();
            t1.setPenWidth(2);
            t1.turn(num);
            t1.forward(200);
            num = num + 1;
        }
       
        
        while (num < (num2 * 2))
        {
            Turtle t2 = new Turtle(turtleWorld);
            t2.hide();
            t2.setPenWidth(2);
            t2.turn(60 + num);
            t2.forward(200);
            num = num + 1;
        }
        while (num < (num2 * 3))
        {
            Turtle t3 = new Turtle(turtleWorld);
            t3.hide();
            t3.setPenWidth(2);
            t3.turn(120 + num);
            t3.forward(200);
            num = num + 1;
        }
        
        int newnum = 0;
        
        
        while (newnum < (num2))
        {
            Turtle t4 = new Turtle(turtleWorld);
            t4.setPenColor(Color.BLUE);
            t4.hide();
            t4.setPenWidth(2);
            t4.turn(newnum + num2);
            t4.forward(150);
            newnum = newnum + 1;
        }
        
        while (newnum < (num2 * 2))
        {
            Turtle t5 = new Turtle(turtleWorld);
            t5.setPenColor(Color.BLUE);
            t5.hide();
            t5.setPenWidth(2);
            t5.turn(newnum + (num2 * 2));
            t5.forward(150);
            newnum = newnum + 1;
        }
        
        while (newnum < (num2 * 3))
        {
            Turtle t6 = new Turtle(turtleWorld);
            t6.setPenColor(Color.BLUE);
            t6.hide();
            t6.setPenWidth(2);
            t6.turn(newnum + (num2 * 3));
            t6.forward(150);
            newnum = newnum + 1;
        }
        int wid = 5;
        Turtle t7 = new Turtle(turtleWorld);
        t7.hide();
        t7.penDown();
        t7.setPenWidth(wid);
        t7.setPenColor(Color.BLACK);
        t7.forward(200);
        Turtle t8 = new Turtle(turtleWorld);
        t8.hide();
        t8.turn(60);
        t8.penDown();
        t8.setPenWidth(wid);
        t8.setPenColor(Color.BLACK);
        t8.forward(200);
        Turtle t9 = new Turtle(turtleWorld);
        t9.hide();
        t9.turn(120);
        t9.penDown();
        t9.setPenWidth(wid);
        t9.setPenColor(Color.BLACK);
        t9.forward(200);
        Turtle t10 = new Turtle(turtleWorld);
        t10.hide();
        t10.turn(180);
        t10.penDown();
        t10.setPenWidth(wid);
        t10.setPenColor(Color.BLACK);
        t10.forward(200);
        Turtle t11 = new Turtle(turtleWorld);
        t11.hide();
        t11.turn(240);
        t11.penDown();
        t11.setPenWidth(wid);
        t11.setPenColor(Color.BLACK);
        t11.forward(200);
        Turtle t12 = new Turtle(turtleWorld);
        t12.hide();
        t12.turn(300);
        t12.penDown();
        t12.setPenWidth(wid);
        t12.setPenColor(Color.BLACK);
        t12.forward(200);
        
    }
}