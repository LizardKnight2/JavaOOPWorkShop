package hw1;

public class HotDrink extends Product {

    private int temperature;
    private Double volume;

    public HotDrink(String name, Double price, int temperature, Double volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + " " +
                "price='" + getPrice() + " " +
                "volume='" + getVolume() + " " +
                "temperature=" + temperature +
                '}';
    }
}
