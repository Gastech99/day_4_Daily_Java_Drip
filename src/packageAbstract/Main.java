package packageAbstract;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Calcule de la surface du cercle
        Cercle c = new Cercle("Cercle", 5.3F);
        c.afficher();
        System.out.println("La surface du cercle est de : "+c.surface());

        // Calcul de la surface du rectangle
        Rectangle r = new Rectangle("Rectangle", 3.3F, 9.1F);
        r.afficher();
        System.out.println("La surface du rectangle est de : "+r.surface());
    }
}