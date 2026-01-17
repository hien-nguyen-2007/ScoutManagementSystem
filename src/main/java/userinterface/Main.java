package userinterface;

import domain.Rank;
import domain.Scout;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Scout> scouts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        addScouts(scanner);

        displayScouts();
    }

    public static void displayScouts() {
        for (Scout scout: scouts) {
            System.out.println(scout);
        }
    }

    public static void addScouts(Scanner scanner) {
        System.out.print("Would you like to enter a Scout? (y/n) ");
        String input = scanner.next();
        while (input.equals("y")) {
            System.out.print("First name: ");
            String firstName = scanner.next();

            System.out.print("Last name: ");
            String lastName = scanner.next();

            String name = firstName + " " + lastName;

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

            Scout scout = new Scout(name, firstName, lastName, birthday, rank, patrol, unit, dateJoined, email, phoneNumber);
            scouts.add(scout);

            System.out.print("Would you like to enter a Scout? (y/n) ");
            input = scanner.next();
        }
        System.out.println();
    }

    public static void rankUp(Scout scout, Rank rank) {
        scout.setRank(rank);
    }
}