package org;

public class TimeKeeper implements Runnable {
	private int CurrentTime ;
	Ground earth;
	TimeKeeper()
	{
		earth = new Ground(0.3);
	}
	void setTime(int argCurrentTime) {
		this.CurrentTime = argCurrentTime;
	}

	int getCurrentTime() {
		return CurrentTime;
	}

	void resetTime() {
		setTime(0);
	}

	@Override
	public void run() {
		float Offset = 0;
        Double Yvel=80d;
        Double e = 0.97;
		while(true){
		setTime(getCurrentTime() + 1);
		//System.out.println("THHH");
				CanShotM.FrameGame.repaint();
		CanShotM.P.ShootBall(Offset,0.5f, Yvel);
		if(earth.detectCollision()){
			 Offset =  Physics.Xpos;
			 Yvel =  (Yvel*e);
			System.out.println(" Yvel :"+Yvel);

			
				
			resetTime();}
		try {
			Thread.sleep(10);
		} catch (InterruptedException me) {
			me.printStackTrace();
		}

	}
}}
