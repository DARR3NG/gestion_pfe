package com.elkastali.gestionpfe.service;

import com.elkastali.gestionpfe.entities.Pfe;

import java.util.List;

public interface PfeService {

    Pfe savePfe(Pfe pfe);
    Pfe updatePfe(Pfe pfe, Long id);
    Boolean deletePfe(Long id);
    Pfe getPfe(Long id);

    List<Pfe> getAllPfes();
}
