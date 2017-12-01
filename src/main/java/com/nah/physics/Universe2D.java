package com.nah.physics;

import java.util.ArrayList;

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

}
