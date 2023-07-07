package br.com.fogliato.miscellaneous;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.algoexpert.io/questions/tournament-winner
public class TournamentWinner {
    public String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> pointsBoard = new HashMap<String, Integer>();
        int match = 0;
        String champion = "";
        int leaderPoints = 0;

        while (match < results.size()) {
            int matchResult = results.get(match);
            List<String> teams = competitions.get(match);
            String homeTeam = teams.get(0);
            String awayTeam = teams.get(1);

            int pointsHomeTeam = pointsBoard.getOrDefault(homeTeam, 0) + (matchResult == 1 ? 3 : 0);
            int pointsAwayTeam = pointsBoard.getOrDefault(awayTeam, 0) + (matchResult == 0 ? 3 : 0);
            pointsBoard.put(homeTeam, pointsHomeTeam);
            pointsBoard.put(awayTeam, pointsAwayTeam);

            if (pointsHomeTeam > leaderPoints) {
                champion = homeTeam;
                leaderPoints = pointsHomeTeam;
            }
            if (pointsAwayTeam > leaderPoints) {
                champion = awayTeam;
                leaderPoints = pointsAwayTeam;
            }
            match++;
        }
        return champion;
    }
}
