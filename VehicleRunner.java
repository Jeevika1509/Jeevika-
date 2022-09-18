class VehicleRunner{
								public static void main(String[] args){
									double totalDistance=Vehicle.transport("bangalore","mangalore");
									System.out.println("distance :"+totalDistance);
									Vehicle.transport("bangalore","mangalore","yes");
									Vehicle.transport("bangalore","mangalore","no");
									Vehicle.transport("reached");
									Vehicle.transport("not reached");
									Vehicle.transport("mangalore",true);
									Vehicle.transport("mangalore",false);
									Vehicle.transport(true);
									Vehicle.transport(false);
								}
}