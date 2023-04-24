package ss16_binary_file_and_serialization.bai_tap.copy_file_binary;

import java.io.File;
import java.io.IOException;

public class Main {
    static final String PATH_SOURCE_FILE = "src/ss16_binary_file_and_serialization/bai_tap/copy_file_binary/source_file";
    static final String PATH_TARGET_FILE = "src/ss16_binary_file_and_serialization/bai_tap/copy_file_binary/target_file";

    public static void main(String[] args) {
        String str = CopyFileBinary.readFile(PATH_SOURCE_FILE);
        try {
            CopyFileBinary.writeFile(PATH_TARGET_FILE,str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(PATH_TARGET_FILE);
        System.out.println("Số byte là:" + file.length());
    }
}
