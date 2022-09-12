class FoodItems{
                public static void main(String[] args){
				String foodItem1="idli";
				String foodItem2="dosa";
				String foodItem3="puri";
				String foodItem4="chapati";
				String foodItem5="roti";
				String foodItem6="upma";
				String foodItem7="vangibhath";
				String foodItem8="bisibelebath";
				String foodItem9="pulao";
				String foodItem10="vegbiriyani";
				String foodItem11="paratha";
				String foodItem12="vada";
				String foodItem13="kesaribhath";
				
				String[] fooditems={"idli","dosa","puri","chapati","roti","upma","vangibhath","bisibelebath","pulao","vegbiriyani","paratha","vada","kesaribhath"};
				
				int ref=fooditems.length;
				System.out.println("Number of food items is:"+ref);
				
				for(int food=0;food<fooditems.length;food++)
				{
					String ref1=fooditems[food];
					System.out.println("Food Items are:"+ref1);
				}
				  fooditems[3]="vadapav";
				  fooditems[7]="pavbhaji";
				 for(int food=0;food<fooditems.length;food++)
				{
					String ref2=fooditems[food];
					System.out.println("Food Items are:"+ref2);
				}
		
				
				}
}
				