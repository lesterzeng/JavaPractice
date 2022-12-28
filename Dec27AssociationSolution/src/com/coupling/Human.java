package com.coupling;

public class Human {
	 Brain brain;
	 HeartBeat heartBeat;
	
	public Human() {
		 brain=new Brain("70%",300.56f);
		 heartBeat=new HeartBeat(72, 500,"96%");
	}
}
