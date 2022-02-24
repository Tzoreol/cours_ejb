package fr.tzoreol.cours_ejb.ejbs;

import javax.ejb.Local;

@Local
public interface Converter {
    double usdToEur(double usd);
}
