class Card{
	static String type;
	static double height;
	static double width;
	static  int price; 
	static String[] colors;
	
	static void displayDetails()
	{
	System.out.println(type);
	System.out.println(height);
	System.out.println(width);
	System.out.println(price);
	
	if(colors!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<colors.length;position++){
		String ref=colors[position];
		System.out.println(ref +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	
}
}