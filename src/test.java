/*
 * This class is a test class with a main method to test all methods 
 * 
 * 
 */
public class test {

	public static void main(String[] args) {
		
		//create five new instances of profiles
		Profile p1=new Profile("Johnny","Work",15,001);
		Profile p2=new Profile("Sam","Work",25,002);
		Profile p3=new Profile("Peter","Work",2,003);
		Profile p4=new Profile("Ben","Work",15,004);
		Profile p5=new Profile("Bob","Home",30,005);
		Profile p6=new Profile("Alice","Home",24,006);

		//create new instance of Profile manager
		ProfileManager test_MP=new ProfileManager();
		
		
		//add all created profiles in profile list
		test_MP.addProfile(p1);
		
		test_MP.addProfile(p2);

		test_MP.addProfile(p3);
		
		test_MP.addProfile(p4);
		
		test_MP.addProfile(p5);
		
		test_MP.addProfile(p6);

		
		
		
		//Test: check whether profiles are added into the list successfully
		System.out.println("Test add profile:  "+test_MP.get_Plist().get(2).getID());
		
		
		
		// create new ConnectionManager object to access all connections and methods
		ConnectionManager test_MC=new ConnectionManager();

		
		
		// input all profiles from profile manager to connection manager
		test_MC.Pmanager=test_MP;
		
		
		
		
		//try to add new connections 
		test_MC.addFriendConnection(002, 005);
		
		test_MC.addCoupleConnection(002, 005);
		
		test_MC.addCoupleConnection(002, 006);
		
		test_MC.addParentConnection(002, 005, 003);
		
		
		
		//Test: whether friend connection is added in connection list
		try {
	    
		System.out.println("Test add connection:  "+test_MC.get_Clist().get(0).getPerson1().getName());
		System.out.println("Test add connection:  "+test_MC.get_Clist().get(0).getPerson2().getName());
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Not valid");
			
		}
		
		
		
		//Test: whether parent connection is added
		try {
			System.out.println("Test add conenction:  "+test_MC.get_Clist().get(2).getPerson1().getName());
			System.out.println("Test add conenction:  "+test_MC.get_Clist().get(2).getPerson2().getName());
			System.out.println("Test add conenction:  "+test_MC.get_Clist().get(2).getChild().getName());
			
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Not valid");
				
			}
		
	
		
		
		
	}

}
