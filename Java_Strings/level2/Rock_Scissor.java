import java.util.Scanner;

public class Rock_Scissor{

    // Method 1: Generate computer's choice using Math.random
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) {
            return "rock";
        } else if (rand < 0.66) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Method 2: Determine the winner between user and computer
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        switch (user) {
            case "rock":
                return (computer.equals("scissors")) ? "Player" : "Computer";
            case "paper":
                return (computer.equals("rock")) ? "Player" : "Computer";
            case "scissors":
                return (computer.equals("paper")) ? "Player" : "Computer";
            default:
                return "Invalid";
        }
    }

    // Method 3: Compute win counts and percentages
    public static String[][] calculateStats(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];

        double playerPercent = (totalGames > 0) ? ((double) playerWins / totalGames) * 100 : 0;
        double computerPercent = (totalGames > 0) ? ((double) computerWins / totalGames) * 100 : 0;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        return stats;
    }

    // Method 4: Display results
    public static void displayResults(String[][] gameData, String[][] stats, int draws) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < gameData.length; i++) {
            System.out.println((i + 1) + "\t" + gameData[i][0] + "\t" + gameData[i][1] + "\t\t" + gameData[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.println("Player\tWins\tWin %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }

        System.out.println("\nDraws: " + draws);
    }

    // Main method
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] gameData = new String[totalGames][3]; // Stores player, computer, winner
        int playerWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice! Please enter rock, paper, or scissors: ");
                userChoice = scanner.nextLine().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameData[i][0] = userChoice;
            gameData[i][1] = computerChoice;
            gameData[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, draws, totalGames);
        displayResults(gameData, stats, draws);

        }
    }
}
