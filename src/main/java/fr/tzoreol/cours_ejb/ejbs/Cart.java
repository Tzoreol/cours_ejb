package fr.tzoreol.cours_ejb.ejbs;

import javax.ejb.Remote;

@Remote
public interface Cart {
    void createCart(String login);
    void addItem(String title, double price);
    void removeItem(String title, double price);
    String displayCart();
    String displayCustomer();
    double getTotal();
    void destroy();
}
