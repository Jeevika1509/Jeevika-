class MovieDataOperatorRunner{
	public static void main(String[] args)
	{
		System.out.println("Started executing main method:");
		MovieDataOperator.save("Sita Ramam");
		MovieDataOperator.save("Conjuring");
		MovieDataOperator.save("Interstellar");
		MovieDataOperator.save("Mungaru male");
		MovieDataOperator.save("Vikram");
		MovieDataOperator.display();
		System.out.println("Exit main method:");
	}
}