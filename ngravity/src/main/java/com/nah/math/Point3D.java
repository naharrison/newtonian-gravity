package com.nah.math;

public class Point3D {
	
	public double x, y, z;
	
	public Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getDistance(Point3D point) {
		return Math.sqrt((point.x - this.x)*(point.x - this.x) + (point.y - this.y)*(point.y - this.y) + (point.z - this.z)*(point.z - this.z));
	}

	public double getRadius() {
		return Math.sqrt(x*x + y*y + z*z);
	}

	public double getThetaInDegrees() {
		return Math.toDegrees(Math.acos(z/Math.sqrt(x*x + y*y + z*z)));
	}

	public double getThetaInRadians() {
		return Math.acos(z/Math.sqrt(x*x + y*y + z*z));
	}

	public double getPhiInDegrees() {
		return Math.toDegrees(Math.atan2(y, x));
	}

	public double getPhiInRadians() {
		return Math.atan2(y, x);
	}

}
