package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Window;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		Location newloc;
		
		switch(currentDirection) {
			case RIGHT:
				newloc = new Location(head.getLocation().x+1, head.getLocation().y);
				break;
			case LEFT:
				newloc = new Location(head.getLocation().x-1, head.getLocation().y);
				break;
			case UP:
				newloc = new Location(head.getLocation().x, head.getLocation().y-1);
				break;
			default:
				newloc = new Location(head.getLocation().x, head.getLocation().y+1);
				break;
		
		}

		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		for (int i = snake.size()-1; i > 0 ; i--) {
			snake.get(i).setLocation(snake.get(i-1).getLocation());
		}
		
		//3. set the location of the head to the new location calculated in step 1
		head.setLocation(newloc);

		//4. set canMove to true
		canMove = true;
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
			if (currentDirection == Direction.RIGHT && d == Direction.LEFT) {
				canMove = false;
			} 
			if (currentDirection == Direction.LEFT && d == Direction.RIGHT) {
				canMove = false;
			} 
			if (currentDirection == Direction.UP && d == Direction.DOWN) {
				canMove = false;
			}
			if (currentDirection == Direction.DOWN && d == Direction.UP) {
				canMove = false;
			}
			
			if (canMove == true) {
				currentDirection = d;
		}
		canMove = false;
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head
		head.setLocation(loc);
		//3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		boolean outOfBounds = false;
		
		if (head.getLocation().x > _00_SnakeGame.WIDTH-1|| head.getLocation().y > _00_SnakeGame.HEIGHT-1 || head.getLocation().x < 0 || head.getLocation().y < 0) {
			outOfBounds = true;
		}
		System.out.println(head.getLocation().x +  "," + head.getLocation().y);
		
		return outOfBounds;
	}
	
	public boolean isHeadCollidingWithBody() {
		System.out.println("a;lksdjf e");
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		boolean isHeadCollidingWithBody = false;
		
		for (int i = 0; i < snake.size(); i++) {
			if (head.getLocation().equals(snake.get(i).getLocation())) {
				isHeadCollidingWithBody = true;
			}
		}
		System.out.println(isHeadCollidingWithBody + "\\\n");
		return isHeadCollidingWithBody;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		boolean isLocationOnSnake = false;
		
		for (int i = 0; i < snake.size(); i++) {
						
			if (loc.equals(snake.get(i).getLocation())) {
				isLocationOnSnake = true;
			}
		}
	
		return isLocationOnSnake;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
