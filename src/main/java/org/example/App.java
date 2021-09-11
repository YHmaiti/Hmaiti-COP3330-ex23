/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program walks the user through troubleshooting issues with a car.
// The program uses the decision tree provided by the assignment and which can be
// shown through the program conditionals.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // create a string varibale that will store at each time the user is prompted for
        // an answer
        String response = "";

        System.out.print("Is the car silent when you turn the key? (y or n) ");
        response = scanner.nextLine();

        if (response.equals("y")) {

            System.out.print("Are the battery terminals corroded? (y or n) ");
            response = scanner.nextLine();

            if (response.equals("y")) {

                System.out.print("Clean terminals and try starting again.");
                return;

            } else if (response.equals("n")) {

                System.out.print("Replace cables and try again.");
                return;

            }

        } else if (response.equals("n")) {

            System.out.print("Does the car make a slicking noise? (y or n) ");
            response = scanner.nextLine();

            if (response.equals("y")) {

                System.out.print("Replace the battery.");
                return;

            } else if (response.equals("n")) {

                System.out.print("Does the car crank up but fail to start? (y or n) ");
                response = scanner.nextLine();

                if (response.equals("y")) {

                    System.out.print("Check spark plug connections.");
                    return;

                } else if (response.equals("n")) {

                    System.out.print("Does the engine start and then die? (y or n) ");
                    response = scanner.nextLine();

                    if (response.equals("y")) {

                        System.out.print("Does you car have fuel injection? (y or n) ");
                        response = scanner.nextLine();

                        if (response.equals("y")) {

                            System.out.print("Get it in for service.");
                            return;

                        } else if (response.equals("n")) {

                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;

                        }

                    } else if (response.equals("n")) {

                        System.out.print("This should not be possible.");
                        return;

                    }

                }

            }

        }

    }

}