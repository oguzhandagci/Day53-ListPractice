package Mains;

import Classes.TvShow;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String showName;
        int episodes;
        String genre;
        ArrayList<TvShow> shows = new ArrayList<TvShow>();
        TvShow show1 = new TvShow("The Office");
        TvShow show2 = new TvShow("How I Met Your Mother", 208);

        while (true) {
            System.out.println("Name of the show:");
            showName = scanner.nextLine();
            if (showName.isBlank()) {
                break;
            }
            System.out.println("How many episodes?");
            episodes = scanner.nextInt();
            System.out.println("What is the genre?");
            genre = scanner.next();
            scanner.nextLine();

            shows.add(new TvShow(showName, episodes, genre));
        }
        print(shows);
    }

    public static void print(ArrayList<TvShow> shows) {
        for (TvShow show : shows) {
            System.out.println(show.toString());
        }
    }
}