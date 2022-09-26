class GraduateDataOperator{
	static String[] graduateName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		graduateName[position]=name;
		position++;
		System.out.println("Saved name:"+name+"at position"+position);
	}
	
	static void display()
	{
		for (int index=0;index<graduateName.length;index++)
		{
			 String ref=graduateName[index];
			 System.out.println("List of graduate names are:"+ref);
		}
	}
}