/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.rps;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Random Rand = new Random();
        int compScore = 0;
        int userScore = 0;
        int counter = 0;
        
        System.out.println("Hello what is your name?");
        String name = Scan.nextLine();
        
        while(counter == 0){
            int compChoice = 1 + Rand.nextInt(3);
            
            System.out.println("Hello " + name + " Type 1 for rock, 2 for paper, 3 for scissors ");
            int playerChoice = Scan.nextInt();
            
            if(playerChoice == compChoice){
                System.out.println("It's a tie; no points will be awarded ");
            }
            else if(playerChoice == 1){
                if(compChoice == 2){
                    System.out.println("Computer selected paper");
                    System.out.println("Sory" + name + "You lost this round");
                    compScore++;
                    System.out.println("Cmputer:" + compScore);
                    System.out.println(name + ": " + userScore);
                }else if (compChoice == 3){
                    System.out.println("Computer selected scissors");
                    System.out.println("congrats! " + name + " You won this round");
                    userScore++;
                    System.out.println("Computer:" + compScore);
                    System.out.println(name + " :" + userScore);
                }
            }
            else if(playerChoice == 2){
                if(compChoice == 1){
                    System.out.println("Computer selected rock");
                    System.out.println("Congrats " + name + " You won this round");
                    userScore++;
                    System.out.println("Computer:" + compScore);
                    System.out.println(name + ": " + userScore);
                }else if (compChoice == 3){
                    System.out.println("Computer selected scissors");
                    System.out.println("Sorry" + name + "You lost bruv");
                    compScore++;
                    System.out.println("Computer:" + compScore);
                    System.out.println(name + " :" + userScore);
                }
            }
            else if(playerChoice == 3){
                 if(compChoice == 1){
                    System.out.println("Computer selected rock");
                    System.out.println("Sorry" + name + "You lost bruv");
                    compScore++;
                    System.out.println("Computer:" + compScore);
                    System.out.println(name + ": " + userScore);
                }else if (compChoice == 2){
                    System.out.println("Computer selected paper");
                    System.out.println("Congrats" + name + "You won this round");
                    userScore++;
                    System.out.println("Computer: " + compScore);
                    System.out.println(name + ": " + userScore);
                }   
            }
            if(userScore == 10){
                System.out.println ("You won the game bruv");
                counter++;
            }
            if(compScore == 10){
                System.out.println("I am sorry, but you have been defeated grasshopper");
                counter++;
            }
        } 
    }
}
