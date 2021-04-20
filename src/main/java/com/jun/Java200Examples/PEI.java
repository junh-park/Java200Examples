package com.jun.Java200Examples;

public enum PEI {
	//Assigning default values
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue;
	
	PEI(int pie){
		this.peiValue=pie;
	}

	public int getPei() {
		return peiValue;
	}
}

