package Transport;

public enum BusCapacity {XS(null, 10), S(10, 25), M(40,50), L(60,80), XL(100,120);
    private Integer from;
    private Integer to;

    BusCapacity(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    @Override
    public String toString() {
        if (getFrom() == null) {
            return  "Вместимость: до " + getTo() + " человек";
        } else if (getTo() == null) {
            return "Вместимость: от " + getFrom() + " человек";
        } else if (getFrom() != null && getTo() != null) {
            return "Вместимость: " + getFrom() + " человек до " + getTo() + " человек";
        } else
            return "Данные не заданы";

    }
}
