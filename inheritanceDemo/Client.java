package inheritanceDemo;

public class Client implements Car, Ac, Engine, Controls{
    public void carWheel() {
        System.out.println("Alloy wheels");
    }

    @Override
    public void carColor() {
        System.out.println("Red color car");
    }

    @Override
    public void getCar() {
        System.out.println("Car details:");
        System.out.println("AC Points: " + getAcPoints());
        System.out.println("Engine Type: " + getTypeofengine());
        System.out.println("Engine Model: " + getTypeofmodel());
        System.out.println("Brake type: " + getBreaks());
        System.out.println("Number of Gears: " + getGears());
        System.out.println("Number of Seats: " + getSeats());
    }

    @Override
    public String getAcPoints() {
        return "4pointac";
    }

    @Override
    public String getTypeofengine() {
        return "Hybrideengine";
    }

    @Override
    public String getTypeofmodel() {
        return "220cc";
    }

    @Override
    public String getBreaks() {
        return "Hydraulic Brakes";
    }

    @Override
    public int getGears() {
        return 6;
    }

    @Override
    public int getSeats() {
        return 8;
    }

    public static void main(String[] args) {
        Car client = new Client();
        client.getCar();
    }

}
