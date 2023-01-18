package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class SoldierDTO extends AbstractAuditDTO{

	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="name must be >3 and <20")
	private String name;
	@Min(value=1,message="id must be greater than 1")
	@Max(value=1000,message="id must be less thyan 1000")
	private int id;
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="rank must be >3 and <20")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="batallion must be >3 and <20")
	private String batallion;
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="country name must be >3 and <20")
	private String country;
	
}
