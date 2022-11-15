public class Main {

    public static void main(String[] args) {
        Automobile automobile = new Automobile();
        System.out.println(automobile);
        Automobile automobile1 = new Automobile();
        automobile1.brand = "Lada";
        automobile1.model = "Granta";
        automobile1.year = 2015;
        automobile1.country = "Russia";
        automobile1.color = "жёлтого";
        automobile1.engineVolume = 1.7f;
        System.out.println(automobile1);

        Automobile automobile2 = new Automobile("Audi", "A8 50 L TDI quattro", 2020, "Германия", " чёрного", 3.0f);
        System.out.println(automobile2);
        Automobile automobile3 = new Automobile("BMW", "Z8", 2021, "Германия", " чёрного", 3.0f);
        System.out.println(automobile3);
        Automobile automobile4 = new Automobile("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красного", 2.4f);
        System.out.println(automobile4);
        Automobile automobile5 = new Automobile("Hyundai", "Avante", 2016, "Южная Корея", "оранжевого", 1.6f);
        System.out.println(automobile5);
    }
}
