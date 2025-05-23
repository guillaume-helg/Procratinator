package org.example.procrastinator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.procrastinator.entities.enumeration.Niveau;
import org.example.procrastinator.entities.enumeration.Type;
import org.example.procrastinator.entities.enumeration.Statut;


import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class PiegeProductivite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPiegeProductivite;
    private String titre;
    private String description;
    private Type type;
    private Long idAntiProcrastinateur;
    private Niveau niveau;
    private Recompense recompense;
    private Consequence consequence;
    private Date dateCreation;
    private Statut statut;

}


