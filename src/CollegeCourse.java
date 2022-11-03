
public class CollegeCourse {
// data
private String department;
private String courseNum;
private int credits;
private double courseFee;
private final double COSTPERCREDIT = 120;

//constructor
public CollegeCourse(String department, String courseNum, int credits) {
	this.department = department;
	this.courseNum = courseNum;
	this.credits = credits;
	this.courseFee = credits * COSTPERCREDIT;
}

// display method
public void display() {
	System.out.println(department + "\t" + courseNum);
	System.out.println("Credits: "+credits);
	System.out.println("Fee: "+courseFee);
}

// getters and setter
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getCourseNum() {
	return courseNum;
}
public void setCourseNum(String courseNum) {
	this.courseNum = courseNum;
}
public int getCredits() {
	return credits;
}
public void setCredits(int credits) {
	this.credits = credits;
}
public double getCourseFee() {
	return courseFee;
}
public void setCourseFee(double courseFee) {
	this.courseFee = courseFee;
}

}
