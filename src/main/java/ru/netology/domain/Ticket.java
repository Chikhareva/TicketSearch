package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Ticket implements Comparable {
    private int id;
    private int price;
    private String departure;
    private String arrival;
    private int duration;

    @Override
    public int compareTo(Object o) {
        Ticket ticket = (Ticket) o;
        return price - ticket.price;
    }

    public boolean matches(String fromAirport, String toAirport) {
        if (this.getDeparture().equalsIgnoreCase(fromAirport) && this.getArrival().equalsIgnoreCase(toAirport)) {
            return true;
        }
        return false;
    }
}



