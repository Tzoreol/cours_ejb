package fr.tzoreol.cours_ejb.ejbs.impl;

import fr.tzoreol.cours_ejb.ejbs.Converter;

import javax.ejb.Stateless;

@Stateless
public class ConverterBean implements Converter {
    @Override
    public double usdToEur(double usd) {
        return usd * 0.75;
    }
}
