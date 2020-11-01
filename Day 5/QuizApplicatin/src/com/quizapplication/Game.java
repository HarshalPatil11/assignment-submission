package com.quizapplication;
import java.util.Scanner;
public class Game {

    Questions[] questions=new Questions[3];
    Player player=new Player();

    String[] questionsdata={"  Name the first cricketer to score 1000 runs in an innings in any competitive match ?","According to international standard, what is the distance of marathon race?"," Beighton Cup is associated with which of the following ?"};
    String[] options1={"Prithvi Shaw","26 miles 385 yards","Cricket"};
    String[] options2={"Pranav Dhanawade","26 miles","Football"};
    String[] options3={"Virat Kohli","36 miles 500 yards","Hockey"};
    String[] options4={"Shikhar Dhawan","22 miles","Volleyball"};
    int[] answers={2,1,3};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Questions();
        }


        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Correct Answer !");
                player.score++;
            }
            else{
                System.out.println("Wrong Answer !");


            }
        }

        System.out.println(player.name+" your score is "+player.score);

    }

}
