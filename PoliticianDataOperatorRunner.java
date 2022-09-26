class PoliticianDataOperatorRunner{
	public static void main(String[] args)
	{
		System.out.println("Started executing main method:");
		PoliticianDataOperator.save("Somanna");
		PoliticianDataOperator.save("Narendra Modi");
		PoliticianDataOperator.save("Amit Shah");
		PoliticianDataOperator.save("Yediyurappa");
		PoliticianDataOperator.save("kumaraswamy");
		PoliticianDataOperator.display();
		System.out.println("Exit main method:");
	}
}