class MobileRunner{
								public static void main(String[] args){
									System.out.println("main: start");
									
									Mobile.displayDetails();
									
									Mobile.brand="Samsung";
									Mobile.width=165.1;
									Mobile.length=76.4;
									Mobile.display="InfinityVDisplay";
									Mobile.cpu="Octacore";
									Mobile.baseBandVersion="A315";
									Mobile.kernelVersion=4.111;
									Mobile.cellularTechnology="4G";
									Mobile.connectivityTechnology="USB";
									Mobile.connectorType="TypeC";
									Mobile.sdCard=1;
									Mobile.cameraFeatures="frontCamera";
									Mobile.snapdragon=5000;
									Mobile.warranty=1;
									Mobile.deviceInterface="TouchScreen";
									Mobile.processor=2.2;
									Mobile.brightenessMode=500;
									Mobile.speaker="dolbyAtmos";
									
									String[] ref1={"Samsung","Iphone"};
									Mobile.brands=ref1;
									Mobile.displayDetails();
									
									String[] ref2={"blue","black"};
									Mobile.color=ref2;
									Mobile.displayDetails();
									
									String[] ref3={"Front camera","backcamera"};
									Mobile.camera=ref3;
									Mobile.displayDetails();
									
									int[] ref4={128,256};
									Mobile.storage=ref4;
									Mobile.displayDetails();
									
									int[] ref5={6000,4353};
									Mobile.batteryCapacity=ref5;
									Mobile.displayDetails();
									
									String[] ref6={"45watt","20watt"};
									Mobile.chargingCapacity=ref6;
									Mobile.displayDetails();
									
									String[] ref7={"4GB","6GB"};
									Mobile.ram=ref7;
									Mobile.displayDetails();
									
									String[] ref8={"SMG977","A1920"};
									Mobile.model=ref8;
									Mobile.displayDetails();
									
									String[] ref9={"10","8"};
									Mobile.androidVersion=ref9;
									Mobile.displayDetails();
									
									String[] ref10={"Android","IOS"};
									Mobile.operatingSystem=ref10;
									Mobile.displayDetails();
									
									int[] ref11={20000,50000};
									Mobile.price=ref11;
									Mobile.displayDetails();
									
									int[] ref12={2,2};
									Mobile.simSlots=ref12;
									Mobile.displayDetails();
									
									System.out.println("main: end");
		 
		
	}
}