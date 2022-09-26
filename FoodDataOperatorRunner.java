class FoodDataOperatorRunner{
	public static void main(String[] args)
	{
		System.out.println("Started executing main method:");
		FoodDataOperator.save("Dosa");
		FoodDataOperator.save("Vada");
		FoodDataOperator.save("Puri");
		FoodDataOperator.save("Roti");
		FoodDataOperator.save("Upma");
		FoodDataOperator.display();
		System.out.println("Exit main method:");
	}
}