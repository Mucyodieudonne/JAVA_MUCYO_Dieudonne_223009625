package com.Sports_Team_Performance;

class Player {
    String name;
    int score;

    // Constructor
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Team class
class Team {
    String teamName;
    Player[] players;

    // Constructor
    Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    // Compute total team score
    int totalScore() {
        int total = 0;
        for (Player p : players) {
            total += p.score;
        }
        return total;
    }

    // Find highest-scoring player
    Player highestScorer() {
        Player top = players[0];
        for (Player p : players) {
            if (p.score > top.score) {
                top = p;
            }
        }
        return top;
    }

    // Display team details
    void displayTeam() {
        System.out.println("Team: " + teamName);
        for (Player p : players) {
            System.out.println("Player: " + p.name + ", Score: " + p.score);
        }
        System.out.println("Total Score: " + totalScore());
        System.out.println("Highest Scorer: " + highestScorer().name + " (" + highestScorer().score + ")");
        System.out.println();
    }
}