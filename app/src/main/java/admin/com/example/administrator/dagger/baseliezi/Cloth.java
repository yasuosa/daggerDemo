package admin.com.example.administrator.dagger.baseliezi;

import java.io.Serializable;

import javax.inject.Inject;

public class Cloth implements Serializable {
    String color;


    public Cloth(String color) {
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "color='" + color +"的衣服"+ '\'' +
                '}';
    }
}
