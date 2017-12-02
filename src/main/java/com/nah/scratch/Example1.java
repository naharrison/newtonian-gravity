package com.nah.scratch;

import com.nah.math.Point2D;
import com.nah.physics.PointMass2D;
import com.nah.physics.Universe2D;
import com.nah.graphics.VisibleUniverse;

public class Example1 {

	public static void main(String[] args) {

		Universe2D u = new Universe2D(0.5);
		u.addMass(new PointMass2D(new Point2D(-1, -1), 5));
		u.addMass(new PointMass2D(new Point2D(7, 1), 4));
		u.addMass(new PointMass2D(new Point2D(-2, 0), 2));

		VisibleUniverse vu = new VisibleUniverse(u);
		vu.setVisible(true);

	}

}
