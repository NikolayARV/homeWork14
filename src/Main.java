public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", -1988, "брент-менеджером");
        Human anna = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя","Калининград", 1992, "проект-менеджером");
        Human artem = new Human("Артем", "Москва", 1995,null);
        System.out.println(katya);
        System.out.println(maksim);

        Car lada = new Car("Lada", "Granta", 1.7f, "желтого", 2015, "в России");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черного", 2020, "в Германии");
        Car bmw = new Car("BMW", "Z8", 3.0f, "черного", 2021, "в Германии");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красного", 2018, "в Юнной Корее");
        Car hyundai = new Car("Hyundai", null, -5, null, 2016, "в Южной Корее");

        System.out.println(hyundai);
        System.out.println(bmw);
        System.out.println(lada);
        System.out.println(kia);
        System.out.println(audi);
        System.out.println(artem);

    }
}