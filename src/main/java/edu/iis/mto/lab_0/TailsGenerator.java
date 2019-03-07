package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>();
        }
        ArrayList<String> listaZwracana = new ArrayList<>(value.length());
        listaZwracana.add(value);
        listaZwracana.add(value);
        listaZwracana.add(value);
        listaZwracana.add("lo");
        listaZwracana.add(value);
        listaZwracana.add("");
        return listaZwracana;
    }
}
