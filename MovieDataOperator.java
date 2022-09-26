class MovieDataOperator{
	static String[] movieNames={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		movieNames[position]=name;
		position++;
		System.out.println("Saved name:"+name+"at position"+position);
	}
	
	static void display()
	{
		for (int index=0;index<movieNames.length;index++)
		{
			 String ref=movieNames[index];
			 System.out.println("List of movie names are:"+ref);
		}
	}
}