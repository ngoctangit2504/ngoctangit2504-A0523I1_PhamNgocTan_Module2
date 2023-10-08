package ss17_io_binary_file_and_serialization.exercise.product_management.repository.impl;

import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;
import ss17_io_binary_file_and_serialization.exercise.product_management.repository.IRepository;
import ss17_io_binary_file_and_serialization.exercise.product_management.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository {

    String PATH_EMPLOYEE = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\module2\\src\\ss17_io_binary_file_and_serialization\\exercise\\product_management\\data\\ProductCSV";
    @Override
    public List<Product> displayListProduct() {
        List<Product> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readCSV(PATH_EMPLOYEE);
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            Product product = new Product(Integer.parseInt(array[0]),array[1],array[2],Double.parseDouble(array[3]),array[4]);
            employeeList.add(product);
        }
        return employeeList;
    }

    @Override
    public void add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToCSV());
        ReadAndWriteFile.writeToCSV(PATH_EMPLOYEE,stringList,true);
    }

    @Override
    public void serch(int maSanPham) {

    }
}
