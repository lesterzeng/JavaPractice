package com.coupling;

public class Brain {
	private String IQ;
	private float weight;
	public String getIQ() {
		return IQ;
	}
	public float getWeight() {
		return weight;
	}
	public Brain(String iQ, float weight) {
		super();
		IQ = iQ;
		this.weight = weight;
	}
}
