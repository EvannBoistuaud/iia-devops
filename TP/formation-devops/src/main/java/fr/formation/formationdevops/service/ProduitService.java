package fr.formation.formationdevops.service;

import org.springframework.stereotype.Service;

@Service
public class ProduitService {
    
    public void findAll() {
        System.out.println("Rechercher dans le fichier ...");
    }

    public void save() {
        System.out.println("Sauvegarde dans le fichier ...");
    }
}
