public class MCQuestion extends Question{
    private String[] choices;
    private String ans;
    public MCQuestion(String text, String[] choices, String ans) {
        super(text);
        this.choices = choices;
        this.ans = ans;
    }
    public String toString() {
        
        String All="";

        for(int i =0;i<4;i++){
            All = All +"\n"+choices[i];

        }

        return super.toString() + All + ans;
    }
}
