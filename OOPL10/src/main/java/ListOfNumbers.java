import java.io.*; 
import java.util.Vector; 
 
public class ListOfNumbers { 
private Vector victor; 
private static final int size = 10; 
public ListOfNumbers () { 
 victor = new Vector(size); 
 for (int i = 0; i < size; i++) 
  victor.addElement(new Integer(i)); 
} 
public void writeList() { 
 PrintWriter p = null; 
  try { 
   System.out.println("Entering try statement"); 
   p = new PrintWriter(new FileOutputStream("OutFile.txt")); 
   for (int i = 0; i < size; i++) 
    p.println("Value at: " + i + " = " + victor.elementAt(i)); 
   } catch (ArrayIndexOutOfBoundsException e) { 
      System.err.println("Caught ArrayIndexOutOfBoundsException: " + 
 e.getMessage()); 
     } catch (IOException e) { 
        System.err.println("Caught IOException: " + e.getMessage()); 
       } finally { 
          if (p != null) { 
           System.out.println("Closing PrintWriter"); 
           p.close(); 
          } else { 
             System.out.println("PrintWriter not open"); 
            } 
        } 
    } 
 
 public static void main(String args[])   { 
 ListOfNumbers lst = new ListOfNumbers(); 
 lst.writeList(); 
}//end main 
 
}//end ListOfNumbers 