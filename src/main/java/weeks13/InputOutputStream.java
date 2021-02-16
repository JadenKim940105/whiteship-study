package weeks13;

import java.io.*;

public class InputOutputStream {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/jhkim/Desktop/velog/whiteship-study/src/main/java/weeks13/output.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        int data = 0;
        try{
            while ((data = System.in.read()) != -1){
                fileOutputStream.write(data);
            }
        } catch (IOException ioe){
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*long start = System.currentTimeMillis();

        FileInputStream fileInputStream = new FileInputStream("/Users/jhkim/Desktop/velog/whiteship-study/src/main/java/weeks13/test.txt");
        int i = 0;
        try{
            while ((i = fileInputStream.read()) != -1){
                System.out.write(i);
            }

        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("걸린시간 : " + (System.currentTimeMillis() - start));*/

      /*  BufferedInputStream bufferedStream = new BufferedInputStream(new FileInputStream("/Users/jhkim/Desktop/velog/whiteship-study/src/main/java/weeks13/test.txt"), 1024);
        int j = 0 ;
        try{
            while ((j = bufferedStream.read()) != -1){
                System.out.write(j);
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            try {
                bufferedStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("걸린시간 : " + (System.currentTimeMillis() - start));*/
    }
}
