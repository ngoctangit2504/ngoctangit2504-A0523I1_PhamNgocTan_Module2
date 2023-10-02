package ss16_io_file.practice.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\module2\\src\\ss16_io_file\\practice\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\file_numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\module2\\src\\ss16_io_file\\practice\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\file_numbers.txt", maxValue);
    }
}
