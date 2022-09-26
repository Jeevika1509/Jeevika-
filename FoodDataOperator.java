class FoodDataOperator{
	static String[] foodItem={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		foodItem[position]=name;
		position++;
		System.out.println("Saved name:"+name+"at position"+position);
	}
	
	static void display()
	{
		for (int index=0;index<foodItem.length;index++)
		{
			 String ref=foodItem[index];
			 System.out.println("List of food items are:"+ref);
		}
	}
}
	