package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String departure;
    private String arrival;
    private int duration;


    public boolean matches(String fromAirport, String toAirport) {
        if (this.getDeparture().equalsIgnoreCase(fromAirport) && this.getArrival().equalsIgnoreCase(toAirport)) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Ticket o) {
        Ticket ticket = (Ticket) o;
        return price-ticket.price;
    }
}



