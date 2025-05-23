package org.example.procrastinator.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.procrastinator.entities.enumeration.Niveau;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Utilisateur {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;
    private String pseudo;
    private String mail;
    private Niveau niveau;
    private Excuse excusePreferee;
    private Date dateInscription;
    private int point;

}
