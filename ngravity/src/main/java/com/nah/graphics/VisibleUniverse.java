package com.nah.graphics;

import javax.swing.*;
import java.awt.*;
import com.nah.math.Vector2D;
import com.nah.physics.Universe2D;
import com.nah.physics.PointMass2D;

public class VisibleUniverse extends JFrame {

	public Universe2D universe;
	public int maxJFrameDimension = 900; // pixels
	public int marginSize = 50; // pixels

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

		int index = 0;
		for(PointMass2D mass : universe.masses) {
			int radius = 10; // pixels
			double xpixel = (mass.position.x - universe.getDimensions().xstart)/universe.getDimensions().xwidth;
			xpixel = xpixel*(getWidth() - 2.0*marginSize) + marginSize;
			double ypixel = (mass.position.y - universe.getDimensions().ystart)/universe.getDimensions().ywidth;
			ypixel = ypixel*(getHeight() - 2.0*marginSize) + marginSize;
			ypixel = getHeight() - ypixel;
			g.fillOval((int) (xpixel - Math.sqrt(2.0)*radius), (int) (ypixel - Math.sqrt(2.0)*radius), 2*radius, 2*radius); // to shift to center (instead of top left)

			// now draw force vectors
			Vector2D force = universe.getForce(index);
			double forcePixelLength = 40;
			g.drawLine((int) xpixel, (int) ypixel, (int) (xpixel + forcePixelLength*force.x/force.getMagnitude()), (int) (ypixel - forcePixelLength*force.y/force.getMagnitude()));

			index++;
		}

	}

}
