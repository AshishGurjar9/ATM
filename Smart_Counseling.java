import java.util.Scanner;

public class Smart_Counseling {

   static Scanner ag = new Scanner(System.in);
    static int  Interest,Interested,number=1, count=0;static String Area="",name ,skill;
   static void Pofile()
   {  
    System.out.println("________________________________________________________________________________________________________________________________________________________________\n");
    System.out.println("Skills : ( Java , Python , Communication , JavaScript , E-commerce , Soil Science , Video Editing , Animation , Typography ,Lab Techniques ,Medical  ");
    System.out.println("           Crop Management , Digital Marketing , CSS, Photoshop , Market Research , Biology Engineering , Problem Solving , Algorithm , UI/UX ,HTML  ");
    System.out.println("           Agricultural Technology )\n");
    System.out.print(" Enter Student Name  :");

     name =ag.next();
     ag.nextLine();

    //  System.out.print(" Enter your Skill    :"); 
    //   skill=ag.nextLine();

    Choice();
   }
    
   static  void welcome()
   {
    System.out.println("................................................");    
    System.out.println(" WELCOME TO THE SMART STUDENT COUNSELING SYSTEM ");
    System.out.println("................................................\n");

    System.out.println(" WHAT ARE YOUR PRIMARY AREAS OF INTEREST ?\n");
     System.out.println("      ---------- OPTIONS -----------   ");
     System.out.println(" 1.  Technology   : ");
     System.out.println(" 2.  Business     : ");
     System.out.println(" 3.  Agriculture  : ");
     System.out.println(" 4.  Science      : ");
     System.out.println(" 5.  Arts         : ");
     System.out.println(" 6.  Exit         : ");
     System.out.println(" Select Your Area  of Interest ( 1-6 ): ");
   
    try {
        Interest = ag.nextInt();
    } catch (java.util.InputMismatchException e) {
        System.out.println(" !  Please enter a valid number (1-6)  !  ");
        ag.nextLine(); // consume the invalid input
        welcome();
        return;
    }

    switch ( Interest) {
                case 1: Area=" 1.  Technology " ;
                System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
                Inner_choice();                    break;
                
                case 2: Area=" 2.  Business ";
                System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
                Inner_choice();               break;
        
                case 3: Area=" 3.  Agriculture";
                System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
                Inner_choice();                      break;
        
                 
                case 4: Area=" 4.  Science ";
                System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
                Inner_choice();                  break;
        
                case 5: Area=" 5.  Arts " ;
                System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
                Inner_choice();                break;
        
                case 6:
                // Pofile();
                System.out.println("...........................................");
                System.out.println("  @@     THANK YOU FOR VISITING HERE     @@"); 
                System.out.println("-------------------------------------------");
                 System.exit(0);     
                 //Pofile();  
                     break;

        
                 default :
                 System.out.println(" !  Please Select a Valid Choice  !  ");
                  welcome();
                     break;     
        
            }
    //  Inner_choice();
}
    static void Choice()
    { 
        System.out.print(" Enter your Skill    :"); 
        skill=ag.nextLine();

        if (skill.equalsIgnoreCase("Java")) {
            Area=" 1.  Technology " ;
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  -Technology  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Python")) {
            Area=" 1.  Technology " ;
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  -Technology  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("JavaScript")) {
            Area=" 1.  Technology " ; 
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  -Technology  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("HTML")) {
            Area=" 1.  Technology " ; 
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  -Technology  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("CSS")) {
            Area=" 1.  Technology " ; 
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  -Technology  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Problem Solving")) {
            Area=" 1.  Technology " ; 
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  -Technology  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Algorithm")) {
            Area=" 1.  Technology " ; 
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  -Technology  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Communication")) {
            Area=" 2.  Business ";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Business  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Digital Marketing")) {
            Area=" 2.  Business ";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Business  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("E-commerce")) {
            Area=" 2.  Business ";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Business  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Market Research")) {
            Area=" 2.  Business ";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Business  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Soil Science")) {
            Area=" 3.  Agriculture";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Agriculture  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Crop Management")) {
            Area=" 3.  Agriculture";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Agriculture  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Agricultural Technology")) {
            Area=" 3.  Agriculture";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Agriculture  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Biology Engineering")) {
            Area=" 4.  Science ";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Science  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Lab Techniques")) {
            Area=" 4.  Science ";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Science  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Medical")) {
            Area=" 4.  Science ";
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Science  :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Video Editing")) {
            Area=" 5.  Arts " ;
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Arts   :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Animation")) {
            Area=" 5.  Arts " ;
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Arts   :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Photoshop")) {
            Area=" 5.  Arts " ;
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Arts   :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("UI/UX")) {
            Area=" 5.  Arts " ;
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Arts   :   ");
            welcome();
        } else if (skill.equalsIgnoreCase("Typography")) {
            Area=" 5.  Arts " ;
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\n I Suggest  You Select  - Arts   :   ");
            welcome();
        } else {
            if(number==1){
                System.out.println(" !  Please Select a Valid Skill  !  ");
                number++;
                Choice();
            } else if(number==2){
                System.out.println(" Sorry ! I  Suggest , Select Your Interest   ");
                number++;
                welcome();
            }
        }
    }
   
