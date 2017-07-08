
public class Faculty {

	private String facultyName;
	private Department[] departments;

	public Faculty(String facultyName, Department[] departments) {
		this.facultyName = facultyName;
		this.departments = departments;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}

	
}