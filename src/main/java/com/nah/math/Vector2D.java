package com.nah.math;

public class Vector2D {
	
	public double x, y;
	
	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getMagnitude() {
		return Math.sqrt(x*x + y*y);
	}

	public double getThetaInDegrees() {
		return Math.toDegrees(Math.atan2(y, x));
	}

	public double getThetaInRadians() {
		return Math.atan2(y, x);
	}

}
