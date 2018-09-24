
public class Manager {
	int mgrID;
	String mgrName;
	Address address;
	
	public Manager(int mgrID, String mgrName, Address address) {
		
		this.mgrID = mgrID;
		this.mgrName = mgrName;
		this.address = address;
	}
	
	public void displayMgr() {
		
		System.out.println("Manager's ID: " + mgrID);
		System.out.println("Manager's Name: " + mgrName);
		System.out.println("Manager's address: ");
		System.out.println("                  city-" + address.city);
		System.out.println("                  pincode-" + address.pincode);
		System.out.println("                  state-" + address.state);
	}
}
