package packageAbstract;

public abstract class Form {
    // Attribut
    private String name;

    // Méthodes concrètes
    public Form(String name){
        this.name = name;
    }
    public void afficher(){
        System.out.println("Form : "+this.name);
    }

    // Méthodes abstraites
    public abstract float surface(); // Le mot clé abstract est obligatoire ici puisqu'on est dans une classe abstraite et non dans une interface

}
