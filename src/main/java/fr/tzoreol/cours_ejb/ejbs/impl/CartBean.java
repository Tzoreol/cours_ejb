package fr.tzoreol.cours_ejb.ejbs.impl;

import fr.tzoreol.cours_ejb.ejbs.Cart;

import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class CartBean implements Cart {

    public long customerId;
    public String customerName;
    private List<String> items;
    private double total;

    @Override
    public void createCart(String login) {
        this.customerName = login;
        this.customerId = Math.round(Math.random() * 10000);
        this.items = new ArrayList<>();
        this.total = 0;
    }

    @Override
    public void addItem(String title, double price) {
        this.items.add(title);
        this.total += price;
    }

    @Override
    public void removeItem(String title, double price) {
        if(this.items.contains(title)) {
            this.items.remove(title);
            this.total -= price;
        }
    }

    @Override
    public String displayCart() {
        StringBuilder sb = new StringBuilder();
        this.items.forEach(item -> sb.append(item + " "));
        return sb.toString();
    }

    @Override
    public String displayCustomer() {
        return this.customerName + " - " + this.customerId;
    }

    @Override
    public void destroy() {
        this.items = null;
    }

    @Override
    public double getTotal() {
        return this.total;
    }
}
