package assigment;

import java.util.Scanner;

public class MyersBriggs {

    public static void main(String[] args) {
        MyersBriggs.display();
    }

    public static void display(){
         int extroversion_counter = 0;
         int introversion_counter = 0;
         int sensing_counter = 0;
         int intuition_counter = 0;
         int thinking_counter = 0;
         int feeling_counter = 0;
         int judging_counter = 0;
         int perceiving_counter = 0;

        String user_input;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 20; i++) {
            System.out.println("Enter A or B");
            switch (i) {
                case 1 ->{System.out.println("A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one: ");
                user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        extroversion_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                         introversion_counter++;
                    }
                case 2 -> {System.out.println("A. more outgoing, think out loud. B. more reserved, think to yourself: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                            sensing_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                           intuition_counter++;
                }
                case 3 ->{System.out.println( "A. seek many tasks, public activities, interaction with others:  B. seek private, solitary activities with quiet to concentrate:  ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                            thinking_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                            feeling_counter++;}
                case 4 ->{System.out.println("A.external, communicative, express yourself. B. internal, reticent, keep to yourself: ");
                    user_input = input.next();
                if (user_input.equalsIgnoreCase("A"))
                        judging_counter++;
                else
                if (user_input.equalsIgnoreCase("B"))
                       perceiving_counter++;}
                case 5 ->{System.out.println( "A. active, initiate. B. reflective, deliberate: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        extroversion_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        introversion_counter++;}
                case 6 ->{System.out.println("A. interpret literally. B. look for meaning and possibilities: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        sensing_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        intuition_counter++;}
                case 7 ->{System.out.println("A. practical, realistic, experiential. B. imaginative, innovative, theoretical: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        thinking_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        feeling_counter++;}
                case 8 ->{
                    System.out.println("A. standard, usual, conventional. B. different, novel, unique: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        judging_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        perceiving_counter++;
                }
                case 9 ->{
                    System.out.println("A. focus on here-and-now .B.look to the future, global perspective, big picture: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        extroversion_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        introversion_counter++;
                }
                case 10 ->{
                    System.out.println("A. facts, things, what is. B. ideas, dreams, what could be, philosophical: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        sensing_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        intuition_counter++;
                }
                case 11 ->{
                    System.out.println("A. logical, thinking_counter, questioning. B. empathetic, feeling, accommodating: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        thinking_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        feeling_counter++;
                }
                case 12 ->{
                    System.out.println("A. candid, straight forward, frank. B.tactful, kind, encouraging: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        judging_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        perceiving_counter++;

                }
                case 13 ->{
                    System.out.println( "A.  firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        extroversion_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        introversion_counter++;
                }
                case 14 ->{
                    System.out.println(  "A. tough-minded, just B.tender-hearted, merciful: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        sensing_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        intuition_counter++;
                }
                case 15 ->{
                    System.out.println("A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        thinking_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        feeling_counter++;
                }
                case 16 ->{
                    System.out.println("A. organized, orderly. B. flexible, adaptable: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        judging_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        perceiving_counter++;
                }
                case 17 ->{
                    System.out.println("A. plan, schedule B. unplanned, spontaneous: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        extroversion_counter++;
                    else
                        if (user_input.equalsIgnoreCase("B"))
                        introversion_counter++;
                }
                case 18 ->{
                    System.out.println("A. regulated, structured B. easygoing, live and let live: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        sensing_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        intuition_counter++;
                }
                case 19 ->{
                    System.out.println(" A. preparation, plan ahead. B. go with the flow, adapt as you go: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        thinking_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        feeling_counter++;
                }
                case 20 ->{
                    System.out.println( "A. control, govern B. latitude, freedom: ");
                    user_input = input.next();
                    if (user_input.equalsIgnoreCase("A"))
                        judging_counter++;
                    else
                    if (user_input.equalsIgnoreCase("B"))
                        perceiving_counter++;
                }
            }
        }
      if (extroversion_counter > introversion_counter)
          System.out.print("E");
      else
          System.out.print("I");
      if (sensing_counter > intuition_counter)
          System.out.print("S");
      else
          System.out.print("N");
      if (thinking_counter > feeling_counter)
          System.out.print("T");
      else
          System.out.print("F");
      if (judging_counter > perceiving_counter)
          System.out.print("J");
      else
          System.out.print("P");

    }
    }
