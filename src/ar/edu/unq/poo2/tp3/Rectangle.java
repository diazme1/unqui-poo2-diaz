package ar.edu.unq.poo2.tp3;

public class Rectangle {
	
	private Point leftInfCorner;
	private int base;
	private int height;
	
	public Rectangle(Point leftInf, int base, int height) {
		super();
		
		if (base != height){
			
			this.setLeftInfCorner(leftInf);
			this.setBase(base);
			this.setHeight(height);
		}
	}
	
	public void setLeftInfCorner(Point point) {
		this.leftInfCorner = point;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public Point getLeftInfCorner() {
		return this.leftInfCorner;
	}
	
	public Point getRightInfCorner() {
		Point pointToAdd = new Point(base, 0);
		return leftInfCorner.addPoint(pointToAdd);
	}
	
	public Point getLeftSupCorner() {
		Point pointToAdd = new Point(0, height);
		return leftInfCorner.addPoint(pointToAdd);
	}
	
	public Point getRightSupCorner() {
		Point pointToAdd = new Point(base, height);
		return leftInfCorner.addPoint(pointToAdd);
	}
	
	public Point[] getCorners() {
		
		Point[] corners = new Point[4];
		corners[0] = this.getLeftInfCorner();
		corners[1] = this.getRightInfCorner();
		corners[2] = this.getLeftSupCorner();
		corners[3] = this.getRightSupCorner();
		
		return corners;
	}
	
	public int getArea() {
		return base * height;
	}
	
	public int getPerimeter() {
		return (base * 2) + (height * 2);
	}
	
	public boolean isVertical() {
		return base < height;
	}
	
	public boolean isHorizontal() {
		return base > height;
	}
	
}
