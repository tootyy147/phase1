package org.example.main.screens;

import org.example.main.services.DirectoryService;
import org.example.main.services.ScreenService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomeScreen implements Screen {

    private ArrayList<String> options = new ArrayList<>();

    public WelcomeScreen() {
        options.add("# 1. List All Files");
        options.add("# 2. Show File Options Menu");
        options.add("# 3. Quit");
    }

    public void introScreen() {
        System.out.println();
        System.out.println("**************************************");
        System.out.println("      DEVELOPER: Taghreed      ");
        System.out.println("**************************************");
        System.out.println("*       APP NAME : Test              *");
        System.out.println("**************************************");
        System.out.println("\n");

        mainMenuOptions();
    }

    public void mainMenuOptions() {
        System.out.println("########################################");
        System.out.println("            MAIN MENU           ");
        System.out.println("########################################");
        System.out.println("\n");
        System.out.println("Select any one of the following: ");
        for (String s : options) {
            System.out.println(s);
        }
        System.out.println("\n");

        System.out.println("########################################");
        System.out.println("Enter your choice : ");
    }

    public void getUserInput() {
        int selectedOption = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.navigateOption(selectedOption);
        }
    }

    @Override
    public void navigateOption(int option) {
        switch (option) {

            case 1: // show Files in Directory
                this.listFiles();

                this.mainMenuOptions();

                break;

            case 2: // show File Options menu
                ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
                ScreenService.getCurrentScreen().mainMenuOptions();
                ScreenService.getCurrentScreen().getUserInput();

                this.mainMenuOptions();

                break;

            default:
                System.out.println("Invalid Option");
                break;
        }

    }

    public void listFiles() {

        System.out.println("List of Files: ");
        DirectoryService.PrintFiles();

    }

    private int getOption() {
       Scanner in = new Scanner(System.in);
            int returnOption = 0;
            try {
                returnOption = in.nextInt();
            } catch (InputMismatchException ex) {

            }
            return returnOption;
        }

   
}
