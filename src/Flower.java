public class Flower {
    String name;
    private String flowerColor = "белый";
    private String country = "Россия";
    private float cost = 1.00f;
    int lifeSpan = 3;

    public Flower(String name, int lifeSpan) {
        this.name = name;
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "России";
        } else {
            this.country = country;
        }
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1.00f;
        } else {
            this.cost = cost;
        }
    }


    @Override
    public String toString() {
        return name + " из " + getCountry() + ", стоимость штуки - "
                + getCost() + " рублей, " + "срок стояния - " + lifeSpan + " дней. Цвет " + getFlowerColor();
    }
}

