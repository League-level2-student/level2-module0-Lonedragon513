package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
public static void main(String[] args) {
	Robot[] r = new Robot [5];
	
	for (int i = 0; i < 5; i++) {
		r[i] = new Robot();
		r[i].setX(800-(i*50));
		r[i].setY(600);
		r[i].setSpeed(1000);
		}
	Random ra = new Random ();
	
	
	
	//for (int i = 0; i > -5; i++) {
		
	
+
	for (int b = 0; b < 5; b++) {
			System.out.println(b);
		int a = ra.nextInt(500);
		r[b].move(a);
		
		
		}
	
	}
//	}
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
