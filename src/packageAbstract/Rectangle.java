package packageAbstract;

public class Rectangle extends Form{

    private float lon, lar;
    public Rectangle(String name, float lon, float lar){
        super(name);
        this.lon = lon;
        this.lar = lar;
    }

    @Override
    public float surface() {
        return lon * lar;
    }
}
