package ss16_binary_file_and_serialization.bai_tap.copy_file_binary;

import java.io.*;

public class CopyFileBinary {
    public static void writeFile(String pathFile, String str) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pathFile, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static String readFile(String filePath) {
        String str = "";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
            byte[] bytes = new byte[1024];
            int i = -1;
            while ((i = inputStream.read(bytes)) != -1) {
                str = new String(bytes, 0, i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}
