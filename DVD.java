package Inventory;

public class DVD extends product {

    private double length;

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private String rating;
    private String studio;

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

}
