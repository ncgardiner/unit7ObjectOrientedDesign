import java.util.Scanner;
public class FillInQuestion extends Question
{
    /*This class supports fill in the blank questions where the answer is specified
     * in the question
     * ex: "The inventor of Java was _James Gosling_."
     * This will extract the answer from the question and replace the answer with _____
     */
    
    //we will override setText method cus why not lol
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "______"+parser.next();
        //lit
        super.setText(question);
        this.setAnswer(answer);
    }
}