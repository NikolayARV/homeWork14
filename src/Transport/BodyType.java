package Transport;

public enum BodyType {SEDAN ("Седан"), HATCHBACK("Хэтчбэк"), CUPE("Купе"), UNIVERSAL("Универсал"), VNEDOROGNIK("Внедорожник"), SUV("Кроссовер"), PICKUP("Пикап"), FURGON("Фургон"), MINIVAN("Минивэн");
    private String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: "  + getBodyType() ;
    }
}
