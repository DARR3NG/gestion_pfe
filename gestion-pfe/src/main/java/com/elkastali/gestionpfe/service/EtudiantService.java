package com.elkastali.gestionpfe.service;

import com.elkastali.gestionpfe.entities.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant saveEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant, Long id);
    Boolean deleteEtudiant(Long id);
    Etudiant getEtudiant(Long id);

    List<Etudiant> getAllEtudiants();

}
