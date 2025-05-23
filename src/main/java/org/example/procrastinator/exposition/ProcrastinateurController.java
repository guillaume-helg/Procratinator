package org.example.procrastinator.exposition;

import org.example.procrastinator.entities.Procrastinateur;
import org.example.procrastinator.entities.TacheAEviter;
import org.example.procrastinator.metier.ProcrastinateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/procrastinateur")
public class ProcrastinateurController {

    private ProcrastinateurService procrastinateurService;

    @PostMapping
    public ResponseEntity<Procrastinateur> createProcrastinateur(@RequestBody Procrastinateur procrastinateur) {
        Procrastinateur savedProcrastinateur = procrastinateurService.createProcrastinateur(procrastinateur);
        return new ResponseEntity<>(savedProcrastinateur, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<TacheAEviter[]> creerListeTacheAEviter() {
        TacheAEviter[] tacheAEviter = new TacheAEviter[2];
        return new ResponseEntity<>(tacheAEviter, HttpStatus.CREATED);
    }

    public void participerDefiProcrastination() {

    }

    public void eviterPiegeProductivite() {

    }
}
