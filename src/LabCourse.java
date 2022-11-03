
public class LabCourse extends CollegeCourse{
//constructor
public LabCourse(String department, String courseNum, int credits) {
	super(department, courseNum, credits);
	super.setCourseFee(super.getCourseFee() + 50);
}

//display method
public void display() {
	System.out.println(getDepartment() + "\t" + getCourseNum() +"\tLab");
	System.out.println("Credits: "+getCredits());
	System.out.println("Fee: "+getCourseFee());
}
}
