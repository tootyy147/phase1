package org.example.main.services;

import org.example.main.screens.FileOptionsScreen;
import org.example.main.screens.Screen;
import org.example.main.screens.WelcomeScreen;

public class ScreenService {
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
