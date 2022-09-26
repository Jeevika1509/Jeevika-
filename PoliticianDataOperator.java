class PoliticianDataOperator{
	static String[] politicianName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		politicianName[position]=name;
		position++;
		System.out.println("Saved name:"+name+"at position"+position);
	}
	
	static void display()
	{
		for (int index=0;index<politicianName.length;index++)
		{
			 String ref=politicianName[index];
			 System.out.println("List of politician names are:"+ref);
		}
	}
}