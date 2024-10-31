package Inventory;

public class CD extends product{

    private static String artis;
    private static String song;
    private static String label;

    public CD(){

        artis = "";
        song = "";
        label = "";
        price = 0;
        quantity = 0;
        



    }

    public CD(int number, String name, int quantity, double price, String artis, String song, String label ){

        super(number, quantity, price);
        this.artis = artis;
        this.song = song;
        this.label = label;
        

    
    }

    }

      


