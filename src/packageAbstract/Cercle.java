package packageAbstract;

public class Cercle extends Form{

    private float rayon;

    public Cercle(String name, float rayon){
        super(name);
        this.rayon = rayon;
    }

    @Override
    public float surface() {
        return rayon * rayon * 3.14F;
    }
}
