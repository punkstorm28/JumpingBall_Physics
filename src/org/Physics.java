package org;
import java.awt.Rectangle;
import java.lang.Math;
public class Physics {
	TimeKeeper Time;
	private float Acceleration = 0.47f;
	 static Float Xinit;
	private final Float Yinit;
	
	static  float Xpos=0;
	static float Ypos;

	Physics() {
		Ypos = 620;
		Xinit = 0.5f;
		Yinit = 80f;
		Time = new TimeKeeper();
		Thread timeThread = new Thread(Time);
		timeThread.start();
	}
	
	float abs(float argNumber)
	{
		if(argNumber>0)
			return argNumber;
		if(argNumber == 0)
			return 0;
		else 
			return -(argNumber);
	}
	void ShootBall(float Xoffset,float Xinit , Double yvel)
	{
		
		Xpos = (float) (Xinit*Time.getCurrentTime())+Xoffset;
		Ypos = -((float)(yvel*Time.getCurrentTime()-0.5*Acceleration*Time.getCurrentTime()*Time.getCurrentTime()))/10 -113;
		//System.out.println("Ypos is :" +Ypos);
		//System.out.println("The time is :"+Time.getCurrentTime());
	}
static	float getXpos()
	{
		return Xpos;
	}
	static float getYpos()
	{
		return (Ypos+700);
	}
	static  Rectangle getShotRect()
	{
		return new Rectangle((int)getXpos(),(int)getYpos(),40,40);
	}

}
