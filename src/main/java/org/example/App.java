package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        final String user = "QuinnB";
        final String pass = "abc$123";
        System.out.println("Username:");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        if( username.equals(user) ){
            System.out.println("Password:");
            String password = input.nextLine();
            if( password.equals(pass)){
                System.out.println("Welcome!");
                return;
            }
            System.out.println("I don't know you.");
            return;
        }
        System.out.println("Incorrect Username");

    }
}
