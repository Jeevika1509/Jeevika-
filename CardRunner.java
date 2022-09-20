class CardRunner{
	public static void main(String[] card)
	{
		System.out.println("main: start");
		
		Card.displayDetails();
		Card.type="MetroCard";
		Card.height=86D;
		Card.width= 54D;
		Card.price=50;
	
	String[] things={"blue","purple"};
		Card.colors=things;
		 Card.displayDetails();
		 
		 System.out.println("main: end");
		 
		
	}
}