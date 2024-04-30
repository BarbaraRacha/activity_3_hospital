package ma.enset.activity_2_patient.service;

import ma.enset.activity_2_patient.entities.Consultation;
import ma.enset.activity_2_patient.entities.Medecin;
import ma.enset.activity_2_patient.entities.Patient;
import ma.enset.activity_2_patient.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsltation(Consultation consltation);
}
