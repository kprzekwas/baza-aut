package domain;


public class Model {
    private int id_model;
    private String name;
    private int serial_number;
    private double price;
    private Brand brand;
    
    public Model(){}
    
    public Model(int id_model, String name, int serial_number, double price, Brand brand){
        this.id_model = id_model;
        this.name = name;
        this.serial_number = serial_number;
        this.price = price;
        this.brand = brand;
    }

    public int getid_model() {
        return id_model;
    }

    public void setid_model(int id_model) {
        this.id_model = id_model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }
    
    @Override
    public String toString() {
        return "Model{" +
                "id_model=" + id_model +
                ", name='" + name + '\'' +
                ", serial_number='" + serial_number + '\'' +
                ", price='" + price + '\'' +
                ", brand=" + brand +
                '}';
    }
}
