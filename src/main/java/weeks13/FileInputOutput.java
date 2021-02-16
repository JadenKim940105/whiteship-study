package weeks13;

import java.io.*;

public class FileInputOutput {
    public static void main(String[] args) {

        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/Users/jhkim/Desktop/velog/whiteship-study/src/main/java/weeks13/output.txt")));
            String line = "";
            while ((line=bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        File file = new File("/Users/jhkim/Desktop/velog/whiteship-study/src/main/java/weeks13/newFile.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("!!!");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
