package com.nah.physics;

import java.util.ArrayList;
import java.util.Collections;
import com.nah.math.Vector2D;
import com.nah.math.Dimensions2D;

public class Universe2D {
	
	public double G;
	public ArrayList<PointMass2D> masses;
	
	public Universe2D() {
		G = 6.67e-11;
		masses = new ArrayList<>();
	}
	
	public Universe2D(double G) {
		this.G = G;
		masses = new ArrayList<>();
	}
	
	public void addMass(PointMass2D mass) {
		masses.add(mass);
	}

	public Vector2D getForce(int imass) {
		if(imass < 0 || imass >= masses.size()) return null;
		double fx = 0.0;
		double fy = 0.0;
		for(int k = 0; k < masses.size(); k++) {
			if(k != imass) {
				fx = fx + G*masses.get(imass).getM1M2OverR2Vector(masses.get(k)).x;
				fy = fy + G*masses.get(imass).getM1M2OverR2Vector(masses.get(k)).y;
			}
		}
		return new Vector2D(fx, fy);
	}

	/**
	 * Returns xstart, xwidth, ystart, and ywidth in the form of a Dimensions2D
	 */
	public Dimensions2D getDimensions() {
		if(masses.size() == 0 || masses.size() == 1) return new Dimensions2D(0.0, 0.0, 0.0, 0.0);
		ArrayList<Double> xvals = new ArrayList<>();
		ArrayList<Double> yvals = new ArrayList<>();
		for(int k = 0; k < masses.size(); k++) {
			xvals.add(masses.get(k).position.x);
			yvals.add(masses.get(k).position.y);
		}
		Collections.sort(xvals);
		Collections.sort(yvals);
		return new Dimensions2D(xvals.get(0), xvals.get(masses.size()-1) - xvals.get(0), yvals.get(0), yvals.get(masses.size()-1) - yvals.get(0));
	}

}
