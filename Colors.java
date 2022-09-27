class Colors{
	static String[] colors={null,null,null,null,null,null,null};
	static int position=0;

	
	static void save(String name)
	{
		if(name!=null && name.length()>=3)
		{
		colors[position]=name;
		System.out.println("Saved name:"+name+"at position"+position);
		position++;
		}
			
	}
	
	static void display()
	{
		for (int index=0;index<colors.length;index++)
		{
			 String ref=colors[index];
			 System.out.println("List of colors are:"+ref);
		}
	}
	
	static boolean findColors(String name)
	{
		System.out.println("It's a Valid name");
		for(int find=0;find<colors.length;find++)
		{
			String ref=colors[find];
			if(ref==name)
			{
				System.out.println("Color is:"+name);
				return true;
			}
			else
			{
				System.out.println("Color is not available");
			}
		    
			
			
        }
		return false;
	}
}
