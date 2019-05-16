package com.dev4.cersa;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Scanner;

public class AddQuestion {

enum tipos_erwtisewn
{
    Choose_questiontype,
    TRUE_FALSE,
    MULTIPLE_CHOICE
}

String question="",answer="";

enum lista_mathimatwn
{
    Choose_Course,
    Calculus_I,
    Software_Engineering,
    Computer_Architecture
}

private boolean ValidateQuestion(String answer,String question,tipos_erwtisewn tipos,lista_mathimatwn mathima) {


    if (mathima.equals("")) { // Check if course selected
        System.out.print("Please choose a course\n");
        return false;

    } else if (tipos.equals("")) {  // Check if question type selected
        System.out.print("Please choose question type\n");
        return false;

    }else if(answer.equals("")) {
        if(tipos == tipos_erwtisewn.MULTIPLE_CHOICE){
            System.out.print("Please provide an answer\n");
            return false;
        }}

    if(question.equals("")) {
        System.out.print("Please provide a question\n");
        return false;
    }

    return true; // All clear
}

private void AddaQuestion(){

    String mathima,tipos;

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    Scanner myObj1 = new Scanner(System.in);
    Scanner myObj2 =  new Scanner(System.in);
    Scanner myObj3 =  new Scanner(System.in);



    System.out.println("Choose a course\n");
    mathima = myObj.nextLine();
    lista_mathimatwn mathimaEnum = lista_mathimatwn.valueOf(mathima); // String to Enum

    System.out.println("Choose question type\n");
    tipos = myObj1.nextLine();
    tipos_erwtisewn tiposEnum = tipos_erwtisewn.valueOf(tipos); // String to Enum

    System.out.println("Enter your question\n");
    question = myObj2.nextLine();

    if(tipos.equals("MULTIPLE_CHOICE")) {
        System.out.println("Enter your answer\n");
        answer = myObj3.nextLine();

    }

ValidateQuestion(answer,question,tiposEnum,mathimaEnum);


}

}
