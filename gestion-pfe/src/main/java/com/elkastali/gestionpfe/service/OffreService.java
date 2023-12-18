package com.elkastali.gestionpfe.service;

import com.elkastali.gestionpfe.entities.Offre;

import java.util.List;

public interface OffreService {

    Offre saveOffre(Offre offre);
    Offre updateOffre(Offre offre, Long id);
    Boolean deleteOffre(Long id);
    List<Offre> getAllOffres();
    Offre getOffre(Long id);
}
