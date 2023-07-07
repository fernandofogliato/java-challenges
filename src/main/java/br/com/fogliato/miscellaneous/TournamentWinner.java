package br.com.fogliato.miscellaneous;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.algoexpert.io/questions/tournament-winner
public class TournamentWinner {
    private static final int HOME_TEAM_WON = 1;

    public String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> scores = new HashMap<>();
        int match = 0;
        String bestTeam = "";
        int leaderPoints = 0;

        while (match < results.size()) {
            int matchResult = results.get(match);
            List<String> teams = competitions.get(match);
            String homeTeam = teams.get(0);
            String awayTeam = teams.get(1);

            String winner;
            int points;
            if (matchResult == HOME_TEAM_WON) {
                points = scores.getOrDefault(homeTeam, 0) + 3;
                winner = homeTeam;
            } else {
                points = scores.getOrDefault(awayTeam, 0) + 3;
                winner = awayTeam;
            }

            scores.put(winner, points);
            if (points > leaderPoints) {
                bestTeam = winner;
                leaderPoints = points;
            }
            match++;
        }
        return bestTeam;
    }
}
