public class Employe extends Personne {
    private double salaire;
    private String fonction;

    public Employe(String nom, String prenom, double salaire, String fonction) {
        super(nom, prenom);
        this.salaire = salaire;
        this.fonction = fonction;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void afficherInfos() {
        System.out.println("Employé : " + getNom() + " " + getPrenom());
        System.out.println("Fonction : " + fonction);
        System.out.println("Salaire : " + salaire);
    }
}