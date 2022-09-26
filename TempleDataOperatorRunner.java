class TempleDataOperatorRunner{
	public static void main(String[] args)
	{
		System.out.println("Started executing main method:");
		TempleDataOperator.save("ISKCON");
		TempleDataOperator.save(" Banashankari Temple");
		TempleDataOperator.save("Ragigudda Anjaneya Temple");
		TempleDataOperator.save("Dodda Ganesha Temple");
		TempleDataOperator.save("The Nandhi Temple");
		TempleDataOperator.display();
		System.out.println("Exit main method:");
	}
}