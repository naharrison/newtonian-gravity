package com.nah.graphics;

import javax.swing.*;
import java.awt.*;
import com.nah.physics.Universe2D;

public class VisibleUniverse extends JFrame {

	public Universe2D universe;

	public VisibleUniverse(Universe2D universe) {
		super();
		this.universe = universe;

		int frameWidth, frameHeight;
		if(universe.getDimensions().x >= universe.getDimensions().y) {
			frameWidth = 800;
			frameHeight = (int) (800.0*(universe.getDimensions().y/universe.getDimensions().x));
		}
		else {
			frameHeight = 800;
			frameWidth = (int) (800.0*(universe.getDimensions().x/universe.getDimensions().y));
		}

		setSize(frameWidth, frameHeight);
		setLocation(150, 150);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(50, 50, 20, 20);
	}

}
