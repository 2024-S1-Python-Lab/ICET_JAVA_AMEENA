import java.io.*;
import java.util.Scanner;
public class ReadWriteDisp
{
public static void main(String[] args)
{
String filename, content;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Name of File: ");
filename = sc.nextLine();
try
{
// Write content to the file
FileWriter f1 = new FileWriter(filename);
System.out.println("\nEnter the Content (Press Ctrl+Z then Enter to stop):");
while (sc.hasNextLine())
{
content = sc.nextLine();
f1.write(content + "\n"); // Add newline to avoid merging
}
f1.close();
System.out.println("\nContent written to the file successfully.");
}
catch (IOException ioe)
{
System.out.println("\nException: " + ioe);
}
try
{
// Read content from the file
FileReader fr = new FileReader(filename);
Scanner fileScanner = new Scanner(fr);
System.out.println("\nContent of the file:");
while (fileScanner.hasNextLine())
{
content = fileScanner.nextLine();
System.out.println(content);
}
fileScanner.close();
fr.close();
}
catch (IOException ioe)
{
System.out.println("\nException: " + ioe);
}
sc.close(); // Close Scanner
}
}
