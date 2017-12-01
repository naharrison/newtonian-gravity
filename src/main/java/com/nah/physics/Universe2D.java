package com.nah.physics;

import java.util.ArrayList;
import com.nah.math.Vector2D;

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

	public Vector2D getForce(int imass) { // in progress
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

}
