/*
 * Copyright (c) 1997,98,99,2000 E.J.Dijkstra / R.Smedinga. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. 
 *
 * This Java source code is part of a course on Object Oriented Techniques
 * developed by E.J.Dijkstra and R.Smedinga for PTS Software, Bussum.
 */
/*
 * @version 1.1 19980109
 * @author R.Smedinga@cs.rug.nl
 */


public class CounterDemo 
{
   public static void main (String argv[]) {
      while (true) {  
         System.out.println() ;
         System.out.print ("0 = finish          ") ;
         System.out.print ("1 = intCounter         ");
         System.out.println ("2 = asciiCounter       ");
         System.out.print ("3 = dateCounter        ");
         System.out.print ("4 = sequenceCounter    ") ;
         System.out.println ("5 = hexCounter         ") ;
         int answer =
            Console.readInt("which counter to test [0,1,2,3,4,5] ? ");
         if (answer == 0) return ;
         switch (answer) 
         {
            case 1 :
              aDemo (new IntCounter()) ;
              break ;
            case 2 :
              aDemo (new AsciiCounter()) ;
              break ;
            case 3 :
              aDemo (new DateCounter()) ;
              break ;
            case 4 :
              String [] seq = new String[5];
              seq[0] = "love" ;
              seq[1] = "een" ;
              seq[2] = "two" ;
              seq[3] = "drei" ;
              seq[4] = "quatro" ;
              aDemo (new SequenceCounter(seq)) ;
              break ;
            case 5 :
               aDemo (new HexCounter()) ;
              break ;
            default :
              System.out.println ("wrong number") ;
         }
      } 
   }
      
   public static void aDemo (Counter cnt) 
   {
      System.out.println ("Counter value: " + cnt.valueAsString());
      System.out.println ("16 increments:");
      for (int i=0; i<16; i++) 
      {  
         cnt.increment (); 
         System.out.print (cnt.valueAsString() + "--") ;        
         }
      System.out.println () ;
      System.out.println ("Counter value: " + cnt.valueAsString());
      System.out.println ("5 decrements:");
      for (int i=0; i<5; i++) 
      {  
         cnt.decrement (); 
         System.out.print (cnt.valueAsString() + "--") ;               
      }
      System.out.println() ;
      System.out.println ("Counter value: " + cnt.valueAsString());
      System.out.println("52 increments:") ;
      for (int i=0; i<52 ; i++) cnt.increment() ;
      System.out.println("Resulting value: " + cnt.valueAsString());
      System.out.println ("reset: ");
      cnt.reset ();
      System.out.println ("Counter value: " + cnt.valueAsString());
      System.out.println("63 increments:") ;
      for (int i=0; i<63 ; i++) cnt.increment() ;
      System.out.println("Resulting value: " + cnt.valueAsString());
      System.out.println ("reset: ");
      cnt.reset ();
      System.out.println("Resulting value: " + cnt.valueAsString());      
      System.out.println ("reset: ");
      cnt.reset ();
      System.out.println("Resulting value: " + cnt.valueAsString());
   }

}
