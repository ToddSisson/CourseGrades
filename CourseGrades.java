package num5;

public class CourseGrades {

	private GradedActivity[] activities;

	public CourseGrades(){
		activities = new GradedActivity[4];
	}
	public void setLab(GradedActivity lab){
		activities[0] = lab;
	}
	public void setPassFailExam(PassFailExam exam){
		activities[1] = exam; 
	}
	public void setEssay(Essay essay){
		activities[2] = essay;
	}
	public void setFinalExam(FinalExam finalExam){
		activities[3] = finalExam;
	}

	public String toString(){
		return "Lab score (Grade): " + activities[0].getScore() + " (" + activities[0].getGrade()+ ")"
				+ "\nPass fail exam score (Grade): " + activities[1].getScore() + " (" + activities[1].getGrade()+ ")"
				+ "\nEssay score and (Grade): " + activities[2].getScore() + " (" + activities[2].getGrade()+ ")"
				+ "\nFinal exam score (Grade): " + activities[3].getScore() + " (" + activities[3].getGrade()+ ")";
	}
}
