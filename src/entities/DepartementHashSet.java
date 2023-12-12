package entities;

import interfaces.IDepartement;
import interfaces.IGestion;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> departements=new HashSet();
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departements){
            if (departement.getNom_departement().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        if (departements.contains(departement))
            return true;
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements);
    }

    public static class SocieteArrayList implements IGestion<Departement.Employe> {

        List<Departement.Employe> employes = new ArrayList<>();
        @Override
        public void ajouterEmploye(Departement.Employe employe) {
            employes.add(employe);
        }

        @Override
        public boolean rechercherEmploye(String nom) {
            for (int i = 0; i < employes.size(); i++) {
                if (employes.get(i).getNom().equals(nom))
                    return true;
            }
            return false;
        }

        @Override
        public boolean rechercherEmploye(Departement.Employe employe) {
            if (employes.contains(employe))
                return true;
            else
                return false;
        }

        @Override
        public void supprimerEmploye(Departement.Employe employe) {
            employes.remove(employe);
        }

        @Override
        public void displayEmploye() {
            System.out.println(employes);
        }

        @Override
        public void trierEmployeParId() {
            Comparator<Departement.Employe> comparator_Id=new Comparator<Departement.Employe>() {
                @Override
                public int compare(Departement.Employe o1, Departement.Employe o2) {
                    return (o1.getId() - o2.getId());
                }
            };
            Collections.sort(employes, comparator_Id);
        }
        @Override
        public void trierEmployeParNomDépartementEtGrade() {
            Comparator<Departement.Employe> comparator_Nom=new Comparator<Departement.Employe>() {
                @Override
                public int compare(Departement.Employe o1, Departement.Employe o2) {
                    return (o1.getNomDepartement().compareTo(o2.getNomDepartement()));
                }
            };

            Comparator<Departement.Employe> comparator_Grade=new Comparator<Departement.Employe>() {
                @Override
                public int compare(Departement.Employe o1, Departement.Employe o2) {
                    return (o1.getGrade() - o2.getGrade());
                }
            };

            Collections.sort(employes,comparator_Nom.thenComparing(comparator_Grade));
        }

    }
}

