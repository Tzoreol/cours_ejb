package fr.tzoreol.cours_ejb.ejbs.impl;

import javax.ejb.Singleton;

@Singleton
public class CounterBean {
    private int count = 1;

    public int getCount() {
        return this.count++;
    }
}
