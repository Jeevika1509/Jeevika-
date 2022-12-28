package com.xworkz.examples.DTO;

public class GamesDTO {

	private String name;
	private String type;
	private Integer noOfPlayers;
	
	public GamesDTO() {
		System.out.println("running constructor with no arguments");
	}

	public GamesDTO(String name, String type, Integer noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}
	
	public boolean equals(Object ref) {
		System.out.println("running equals method from Games DTO");
		if(ref!=null) {
			if(ref instanceof GamesDTO) {
				GamesDTO dto=(GamesDTO)ref;
				if(dto.name.equals(this.name) && dto.type.equals(this.type) && dto.noOfPlayers.equals(this.noOfPlayers)){
					System.out.println("name is matching:"+dto.name+"type is matching:"+dto.type+"noOfPlayers is matching:"+dto.noOfPlayers);
				return true;
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "GamesDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
}
