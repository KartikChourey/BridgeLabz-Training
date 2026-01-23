package gamingapp;



public class Main {
    public static void main(String[] args) {

        GamingApp leaderboard = new GamingApp();

        leaderboard.addPlayer(1200, "Alex");
        leaderboard.addPlayer(1800, "Ravi");
        leaderboard.addPlayer(1500, "Kartik");
        leaderboard.addPlayer(2000, "Neha");
        leaderboard.addPlayer(1700, "Aman");

        System.out.println("Top Players:");
        leaderboard.displayTop10();

        System.out.println("Removing player with score 1500");
        leaderboard.removePlayer(1500);

        System.out.println("Updated Leaderboard:");
        leaderboard.displayTop10();
    }
}
