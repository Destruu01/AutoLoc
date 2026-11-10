package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.calcul.VehiculeOffre;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceController {
    private final IAgenceService agenceService;


    @GetMapping
    public List<Agence> findAll() {
        return agenceService.findAll();
    }

    @GetMapping("/{id}")                                  // Q19
    public Agence findById(@PathVariable Long id) {
        return agenceService.findById(id);
    }

    @PostMapping                                          // Q21
    @ResponseStatus(HttpStatus.CREATED)
    public Agence create(@RequestBody Agence agence) {
        return agenceService.create(agence);
    }

    @PutMapping("/{id}")                                  // Q24
    public Agence update(@PathVariable Long id, @RequestBody Agence agence) {
        return agenceService.update(id, agence);
    }

    @DeleteMapping("/{id}")                               // Q25
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        agenceService.deleteById(id);
    }

    @GetMapping("/{id}/simuler")
    public String simuler(@PathVariable Long id,
                          @RequestParam int nbJours,
                          @RequestParam VehiculeOffre offre) {
        return agenceService.simuler(agenceService.findById(id), nbJours, offre);
    }
}