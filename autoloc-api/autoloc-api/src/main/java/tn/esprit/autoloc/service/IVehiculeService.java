package tn.esprit.autoloc.service;

import tn.esprit.autoloc.calcul.VehiculeOffre;
import tn.esprit.autoloc.domain.Vehicule;

public interface IVehiculeService extends IGenericService<Vehicule, Long>{
    double calculTarif(Vehicule vehicule, int nbJours, VehiculeOffre offre);
    Vehicule desaffecte(Long id);
    Vehicule affecte(Long id, Long idAgence);
    Vehicule affecteEquipement(Long idVehicule, Long idEquipement);
}