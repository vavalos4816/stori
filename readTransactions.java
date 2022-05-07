import java.io.File;
import java.util.Scanner;

public class readTransactions
{
  static String fileName = "transactions.csv";
  public static void main(String[] args)
  {
     readFile();
  }
  public static void readFile() {
    String line = "";
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      scanner.nextLine();
      while (scanner.hasNextLine()) {
        line = scanner.nextLine();
        readEntry(line);
      }
      scanner.close();
    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void readEntry(String line) {
    String[] fields = line.split(",");
    System.out.println(fields[0]+" "+fields[1]+" "+fields[2]);
  } 
}