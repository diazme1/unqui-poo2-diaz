package ar.edu.unq.poo2.tp3;

public class Main {
	public static void main(String[] args) {
		
		Point startCorner = new Point(1,1);
		Rectangle rectangle = new Rectangle(startCorner, 5, 2);
		
		StringBuilder printCorners = new StringBuilder();
        Point[] corners = rectangle.getCorners();
        for (int i = 0; i < corners.length; i++) {
            printCorners.append(corners[i].toString()); // Llama a toString() para cada Point
            if (i < corners.length - 1) {
                printCorners.append(", ");
            }
        }

		System.out.println("Starter Point: " + startCorner);
        System.out.println("Base: " + rectangle.getBase());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Corners: " + printCorners);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
