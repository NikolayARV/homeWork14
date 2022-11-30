package Transport;

public enum LoadCapacity {N1(0.0f, 3.5f)
    , N2(3.5f,12.0f)
    , N3(12.0f,0.0f);
    private final float from;
    private final float to;

    LoadCapacity(float from, float to) {
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

        if (getFrom() == 0.0f) {
            return "Грузоподъемность: до " + getTo() + " тонн";
        } else if (getFrom() != 0.0f && getTo()!=0.0f) {
            return "Грузоподъемность: от " + getFrom() + " до  " + getTo() + " тонн";

        }

        return "Грузоподъемность: от " + getFrom() + " тонн";
    }
}

