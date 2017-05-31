import java.util.Scanner;
import java.io.*; //import entire io library for 'File', 'ExceptionNotFound', etc.
//Scan .txt file and return word count.
  public class Scan {
    public static void main(String[] args) throws IOException { //IOException handles 'file not found', file corruption, etc.
      File file = new File("Gettysburg Address.txt"); //save document as .txt; must import Apache POI libraries to read .doc or .docx
      Scanner sc = new Scanner(file);
      int WordCount = 0;
      int Finder = 0;
      String word;
      Scanner input = new Scanner(System.in);
      System.out.println("You have accessed the Gettysburg Address. What word are you looking for?");
      word = input.next();
      while (sc.hasNext()) {
        WordCount++;
        if (sc.next().equals(word)) {
            Finder++;
          }
        }
        System.out.print("There are " + Finder + " instances of the word '" + word + "' in this file.\nTotal word count: " + WordCount + ".\n");
   }
  }


