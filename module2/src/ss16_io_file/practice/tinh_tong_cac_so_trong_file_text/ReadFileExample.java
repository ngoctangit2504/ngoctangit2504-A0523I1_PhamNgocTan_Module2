package ss16_io_file.practice.tinh_tong_cac_so_trong_file_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc lỗi nội dung!");
        }
    }

    public static void main(String[] args) {
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText("D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\module2\\src\\ss16_io_file\\practice\\tinh_tong_cac_so_trong_file_text\\File_tinh_tong_cac_so_trong_file.txt");
    }
}
