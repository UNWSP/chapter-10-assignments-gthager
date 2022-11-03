import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		//constants
		String[] LABS = {"BIO", "CHEM", "CIS", "PHY"};
		
		//variables
		String depName = new String();
		String courseNum = new String();
		int credits;
		boolean isLab = false;
		
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("input the department code: ");
		depName = input.next();
		System.out.println("input the course number: ");
		courseNum = input.next();
		System.out.println("input the number of credits: ");
		credits = input.nextInt();
		
		//determine if its a lab class
		for (int i =0; i<LABS.length; i++) {
			if (depName.toUpperCase().equals(LABS[i])){
				isLab = true;
			}
		}
		
		if (isLab == true) {
			LabCourse course = new LabCourse(depName, courseNum, credits);
			course.display();
		}
		else {
			CollegeCourse course = new CollegeCourse(depName, courseNum, credits);
			course.display();
		}
	}

}
