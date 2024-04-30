package ma.enset.activity_2_patient.repositories;

import ma.enset.activity_2_patient.entities.Medecin;
import ma.enset.activity_2_patient.entities.RendezVous;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {

}
