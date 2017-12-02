package com.nah.graphics;

import javax.swing.*;
import java.awt.*;
import com.nah.physics.Universe2D;
import com.nah.physics.PointMass2D;

public class VisibleUniverse extends JFrame {

	public Universe2D universe;
	public int maxJFrameDimension = 800; // pixels
	public int marginSize = 25; // pixels

	public VisibleUniverse(Universe2D universe) {
		super();
		this.universe = universe;

		int frameWidth, frameHeight;
		if(universe.getDimensions().xwidth >= universe.getDimensions().ywidth) {
			frameWidth = maxJFrameDimension;
			frameHeight = (int) (maxJFrameDimension*(universe.getDimensions().ywidth/universe.getDimensions().xwidth));
		}
		else {
			frameHeight = maxJFrameDimension;
			frameWidth = (int) (maxJFrameDimension*(universe.getDimensions().xwidth/universe.getDimensions().ywidth));
		}

		setSize(frameWidth, frameHeight);
		setLocation(150, 150);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		for(PointMass2D mass : universe.masses) {
			double xpixel = (mass.position.x - universe.getDimensions().xstart)/universe.getDimensions().xwidth;
			xpixel = xpixel*(getWidth() - 2.0*marginSize) + marginSize;
			xpixel = xpixel - Math.sqrt(2.0)*10.0; // to shift to center (instead of top left) (10 = radius)
			double ypixel = (mass.position.y - universe.getDimensions().ystart)/universe.getDimensions().ywidth;
			ypixel = ypixel*(getHeight() - 2.0*marginSize) + marginSize;
			ypixel = getHeight() - ypixel;
			ypixel = ypixel - Math.sqrt(2.0)*10.0;
			g.fillOval((int) xpixel, (int) ypixel, 20, 20);
			System.out.println(xpixel + " " + ypixel);
		}
	}

}
