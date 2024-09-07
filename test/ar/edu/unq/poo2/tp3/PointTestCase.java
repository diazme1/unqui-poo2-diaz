package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

	@Test
	void testCreatePointArguments() {
		Point point = new Point(1,2);
		assertEquals(1, point.getX());
		assertEquals(2, point.getY());
	}

	@Test
	void testCreatePointDefault() {
		Point point = new Point();
		assertEquals(0, point.getX());
		assertEquals(0, point.getY());
	}
	
	@Test
	void testMovePoint() {
		Point point = new Point();
		point.movePoint(5, 8);
		assertEquals(5, point.getX());
		assertEquals(8, point.getY());
	}
	
	@Test
	void testAddPoints() {
		Point frstPoint = new Point(5, 6);
		Point scndPoint = new Point(5, 4);
		Point resultPoint = frstPoint.addPoint(scndPoint);
		assertEquals(10, resultPoint.getX());
		assertEquals(10, resultPoint.getY());
	}
	
	
}
