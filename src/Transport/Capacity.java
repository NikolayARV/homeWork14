package Transport;

public enum Capacity {XS (0, 10), S(10, 25),
    M(40, 50),
    L(60,80),
    XL(100,120);

    private final Integer from;
    private final Integer to;

    Capacity(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }

    @Override
    public String toString() {
        if (getFrom() == 0){
            return "Вместимость: " + getTo() + " мест.";
        } else if (getFrom() != 0 && getTo()!=0) {
            return "Вместимость: " + getFrom() +" - " + getTo() + " мест.";

        }

        return "Вместимость: " + getFrom() + " мест.";
    }
}
