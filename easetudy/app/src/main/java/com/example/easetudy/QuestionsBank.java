package com.example.easetudy;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Who invented Java Programming?", "Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup", "James Gosling","");
        final QuestionsList question2 = new QuestionsList("Which statement is true about Java?", "Java is a sequence-dependent programming language","Java is a code dependent programming language","Java is a platform-dependent programming language","Java is a platform-independent programming language", "Java is a platform-independent programming language","");
        final QuestionsList question3 = new QuestionsList("Which component is used to compile, debug and execute the java programs?", "JRE","JIT","JDK","JVM", "JDK","");
        final QuestionsList question4 = new QuestionsList("Which one of the following is not a Java feature?", "Object-oriented","Use of pointers","Portable","Dynamic and Extensible", "Use of pointers","");
        final QuestionsList question5 = new QuestionsList("Which of these cannot be used for a variable name in Java??", "identifier & keyword","identifier","keyword","none of the above", "keyword","");
        final QuestionsList question6 = new QuestionsList("What is the extension of java code files?", ".js",".txt",".class",".java", ".java","");
        final QuestionsList question7 = new QuestionsList("Which environment variable is used to set the java path?", "MAVEN_Path","JavaPATH","JAVA","JAVA_HOME", "JAVA_HOME","");
        final QuestionsList question8 = new QuestionsList("Which of the following is not an OOPS concept in Java?", "Polymorphism","Inheritance","Compilation","Encapsulation", "Compilation","");
        final QuestionsList question9 = new QuestionsList("What is not the use of “this” keyword in Java?", "Referring to the instance variable when a local variable has the same name","Passing itself to the method of the same class","Passing itself to another method","Calling another constructor in constructor chaining", "Passing itself to the method of the same class","");
        final QuestionsList question10 = new QuestionsList("Which component is used to compile, debug and execute the java programs?", "JRE","JIT","JDK","JVM", "JDK","");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Which of the following options represents the incorrect way to declare a PHP variable?", "$aVariable;","$a_Variable = 9;","$AVariable;","$a Variable;", "$a Variable;","");
        final QuestionsList question2 = new QuestionsList("Which of the following is the incorrect way to declare a PHP variable?", "$a_Number = 9;","$a_Number = 9","$a_Num = 9;","$aNumber = 9;", "$a_Number = 9 ","");
        final QuestionsList question3 = new QuestionsList("Using which of the following way can you embed PHP code in an HTML page?", "<?php PHP code goes here ?>","<? PHP code goes here ?>","<script language=\"php\"> PHP code goes here </script>","All of the above", "All of the above","");
        final QuestionsList question4 = new QuestionsList("Which of the following type of variables are floating-point numbers, like 3.14159 or 49.1?", "Integers","Doubles","Booleans","Strings", "Doubles","");
        final QuestionsList question5 = new QuestionsList("Which of the following function is used to redirect a page?", "redirect()","header()","reflect()","None of the above", "header()","");
        final QuestionsList question6 = new QuestionsList("Which of the following is used to destroy the session?", "session_start() function","$_SESSION[]","isset() function","session_destroy() function", "session_destroy() function","");
        final QuestionsList question7 = new QuestionsList("Which of the following method of Exception class returns source line?", "getMessage()","getCode()","getFile()","getLine()", "getLine()","");
        final QuestionsList question8 = new QuestionsList("Which of the following method returns current date and time?", "time()","getdate()","date()","None of the above", "time()","");
        final QuestionsList question9 = new QuestionsList("Which of the following array represents an array containing one or more arrays?", "Numeric Array","Associative Array","Multidimentional Array","None of the above", "Multidimentional Array","");
        final QuestionsList question10 = new QuestionsList("What is the correct way to add 1 to the $count variable?", "$count =+1","count++;","++count","$count++;", "$count =+1","");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }
    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("There are ___ levels of heading in HTML", "Three","Four","Five","Six", "Six","");
        final QuestionsList question2 = new QuestionsList("Which of the following tags do not require a terminator?", "<u>","<br>","<b>","none of the above", "<br>","");
        final QuestionsList question3 = new QuestionsList("To get the ordered list we use", "<h1>","<ul>","<ol>","<ml>", "<ol>","");
        final QuestionsList question4 = new QuestionsList("The Major components of the Web browser are ___", "Menu Bar","ToolBar","Location","All Of the Above", "All Of the Above","");
        final QuestionsList question5 = new QuestionsList("Which one of the following tags is used to insert graphics in the webpage", "<image>","<images>","<img>","<graphics>", "<img>","");
        final QuestionsList question6 = new QuestionsList("The following html tag is used to display the content as a moving text", "<marquee>","</img>","<a href>","none of the above", "<marquee>","");
        final QuestionsList question7 = new QuestionsList("html comment should be enclosed between", "<!– and — >","<! And !>","<!— and –“”","none of the above", "<!– and — >","");
        final QuestionsList question8 = new QuestionsList("html document have a extension ____", ".htx or .htxl"," .htm or .html",".hmt or hmtl","none of the above", ".htm or .html","");
        final QuestionsList question9 = new QuestionsList("CGI stand for", "Command Gate Interface","Common Gateway Interface","Common Gate input","None of the above", "Common Gateway Interface","");
        final QuestionsList question10 = new QuestionsList("For a particular font its size attribute can be an absolute value ranging form", "1-10","1-9","1-8","1-7", "1-10","");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }
    private static List<QuestionsList> cplusplusQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Who invented C++?", "Dennis Ritchie","Ken Thompson","Brian Kernighan","Bjarne Stroustrup", "Bjarne Stroustrup","");
        final QuestionsList question2 = new QuestionsList("What is C++?", "C++ is an object oriented programming language","C++ is a procedural programming language","C++ supports both procedural and object oriented programming language","C++ is a functional programming language", "C++ supports both procedural and object oriented programming language","");
        final QuestionsList question3 = new QuestionsList(" Which of the following is used for comments in C++?", "/* comment */","// comment */","// comment","both // comment or /* comment */", "both // comment or /* comment */","");
        final QuestionsList question4 = new QuestionsList(" Which of the following is a correct identifier in C++?", "VAR_1234","$var_name","7VARNAME","7var_name", "VAR_1234","");
        final QuestionsList question5 = new QuestionsList("Which of the following is not a type of Constructor in C++?", "Default constructor","Parameterized constructor","Copy constructor","Friend constructor", "Friend constructor","");
        final QuestionsList question6 = new QuestionsList("What is virtual inheritance in C++?", "C++ technique to enhance multiple inheritance","C++ technique to ensure that a private member of the base class can be accessed somehow","C++ technique to avoid multiple inheritances of classes","C++ technique to avoid multiple copies of the base class into children/derived class", "C++ technique to avoid multiple copies of the base class into children/derived class","");
        final QuestionsList question7 = new QuestionsList("Which of the following is the correct syntax of including a user defined header files in C++?", "#include [userdefined]","#include “userdefined”","#include <userdefined.h>","#include <userdefined>", "#include “userdefined”","");
        final QuestionsList question8 = new QuestionsList("Which of the following user-defined header file extension used in c++?", "hg","cpp","h","hf", "h","");
        final QuestionsList question9 = new QuestionsList("Which of the following approach is used by C++?", "Left-right","Right-left","Bottom-up","Top-down", "Bottom-up","");
        final QuestionsList question10 = new QuestionsList("What is the difference between delete and delete[] in C++?", "delete is syntactically correct but delete[] is wrong and hence will give an error if used in any case","delete is used to delete normal objects whereas delete[] is used to pointer objects","delete is a keyword whereas delete[] is an identifier","delete is used to delete single object whereas delete[] is used to multiple(array/pointer of) objects", "delete is used to delete single object whereas delete[] is used to multiple(array/pointer of) objects","");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {

        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "cplusplus":
                return cplusplusQuestions();
            default:
                return htmlQuestions();
        }
    }
}
