package fr.tzoreol.cours_ejb;

import javax.ejb.Stateless;

@Stateless
public class MyBean {
    public long id;

    public MyBean() {
        this.id = Math.round(Math.random() * 10000);
    }
}