   static void Inner_choice()  
    {
       // System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
        System.out.println("\n 1. Career Matching        : ");
        System.out.println(" 2. Skill Development Plan : ");
        System.out.println(" 3. Job Market Trends      : ");
        System.out.println(" 4. SUCCESS STORIES        : ");
        System.out.println(" 5. Return                 : ");
        System.out.println(" Select Your Choice ( 1-5 ) ");

        try {
            Interested = ag.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println(" !  Please enter a valid number (1-5)  !  ");
            ag.nextLine(); // consume the invalid input
            Inner_choice();
            return;
        }

        switch(Interested) 
        {
          case 1:
          Career_Matching(); 
                                break;

          case 2:
          Skill_Development();  break;

          case 3:
          Job_Market_Trends();  break;

          case 4:
          Success_Stories();    break;

          case 5:
          System.out.println(" Return to Your Primary Areas of Interest");
          welcome();            break;

          default:
          System.out.println(" !  Please Select a Valid Choice  !  ");
          Inner_choice();
             break;
        }
    }
    
    //      System.out.println("\n Career Matching :");
    static void Career_Matching()
    { 
    switch ( Interest) {
        case 1:  Area="1.  Technology " ;
        
        System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
        System.out.println("Career Matching :"); 
         System.out.println("  Software Developer ");
         System.out.println("  Data Scientist  ");
         System.out.println("  Cybersecurity Analyst ");    
         System.out.println("  Web Developer");       break;

        case 2: Area="2.  Business ";
         System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area+"");
         System.out.println("Career Matching :");
          System.out.println("  Marketing Manager, Business Analyst  ");
          System.out.println("  Financial Analyst ");
          System.out.println("  Project Manager  ");                break;

         case 3: Area="3.  Agriculture";
         System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
         System.out.println("Career Matching :");
          System.out.println("  Agriculture/Agronomy ");
          System.out.println("  Agriculture Engineering  ");
          System.out.println("  Food Scientist ");                  break;

         case 4: Area = " 4.  Science ";
         System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
         System.out.println("Career Matching :");
          System.out.println("  Biomedical Engineer ");
          System.out.println("  Research Scientist ");
          System.out.println("  Environmental Scientist ");         break;

         case 5: Area="5.  Arts ";
         System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
         System.out.println("Career Matching :");
          System.out.println("  Graphic Designer ");
          System.out.println("  Animator   ");
          System.out.println("  Content Creator ");                 break;

     
          
    
        default:
         System.out.println(" !  Please Select a Valid Interest  !  ");
         welcome();
            break;}
            Inner_choice();
    }   
//     static void Inner_choice()  
//     {
//         System.out.println("\n 1. Career Matching      : ");
//         System.out.println(" 2. Skill Development Plan : ");
//         System.out.println(" 3. Job Market Trends      : ");
//         System.out.println(" 4. SUCCESS STORIES        :");
//         System.out.println(" 5. Exit                   :");
//         System.out.println(" Select Your Choice ( 1-5 )");

