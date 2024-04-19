import java.util.*;

public class Trivia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Trivia Game! Write your answer in order to respond to each question. (Case Sensitive!)");

        ArrayList<String[]> answers = new ArrayList<>();
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();
        ArrayList<String> input = new ArrayList<>();

        
        addQuestionsAndAnswers(questions, answers, categories);

        // Game
        int score = 0;
        int totalQuestions = 10;
        Set<Integer> askedQuestions = new HashSet<>(); 

        try {
            for (int i = 0; i < totalQuestions; i++) {
                int randomIndex;
                do {
                    randomIndex = random.nextInt(questions.size());
                } while (askedQuestions.contains(randomIndex));
                askedQuestions.add(randomIndex);

                System.out.println("Question " + (i + 1) + " (Category: " + categories.get(randomIndex) + "): " + questions.get(randomIndex));
                String[] currentOptions = answers.get(randomIndex);
                displayOptions(currentOptions);

                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();
                input.add(userAnswer);

                if (userAnswer.equalsIgnoreCase(currentOptions[0])) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + currentOptions[0] + "\n");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Insufficient questions in the question bank.");
        } finally {
            
            System.out.println("Game Over!\nYour Score: " + score + "/" + totalQuestions);
            System.out.println("Your Answers: " + input);

            
            if (score >= 7) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Sorry, you did not meet the win condition. Better luck next time!");
            }

            
            scanner.close();
        }
    }

    private static void addQuestionsAndAnswers(ArrayList<String> questions, ArrayList<String[]> answers, ArrayList<String> categories) {
        questions.add("What is the capital of France?");
        answers.add(new String[]{"Paris", "Rome", "Madrid", "Berlin"});
        categories.add("Geography");
        questions.add("What is the capital of Venezuela?");
        answers.add(new String[]{"Caracas", "Bogota", "Washington", "La 42"});
        categories.add("Geography");
        questions.add("What is the capital of Dominican Republic?");
        answers.add(new String[]{"Santo Domingo", "San Juan", "Luap", "Sanca"});
        categories.add("Geography");
        questions.add("What is the capital of Spain?");
        answers.add(new String[]{"Madrid", "Duane", "Palalin", "Barcelona"});
        categories.add("Geography");
        questions.add("What is the capital of Colombia?");
        answers.add(new String[]{"Bogota", "San Pedro", "Taling", "Beijing"});
        categories.add("Geography");
        questions.add("Who holds the record for the most points scored in a single NBA game?");
        answers.add(new String[]{"Wilt Chamberlain", "Kobe Bryant", "LeBron James", "Michael Jordan"});
        categories.add("Basketball");
        questions.add("Name the NBA team with the most championships in history.");
        answers.add(new String[]{"Boston Celtics", "Los Angeles Lakers", "Chicago Bulls", "Golden State Warriors"});
        categories.add("Basketball");
         questions.add("Which player is known as 'The Answer' and played for the Philadelphia 76ers?");
        answers.add(new String[]{"Allen Iverson", "Shaquille O'Neal", "Tim Duncan", "Kevin Garnett"});
        categories.add("Basketball");
        questions.add("What is the regulation height of an NBA basketball hoop in feet?");
        answers.add(new String[]{"10 feet", "9 feet", "11 feet", "12 feet"});
        categories.add("Basketball");
        questions.add("In which year did the Chicago Bulls win their first NBA championship with Michael Jordan?");
        answers.add(new String[]{"1991", "1989", "1993", "1995"});
        categories.add("Basketball");
        questions.add("Who won the FIFA World Cup in 2018?");
        answers.add(new String[]{"France", "Croatia", "Brazil", "Germany"});
        categories.add("Soccer");
        questions.add("Which team has won the most UEFA Champions League titles in football?");
        answers.add(new String[]{"Real Madrid", "Barcelona", "Bayern Munich", "Liverpool"});
        categories.add("Soccer");
        questions.add("Who is the all-time leading goal scorer in the history of the English Premier League?");
        answers.add(new String[]{"Alan Shearer", "Thierry Henry", "Wayne Rooney", "Frank Lampard"});
        categories.add("Soccer");
        questions.add("In which year did Lionel Messi win his first FIFA Ballon d'Or?");
        answers.add(new String[]{"2009", "2007", "2010", "2012"});
        categories.add("Soccer");
        questions.add("Name the current coach of the Brazilian national football team.");
        answers.add(new String[]{"Tite", "Dunga", "Luiz Felipe Scolari", "Carlos Queiroz"});
        categories.add("Soccer");
        questions.add("What are the names of Goku's sons in Dragon Ball Z?");
        answers.add(new String[]{"Gohan and Goten", "Trunks and Krillin", "Vegeta and Piccolo", "Yamcha and Tien"});
        categories.add("Dragon Ball");
         questions.add("Who is the creator of the Dragon Ball manga and anime series?");
        answers.add(new String[]{"Akira Toriyama", "Masashi Kishimoto", "Eiichiro Oda", "Hiro Mashima"});
        categories.add("Dragon Ball");
        questions.add("What is the name of the powerful fusion between Goku and Vegeta?");
        answers.add(new String[]{"Vegetto", "Gogeta", "Goketa", "Vegito"});
        categories.add("Dragon Ball");
        questions.add("In Dragon Ball Z, which character is the Prince of all Saiyans?");
        answers.add(new String[]{"Vegeta", "Goku", "Raditz", "Bardock"});
        categories.add("Dragon Ball");
        questions.add("What are the seven Dragon Balls used for in the Dragon Ball series?");
        answers.add(new String[]{"Summoning Shenron", "Making a wish", "Powering up", "Opening a portal to another dimension"});
        categories.add("Dragon Ball");
        

        
    }

    private static void displayOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) ('A' + i) + ". " + options[i]);
        }
    }
}
