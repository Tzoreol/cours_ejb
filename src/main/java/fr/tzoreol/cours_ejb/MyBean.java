package fr.tzoreol.cours_ejb;

import javax.ejb.Stateful;

@Stateful
public class MyBean {
    public long id;

    public MyBean() {
        this.id = Math.round(Math.random() * 10000);
    }
}