//         Interest = ag.nextInt();
//     Skill_Development();
// }
         

        static void  Skill_Development(){
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
             System.out.println("\nSkill Development Plan : ");
             System.out.println(" Recommended Courses :");

             switch(Interest){

                case 1: 
                System.out.println(" Learn - Java , Python or JavaScript ,Problem Solving  ");
                System.out.println(" - HTML,CSS, C++ ");
                System.out.println(" - Data Structures and Algorithms ");        break;

                case 2: 
                System.out.println(" - Digital Marketing , E-commerce ");
                System.out.println(" - Market Research ");
                System.out.println(" - Communication ,Financial Management ");   break;

                case 3: 
                System.out.println(" - Soil Science ");
                System.out.println(" - Crop Management");
                System.out.println(" - Agricultural Technology ");               break;

                case 4: 
                System.out.println(" - Biology Engineering ");
                System.out.println(" - Lab Techniques ");
                System.out.println(" - Scientific Method ,Ecology ");            break;

                case 5: 
                System.out.println(" - UI/UX , Photoshop ");
                System.out.println(" - Typography ,Animation ");
                System.out.println(" - Video Editing ,Storyboarding ");          break;
    
            }
             //Job_Market_Trends();
             Inner_choice();
        }
        static void Job_Market_Trends(){
            System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
            System.out.println("\nJob Market Trends :");
            switch (Interest) {
                case 1:
                    System.out.println("  Very High Demand for Software Development ");
                    System.out.println("  and  Data Scientist. ");                   
                    System.out.println("  Growing Need for Cybersecurity Professionals.\n ");                     break;
                   
                case 2:
                    System.out.println("  Strong Demand for Business Analysts\n  and Project Managers. ");
                    System.out.println("  Growth in e-commerce and Digital Marketing.\n");                        break;

                case 3:
                    System.out.println("  Increasing Demand for Agriculture Scientists. ");    
                    System.out.println("  Growing Demand for Sustainable Agriculture and food Technology.\n");     break; 

                case 4:
                    System.out.println("  Growing Need for Biotechnology.  ");
                    System.out.println("  High Demand for Data & Environmental Scientists.\n ");                     break;

                case 5:
                    System.out.println("  Increasing Demand for Graphic Designers. ");
                    System.out.println("  Growth in Digital Art and Animation.\n ");                               break;
            

            }
           // Success_Stories();
           Inner_choice();
        }

      static void  Success_Stories()
       {
        System.out.println("\n@@  YOUR INTERESTED AREA  @@   : "+Area);
           System.out.println("SUCCESS STORIES :");
           switch(Interest){

             case 1:  
             System.out.println(" Linus Torvalds- Creator of operating system."); 
             System.out.println(" Daliana Liu - Senior Data Scientist at Amazon. ");
             System.out.println(" Satya Nadella - Security Analyst at Microsoft.\n ");   break;
             case 2:
             System.out.println(" Dean Gomes -Marketing Director at Nike. ");
             System.out.println(" Deepa Kumar - Project Menager at IBM .\n");            break;
             case 3:
             System.out.println("  Dr. M.S. Swaminathan - AGricultural Scientist. ");
             System.out.println("  Norman Borlaug - Father of the Green Revolution \n"); break;

             case 4:
             System.out.println(" Medha Patkar - Environmental Scientist at EPA. ");
             System.out.println(" CV Raman -  Research Scientist. \n");                  break;

             case 5:
             System.out.println(" Ankita Roy - Freelance Designer. ");
             System.out.println(" Ashish Chanchlani and Sandeep Maheshwari- YouTube Creator. \n ");break;


           }
           Inner_choice();
       }
    
       public static void main(String[] args) {
        int n=0; number =1;
        while(n<5){
       // welcome();
         Pofile();
        // number =1;
        System.out.println(".............................................");
        System.out.println("  @@     THANK YOU FOR VISITING HERE     @@  "); 
        System.out.println("---------------------------------------------");
         n++;
         System.out.println(" Smart_Counseling Compieted User no.= "+n);
         System.out.println("______________________________________________________________");
        }
        
       }

    
}

