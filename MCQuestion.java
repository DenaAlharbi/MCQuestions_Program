public class MCQuestion extends Question{
    private String[] choices;
    private String ans;
    public MCQuestion(String text, String[] choices, String ans) {
        super(text);
        this.choices = choices;
        this.ans = ans;
    }
    public String toString() {
        String A="a. public variables";
        String B="b. private variables";
        String C="c. instance variables";
        String D="d. class variables";
        String All="";
        //String anss= "answer= \n";
        for(int i =0;i<4;i++){
            All = All +"\n"+choices[i];

        }

        return super.toString() + All + ans;
    }
}
