package question.papaer.test;

import java.util.Scanner;

import question.app.Question;
import question.app.QuestionBank;

public class QuestionPaperConsole {
	static QuestionBank questionBank = new QuestionBank();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		for(Question question : questionBank.getQuestion(5)) {
			System.out.println(question.getQuestion());
			System.out.println("1 :"+question.getOption1());
			System.out.println("2 :"+question.getOption2());
			System.out.println("3 :"+question.getOption3());
			System.out.println("4 :"+question.getOption4());
			System.out.println("Enter the no of correct Option");
			String answer = scanner.next();
			questionBank.checkCorrectAnswer(question, answer);
		}
		
		System.out.println("no of correct answer is "+questionBank.getCorrectAnswerCount());
		System.out.println("no of Incorret Answer is "+questionBank.getIncorrectAnswerCount());
		System.out.println("percentage is "+questionBank.getPercentage(5));
	}
	

}
