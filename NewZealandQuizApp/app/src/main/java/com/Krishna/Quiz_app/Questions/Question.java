package com.Krishna.Quiz_app.Questions;

public class Question {
    public String quesarray[] =
            {
                    "1. The Kiwifruit was originally called what?",
                    "2. Whose head will you find on all New Zealand coins?",
                    "3. Name the sea that lies between Australia and New Zealand",
                    "4. New Zealand's international rugby team is called what?",
                    "5. What was the capital of New Zealand before it was moved to Wellington?",
                    "6. What is the Maori word for New Zealand?",
                    "7. Where in New Zealand did the severe 1931 earthquake occur?",
                    "8. What is the name of the Maori welcoming ceremony?",
                    "9. What is the Maori word for \"mountain\"?",
                    "10.The city, Tamaki, is better known as?"
            };
    private String selectans[][] =
            {
                    {"Chinese Gooseberry","Gooseberry","Chinese Blueberry","Chinese Berry"},
                    {"Queen Elizabeth III","Queen Elizabeth I","Queen Elizabeth II","Queen Elizabeth"},
                    {"Pacific Ocean","Tasman","South Pacific Ocean","Western Pacific Ocean"},
                    {"All Blacks","Black caps","All caps","All black"},
                    {"Otago","Christ church","Auckland","Queenstown"},
                    {"Aoteara","Aotearoae","Aotearo","Aotearoa"},
                    {"Napier","Auckland","Rotorua","None of the mentioned"},
                    {"Powhi","Powhir","Pohiri","Powhiri"},
                    {"Powhiri","Aotearo","Maunga","None Of The Above"},
                    {"Christchurch","Otago","Wellington","Auckland"}
            };
    private String correctans[] =
            {
                    "Chinese Gooseberry","Queen Elizabeth II","Tasman","All Blacks","Auckland","Aotearoa","Napier","Powhiri","Maunga","Auckland"
            };

    public String getQuestion(int a)
    {
        String question = quesarray[a];
        return question;
    }

    public String getChoice1(int a)
    {
        String choice0 = selectans[a][0];
        return choice0;
    }

    public String getChoice2(int a)
    {
        String choice1 = selectans[a][1];
        return choice1;
    }

    public String getChoice3(int a)
    {
        String choice2 = selectans[a][2];
        return choice2;
    }

    public String getChoice4(int a)
    {
        String choice3 = selectans[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a)
    {
        String answer = correctans[a];
        return answer;
    }
    public int getLength()
    {
        return  quesarray.length;
    }
}
