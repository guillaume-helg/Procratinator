package org.example.procrastinator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.procrastinator.entities.enumeration.Statut;
import org.example.procrastinator.entities.enumeration.StatutParticipationDefi;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class ParticipationDefi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParticipationDefi;
    private Long idDefiProcrastinateur;
    private Long idProcrastinateur;
    private Date dateInscription;
    private StatutParticipationDefi statutParticipationDefi;
    private int pointsGagnes;

}

