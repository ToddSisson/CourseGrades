package num5;

public class Essay extends GradedActivity {

	private int grammarScore;
	private int spellingScore;
	private int lengthScore;
	private int contentScore;
	
	public Essay(int grammarScore, int spellingScore, int lengthScore, int contentScore) {
		this.grammarScore = grammarScore;
		this.spellingScore = spellingScore;
		this.lengthScore = lengthScore;
		this.contentScore = contentScore;
		setScore(this.grammarScore + this.spellingScore + this.lengthScore + this.contentScore);
	}

}
