package org.userinterface;

import objects.Rank;
import objects.Scout;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Scout> scouts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like to enter a Scout? (y/n) ");
        String input = scanner.next();
        while (input.equals("y")) {
            System.out.print("First name: ");
            String firstName = scanner.next();

            System.out.print("Last name: ");
            String lastName = scanner.next();

            String name = firstName + " " + lastName;

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.next());

            System.out.print("Birthday: (mm/dd/yyyy) ");
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date birthday;
            try {
                birthday = dateFormat.parse(scanner.next());
            } catch (Exception e) {
                System.out.println("Error in processing birthday: " + e.getMessage());
                break;
            }

            System.out.print("Rank: ");
            String rankName = scanner.next();
            System.out.print("Date earned: (MM/dd/yyyy) ");
            Date dateEarned = null;
            try {
                Date e = dateFormat.parse(scanner.next());
                dateEarned = e;
            } catch (Exception e) {
                System.out.println("Error in processing date earned: " + e.getMessage());
            }

            Rank rank = new Rank(rankName, dateEarned);

            System.out.print("Patrol: ");
            scanner.nextLine();
            String patrol = scanner.nextLine();

            System.out.print("Unit: ");
            int unit = Integer.parseInt(scanner.next());

            System.out.print("Date joined: (MM/dd/yyyy) ");
            Date dateJoined = null;
            try {
                dateJoined= dateFormat.parse(scanner.next());
            } catch (Exception e) {
                System.out.println("Error in processing date joined: " + e.getMessage());
            }

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Phone number: ");
            long phoneNumber = scanner.nextLong();
            System.out.println();

            Scout scout = new Scout(name, firstName, lastName, age, birthday, rank, patrol, unit, dateJoined, email, phoneNumber);
            scouts.add(scout);

            System.out.print("Would you like to enter a Scout? (y/n) ");
            input = scanner.next();
        }

        for (Scout scout: scouts) {
            System.out.println(scout);
        }
    }
}