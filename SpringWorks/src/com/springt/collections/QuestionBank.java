package com.springt.collections;

import java.util.List;

public class QuestionBank {
private String Question;
private List<String> options;
public QuestionBank() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "QuestionBank [Question=" + Question + ", options=" + options + "]";
}
public String getQuestion() {
	return Question;
}
public void setQuestion(String question) {
	Question = question;
}
public List<String> getOptions() {
	return options;
}
public void setOptions(List<String> options) {
	this.options = options;
}

}
