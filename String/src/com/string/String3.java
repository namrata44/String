package com.string;

public class String3 {

	public static void main(String[] args) {
		String first = "Java ";
		System.out.println("First String: " + first);

		String second = "Programming";
		System.out.println("Second String: " + second);

		String joinedString = first.concat(second);
		System.out.println("Joined String: " + joinedString);
	}
}
