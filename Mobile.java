class Mobile{
	static String brand;
	static double width;
	static double length;
	static String display;
	static String cpu;
	static String baseBandVersion;
	static double kernelVersion;
    static String cellularTechnology;
	static String connectivityTechnology;
	static String connectorType;
	static int sdCard;
	static String cameraFeatures;
	static int snapdragon;
	static int warranty;
	static String deviceInterface;
	static double processor;
	static int brightenessMode;
	static String speaker;
	static String brands[];
	static String color[];
    static String camera[];
    static int storage[];
    static int batteryCapacity[];
    static String chargingCapacity[];
    static String ram[];
    static String model[];
    static String androidVersion[];
    static String operatingSystem [];
    static int price[];
    static int simSlots[];
	
	static void displayDetails()
	{
		System.out.println(brand);
		System.out.println(width);
		System.out.println(length);
		System.out.println(display);
		System.out.println(cpu);
		System.out.println(baseBandVersion);
		System.out.println(kernelVersion);
		System.out.println(cellularTechnology);
		System.out.println(connectivityTechnology);
		System.out.println(connectorType);
		System.out.println(sdCard);
		System.out.println(cameraFeatures);
		System.out.println(snapdragon);
		System.out.println(warranty);
		System.out.println(deviceInterface);
		System.out.println(processor);
		System.out.println(brightenessMode);
		System.out.println(speaker);
		
		if(brands!=null)
		{
		System.out.println("array is pointing to memory");
		for(int position=0;position<brands.length;position++){
		String reference=brands[position];
		System.out.println(reference +"position" +position);
		}
		
		}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
		   
		   
		   
		   if(color!=null)
	      {
		System.out.println("array is pointing to memory");
		for(int position=0;position<color.length;position++){
		String reference1=color[position];
		System.out.println(reference1 +"position" +position);
		 }
		
	      }
	
	else{
				System.out.println("array not pointing to memory");
		   }	
		   
		   if(camera!=null)
		{
		System.out.println("array is pointing to memory");
		for(int position=0;position<camera.length;position++){
		String reference2=camera[position];
		System.out.println(reference2 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(storage!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<storage.length;position++){
		int reference3=storage[position];
		System.out.println(reference3 +"position" +position+"GB");
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(batteryCapacity!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<batteryCapacity.length;position++){
		int reference4=batteryCapacity[position];
		System.out.println(reference4 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(chargingCapacity!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<chargingCapacity.length;position++){
		String reference5=chargingCapacity[position];
		System.out.println(reference5 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(ram!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<ram.length;position++){
		String reference6=ram[position];
		System.out.println(reference6 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(model!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<model.length;position++){
		String reference7=model[position];
		System.out.println(reference7 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(androidVersion!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<androidVersion.length;position++){
		String reference8=androidVersion[position];
		System.out.println(reference8 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(operatingSystem!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<operatingSystem.length;position++){
		String reference9=operatingSystem[position];
		System.out.println(reference9 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(price!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<price.length;position++){
		int reference10=price[position];
		System.out.println(reference10 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	
	if(simSlots!=null)
	{
		System.out.println("array is pointing to memory");
		for(int position=0;position<simSlots.length;position++){
		int reference11=simSlots[position];
		System.out.println(reference11 +"position" +position);
		}
		
	}
	
	else{
				System.out.println("array not pointing to memory");
		   }	
	}
}
	
	