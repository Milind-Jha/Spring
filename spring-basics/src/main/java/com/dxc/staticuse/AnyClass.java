package com.dxc.staticuse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnyClass {
	
	@Value("#{ T(com.dxc.staticuse.AnotherClass).sqrt(5) }")
	private double z;
	
	private boolean check;

	public boolean isCheck() {
		return check;
	}
	
	@Value("#{1>0}")
	public void setCheck(boolean check) {
		System.out.println("setter used for boolean");
		this.check = check;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "AnyClass : " + z+" check : "+ check;
	}
	
}
