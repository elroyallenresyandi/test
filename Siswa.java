package project;

public class Siswa {

    double id;
    String nama;
    double ipk;



    //Contructor nama sm dgn nama class

    public Siswa(int i, String string, int j) {
        id = 0;
        nama ="";
        ipk =0;

}
    //constructur parameter
    public Siswa() {

        this.id = id;
        this.nama = nama;
        this.ipk = ipk;

    }

    //method
    public void print() {
        System.out.println("Data siswa!!");
        System.out.println("ID : "+id);
        System.out.println("nama : "+nama);
        System.out.println("ipk : "+ipk);
    }
    public double getipk() {
        return  this.ipk;
    }
    public void setIPk(double x){
        this.ipk=x;
    }
    public String getnama() {
       return this.nama;

    } 
    public void setID(double i) {   
        this.id=i;
    } 
    public void setNama (String adi) {
        this.nama=adi;
    }

} 