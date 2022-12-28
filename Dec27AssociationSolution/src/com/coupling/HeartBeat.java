package com.coupling;

public class HeartBeat {
	private int hr;
	private float weight;
	private String spo2;
	
	public HeartBeat(int hr, float weight, String spo2) {
		super();
		this.hr = hr;
		this.weight = weight;
		this.spo2 = spo2;
	}
	public int getHr() {
		return hr;
	}
	public float getWeight() {
		return weight;
	}
	public String getSpo2() {
		return spo2;
	}
}
