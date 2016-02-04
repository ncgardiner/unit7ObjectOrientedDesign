public class NumericQuestion extends Question
{
    private double answer;
    //method overloading (String -> double)
    public void setAnswer(double correctResponse)
    {
        this.answer = correctResponse;
    }
    
    //method overriding (same thing as OG)
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer)<=0.01;
    }
    
    
}