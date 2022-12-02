package Transport;

public enum LoadCapacity {
    N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);
    private Float from;
    private Float to;

    LoadCapacity(Float from, Float to) {
        this.from = from;
        this.to = to;
    }

    public Float getFrom() {
        return from;
    }

    public Float getTo() {
        return to;
    }

    @Override
    public String toString() {
        if (getFrom() == null) {
            return  "Грузоподъемность: до " + getTo() + " тонн";
        } else if (getTo() == null) {
           return "Грузоподъемность: от " + getFrom() + " тонн";
        } else if (getFrom() != null && getTo() != null) {
            return "Грузоподъемность: " + getFrom() + " тонн до " + getTo() + " тонн";
        } else
            return "Данные не заданы";

    }
}