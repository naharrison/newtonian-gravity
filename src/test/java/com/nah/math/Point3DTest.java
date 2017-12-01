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

	@Test
	public void testGetRadius() {
		Point3D p1 = new Point3D(3.0, 4.0, 12.0);
		assertEquals(p1.getRadius(), 13.0, 1e-6);
	}

	@Test
	public void testGetThetaInDegrees() {
		Point3D p1 = new Point3D(3.0, 4.0, 12.0);
		assertEquals(p1.getThetaInDegrees(), Math.toDegrees(Math.atan2(5.0, 12.0)), 1e-6);
	}

	@Test
	public void testGetThetaInRadians() {
		Point3D p1 = new Point3D(3.0, 4.0, 12.0);
		assertEquals(p1.getThetaInRadians(), Math.atan2(5.0, 12.0), 1e-6);
	}

	@Test
	public void testGetPhiInDegrees() {
		Point3D p1 = new Point3D(3.0, 4.0, 12.0);
		assertEquals(p1.getPhiInDegrees(), Math.toDegrees(Math.atan2(4.0, 3.0)), 1e-6);
	}

}
