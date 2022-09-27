class ColorsRunner{
		public static void main(String[] args)
		{
		System.out.println("Started executing main method:");
		Colors.save("Red");
		Colors.save("Yellow");
		Colors.save("Green");
		Colors.save("Pink");
		Colors.save("Black");
		Colors.save("White");
		Colors.save("Purple");
		Colors.display();
		Colors.findColors("Yellow");
		System.out.println("Exit main method:");
		}
}