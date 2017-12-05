package com.nah.physics;

import com.nah.math.Point3D;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointMass3DTest {
   
   @Test
   public void testConstructor() {
      Point3D p1 = new Point3D(-1.0, -3.0, 5.5);
      PointMass3D m1 = new PointMass3D(p1, 938.0);
      assertEquals(m1.position.x, -1.0, 1e-6);
      assertEquals(m1.position.y, -3.0, 1e-6);
      assertEquals(m1.position.z, 5.5, 1e-6);
      assertEquals(m1.mass, 938.0, 1e-6);
   }

}

