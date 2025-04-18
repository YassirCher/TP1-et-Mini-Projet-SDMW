package net.yassir.presentation;

import net.yassir.dao.DaoImpl;
import net.yassir.metier.MetierImpl;
import net.yassir.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);// Injection des dependances via le setter
        System.out.println("RES= "+metier.calcul());
    }
}
