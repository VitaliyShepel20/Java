import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A9 {

    public static void main(String[] args) {

        String filePath = "input.txt";
        String secLine = readSecondLine(filePath);
        System.out.println("The second line:\n --> " + secLine);
    }

    public static String readSecondLine(String path)
    {
        String secondLine = null;
        Scanner fileReader;
        try
        {
            fileReader = new Scanner(new File(path));
            int nLines = 0;
            while(fileReader.hasNextLine())
            {
                String currentLine = fileReader.nextLine().trim();
                nLines++;
                if(nLines == 2)
                {
                    secondLine = currentLine;
                    break;
                }
            }
            fileReader.close();
        }catch(FileNotFoundException fnfe){
            System.out.println("File " + path + " could not be found! Exiting..");
            System.exit(0);
        }
        return secondLine;
    }
}