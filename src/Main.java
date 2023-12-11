import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        DepartementHashSet departement1 = new DepartementHashSet();

        Departement departe1 = new Departement(1, "etage1", 60);
        Departement departe2 = new Departement(2, "etage2", 120);
        Departement departe3 = new Departement(3, "etage3", 80);
        departement1.ajouterDepartement(departe1);
        departement1.ajouterDepartement(departe2);
        departement1.ajouterDepartement(departe3);
        System.out.println("List of departements:");
        departement1.displayDepartement();
        String r = "etage2";
        if (departement1.rechercherDepartement(r)) {
            System.out.println(" Department " + r + " Found ");
        } else {
            System.out.println("Department " + r + " Not found");
        }

        departement1.supprimerDepartement(departe2);

        System.out.println("\nList of departments after the delete :");
        departement1.displayDepartement();

        System.out.println("\nList of departments triees :");
        TreeSet<Departement> departementsTries = departement1.trierDepartementById();
        for (Departement departement : departementsTries) {
            System.out.println(departement);
        }
    }

    }
