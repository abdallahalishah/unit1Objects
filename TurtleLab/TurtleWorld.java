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
        Turtle t9 = new Turtle(turtleWorld);
        Turtle t8 = new Turtle(turtleWorld);
        Turtle t7 = new Turtle(turtleWorld);
        Turtle t6 = new Turtle(turtleWorld);
        Turtle t5 = new Turtle(turtleWorld);
        
        t1.setPenColor(Color.RED);
        t2.setPenColor(Color.BLUE);
        t3.setPenColor(Color.BLACK);//yellow
        t4.setPenColor(Color.CYAN);//black
        t5.setPenColor(Color.GREEN);
        t6.setPenColor(Color.CYAN);
        t7.setPenColor(Color.BLACK);//orange
        t8.setPenColor(Color.BLUE);//pink
        t9.setPenColor(Color.RED);//magenta
        
        int num = 20;
        
        t1.setPenWidth(num);
        t2.setPenWidth(num);
        t3.setPenWidth(num);
        t4.setPenWidth(num);
        t5.setPenWidth(num);
        t6.setPenWidth(num);
        t7.setPenWidth(num);
        t8.setPenWidth(num);
        t9.setPenWidth(num);
        
        t1.hide();
        t2.hide();
        t3.hide();
        t4.hide();
        t5.hide();
        t6.hide();
        t7.hide();
        t8.hide();
        t9.hide();
        
        t1.turn(270);
        t1.forward(200);
        t1.turn(90);
        t1.forward(100);
        t1.turn(90);
        t1.forward(40);
        t1.turn(-90);
        t1.forward(80);
        t1.turn(-90);
        t1.forward(80);
        t1.turn(-90);
        t1.forward(80);
        t1.turn(-90);
        t1.forward(40);
        t1.turn(-90);
        
        t2.turn(270);
        t2.forward(150);        
        t2.turn(-90);
        t2.forward(100);
        t2.turn(90);
        t2.forward(40);
        t2.turn(-90);
        t2.forward(80);
        t2.turn(-90);
        t2.forward(80);
        t2.turn(-90);
        t2.forward(80);
        t2.turn(-90);
        t2.forward(40);
        t2.turn(-90);
        
        t3.turn(270);
        t3.forward(100);
        t3.turn(90);
        t3.forward(100);
        t3.turn(90);
        t3.forward(40);
        t3.turn(-90);
        t3.forward(80);
        t3.turn(-90);
        t3.forward(80);
        t3.turn(-90);
        t3.forward(80);
        t3.turn(-90);
        t3.forward(40);
        t3.turn(-90);
        
        t4.turn(270);
        t4.forward(50);
        t4.turn(-90);
        t4.forward(100);
        t4.turn(90);
        t4.forward(40);
        t4.turn(-90);
        t4.forward(80);
        t4.turn(-90);
        t4.forward(80);
        t4.turn(-90);
        t4.forward(80);
        t4.turn(-90);
        t4.forward(40);
        t4.turn(-90);
        
        t5.forward(100);
        t5.turn(90);
        t5.forward(40);
        t5.turn(-90);
        t5.forward(80);
        t5.turn(-90);
        t5.forward(80);
        t5.turn(-90);
        t5.forward(80);
        t5.turn(-90);
        t5.forward(40);
        t5.turn(-90);
        
        t9.turn(90);
        t9.forward(200);
        t9.turn(270);
        t9.forward(100);
        t9.turn(90);
        t9.forward(40);
        t9.turn(-90);
        t9.forward(80);
        t9.turn(-90);
        t9.forward(80);
        t9.turn(-90);
        t9.forward(80);
        t9.turn(-90);
        t9.forward(40);
        t9.turn(-90);
        
        t8.turn(90);
        t8.forward(150);
        t8.turn(-270);
        t8.forward(100);
        t8.turn(90);
        t8.forward(40);
        t8.turn(-90);
        t8.forward(80);
        t8.turn(-90);
        t8.forward(80);
        t8.turn(-90);
        t8.forward(80);
        t8.turn(-90);
        t8.forward(40);
        t8.turn(-90);
        
        t7.turn(90);
        t7.forward(100);
        t7.turn(270);
        t7.forward(100);
        t7.turn(90);
        t7.forward(40);
        t7.turn(-90);
        t7.forward(80);
        t7.turn(-90);
        t7.forward(80);
        t7.turn(-90);
        t7.forward(80);
        t7.turn(-90);
        t7.forward(40);
        t7.turn(-90);
        
        t6.turn(90);
        t6.forward(50);
        t6.turn(-270);
        t6.forward(100);
        t6.turn(90);
        t6.forward(40);
        t6.turn(-90);
        t6.forward(80);
        t6.turn(-90);
        t6.forward(80);
        t6.turn(-90);
        t6.forward(80);
        t6.turn(-90);
        t6.forward(40);
        t6.turn(-90);
        
        
//         t1.show();
//         t2.show();
//         t3.show();
//         t4.show();
//         t5.show();
//         t6.show();
//         t7.show();
//         t8.show();
//         t9.show();
        
        t1.penUp();
        t2.penUp();
        t3.penUp();
        t4.penUp();
        t5.penUp();
        t6.penUp();
        t7.penUp();
        t8.penUp();
        t9.penUp();
        
        t1.forward(80);
        t2.forward(80);
        t3.forward(80);
        t4.forward(80);
        t5.forward(80);
        t6.forward(80);
        t7.forward(80);
        t8.forward(80);
        t9.forward(80);
        
        t1.penDown();
        t2.penDown();
        t3.penDown();
        t4.penDown();
        t5.penDown();
        t6.penDown();
        t7.penDown();
        t8.penDown();
        t9.penDown();
        
        t1.forward(40);
        t2.forward(40);
        t3.forward(40);
        t4.forward(40);
        t5.forward(40);
        t6.forward(40);
        t7.forward(40);
        t8.forward(40);
        t9.forward(40);
        
        t1.turn(-90);
        t1.forward(80);
        t1.turn(-90);
        t1.forward(220);
        
        t2.turn(90);
        t2.forward(130);
        t2.turn(90);
        t2.forward(220);
        t2.turn(90);
        t2.forward(60);
        
        t3.turn(90);
        t3.forward(50);
        
        t4.turn(-90);
        t4.forward(50);
        
        t5.turn(-90);
        t5.forward(50);
        t5.turn(180);
        t5.forward(100);
        
        t6.turn(90);
        t6.forward(50);
        
        t7.turn(-90);
        t7.forward(50);
        
        t8.turn(-90);
        t8.forward(130);
        t8.turn(-90);
        t8.forward(220);
        t8.turn(-90);
        t8.forward(60);
        
        t9.turn(90);
        t9.forward(80);
        t9.turn(90);
        t9.forward(220);
        
        
        
    }
}