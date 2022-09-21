class GroceriesRunner{
	public static void main(String[] args){
		System.out.println("main method execution started:");
		Groceries.setGroceryName("Maggie");
		Groceries.setWeight(70);
		Groceries.setColor("yelllow");
		Groceries.setPrice(20);
		Groceries.setShape("Square");
		Groceries.setIngredient("Wheat Flour");
		Groceries.setQuality("good");
		Groceries.setOffers(true);
		Groceries.setBarcode(890105);
		Groceries.setLength(1);
		Groceries.setGST(5);
		Groceries.setProfit(true);
		Groceries.setWidth(5);
		Groceries.setHeight(12);
		
		String ref1=Groceries.getGroceryName();
		System.out.println("Grocery Name:"+ref1);
		
		double ref2=Groceries.getWeight();
		System.out.println("Weight:"+ref2);
		
		String ref3=Groceries.getColor();
		System.out.println("color:"+ref3);
		
		int ref4=Groceries.getPrice();
		System.out.println("Price:"+ref4);
		
		String ref5=Groceries.getShape();
		System.out.println("Shape:"+ref5);
		
		String ref6=Groceries.getIngredient();
		System.out.println("Ingredient:"+ref6);
		
		String ref7=Groceries.getQuality();
		System.out.println("Grocery Quality:"+ref7);
		
		boolean ref8=Groceries.isOffers();
		System.out.println("Grocery Offers:"+ref8);
		
		long ref9=Groceries.getBarcode();
		System.out.println("Grocery Barcode:"+ref9);
		
		int ref10=Groceries.getLength();
		System.out.println("Length:"+ref10);
		
		int ref11=Groceries.getGST();
		System.out.println("Grocery GST %:"+ref11);
		
		boolean ref12=Groceries.isProfit();
		System.out.println("Grocery Profit:"+ref12);
		
		double ref13=Groceries.getWidth();
		System.out.println("Width:"+ref13);
		
		double ref14=Groceries.getHeight();
		System.out.println("height:"+ref14);
		
	}
}
		
		