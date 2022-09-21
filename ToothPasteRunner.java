class ToothPasteRunner{
	public static void main(String[] args){
		System.out.println("main method execution started:");
		ToothPaste.setBrand("Colgate");
		ToothPaste.setFlavour("Amino");
		ToothPaste.setWeight(500);
		ToothPaste.setIngredients("Sodium Fluoride");
		ToothPaste.setColor("White");
		ToothPaste.setPrice(215);
		ToothPaste.setShape("cylindrical hollow");
		ToothPaste.setTaste("salty");
		ToothPaste.setLength(8.2);
		ToothPaste.setWidth(4.5);
		ToothPaste.setWhitening(true);
		ToothPaste.setGermProtection(true);
		ToothPaste.setBarCode(89013);
		ToothPaste.setHeight(20);
		ToothPaste.setOffers(true);
		
		String ref1=ToothPaste.getBrand();
		System.out.println("Brand:"+ref1);
		
		String ref2=ToothPaste.getFlavour();
		System.out.println("Flavour:"+ref2);
		
		double ref3=ToothPaste.getWeight();
		System.out.println("Weight:"+ref3);
		
		String ref4=ToothPaste.getIngredients();
		System.out.println("Ingredients:"+ref4);
		
		String ref5=ToothPaste.getColor();
		System.out.println("Color:"+ref5);
		
		int ref6=ToothPaste.getPrice();
		System.out.println("Price:"+ref6);
		
		String ref7=ToothPaste.getShape();
		System.out.println("Shape:"+ref7);
		
		String ref8=ToothPaste.getTaste();
		System.out.println("Taste:"+ref8);
		
		double ref9=ToothPaste.getLength();
		System.out.println("Length:"+ref9);
		
		double ref10=ToothPaste.getWidth();
		System.out.println("Width:"+ref10);
		
		boolean ref11=ToothPaste.isWhitening();
		System.out.println("Whitening:"+ref11);
		
		boolean ref12=ToothPaste.isGermProtection();
		System.out.println("GermProtection:"+ref12);
		
		long ref13=ToothPaste.getBarCode();
		System.out.println("Barcode:"+ref13);
		
		int ref14=ToothPaste.getHeight();
		System.out.println("Height:"+ref14);
		
		boolean ref15=ToothPaste.isOffers();
		System.out.println("Offers:"+ref15);
		
		System.out.println("End main method:");
	}
}