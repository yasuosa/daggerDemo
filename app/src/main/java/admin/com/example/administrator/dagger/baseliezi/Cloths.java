package admin.com.example.administrator.dagger.baseliezi;

public class Cloths {

    private Cloth cloth;


    public Cloths(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    @Override
    public String toString() {
        return "Cloths{" +
                "cloth=" + cloth +
                '}';
    }
}
