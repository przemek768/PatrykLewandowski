package Osoba;


import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {

    private String nazwisko;
    private LocalDate dataUrodzenia;


    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public int compareTo(Osoba o) {
        int compareValue = 0;

        if(this.nazwisko.compareTo(o.nazwisko) == 0){
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) == 0){
                compareValue = 0;
            }
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0){
                compareValue +=100;
            }
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0){
                compareValue -=100;
            }

        }

        if(this.nazwisko.compareTo(o.nazwisko) > 0){
            compareValue +=100;
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) == 0){
                compareValue += 0;
            }
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0){
                compareValue +=10;
            }
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0){
                compareValue -=10;
            }

        }
        if(this.nazwisko.compareTo(o.nazwisko) < 0){
            compareValue-=100;
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) == 0){
                compareValue +=0;
            }
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0){
                compareValue +=10;
            }
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0){
                compareValue -=10;
            }

        }




        return compareValue;


    }

    public boolean equals(Osoba o){
        if(this.nazwisko.equals(o.nazwisko) && this.dataUrodzenia.equals(o.dataUrodzenia)){
            return true;
        }
        return false;

    }

    public String toString(){
        String rtn = this.getClass().getSimpleName() + "[" + this.nazwisko + "]" + this.dataUrodzenia;
        return rtn;


    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
}
