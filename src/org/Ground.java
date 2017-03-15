package org;

import java.awt.Rectangle;

public class Ground {
	int GroundLen =1366;
	int GroundHeight = 92;
	double e;
	Ground(double d) {
    e = d;
	}
	
	Rectangle getGroundRect()
	{
		return new Rectangle(0,620,1366,92);
	}
	
	Boolean detectCollision()
	{
		if (getGroundRect().intersects(Physics.getShotRect()))
				{System.out.println("collision occured");
	            return true;
				}
		else 
			return false;
		}
}
