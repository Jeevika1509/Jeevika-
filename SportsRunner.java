class SportsRunner{
	public static void main(String[] args){
		System.out.println("entered main method");
		
		String[] cricket={"Virat kohli","Rohit Sharma","Rishab Pant","Hardik Pandya","KL Rahul","MS Dhoni","Bumrah","Ravindra Jadeja","Ishanth Sharma","Rishabh Pant"};
		
		Sports.cricketTeamMembers(cricket);
		
		int[] kabbadi={1,2,3,4,5,6,7,8,9,10};
		
		Sports.kabbadiTeamMembersJerseyNos(kabbadi);
		
		double[] football={30500,32000,25000,40000,42000,45000,50000,20000,25000,28000};
		
		Sports.FootBallTeamMembersSalary(football);
		
		long[] ludo={9811293810l,9137641912l,9764271683l,9612939128l,9081823745l,9324572395l,9812442523l,9314244243l,9813891042l,9149042094l};
		
		Sports.ludoTeamMobileNumber(ludo);
		
		int[] hockey={1,2,1,3,4,2,5,4,6,7};
		
		Sports.hockeyTeamMembersNoOfMatches(hockey);
		
		int[] koko={93,355,213,1-684,376,244,1-264,672,1-268,54};
		
		Sports.kokoTeamMembersCountryCode(koko);
		
		boolean[] lagori={true,false,true,false,true,false,true,false,true,false};
		
		Sports.lagoriTeamMembersAlive(lagori);

		System.out.println("end the main method");
	}
}