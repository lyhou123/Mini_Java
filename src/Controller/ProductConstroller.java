package Controller;
import ProductModel.Product;
import Utils.Singleton;
import dao.ProductServiceImpl;
import exception.ProductInputValidator;
import menu.ClassUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductConstroller {
    static Scanner scanner = new Scanner(System.in);
    private static  ProductServiceImpl productService;
    public ProductConstroller()
    {
        productService=Singleton.productService();
        scanner=Singleton.scanner();
    }
    public static void index() {
        productService.showProducts();
    }
    public static void WriteProduct()
    {
        String id = ProductInputValidator.getStringInput1("Enter Product ID: ");
        String name = ProductInputValidator.getStringInput("Enter Product Name: ");
        double price = ProductInputValidator.getDoubleInput("Enter Product Price: ");
        int qty = ProductInputValidator.getIntegerInput("Enter Product Quantity: ");
        productService.createProduct(new Product(id, name, price, qty, LocalDate.now()));
    }
    public static void Update() {
        System.out.print("Enter ID of the product to update: ");
        String updateId = scanner.nextLine();
        productService.updateProduct(updateId);
    }
    public static void delete()
    {
        System.out.print("Enter ID of the product to delete: ");
        String deleteId = scanner.nextLine();
        productService.deleteProduct(deleteId);
    }
    public static void Search()
    {
        System.out.println("1. Search By Product ID       2. Search By Product Name");
        String op2= productService.validate("Enter option=",new Scanner(System.in),"[1-4]+");
        int op1=Integer.parseInt(op2);
        Product product = null;
        switch (op1) {
            case 1 -> {
                System.out.print("Enter ID for Search=");
                String id = scanner.nextLine();
               product=  productService.readProduct(id);
            }
            case 2 -> {
                String name = ProductInputValidator.getStringInput("Enter Product Name: ");
                product= productService.readProductByName(name);
            }

        }
        if(product==null)
        {
            System.out.println("<<<<<<<<<<<<<<<<<<<< Product Not Found >>>>>>>>>>>>>>>>>>>>");
        }
        System.out.println("Press Key To Continuous");
        scanner.nextLine();

    }
    public static void Commit()
    {
        productService.commitData();

    }
    public static void checkCommit()
    {
        productService.checkDataCommit();
    }
    public static void Read()
    {
        System.out.println("1. Search By Product ID       2. Search By Product Name");
        String op2= productService.validate("Enter option=",new Scanner(System.in),"[1-4]+");
        int op1=Integer.parseInt(op2);
        Product product = null;
        switch (op1) {
            case 1-> {
                System.out.print("Enter ID for Search=");
                String id =scanner.nextLine();
               product= productService.readProduct(id);
            }
            case 2->{
                String name  = ProductInputValidator.getStringInput("Enter Product Name: ");
               product= productService.readProductByName(name);
            }
        }
        if(product==null)
        {
            System.out.println("<<<<<<<<<<<<<<<<<<<< Product Not Found >>>>>>>>>>>>>>>>>>>>");
        }
        System.out.println("Press Key To Continuous");
        scanner.nextLine();
    }
    public static void BackUp()
    {
        productService.BackupProducts();
    }
    public static void Random()
    {
        productService.randomProduct();
    }
    public static void SetRow()
    {
        productService.SetRow();
    }
    public static void Restore(){productService.restoreProducts();}
}


