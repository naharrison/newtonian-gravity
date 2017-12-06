package com.nah.physics;

import com.nah.math.Point2D;
import com.nah.math.Vector2D;

public class PointMass2D {
	
	public Point2D position;
	public double mass;
	
	public PointMass2D(Point2D position, double mass) {
		this.position = position;
		this.mass = mass;
	}

	public Vector2D getM1M2OverR2Vector(PointMass2D otherMass) {
		double magnitude = mass*otherMass.mass/Math.pow(position.getDistance(otherMass.position), 2.0);
		double angle = Math.atan2(otherMass.position.y - position.y, otherMass.position.x - position.x);
		return new Vector2D(magnitude*Math.cos(angle), magnitude*Math.sin(angle));
	}

}
