package org.example.procrastinator.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.procrastinator.entities.enumeration.Categorie;
import org.example.procrastinator.entities.enumeration.StatutExcuse;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Excuse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExcuse;
    private String texte;
    private String situation;
    private int votesRecus;
    private Long idProcrastinateur;
    private Date dateSoumission;
    private Categorie categorie;
    private Date dateCreation;
    private StatutExcuse statut;

}

