package operators.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isInterviewQuestionsSent = false;
        boolean isJavaHomeworkSent = false;

        //Sent meInterviewQuestions OR HavaHomework

        System.out.println("The student is okay: " +
                (isInterviewQuestionsSent || isJavaHomeworkSent)); //true
        // if there is a single True for OR it is True

        //Sent meInterviewQuestions And HavaHomework
        System.out.println("The student is okay: " +
                (isInterviewQuestionsSent && isJavaHomeworkSent)); //true
        // if there is a single True for OR it is True

        System.out.println("\nThe student did not send the homework " + !isInterviewQuestionsSent);





    }
}
