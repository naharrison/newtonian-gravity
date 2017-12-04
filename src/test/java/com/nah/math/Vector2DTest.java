package com.nah.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class Vector2DTest {
	
	@Test
	public void testVector2D() {
		Vector2D v1 = new Vector2D(3.0, 4.0);
		assertEquals(v1.x, 3.0, 1e-6);
		assertEquals(v1.getMagnitude(), 5.0, 1e-6);
		assertEquals(v1.getThetaInDegrees(), Math.toDegrees(Math.atan2(4.0, 3.0)), 1e-6);
		assertEquals(v1.getThetaInRadians(), Math.atan2(v1.y, 3.0), 1e-6);
	}

}
