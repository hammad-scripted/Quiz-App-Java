import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[10];
    String[] selection = new String[10];

    QuestionService() {
        questions[0] = new Questions(1, "Which is not a programming language among them?", "4", "1) java", "2) c++", "3) python", "4) nova");
        questions[1] = new Questions(2, "Which component is used to compile, debug, and execute Java programs?", "3", "1) JRE", "2) JIT", "3) JDK", "4) JVM");
        questions[2] = new Questions(3, "Which of these is not a feature of Java?", "2", "1) Object-oriented", "2) Use of pointers", "3) Portable", "4) Dynamic");
        questions[3] = new Questions(4, "Which keyword is used to prevent method overriding in Java?", "2", "1) static", "2) final", "3) abstract", "4) protected");
        questions[4] = new Questions(5, "What is the default parameter passing mechanism in C++?", "1", "1) call by value", "2) call by reference", "3) call by pointer", "4) call by name");
        questions[5] = new Questions(6, "Which hook is used to perform side effects in a React functional component?", "3", "1) useState", "2) useContext", "3) useEffect", "4) useReducer");
        questions[6] = new Questions(7, "Which annotation is used to map a specific HTTP GET request in Spring Boot?", "2", "1) @PostMapping", "2) @GetMapping", "3) @RequestMapping", "4) @PutMapping");
        questions[7] = new Questions(8, "Which Git command is used to save your local changes temporarily without committing them?", "1", "1) git stash", "2) git commit", "3) git push", "4) git save");
        questions[8] = new Questions(9, "What is the time complexity of searching an element in a balanced Binary Search Tree (BST)?", "3", "1) O(1)", "2) O(n)", "3) O(log n)", "4) O(n log n)");
        questions[9] = new Questions(10, "Which of the following HTTP status codes represents 'Internal Server Error'?", "3", "1) 400", "2) 404", "3) 500", "4) 503");
    }

    public void playQuiz() {
        Scanner input = new Scanner(System.in); // Instantiated once outside the loop
        int i = 0; // Tracking variable declared outside the loop

        for (Questions question : questions) {
            System.out.println("Question number: " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            System.out.print("Your answer: ");
            selection[i] = input.nextLine(); // Correctly increments index now
            i++;
            System.out.println(); // Prints a newline for readability
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Questions question = questions[i];
            String actualAnswer = question.getAnswer();
            String userAnswer = selection[i]; // FIX: Compare against user selection array

            // Check if userAnswer is not null to prevent NullPointerException
            if (userAnswer != null && actualAnswer.equalsIgnoreCase(userAnswer.trim())) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }
}