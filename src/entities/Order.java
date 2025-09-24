package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int number;
    private String date;
    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public Order(){
    }

    public Order(int number, String date, Customer customer){
        this.number = number;
        this.date = date;
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void addProduct(Product product, int quantity){
        for (int i = 0; i < quantity; i++){
            products.add(product);
        }
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public double calculateTotal(){
        double total = 0.0;
        for (Product p : products){
            total += p.getPrice();
        }
        return total;
    }

}
