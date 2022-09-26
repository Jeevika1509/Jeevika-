class TempleDataOperator{
	static String[] templeNames={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		templeNames[position]=name;
		position++;
		System.out.println("Saved name:"+name+"at position"+position);
	}
	
	static void display()
	{
		for (int index=0;index<templeNames.length;index++)
		{
			 String ref=templeNames[index];
			 System.out.println("List of temple names are:"+ref);
		}
	}
}