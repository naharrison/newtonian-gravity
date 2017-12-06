package com.nah.physics;

import com.nah.math.Point2D;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointMass2DTest {
   
   @Test
   public void testConstructor() {
      Point2D p1 = new Point2D(-1.0, -3.0);
      PointMass2D m1 = new PointMass2D(p1, 938.0);
      assertEquals(m1.position.x, -1.0, 1e-6);
      assertEquals(m1.position.y, -3.0, 1e-6);
      assertEquals(m1.mass, 938.0, 1e-6);
   }

}

