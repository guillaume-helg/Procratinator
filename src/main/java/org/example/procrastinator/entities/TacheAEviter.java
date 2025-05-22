package org.example.procrastinator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.procrastinator.entities.enumeration.DegresUrgence;
import org.example.procrastinator.entities.enumeration.StatutTache;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class TacheAEviter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTacheAEviter;
    private Long idProcrastinateur;
    private String description;
    private DegresUrgence degresUrgence;
    private Date dateLimite;
    private Consequence consequence;
    private StatutTache statut;
    private Date dateCreation;

}


