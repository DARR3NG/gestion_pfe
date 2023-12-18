package com.elkastali.gestionpfe.service.Impl;

import com.elkastali.gestionpfe.entities.Pfe;
import com.elkastali.gestionpfe.repository.PfeRepository;
import com.elkastali.gestionpfe.service.PfeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PfeServiceImpl implements PfeService {

    private final PfeRepository pfeRepository;

    @Override
    public Pfe savePfe(Pfe pfe) {
        return pfeRepository.save(pfe);
    }

    @Override
    public Pfe updatePfe(Pfe pfe, Long id) {

        Pfe p=getPfe(id);
        if(p!=null){

            p.setEntreprise(pfe.getEntreprise());
            p.setSujet(pfe.getSujet());
            p.setDateDebut(pfe.getDateDebut());
            p.setDateFin(pfe.getDateFin());
            p.setEtudiant(pfe.getEtudiant());


        }
        return null;
    }

    @Override
    public Boolean deletePfe(Long id) {
        return null;
    }

    @Override
    public Pfe getPfe(Long id) {
        return null;
    }

    @Override
    public List<Pfe> getAllPfes() {
        return pfeRepository.findAll();
    }
}
