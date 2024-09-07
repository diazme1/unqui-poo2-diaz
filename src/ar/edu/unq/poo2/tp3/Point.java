package ar.edu.unq.poo2.tp3;

public class Point {

	private int x;
	private int y;
	
	public Point() {
		super();
		
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		super();
		
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public String toString() {
		return "("+ x + "," + y + ")" ;
	}
	
	public void setX(int newX) {
		
		this.x = newX;
	}
	
	public void setY(int newY) {
		
		this.y = newY;
	}
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
	}
	
	public void movePoint(int newX, int newY) {
		
		this.setX(newX);
		this.setY(newY);
	}
	
	public Point addPoint(Point point) {
		
		int x = this.getX() + point.getX();
		int y = this.getY() + point.getY();
		
		return new Point(x, y);
	}
}
