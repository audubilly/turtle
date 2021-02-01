package Car;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase(Locale.ROOT);
        if (validModel.equals("cayene") || validModel.equals("Envogue")) {
            this.model = model;
        } else {
            this.model = ("unknown model");
        }

    }
    public String getModel() {
        return this.model;
    }




}

