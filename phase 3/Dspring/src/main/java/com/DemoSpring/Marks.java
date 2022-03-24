package com.DemoSpring;

public class Marks {
	private float phy;
	private float chem;
	private float math;
	
	public Marks() {
		
	}

	public Marks(float phy, float chem, float math) {
		super();
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}

	public float getPhy() {
		return phy;
	}

	public void setPhy(float phy) {
		this.phy = phy;
	}

	public float getChem() {
		return chem;
	}

	public void setChem(float chem) {
		this.chem = chem;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Marks [phy=" + phy + ", chem=" + chem + ", math=" + math + "]";
	}
	

}
