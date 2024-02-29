package menu;

import ProductModel.Product;
import Utils.Singleton;
import dao.ProductServiceImpl;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;
import java.util.Scanner;

public class ClassUI {
    private static Scanner scanner=new Scanner(System.in);
    public ClassUI()
    {
        scanner= Singleton.scanner();
    }
    public static void MainMenu()
    {
        Table table = new Table(10, BorderStyle.CLASSIC_COMPATIBLE_WIDE, ShownBorders.ALL);
        CellStyle cellStyle=new CellStyle(CellStyle.HorizontalAlign.center);
        table.addCell("Display (L)");
        table.addCell("Random  (m)");
        table.addCell("Write   (w)");
        table.addCell("Exit    (e)");
        table.addCell("Delete  (d)");
        table.addCell("Search  (s)");
        table.addCell("SetRow  (r)");
        table.addCell("Commit  (m)");
        table.addCell("BackUp  (k)");
        table.addCell("Restore (t)");
        table.addCell("Help    (h)");
        table.addCell("Exit    (x)");
        System.out.println(table.render());
    }
    public static void viewProductList(List<Product> products) {
        String op;
        Table table = new Table(5, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
        CellStyle cellCenter = new CellStyle(CellStyle.HorizontalAlign.center);
        String[] headers = {"ID", "NAME", "Qty", "Unit Price","Imported Date"};
        for (String header: headers) {
            table.addCell(header, cellCenter);
        }
        for(int i=0;i<5;i++)
        {
            table.setColumnWidth(i,25,25);
        }
        products.forEach(product -> {
            table.addCell(product.getId(), cellCenter);
            table.addCell(product.getName(), cellCenter);
            table.addCell(product.getQty()+"", cellCenter);
            table.addCell(product.getPrice()+"", cellCenter);
            table.addCell(product.getLocalDate()+"", cellCenter);
        });
        System.out.println(table.render());

    }
    public static void displayHelp() {
        System.out.println("# Help Instruction");
        Table table = new Table(1,BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
        table.addCell("1.      Press       l : Display product as table");
        table.addCell("2.      Press       w : Create a new product");
        table.addCell("3.      Press       r : View product details by code");
        table.addCell("4       Press       e : Edit an existing product by code");
        table.addCell("5.      Press       d : Delete an existing product by code");
        table.addCell("6.      Press       s : Search an existing product by name");
        table.addCell("7.      Press       c : Commit transaction data");
        table.addCell("8.      Press       k : Backup data");
        table.addCell("9.      Press       t : Restore data");
        table.addCell("10.     Press       l : Navigate pagination to the last page");
        table.addCell("11.     Press       p : Navigate pagination to the previous page");
        table.addCell("12.     Press       n : Navigate pagination to the next page");
        table.addCell("13.     Press       f : Navigate pagination to the first page");
        table.addCell("14.     Press       g : Navigate pagination to the Specific page");
        table.addCell("15.     Press       o : Set Row of Product List");
        table.addCell("16.     Press       h : Help");
        table.addCell("17.     Press       b : Step Back of the Application");

        System.out.println(table.render());


    }
    public static void Product(Product product)
    {
        Table table = new Table(5, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
        CellStyle cellCenter = new CellStyle(CellStyle.HorizontalAlign.center);
        String[] headers = {"ID", "NAME", "Qty", "Unit Price","Imported Date"};
        for (String header: headers) {
            table.addCell(header, cellCenter);
        }
        for(int i=0;i<5;i++)
        {
            table.setColumnWidth(i,25,25);
        }
        table.addCell(product.getId(), cellCenter);
        table.addCell(product.getName(), cellCenter);
        table.addCell(product.getQty()+"", cellCenter);
        table.addCell(product.getPrice()+"", cellCenter);
        table.addCell(product.getLocalDate()+"", cellCenter);
        System.out.println(table.render());

    }
    }

