public class Student {
	
    private int id;
    private String name;
    private int year;
    private String uniqueId;
    
    
    public Student() {
	}
	
    public Student(int id1, String name1, int year1) {
		id = id1;
		name = name1;
		year = year1;
	}
    
    public int getYear() {
        return year;
    }
public String getUniqueId() {
		String uniqueId = name + id; 
		return uniqueId;
	}
