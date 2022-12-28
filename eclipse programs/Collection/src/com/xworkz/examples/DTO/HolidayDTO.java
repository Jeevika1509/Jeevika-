package com.xworkz.examples.DTO;

public class HolidayDTO {
	
	private String name;
	private String day;
	private String month;
	
	public HolidayDTO() {
		System.out.println("running holiday DTO with no arguments");
	}

	public HolidayDTO(String name, String day, String month) {
		super();
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public boolean equals(Object ref) {
		System.out.println("running equals method from Holiday DTO");
		if(ref!=null) {
			if(ref instanceof HolidayDTO) {
				HolidayDTO dto=(HolidayDTO)ref;
				if(dto.name.equals(this.name) && dto.day.equals(this.day) && dto.month.equals(this.month)){
					System.out.println("name is matching:"+dto.name+"day is matching:"+dto.day+"month is matching:"+dto.month);
				return true;
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "HolidayDTO [name=" + name + ", day=" + day + ", month=" + month + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	

}
