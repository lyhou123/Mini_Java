package dao;
import ProductModel.Product;
import java.util.Scanner;
public interface ProductService {
    void randomProduct();
    void createProduct(Product product);
    void updateProduct(String id);
    void deleteProduct(String id);
    Product readProduct(String id);
    Product readProductByName(String name);
    void showProducts();
    void writeProductsToFileDatabase();
    void writeProductsToFile();
    String validate(String message, Scanner scanner, String regex);
    void SetRow();
    void BackupProducts();
    void restoreProducts();
    void commitData();
    void clearFile(String filePath);
    void checkDataCommit();
    Product writeLineToProduct(String line);
}
