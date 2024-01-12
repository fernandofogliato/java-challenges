package br.com.fogliato.miscellaneous;

import java.util.*;

// https://www.algoexpert.io/questions/stable-internships
public class StableInternships {

    // O(n²) time | O(n²) space | when n is the number of interns
    public static int[][] stableInternships(int[][] interns, int[][] teams) {
        Map<Integer, Integer> chosenInterns = new HashMap<>();
        Stack<Integer> freeInterns = new Stack<>();
        int[] currentInternChoices = new int[teams.length];
        List<Map<Integer, Integer>> teamMaps  = new ArrayList<>();

        // Initialize the stack with interns
        for (int i = interns.length-1; i >= 0; i--) {
            freeInterns.add(i);
        }

        // Initialize the map of team preferences x intern preferences
        for (int[] team : teams) {
            Map<Integer, Integer> rank = new HashMap<>();
            for (int j = 0; j < team.length; j++) {
                rank.put(team[j], j);
            }
            teamMaps.add(rank);
        }

        while (!freeInterns.isEmpty()) {
            int internNum = freeInterns.pop();
            int[] internPreferences = interns[internNum];
            int teamPreference = internPreferences[currentInternChoices[internNum]];
            currentInternChoices[internNum] += 1;

            if (!chosenInterns.containsKey(teamPreference)) {
                chosenInterns.put(teamPreference, internNum);
                continue;
            }

            int previousIntern = chosenInterns.get(teamPreference);
            int previousInternRank = teamMaps.get(teamPreference).get(previousIntern);
            int currentInternRank = teamMaps.get(teamPreference).get(internNum);

            if (currentInternRank < previousInternRank) {
                freeInterns.add(previousIntern);
                chosenInterns.put(teamPreference, internNum);
            } else {
                freeInterns.add(internNum);
            }
        }

        int[][] matches = new int[interns.length][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry: chosenInterns.entrySet()) {
            matches[index] = new int[] {entry.getValue(), entry.getKey()};
            index++;
        }
        return matches;
    }
}
