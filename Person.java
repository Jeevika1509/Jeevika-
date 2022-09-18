class Person{
					static void work(String Company,float Salary)
					{
						System.out.println("Entered work which takes company name and salary");
						System.out.println("Company name is:"+Company);
						System.out.println("Salary is:"+Salary+"lakhs per annum");
					}
					static void work(String Company,float Salary,String designation)
					{
						System.out.println("Entered work which takes company name,salary,designation ");
						System.out.println("Company name is:"+Company);
						System.out.println("Salary is:"+Salary+"lakhs per annum");
						System.out.println("Designation is:"+designation);
						
					}
}