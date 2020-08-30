package Methods;

import java.util.Scanner;

public class StudentsGrade {

	public int qualityPoints(int studAvg) {
		int studGrade = 0;
		if (studAvg >= 90 || studAvg <= 100) {
			studGrade = 4;
		}
		else if (studAvg >= 80 || studAvg <= 89 ) {
			studGrade = 3;
		}
		else if (studAvg >= 70 || studAvg <= 79) {
			studGrade = 2;
		}
		else if (studAvg >= 60 || studAvg <= 69) {
			studGrade = 1;
		}
		else if (studAvg < 60) {
			studGrade = 0;
		}
		return studGrade;
	}

	public static void main(String[] args) {
		
		String studName;
		int studAvg;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Student Name");
		studName = scan.next();
		
		System.out.println("Enter the Student Average Score");
		studAvg = scan.nextInt();		
		
		StudentsGrade avg = new StudentsGrade();
		avg.qualityPoints(studAvg);
		
		System.out.println("StudentName - " + studName + "\nStudentAverageScore - " + studAvg + "\nGrade - " + avg.qualityPoints(studAvg));
		
		scan.close();
	}

}
