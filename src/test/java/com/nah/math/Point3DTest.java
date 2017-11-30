package com.nah.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class Point3DTest {
	
	@Test
	public void testGetDistance() {
		Point3D p1 = new Point3D(2.0, 3.0, 11.0);
		Point3D p2 = new Point3D(-1.0, -1.0, -1.0);
		assertEquals(p1.getDistance(p2), 13.0, 1e-6);
		assertEquals(p2.getDistance(p1), 13.0, 1e-6);
	}

}
