package question.app;
import java.util.UUID;

public class Question {
	private UUID questionID;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String Answer;

	public Question(String question, String option1, String option2, String option3, String option4,
			String answer) {
		super();
		this.questionID = UUID.randomUUID();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.Answer = answer;
	}

	public UUID getQuestionID() {
		return questionID;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return Answer;
	}

	public String getOption1() {
		return option1;
	}

	public String getOption2() {
		return option2;
	}

	public String getOption3() {
		return option3;
	}

	public String getOption4() {
		return option4;
	}

}
