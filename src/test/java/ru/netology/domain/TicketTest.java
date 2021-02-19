package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Ticket first = new Ticket(1, 5000, "SVO", "LED", 50);
    private Ticket second = new Ticket(2, 17000, "SVX", "AER", 180);
    private Ticket third = new Ticket(3, 9000, "VVO", "KHV", 120);
    private Ticket forth = new Ticket(4, 12000, "KGD", "MOW", 90);
    private Ticket fifth = new Ticket(5, 22000, "MOW", "KZN", 150);


    @Test
    public void shouldTicketTest() {
        Ticket[] expected = new Ticket[]{first, third, forth, second, fifth};
        Ticket[] actual = new Ticket[]{first, second, third, forth, fifth};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }


}