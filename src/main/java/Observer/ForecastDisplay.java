package Observer;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        WeatherData weatherData = (WeahterData)observable;
        observable.addObserver((Observer) this);
    }

    public void update(Observable observable, Object arg) {
        if(observable instanceof  WeatherData) {

        }
    }

    public void display() {
        //display code
    }
}
