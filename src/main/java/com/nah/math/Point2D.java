package com.nah.math;

public class Point2D {
	
	public double x, y;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(Point2D point) {
		return Math.sqrt((point.x - this.x)*(point.x - this.x) + (point.y - this.y)*(point.y - this.y));
	}

}
