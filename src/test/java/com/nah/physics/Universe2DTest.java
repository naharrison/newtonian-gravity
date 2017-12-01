package com.nah.physics;

import org.junit.Test;
import static org.junit.Assert.*;

import com.nah.math.Point2D;

public class Universe2DTest {
   
   @Test
   public void testDefaultConstructor() {
		Universe2D u1 = new Universe2D();
      assertEquals(u1.G, 6.67e-11, 0.1e-11);
   }

	@Test
	public void testAddMass() {
		Universe2D u1 = new Universe2D();
		Point2D p1 = new Point2D(2.0, 3.0);
		PointMass2D m1 = new PointMass2D(p1, 3.5);
		u1.addMass(m1);
      assertEquals(u1.masses.get(0).mass, 3.5, 1e-6);
	}

}

