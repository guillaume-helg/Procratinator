package org.example.procrastinator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.procrastinator.entities.enumeration.NiveauRecompense;
import org.example.procrastinator.entities.enumeration.Statut;
import org.example.procrastinator.entities.enumeration.TypeRecompense;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class AttributionRecompense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAttributionRecompense;
    private Long idRecompense;
    private Long idProcrastinateur;
    private Date dateObtention;
    private Date dateExpiration;
    private String contexte;
    private Statut statut;

}



