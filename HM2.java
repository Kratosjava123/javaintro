
public class Sample{
	public static void main(String args[]){
		System.out.println("Hello User");
		students s1= new students(2019, "CSE", 225);
		students s2= new students(2018, "CSBS", 55);
		String id1 = s1.getunique_id(2019);
		System.out.println("Uinque ID for admissions from or after 2019 - " + id1);
		String id2 = s2.getunique_id();
		System.out.println("Uinque ID for admissions before 2019 -" + id2);
	}
}

	
