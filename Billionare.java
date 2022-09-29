class Billionare{
	static String[] billionareNames={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void save(String name)
	{
		if(name!=null && name.length()>5)
		{
			System.out.println("saved name:"+name+"at position"+position);
			billionareNames[position]=name;
			position++;
		}
	}
	static void display()
	{
		for(int index=0;index<billionareNames.length;index++)
		{
			String ref=billionareNames[index];
			System.out.println("list of billionareNames are:"+ref);
		}
	}
	static boolean findbillionareNames(String name)
	{
		System.out.println("It's a valid name");
		for(int find=0;find<billionareNames.length;find++)
		{
			String ref=billionareNames[find];
			if(ref==name)
			{
				System.out.println("billionare is:"+name);
				return true;
			}
			else
			{
				System.out.println("billionare name is not availabe");
			}
		}
		return false;
	}
	static String update(String oldName,String newName)
	{
		if(oldName!=null && newName!=null)
		{
			if(oldName.length()>4 && newName.length()>4)
			{
				for(int point=0;point<billionareNames.length;point++)
				{
					String index=billionareNames[point];
					if(oldName==index)
					{
						System.out.println("Billionare updated"+index);
						billionareNames[point]=newName;
						System.out.println("Billionare name updated with new name"+newName);
						return newName;
					}
				}
			}
			else{
				System.out.println("Billionare name is not updated");
			}
		}
		return null;
	}
	static String update(int index,String newName)
	{
		if(newName!=null)
		{
			for(int point=0;point<billionareNames.length;point++)
				{
				String ref3=billionareNames[point];
				billionareNames[point]=newName;
				System.out.println(newName);
			}
		}
		
		else{
			System.out.println("Billionare name not updated");
		}
		
		return null;
	}
	
		static boolean delete(String name)
		{
			if(name!=null)
			{
			for(int index=0;index<billionareNames.length;index++)
			{
				if(name==billionareNames[index])
				{
					String ref1=billionareNames[index];
					System.out.println("Billionare found:"+ref1+"deleting into null at index"+index);
					billionareNames[index]=null;
					return true;
		        }
			}
			}
			else
			{
				System.out.println("Billionare nme not deleted");
			}
			return false;
		}
			
		
		static boolean delete(int index,String name)
		{
			if(billionareNames[index]!=null)
			{
				
			billionareNames[index]=null;
			System.out.println("deleting at index:"+index);
			
			return true;
		    }
			else{
				System.out.println("Billionare name cannot be deleted");
			}
			return false;
		}
		
}

			