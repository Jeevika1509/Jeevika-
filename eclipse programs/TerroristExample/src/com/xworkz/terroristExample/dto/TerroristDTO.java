package com.xworkz.terroristExample.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
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
public class TerroristDTO extends AbstractAuditDTO{
	
	@NotNull(message="Name cannot be null")
	@NotEmpty(message="Name cannot be empty")
	@Size(max=30,min=3,message="name should be between 3 and 20")
	private String name;
	@Max(value=100,message="age should be less than 100")
	@Min(value=4,message="age should be more than 4")
	private int age;
	@NotNull(message="country Name cannot be null")
	@NotEmpty(message="country Name cannot be empty")
	@Size(max=20,min=3,message="country name should be between 3 and 20")
	private String country;
	private boolean alive;
	private boolean prison;
	@NotNull(message="specialization cannot be null")
	@NotEmpty(message="specialization cannot be empty")
	@Size(max=20,min=3,message="specialization should be between 3 and 20")
	private String specialization;
	@NotNull(message="organization cannot be null")
	@NotEmpty(message="organization cannot be empty")
	@Size(max=20,min=3,message="organization should be between 3 and 20")
	private String organization;
	
	

}
