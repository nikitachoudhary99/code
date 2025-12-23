package com.univ.bean;

public class Password {
private int number;
private String words;
private String specialChar;
public Password() {
	super();
	// TODO Auto-generated constructor stub
}
public Password(String specialChar) {
	super();
	this.specialChar = specialChar;
}
public Password(String words, String specialChar) {
	super();
	this.words = words;
	this.specialChar = specialChar;
}
public Password(int number, String words, String specialChar) {
	super();
	this.number = number;
	this.words = words;
	this.specialChar = specialChar;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getWords() {
	return words;
}
public void setWords(String words) {
	this.words = words;
}
public String getSpecialChar() {
	return specialChar;
}
public void setSpecialChar(String specialChar) {
	this.specialChar = specialChar;
}
@Override
public String toString() {
	return number + "\t" + words + "\t" + specialChar;
}

}
