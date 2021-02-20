package ru.geekbrains.spring1.Model;

public class Product {
    private Long id;
    private String title;
    private Long cost;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getCost() {
        return cost;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }


    public Product(){

    }

    public Product(long id, String title, long cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
