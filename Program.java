package num5;

public class Program {

	public static void main(String[] args) {
		CourseGrades grades = new CourseGrades();
		
		GradedActivity lab = new GradedActivity();
		lab.setScore(95);
		
		//questionsTotal, missed, minPassingScore
		PassFailExam passFailExam = new PassFailExam(10, 2, 70);
		//grammar, spelling, length, content scores
		Essay essay = new Essay(20, 20, 20, 20);
		//questionsTotal, missed
		FinalExam finalExam = new FinalExam(50, 12);
		
		//grade methods
		grades.setLab(lab);
		grades.setPassFailExam(passFailExam);
		grades.setEssay(essay);
		grades.setFinalExam(finalExam);
		
		//tostring
		System.out.println(grades);
		

	}

}
