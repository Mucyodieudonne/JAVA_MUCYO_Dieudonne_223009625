package com.Sports_Team_Performance;

public class SportsLeague {
    public static void main(String[] args) {
        // Create players
        Player[] teamAPlayers = {
            new Player("Alice", 30),
            new Player("Bob", 40),
            new Player("Charlie", 25)
        };

        Player[] teamBPlayers = {
            new Player("David", 50),
            new Player("Eva", 20),
            new Player("Frank", 35)
        };

        // Create teams
        Team teamA = new Team("Tigers", teamAPlayers);
        Team teamB = new Team("Lions", teamBPlayers);

        // Display details
        teamA.displayTeam();
        teamB.displayTeam();

        // Find team with highest total score
        Team winner = (teamA.totalScore() > teamB.totalScore()) ? teamA : teamB;

        System.out.println("🏆 The team with the highest score is: " + winner.teamName +
                           " with " + winner.totalScore() + " points!");
    }
}