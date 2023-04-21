package ss15_io_text_file.thuc_hanh.io_find_max;


import java.util.ArrayList;
import java.util.List;

public class IoFindMax {
    public static int findMax(List<Integer> numbers) {
        int max = 0;
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }

}
