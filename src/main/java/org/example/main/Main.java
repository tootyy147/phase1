package org.example.main;

import org.example.main.screens.WelcomeScreen;

public class Main {

	public static void main(String[] args) {

		WelcomeScreen welcome = new WelcomeScreen();
		welcome.introScreen();
		welcome.getUserInput();

	}
}
