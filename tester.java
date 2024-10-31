package Inventory;
import java.util.Scanner;

 //DRIVER CLASS
public class tester {
    public static void main(String[] args) {

        int [] angka = {1, 2, 3};
        int [] angka2 = new int[5];
        angka[0] = 10;
        angka2[3] = 100;

        String [] nama = {"ana", "salsa", "adi"};
        String [] nama2 = new String[10];


        //ARRAY OBJECT

        product[] p = new product[10];

        Scanner i = new Scanner(System.in);
        System.out.println("masukan number : ");
        int number = i.nextInt();
        System.out.println("masukan name : ");
        String name = i.nextLine();
        System.out.println("masukan quantity : ");
        double quantity = i.nextDouble();
        System.out.println("masukan price : ");
        double price = i.nextDouble();

        //loop

        for (int j = 0; j < p.length; j++) {
            System.out.println(angka [j]);
            p[j] = new product(number, name, quantity, price);
            p[j].print();

        }

        CD[] c = new CD[5];
        c[4] = new CD();





    }
}
