
public class Student {

	private int studentNumber;
	
	private String name;	
	
	private String surname;
	
	private Faculty faculty;
	
	private Department department;
	
	private String semester;
	
	private String dateOfBirth;
	
	private String birthPlace;
	
	private String motherName;
	
	private String fathersName;
	
	private boolean isGranted;
	
	private String email;
	
	private String password;

	public Student(int studentNumber, String name, String surname, Faculty faculty, Department department, String semester,
			String dateOfBirth, String birthPlace, String motherName, String fathersName, boolean isGgranted,
			String email, String password) {
		
		this.studentNumber = studentNumber;
		this.name = name;
		this.surname = surname;
		this.faculty = faculty;
		this.department = department;
		this.semester = semester;
		this.dateOfBirth = dateOfBirth;
		this.birthPlace = birthPlace;
		this.motherName = motherName;
		this.fathersName = fathersName;
		this.isGranted = isGgranted;
		this.email = email;
		this.password = password;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public boolean isGgranted() {
		return isGranted;
	}

	public void setGgranted(boolean isGgranted) {
		this.isGranted = isGgranted;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
