package com.nah.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class Point2DTest {
	
	@Test
	public void testGetDistance() {
		Point2D p1 = new Point2D(2.0, 3.0);
		Point2D p2 = new Point2D(-1.0, -1.0);
		assertEquals(p1.getDistance(p2), 5.0, 1e-6); // 3rd arg is tolerence (delta)
		assertEquals(p2.getDistance(p1), 5.0, 1e-6);
		assertEquals(p2.getDistance(p1), 1.234, 1e-6);
	}

}
