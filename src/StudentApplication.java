
public class StudentApplication {
	
	public static void main(String[] args) {
		
		Department maths = new Department("Maths");
		Department computerScience = new Department("Computer Science");
		Department psyhics = new Department("Psyhics");
		Department[] departments = {maths, computerScience, psyhics};
		
		Faculty facultyOfScience = new Faculty("Faculty of Science", departments);
		
		Student firstStudent = new Student(3,"Ulrike","Marc", facultyOfScience, computerScience, "YAZ", "09-10-1970", "Ankara", "Mehmet", "Ayşe", true, "ulrike@a.com", "123");	
		
		System.out.println("Fakültesi: " + firstStudent.getDepartment().getDepartmentName());
		
		//System.out.println("Fakültesi: " + firstStudent.getFaculty().getDepartments()[1].getDepartmentName());

		
	}

}
