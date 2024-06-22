/*
Кривошейцев Михаил Б763-2
Вариант А
11. Аэропорт. Посадка/высадка пассажиров может осуществляться через конечное число терминалов и наземным способом через конечное число трапов. Самолеты бывают разной вместимости и дальности полета. Организовать функционирование аэропорта, если пунктов назначения 4–6, и зон
дальности 2–3.
*/

import java.util.ArrayList;
import java.util.List;

class Terminal {
    private int terminal_num;
    public Terminal(int terminal_num) {
        this.terminal_num = terminal_num;
    }
    public void prilet(Airplane airplane) {
        System.out.println("Самолет с пунктом назначения " + airplane.get_destination() + " приземляется или взлетает из Терминала " + terminal_num);
    }
}
class Airplane {
    private String destination;
    private int power;
    private int range;
    public Airplane(String destination, int power, int range) {
        this.destination = destination;
        this.power = power;
        this.range = range;
    }
    public String get_destination() {
        return destination;
    }
    public int get_power() {
        return power;
    }
    public int get_range() {
        return range;
    }
}
public class Airport {
    private List<Terminal> terminals;
    private List<Airplane> airplanes;
    public Airport() {
        terminals = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            terminals.add(new Terminal(i));
        }
        airplanes = new ArrayList<>();
    }
    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }
    public void operateAirport() {
        for (Airplane airplane : airplanes) {
            for (Terminal terminal : terminals) {
                terminal.prilet(airplane);
            }
        }
    }
    public static void main(String[] args) {
        Airport airport = new Airport();
        Airplane airplane1 = new Airplane("Улан-Удэ", 200, 1000);
        Airplane airplane2 = new Airplane("Иркутск", 150, 800);
        Airplane airplane3 = new Airplane("Чита", 180, 900);
        Airplane airplane4 = new Airplane("Улан-Удэ", 170, 1100);
        Airplane airplane5 = new Airplane("Иркутск", 150, 800);
        Airplane airplane6 = new Airplane("Чита", 180, 900);
        airport.addAirplane(airplane1);
        airport.addAirplane(airplane2);
        airport.addAirplane(airplane3);
        airport.operateAirport();
    }
}
