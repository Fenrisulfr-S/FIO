package org.example;
import com.github.petrovich4j.*;

public class FIO {
    public static void main(String[] args) {
        Petrovich p = new Petrovich();
        System.out.println(p.say("Александра", NameType.FirstName, Gender.Female, Case.Dative));
        System.out.println(p.say("Сергеевич", NameType.PatronymicName, Gender.Male, Case.Dative));
        System.out.println(p.gender("Петрович", Gender.Both));
    }
}