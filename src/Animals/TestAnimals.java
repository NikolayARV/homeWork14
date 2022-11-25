package Animals;

public class TestAnimals {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("газель", 5, "саванна", 39, "трава");
        Herbivores giraf = new Herbivores("жираф", 6, "саванна", 20, "листва");
        Herbivores loshad = new Herbivores("лошадь", 8, "луг", 36, "сено");
        Predators tigr = new Predators("тигр", 5, "тайга", 36, "добыча");
        Predators giena = new Predators("гиена", 2, "саванна", 39, "добыча");
        Predators medved = new Predators("медведь", 19, "тайга", 40, "всеядный");
        Amphibians lyagushka = new Amphibians("лягушка", 2, "болото");
        Amphibians ug = new Amphibians("уж", 3, "река");
        Flightless pavlin = new Flightless("павлин", 6, "луг", "гуляет");
        Flightless pingvin = new Flightless("пингвин", 9, "ледник", "гуляет");
        Flightless pticaDodo = new Flightless("птица додо", 4, "джунгли", "гуляет");
        Flying chayka = new Flying("чайка", 9, "море", "летает");
        Flying albatros = new Flying("альбатрос", 5, "побережье", "летает");
        Flying sokol = new Flying("сокол", 9, "горы", "летает");
        System.out.println(gazel);
        System.out.println(giena);
        System.out.println(giraf);
        System.out.println(loshad);
        System.out.println(tigr);
        System.out.println(medved);
        System.out.println(lyagushka);
        System.out.println(ug);
        System.out.println(pavlin);
        System.out.println(pingvin);
        System.out.println(pticaDodo);
        System.out.println(chayka);
        System.out.println(albatros);
        System.out.println(sokol);

    }
}

