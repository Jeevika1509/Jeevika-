package com.xworkz.copy.examples;

public class Currency {
	
		
		private String name;
		private String country;
		private String symbol;
		private boolean acceptable;
		private String color;
		private String material;
		private int convertingPrice;
	    private int yearOfIssue;
		private String type;
		private int serialNumber;
	   
	   
		public Currency() {
			
		}
		
		



		public Currency(String name, String country, String symbol, boolean acceptable, String color, String material,
				int convertingPrice, int yearOfIssue, String type, int serialNumber) {
			super();
			this.name = name;
			this.country = country;
			this.symbol = symbol;
			this.acceptable = acceptable;
			this.color = color;
			this.material = material;
			this.convertingPrice = convertingPrice;
			this.yearOfIssue = yearOfIssue;
			this.type = type;
			this.serialNumber = serialNumber;
		}





		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}



		public void setCountry(String country) {
			this.country = country;
		}



		public String getSymbol() {
			return symbol;
		}



		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}



		public boolean isAcceptable() {
			return acceptable;
		}



		public void setAcceptable(boolean acceptable) {
			this.acceptable = acceptable;
		}



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public String getMaterial() {
			return material;
		}



		public void setMaterial(String material) {
			this.material = material;
		}



		public int getConvertingPrice() {
			return convertingPrice;
		}



		public void setConvertingPrice(int convertingPrice) {
			this.convertingPrice = convertingPrice;
		}
		
		

		




		public int getYearOfIssue() {
			return yearOfIssue;
		}





		public void setYearOfIssue(int yearOfIssue) {
			this.yearOfIssue = yearOfIssue;
		}





		public String getType() {
			return type;
		}





		public void setType(String type) {
			this.type = type;
		}





		public int getSerialNumber() {
			return serialNumber;
		}





		public void setSerialNumber(int serialNumber) {
			this.serialNumber = serialNumber;
		}





		
		@Override
		public String toString() {
			return "Currency [name=" + name + ", country=" + country + ", symbol=" + symbol + ", acceptable="
					+ acceptable + ", color=" + color + ", material=" + material + ", convertingPrice="
					+ convertingPrice + ", yearOfIssue=" + yearOfIssue + ", type=" + type + ", serialNumber="
					+ serialNumber + "]";
		}





		public boolean equals(Object obj) {
			System.out.println("running equals method");
			if(obj instanceof Currency) {
				System.out.println("obj is currency,can check the properties");
				Currency curr=(Currency)obj;
				if(this.name.equals(curr.name)) {
					System.out.println("name is same");
					return true;
				}
			}
			else {
				System.out.println("obj is not currency,cannot check properties");
			}
			return false;
		}

	

}
