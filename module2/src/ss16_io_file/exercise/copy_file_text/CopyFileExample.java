package ss16_io_file.exercise.copy_file_text;

import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) {
        File pathFile1 = new File("D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\module2\\src\\ss16_io_file\\exercise\\copy_file_text\\source_file\\file1");
        File pathFile2 = new File("D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\module2\\src\\ss16_io_file\\exercise\\copy_file_text\\source_file\\file2");
        InputStream inputStream = null;
        OutputStream outputStream = null;

        // Kiểm tra xem file c tồn tại không.
        if (!pathFile1.exists()) {
            System.out.println("File 1 không tồn tại");
        } else if (!pathFile2.exists()) {
            System.out.println("File 2 không ồn tại");
        } else {
            try {
                inputStream = new FileInputStream(pathFile1);
                outputStream = new FileOutputStream(pathFile2);

                int length;
                byte[] buffer = new byte[1024];

                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
                System.out.println("File is copied successful!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
