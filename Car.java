import java.awt.*;

public class Car {

    // Data types
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1
    // String -> "a1a2" or "Hello World"
    // Color -> from awt library 'abstract window tool'
    // boolean -> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTailLightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

}
