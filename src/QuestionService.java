
public class QuestionService {

    Questions[] questions=new Questions[10];

    QuestionService(){
        questions[0] = new Questions(1, "Which is not a programming language among them?", "java", "c++", "python", "nova", "nova");
        questions[1] = new Questions(2, "Which component is used to compile, debug, and execute Java programs?", "JRE", "JIT", "JDK", "JVM", "JDK");
        questions[2] = new Questions(3, "Which of these is not a feature of Java?", "Object-oriented", "Use of pointers", "Portable", "Dynamic", "Use of pointers");
        questions[3] = new Questions(4, "Which keyword is used to prevent method overriding in Java?", "static", "final", "abstract", "protected", "final");
        // Note: In C++, default parameter passing is by value.
        questions[4] = new Questions(5, "What is the default parameter passing mechanism in C++?", "call by value", "call by reference", "call by pointer", "call by name", "call by value");
        questions[5] = new Questions(6, "Which hook is used to perform side effects in a React functional component?", "useState", "useContext", "useEffect", "useReducer", "useEffect");
        questions[6] = new Questions(7, "Which annotation is used to map a specific HTTP GET request in Spring Boot?", "@PostMapping", "@GetMapping", "@RequestMapping", "@PutMapping", "@GetMapping");
        questions[7] = new Questions(8, "Which Git command is used to save your local changes temporarily without committing them?", "git stash", "git commit", "git push", "git save", "git stash");
        questions[8] = new Questions(9, "What is the time complexity of searching an element in a balanced Binary Search Tree (BST)?", "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(log n)");
        questions[9] = new Questions(10, "Which of the following HTTP status codes represents 'Internal Server Error'?", "400", "404", "500", "503", "500");
    }
    public void displayQuestions(){

        for(Questions question:questions){
            System.out.println(question);
        }
    }
}
