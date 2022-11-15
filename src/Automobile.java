public class Automobile {

    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    Automobile(String brand, String model, int year, String country, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    Automobile() {
        brand = "Гнилая";
        model = "тачанка";
        year = 1960;
        country = "Черти где";
        color = "Такой же как красный, только синий";
        engineVolume = 1.1f;
    }

    void CarParameters(String brand, String model, int year, String country, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в стране " + country + ", " + color + " цвета, объем двигателя - " + engineVolume + "л.";
    }

}
