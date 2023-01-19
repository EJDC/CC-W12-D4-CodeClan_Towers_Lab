package codeclanTowers;

public class Booking {

    private final Bedroom bedroom;
    private final int nights;

    public Booking(Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights() {
        return nights;
    }

    public int totalBill() {
        return bedroom.getNightlyRate() * this.nights;
    }
}
