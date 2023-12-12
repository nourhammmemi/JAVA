package entities;

public class Departement {

    private int id;
    private String nom_departement;
    private int nbr_employes;
    public Departement()
    {}
    public Departement(int id, String nom_departement, int nbr_employes) {
        this.id = id;
        this.nom_departement = nom_departement;
        this.nbr_employes = nbr_employes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNbr_employes() {
        return nbr_employes;
    }

    public void setNbr_employes(int nbr_employes) {
        this.nbr_employes = nbr_employes;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Departement departement)) return false;
        return getId()==departement.getId() && getNom_departement()==departement.getNom_departement();
    }
    public String toString(){
        return "entities.Departement \nid : "+id+" Nom entities.Departement : "+nom_departement+" nbr employes : "+nbr_employes;
    }


    public static class Employe {

        public int id;
        public String nom;
       public String prenom;
        public String NomDepartement;
        public int grade;


        public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            NomDepartement = nomDepartement;
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getNomDepartement() {
            return NomDepartement;
        }

        public void setNomDepartement(String nomDepartement) {
            NomDepartement = nomDepartement;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
        @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if(!(o instanceof Employe employe)) return false;
            return getId()==employe.getId() && getNom()==employe.getNom();
        }
        public String toString(){
            return "entities.Departement.Employe \nid : "+id+" Grade : "+grade+" nom : "+nom+" prenom : "+prenom+" departement : "+NomDepartement;
        }

    }
}
