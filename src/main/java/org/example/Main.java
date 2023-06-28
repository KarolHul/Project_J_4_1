package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Kamil","Baranowski"));
        osoby.add(new Osoba("Marek","Nowak"));
        osoby.add(new Osoba("Adam","Adamowicz"));
        osoby.add(new Osoba("Aneta","Kapibara"));

        Collections.sort(osoby);
        Collections.reverse(osoby);
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }
    }
}