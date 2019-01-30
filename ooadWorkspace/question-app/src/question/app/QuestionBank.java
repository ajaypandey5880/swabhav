package question.app;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class QuestionBank {
	// private Question[] question = new Question[10];
	private int correctAnswerCount = 0;
	private int incorrectAnswerCount = 0;
	private ArrayList<Question> question = new ArrayList<Question>();
	private ArrayList<Question> randomQuestion = new ArrayList<Question>();

	public QuestionBank() {
		this.questionSetter();
	}

	public void questionSetter() {
		question.add(new Question("What is Maharashtra capital", "Pune", "Mumbai", "Satara", "Nashik", "2"));
		question.add(new Question("What is National Animal", "Tiger", "Lion", "Leapord", "Elephat", "2"));
		question.add(new Question("What is Colour of Water", "White", "blue", "transperent", "NoColour", "4"));
		question.add(new Question("Who is First President Of India", "Rajendra Prasad", "JawaharLal Nehru",
				"Indra Ghandhi", "Sardar Vallabhbhai Patel", "1"));
		question.add(
				new Question("What is Capital of Punjab", "Amritsar", "Chandhigarh", "Jalandhar", "Pathankhot", "2"));
		question.add(
				new Question("What is Capital of Harayana	", "Chandhigarh", "Nayagoan", "Panchkula", "Ludhina", "1"));
		question.add(new Question("What is Capital of Gujrat", "Ahemdabad", "Surat", "Ghandhi_Nagar", "Mumbai", "3"));
		question.add(new Question("What is South End Point of India", "KanyaKumari", "Indra_Point", "Sir_Creek",
				"Kibithu", "2"));
		question.add(new Question("Who is President Of India", "Ram_Nath_kovind", "Prathibha_Patil", "Pranav_Mukherjee",
				"Sonia_Ghandhi", "1"));
		question.add(new Question("How many States India Have", "26", "28", "27", "29", "4"));

	}

	public ArrayList<Question> getQuestionList() {
		return question;
	}

	public String getQuestionByID(UUID id) {
		for (Question question : getQuestionList()) {
			if (id == question.getQuestionID()) {
				return question.getQuestion();
			}
		}
		return null;
	}

	public void checkCorrectAnswer(Question question, String answer) {
		if (question.getAnswer().contains(answer)) {
			correctAnswerCount++;
		} else {
			incorrectAnswerCount++;
		}
	}

	public int getIncorrectAnswerCount() {
		return incorrectAnswerCount;
	}

	public ArrayList<Question> getQuestion(int range) {
		for (int i = 0; i < range; i++) {
			Random list = new Random();
			int no = list.nextInt(getQuestionList().size());
			randomQuestion.add(getQuestionList().get(no));
		}
		return randomQuestion;
	}

	public int getCorrectAnswerCount() {
		return correctAnswerCount;
	}

	public float getPercentage(int total) {
		return correctAnswerCount * 100 / total;
	}

	public void addQuestion(Question question) {
		this.question.add(question);
	}

}
