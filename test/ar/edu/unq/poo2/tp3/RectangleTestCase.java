package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTestCase {


	@Test
	void testCreateRectangle() {
		
		Point startCorner = new Point(1,1);
		Rectangle rectangle = new Rectangle(startCorner, 2, 1);
		
		//InfIzquierda = (1,1)
		assertEquals(rectangle.getLeftInfCorner().getX() , 1);
		assertEquals(rectangle.getLeftInfCorner().getY() , 1);
		//SupIzquierda = (1,2)
		assertEquals(rectangle.getLeftSupCorner().getX(), 1);
		assertEquals(rectangle.getLeftSupCorner().getY(), 2);
		//InfDerecha = (3,1)
		assertEquals(rectangle.getRightInfCorner().getX(), 3);
		assertEquals(rectangle.getRightInfCorner().getY(), 1);
		//SupDerecha = (3,2)
		assertEquals(rectangle.getRightSupCorner().getX(), 3);
		assertEquals(rectangle.getRightSupCorner().getY(), 2);
	}
	
	@Test
	void testCreateRectangleWrong() {
		Point startCorner = new Point(1,1);
		Rectangle rectangle = new Rectangle(startCorner, 2, 2);
		
		assertNull(rectangle.getLeftInfCorner()); //Default de Point es null.
		assertEquals(rectangle.getBase(), 0); //Default de int es 0.
		assertEquals(rectangle.getHeight(), 0); //Default de int es 0.
	}
	
	@Test
	void testGetArea() {
		Point startCorner = new Point(1,1);
		Rectangle rectangle = new Rectangle(startCorner, 3, 2);
		
		assertEquals(rectangle.getArea(), 6);
	}
	
	@Test
	void testGetPerimeter() {
		Point startCorner = new Point(1,1);
		Rectangle rectangle = new Rectangle(startCorner, 3, 2);
		
		assertEquals(rectangle.getPerimeter(), 10);
	}
	
	@Test
	void testIsVertical() {
		Point startCorner = new Point(1,1);
		Rectangle rectangle = new Rectangle(startCorner, 2, 5);
		
		assertTrue(rectangle.isVertical());
	}
	
	@Test
	void testIsHorizontal() {
		Point startCorner = new Point(1,1);
		Rectangle rectangle = new Rectangle(startCorner, 5, 2);
		
		assertTrue(rectangle.isHorizontal());
	}

}
