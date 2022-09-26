class GraduateDataOperatorRunner{
	public static void main(String[] args)
	{
		System.out.println("Started executing main method:");
		GraduateDataOperator.save("Jeevika");
		GraduateDataOperator.save("Rashmi");
		GraduateDataOperator.save("Sinchana");
		GraduateDataOperator.save("Spoorthi");
		GraduateDataOperator.save("Abhigjna");
		GraduateDataOperator.display();
		System.out.println("Exit main method:");
	}
}