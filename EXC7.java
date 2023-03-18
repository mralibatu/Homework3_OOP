import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int correctCounter = 0;
        int questionCount = 5;
        HashMap<String,Boolean> questions = new HashMap<>();
        CreateQuestions(questions,5);           //Create as many questions as entered number and put them into HashMap with default false value

        long start = System.currentTimeMillis();            //Time count start
        for (String i : questions.keySet()) {               //Ask all questions
            if(AskQuestion(i,questions)){
                correctCounter++;
                System.out.println("You are correct!");
            }
        }
        long finish = System.currentTimeMillis();          //Time count stop
        long timeElapsed = (finish - start) / 1000;        //Millisecond to second


        System.out.println("\n");
        System.out.println("Correct count is " + correctCounter);
        System.out.println("Test time is " + timeElapsed + " seconds");
        System.out.println("\nResults : ");
        for(Map.Entry<String,Boolean> que : questions.entrySet()){
            System.out.println(que.getKey() + " " + que.getValue());
        }
    }

    public static void CreateQuestions (HashMap<String,Boolean> questions , int questionCount){
        Random rnd = new Random();

        for (int i = 0; i < questionCount; i++) {
            int firstNumber = rnd.nextInt(10);          //Generate number between 0 - 9
            int secondNumber = rnd.nextInt(9) + 1;     //Generate number between 1 - 9
            String operation = RandomOperation();            //Generate random operation such as "+", "-", "/", "*"
            String question = firstNumber + " " + operation + " " + secondNumber;       //Create the question
            questions.put(question,false);                  //Put question into HashMap
        }

    }

    public static String RandomOperation(){
        Random rnd = new Random();
        switch (rnd.nextInt(4)){
            case 0: {
                return "-";
            }
            case 1:{
                return "+";
            }
            case 2:{
                return "*";
            }
            case 3:{
                return "/";
            }
        }

        return null;
    }

    public static boolean AskQuestion(String question,HashMap<String,Boolean> questions){
        Scanner input = new Scanner(System.in);
        System.out.println();

        String[] arr = question.split(" ");             //Split the question to find numbers and the operation
        int firstNumber = Integer.parseInt(arr[0]);
        String operation = arr[1];
        int secondNumber = Integer.parseInt(arr[2]);
        int answer = FindAnswer(firstNumber,secondNumber,operation);

        System.out.println("What is " + question + "?");
        int answerInput = input.nextInt();

        if(answerInput == answer){
            questions.replace(question,true);               //If the answer is true, replace boolean in the HashMap into True
        }else{
            System.out.println("Your answer is wrong!!");
            System.out.println(question + " should be " + answer);
        }
        return answerInput == answer;
    }

    public static int FindAnswer(int firstNumber, int secondNumber, String operation){
        switch (operation){
            case "-":{
                return firstNumber - secondNumber;
            }
            case "+":{
                return firstNumber + secondNumber;
            }
            case "*":{
                return firstNumber * secondNumber;
            }
            case "/":{
                return firstNumber / secondNumber;
            }
        }

        return 0;
    }
}
