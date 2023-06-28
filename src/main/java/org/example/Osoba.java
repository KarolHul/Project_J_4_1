package org.example;

public class Osoba implements Comparable<Osoba>{
    String imie,nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    @Override
    public String toString(){
        return "{%"+imie+"%,%"+nazwisko+"%}";
    }
    @Override
    public int compareTo(Osoba o) {
        return this.nazwisko.compareTo(o.nazwisko);
    }
}
