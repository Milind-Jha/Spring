package com.dxc.standalonecollections;

import java.util.List;
import java.util.Map;

public class Pojo {
	private List<String> members;
	private Map<String,String> skills;

	public List<String> getMembers() {
		return members;
	}

	public void setMembers(List<String> members) {
		this.members = members;
	}

	public Map<String, String> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Members = " + members +"\nSkills : -\n"+skills;
	}
	
	
}
