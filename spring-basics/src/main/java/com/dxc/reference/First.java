package com.dxc.reference;

public class First {
	private int x;
	private Second second;
	
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}
	public First(int x, Second second) {
		super();
		this.x = x;
		this.second = second;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Second getSecond() {
		return second;
	}
	public void setSecond(Second second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "First [x=" + x + ", second=" + second + "]";
	}
	
	
	
}
