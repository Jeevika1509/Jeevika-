class Product{
public static void main(String[] products){
		System.out.println("Started executing main method:");
		String name=products[0];
		String type=products[1];
		String price=products[2];
		String quantity=products[3];
		String quality=products[4];

		System.out.println("product name:"+name);

		System.out.println("product type:"+type);

		System.out.println("product price:"+price);

		System.out.println("product quantity:"+quantity);

		System.out.println("product quality:"+quality);

		int convertedPrice=Integer.parseInt(price);

		System.out.println("Converted Price:"+convertedPrice);

		int convertedQuantity=Integer.parseInt(quantity);

		System.out.println("Converted Quantity:"+convertedQuantity);

        float convertedQuality=Float.parseFloat(quality);

        System.out.println("Converted Quality:"+convertedQuality);

        int totalPrice=convertedPrice*convertedQuantity;

        System.out.println("Total Price:"+totalPrice);
		
		System.out.println("Exit main method:");


}
}