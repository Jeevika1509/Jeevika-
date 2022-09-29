class BillionareRunner{
		public static void main(String[] args)
		{
		System.out.println("Started executing main method:");
		Billionare.save("MukeshAmbani");
		Billionare.save("GautamAdani ");
		Billionare.save("ShivNadar");
		Billionare.save(" RadhakishanDamani");
		Billionare.save("CyrusPoonawalla");
		Billionare.save("LakshmiMittal");
		Billionare.save("SavitriJindal");
		Billionare.save("UdayKotak");
		Billionare.save("PallonjiMistry");
		Billionare.save("KumarBirla");
		Billionare.display();
		Billionare.findbillionareNames("ShivNadar");
		Billionare.update("GautamAdani","SunilMittal");
		Billionare.display();
		Billionare.update(1,"SunilMittal");
		Billionare.display();
		Billionare.delete("RadhakishanDamani");
		Billionare.display();
		Billionare.delete(5,"LakshmiMittal");
		Billionare.display();
		
		System.out.println("Exit main method:");
		}
}