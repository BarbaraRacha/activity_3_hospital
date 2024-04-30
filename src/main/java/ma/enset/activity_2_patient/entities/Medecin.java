package ma.enset.activity_2_patient.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Entity
@Data // concerne Getters et Setters
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String specialite;
    @OneToMany(mappedBy = "medecin", fetch = FetchType.LAZY)
    @JsonProperty (access = JsonProperty.Access.WRITE_ONLY)
    private Collection<RendezVous> rendezVous;

}
