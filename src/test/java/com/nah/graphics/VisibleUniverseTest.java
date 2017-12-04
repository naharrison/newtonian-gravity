package com.nah.graphics;

import org.junit.Test;
import static org.junit.Assert.*;

import com.nah.physics.Universe2D;

public class VisibleUniverseTest {
	
	@Test
	public void testConstructor() {
		VisibleUniverse vu1 = new VisibleUniverse(new Universe2D());
		assertEquals(vu1.universe.G, 6.67e-11, 0.1e-11);
	}

}
