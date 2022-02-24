package fr.tzoreol.cours_ejb.ejbs;

import javax.ejb.Remote;

@Remote
public interface Cart {
    void createCart(String login);
    void addItem(String title);
    void removeItem(String title);
    String displayCart();
    String displayCustomer();
    void destroy();
}
