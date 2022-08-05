import java.awt.*;
import java.awt.event.KeyEvent;


import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;



import java.awt.event.KeyListener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Criminals {
    //public static int[] selection;

    //private static KeyEvent event;


    public static void main(String[] args) {


        boolean process = true;
        while (process==true){
int selection=0;


        selection=selection-1;

        //public  int[] selection = {0};

        // KeyEvent event = null;
        // KeyEvent event = null;

        //  {

        // }
        int inChar;
        System.out.println("Enter a Character to search criminals by alphabet first name:");
        try {
            inChar = System.in.read();
            System.out.print("You entered ");

            if(inChar==100)
            {
                selection=selection+2;
                criminal c1 = new criminal("black", 32, "Dexter");
                System.out.println("1" + c1);
            }

            if(inChar==99)
            {

                criminal c4= new criminal("Italian",999,"Captain Hook");
                criminal c2 = new criminal("Italian", 900, "Capone");
                System.out.println("1" + c2 + "         2" + c4 );



            }

            if(inChar==99)
            {

                criminal c4= new criminal("Italian",999,"Captain Hook");
              //  criminal c2 = new criminal("Italian", 900, "Capone");
                System.out.println("1" +   "         2" + c4 );



            }



            if(inChar==10)
            {
                selection=selection+2;

            }
            System.out.println(inChar);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }




      selection=selection+1;
      //  int selection = 0;
      //  if (selection == 1) {
        //    criminal c1 = new criminal("black", 32, "Dexter");
        //    System.out.println("1" + c1);
      //  } else if (selection == 2) {
      //      criminal c2 = new criminal("Italian", 900, "Capone");
       //     System.out.println("1" + c2);
      //  } else if (selection == 3) {
      //      criminal c3 = new criminal("Italian", 900, "Capone");
      //      System.out.println("3");
      //  } else {
       //     selection = selection * 0;

      //  }


        //  criminal c1 = new criminal("black", 32, "Dexter");
        // criminal c2 = new criminal("Italian", 900, "Capone");
        // criminal c3 = new criminal("AllRacesMixed", 70000, "Captain Pollution");

        //  System.out.println(c1);
        //  System.out.println(c2);


        // criminal one = new criminal(Ablack, 32);
        //criminal one = new criminal();
        //one = new criminal("Italian", 32, "jones");


        //   criminal c;
        //     c = new criminal("Italian",20);
        //     Scanner SelectCriminal = new Scanner(System.in);

        //     String firstName = SelectCriminal.nextLine();

        //  System.out.println("Username is: " + race);

        //     if(c.race=="Italian")


    }}}