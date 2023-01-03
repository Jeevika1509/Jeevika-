package com.xworkz.examples.DTO;

public class DaughterDTO {

	private String name;
	private long mobile;
	private int age;
	private boolean committed;
	private boolean alive;
	
	public DaughterDTO() {
		System.out.println("running constructor with no arguments");
	}

	public DaughterDTO(String name, long mobile, int age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}

	@Override
	public int hashCode() {
		return 30;
	}
	public boolean equals(Object ref) {
		System.out.println("running equals method from Daughter DTO");
		if(ref!=null) {
			if(ref instanceof DaughterDTO) {
				DaughterDTO dto=(DaughterDTO)ref;
				if(dto.name.equals(this.name)){
					System.out.println("name is matching:"+dto.name);
				return true;
				}
			}
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
}
