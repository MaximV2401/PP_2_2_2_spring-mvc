package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;




public class Car {


    private long id;

    private String model;

    private String series;



    public Car(long id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }


}
