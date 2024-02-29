import Controller.ProductConstroller;
import Utils.Singleton;
import dao.ProductServiceImpl;
import menu.ClassUI;

import java.util.Scanner;

public class Main {
    public ProductConstroller productConstroller;
    public ProductServiceImpl productServiceImpl;
    public Scanner scanner;
    public Main()
    {
        productConstroller=Singleton.productConstroller();
        productServiceImpl=Singleton.productService();
        scanner=Singleton.scanner();
    }
    public void run()
    {
        ProductConstroller.checkCommit();
        while (true)
        {
            ClassUI.MainMenu();
            String op = productServiceImpl.validate("Enter Option=", scanner, "[a-zA-Z]");
            switch (op)
            {
                case "l"->ProductConstroller.index();
                case "w"->ProductConstroller.WriteProduct();
                case "u"->ProductConstroller.Update();
                case "r"->ProductConstroller.Read();
                case "s"->ProductConstroller.Search();
                case "d"->ProductConstroller.delete();
                case "c"->ProductConstroller.Commit();
                case "k"->ProductConstroller.BackUp();
                case "m"->ProductConstroller.Random();
                case "o"->ProductConstroller.SetRow();
                case "t"->ProductConstroller.Restore();
                case "h"->ClassUI.displayHelp();
                case "e"->{
                    ProductConstroller.checkCommit();
                    return ;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
