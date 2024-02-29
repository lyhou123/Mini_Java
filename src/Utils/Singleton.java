package Utils;

import Controller.ProductConstroller;
import dao.ProductServiceImpl;

import java.util.Scanner;

public class Singleton {
    private static Scanner scanner;
    private static ProductServiceImpl productService;
    private static ProductConstroller productConstroller;
    public static Scanner scanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static ProductServiceImpl productService()
    {
        if(productService==null)
        {
            productService=new ProductServiceImpl();
        }
        return productService;
    }
    public static ProductConstroller productConstroller()
    {
        if(productConstroller==null)
        {
            productConstroller=new ProductConstroller();
        }
        return productConstroller;
    }
}