package org.example.procrastinator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.procrastinator.entities.enumeration.DegresUrgence;
import org.example.procrastinator.entities.enumeration.NiveauRecompense;
import org.example.procrastinator.entities.enumeration.StatutTache;
import org.example.procrastinator.entities.enumeration.TypeRecompense;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Recompense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecompense;
    private String titre;
    private String description;
    private String conditionObtention;
    private NiveauRecompense niveauRecompense;
    private TypeRecompense typeRecompense;

}


