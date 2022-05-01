package com.dxc.constructorinjection;

public class Resume {
	
	private String qualification;
	private float workExperinece;

	public Resume(String qualification, float workExperinece) {
		super();
		this.qualification = qualification;
		this.workExperinece = workExperinece;
	}

	@Override
	public String toString() {
		return " [qualification=" + qualification + ", workExperinece=" + workExperinece + "]";
	}
	
}
