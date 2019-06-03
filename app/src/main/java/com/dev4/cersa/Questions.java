package com.dev4.cersa;


//stin klasi questions kanonika ginetai h sindesi me thn vasi
//stin dikia mas morfi kai gia na mporei na ilopoihthei h efarmogh mpainoun statika
public class Questions {

    // kataxwrw tis erwtisis/apantiseis statika
    public String mQuestions[]={
            "Ποιος είναι καθηγητής στην Λογική Σχεδίαση;" ,
            "Δώσε αποτέλεσμα 1+3" ,
            "Πόσα χρόνια ειναι το CEID;" ,
            "Ποιος είναι πρόεδρος του Τμήματος" ,
            "Σε ποια πόλη είναι το CEID;" ,



    };

    public String mChoices[][]={
        {"Κος Βέργος","Κος Αλεξίου","Κος Λουτσέσκου","Κος Μπαρτζώκας"},
        {"2","lne","4","ln kourtinas"},
        {"To ceid είναι για πάντα","3","10","5"},
        {"Κος Γαροφαλάκης","Κος Γαλλόπουλος","Κος Μαρινάκης","Κος Αλαφούζος"},
        {"Πάτρα","Αθήνα","Ηράκλειο","Γουίντερφελ"},
    };

    private String mCorrectAnswers[] = {"Κος Βέργος","4","5","Κος Γαλλοπουλος","Πάτρα",};


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


