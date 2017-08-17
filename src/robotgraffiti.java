import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
public static void main(String[] args) {
Robot matrix = new Robot ();
matrix.penDown();
matrix.setSpeed(10);
matrix.move(200);
matrix.turn(90);
matrix.move(50);
matrix.turn(90);
matrix.move(50);
matrix.turn(90);
matrix.move(50);
matrix.penUp();
matrix.turn(180);
matrix.move(100);
matrix.turn(-90);
matrix.move(50);
matrix.penDown();
matrix.move(50);
}
}
