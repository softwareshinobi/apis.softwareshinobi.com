package digital.softwareshinobi.workspace.sports.wnba;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockWNBAScoresController {

    public static final String[] teams = {
        "Seattle Storm",
        "Chicago Sky",
        "Las Vegas Aces",
        "Minnesota Lynx",
        "Washington Mystics",
        "Los Angeles Sparks",
        "Indiana Fever",
        "Dallas Wings",
        "New York Liberty",
        "Connecticut Sun",
        "Golden State Valkyries", // Starting 2025 season
        "Portland" // Planned expansion city, team name TBD, likely starting later
    };

    public MockWNBAScoresController() {

        System.out.println("## ");
        System.out.println("## init > WNBA Odds Controller");
        System.out.println("## ");

    }

    @GetMapping("/wnba/odds")
    public List<Map<String, Object>> generateMockScores() {

        return generateGameData();

    }

    private List<Map<String, Object>> generateGameData() {

        List<Map<String, Object>> gameList = new ArrayList<>();

        String date = new Date().toString();

        int[] scores = new int[teams.length];

        for (int i = 0; i < teams.length; i++) {
            scores[i] = (int) Math.floor(Math.random() * (100 - 60 + 1)) + 60;
        }

        for (int i = 0; i < scores.length; i += 2) {

            Map<String, Object> gameData = new HashMap<>();

            gameData.put("date", date);

            String team1 = teams[i];
            String team2 = teams[i + 1];
            int score1 = scores[i];
            int score2 = scores[i + 1];

            gameData.put("away_team", team1);
            gameData.put("home_team", team2);
            gameData.put("away_score", score1);
            gameData.put("home_score", score2);

            int overUnder = (int) Math.floor(Math.random() * (170 - 130 + 1)) + 130;
            gameData.put("over_under", overUnder);

            if (Math.random() < 0.5) {

                double moneylineUnderdog = Math.round(Math.random() * 150 + 100); // Range +100 to +250

                // Negative moneyline for favorite (e.g., -200)
                double moneylineFavorite = Math.round(-(Math.random() * 150 + 150)); // Range -150 to -300

                gameData.put("away_money_line", moneylineFavorite);
                gameData.put("home_money_line", moneylineUnderdog);

            } else {

                double moneylineUnderdog = Math.round(Math.random() * 150 + 100); // Range +100 to +250

                // Negative moneyline for favorite (e.g., -200)
                double moneylineFavorite = Math.round(-(Math.random() * 150 + 150)); // Range -150 to -300

                gameData.put("away_money_line", moneylineFavorite);
                gameData.put("home_money_line", moneylineUnderdog);
            }

            // Note: The original moneyline calculation for underdog was mathematically incorrect
            // for standard moneyline representation. This provides a more typical range.
            // Positive moneyline for underdog (e.g., +150)
            //    gameData.put("favorite_moneyline", moneylineFavorite);
            //
            gameList.add(gameData);
        }

        return gameList;
    }

    private static void shuffleArray(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) Math.floor(Math.random() * (i + 1));
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
