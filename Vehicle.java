class Vehicle{
						static double transport(String source,String destination)
						{
							System.out.println("Entered transport which tells about the source and destination");
							if(source=="bangalore"&&destination=="mangalore")
							{
							System.out.println("Source is:"+source);
							System.out.println("Destination is:"+destination);
							return 372;
							}
							if(source=="bangalore"&&destination=="chennai")
							{
							System.out.println("Source is:"+source);
							System.out.println("Destination is:"+destination);
							return 345;
							}
							if(source=="bangalore"&&destination=="Kerala")
							{
							System.out.println("Source is:"+source);
							System.out.println("Destination is:"+destination);
							return 460;
							}
							return 0.0;
							
						}
						static double transport(String source,String destination,String ontime)
						{
							System.out.println("Entered transport which tells about the source,destination and on time");
							if(ontime=="yes")
							{
									System.out.println("Reached the destination on time");
							}
							else
							{
								System.out.println("Couldn't reach the destination on time");
							}
							return 0.0;
						}
						
						static boolean transport(String destination)
						{
							System.out.println("Entered transport which tells whether the person has reached the destination ");
							if(destination=="reached")
							{
								System.out.println("The person has reached the destination");
								return true;
							}
							else
							{
								System.out.println("The person has not yet reached destination");
								return false;
							}
						}
						
						static boolean transport(String destination,boolean ontime)
						{
							System.out.println("Entered transport which tells whether the person has reached the destination on time");
							System.out.println("Destination:"+destination);
							if(ontime==true)
							{
									System.out.println("Reached the destination on time");
									return true;
							}
							if(ontime==false)
							{
								System.out.println("Couldn't reach the destinationon time");
								return false;
							}
							return false;
							
						}
						
						static boolean transport(boolean ontime)
						{
							System.out.println("Entered transport which tells whether the person has reached on time for the destination");
							if(ontime==true)
							{
									System.out.println("Reached the destination on time");
									return true;
							}
							if(ontime==false)
							{
								System.out.println("Couldn't reach the destinationon time");
								return false;
							}
							return false;
							
						}
}
							
							
						
						