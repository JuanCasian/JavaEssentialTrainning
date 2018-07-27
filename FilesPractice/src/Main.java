import java.io.*;

public class Main {
    public static void main(String[] args){
        String testFile = "res/test.txt";
        String resultFile = "res/result.txt";

        try (
                FileReader fileReader = new FileReader(testFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(resultFile)
        ) {
            while (true)
            {
                String line = bufferedReader.readLine();
                if (line == null)
                    break;
                fileWriter.write(line + '\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
