package com.dev4.cersa;



public class Questions {

    public String mQuestions[]={
            "Erwtisi 1" ,
            "Erwtisi 2" ,
            "Erwtisi 3" ,
            "Erwtisi 4" ,
            "Erwtisi 5" ,



    };

    public String mChoices[][]={
        {"Answer1","Answer2","Answer3","Answer4"},
        {"Answer2","Answer1","Answer3","Answer4"},
        {"Answer3","Answer2","Answer1","Answer4"},
        {"Answer4","Answer2","Answer3","Answer1"},
        {"Answer1","Answer2","Answer3","Answer4"},
    };

    private String mCorrectAnswers[] = {"Answer1","Answer2","Answer3","Answer4","Answer1",};


    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
            String choice = mChoices[a][0];
            return choice;

    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;

    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;

    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;

    }
    public String getCorrectAnswer(int a ){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}


