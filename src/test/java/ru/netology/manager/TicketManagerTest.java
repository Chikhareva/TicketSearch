package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TicketManagerTest {
    TicketRepository repository = new TicketRepository();
    TicketManager manager = new TicketManager(repository);
    private Ticket first = new Ticket(1, 5200, "LED", "MOW", 50);
    private Ticket second = new Ticket(2, 13000, "DME", "KJA", 230);
    private Ticket third = new Ticket(3, 25000, "LED", "MOW", 50);
    private Ticket forth = new Ticket(4, 12000, "LED", "ROV", 200);
    private Ticket fifth = new Ticket(5, 25000, "LED", "TOF", 180);
    private Ticket sixth= new Ticket(6,13500,"LED","MOW",50);
    private Ticket seventh=new Ticket(7,15480,"MOW","OVB",180);



    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
    }

    @Test
    public void shouldTicketsFitSearchMoreOne() {
        Ticket[] expected = new Ticket[]{first,sixth,third};
        Ticket[] actual = manager.finAll("LED", "MOW");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTicketsSearchNo() {
        Ticket[] expected = new Ticket[]{};
        Ticket[] actual = manager.finAll("MOW", "UFA");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTicketSearchOne() {
        Ticket[] expected = new Ticket[]{forth};
        Ticket[] actual = manager.finAll("LED", "ROV");
        assertArrayEquals(expected, actual);
    }

}