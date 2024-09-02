package project;

import java.util.Scanner;

//Driver Class
public class siswatestjava{

    /**
     * @param args
     */
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        //membuat object
        Siswa adi = new Siswa ();
        Siswa lala = new Siswa ();

        Siswa adisSiswa = new Siswa(10, "adi",4);

        adi.setID(1);
        adi.setNama("adi");
        adi.setIPk(60);
            
        Siswa adiSiswa = new Siswa(10, "adi", 2);

            in.close();
            if (adi.getipk() >= 75){
                System.out.println(adi.getnama() + " lulus");


            }else {
                System.out.println(adi.getnama() + " tidak lulus");
            }

            //nilai huruf
            if(adi.getipk() <60) {
                System.out.println("E");
            } else if (adi.getipk() > 60 && (adi.getipk() < 71)) {
                System.out.println("D");
            } else if (adi.getipk() > 71 && (adi.getipk() < 81)) {
                System.out.println("C");
            } else if (adi.getipk() > 81 && (adi.getipk() < 91)) {
                System.out.println("B");
            } else if (adi.getipk() > 91 && (adi.getipk() < 100)) {
                System.out.println("A");

            in.close();
    }       


}
}