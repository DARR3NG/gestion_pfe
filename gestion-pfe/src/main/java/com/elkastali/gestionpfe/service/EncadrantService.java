package com.elkastali.gestionpfe.service;

import com.elkastali.gestionpfe.entities.Encadrant;

import java.util.List;

public interface EncadrantService {

    Encadrant saveEncadrant(Encadrant encadrant);
    Encadrant updateEncadrant(Encadrant encadrant, Long id);
    Boolean deleteEncadrant(Long id);
    Encadrant getEncadrant(Long id);

    List<Encadrant> getAllEncadrants();
}
