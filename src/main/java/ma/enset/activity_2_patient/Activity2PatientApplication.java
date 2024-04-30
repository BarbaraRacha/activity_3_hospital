package ma.enset.activity_2_patient;

import ma.enset.activity_2_patient.entities.Patient;
import ma.enset.activity_2_patient.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Activity2PatientApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Activity2PatientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        //patientRepository.save(new Patient(null,"Saad",new Date(2023,12,12),true,3));
        //patientRepository.save(new Patient(null,"Zouhair",new Date(2024,2,12),true,3));
        //patientRepository.save(new Patient(null,"Malak",new Date(),true,3));
        //patientRepository.save(new Patient(null,"Nasser",new Date(2023,10,21),true,3));

        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p->{
             System.out.println(p.toString());
        });


        System.out.println("------------------------------------------");
        Patient patient = patientRepository.findById(Long.valueOf("1")).get();
        System.out.println(patient.toString());


        System.out.println("------------------------------------------");
        List<Patient> patients_cherche = patientRepository.findAllByNomContaining("s");
        patients_cherche.forEach(p->{
            System.out.println(p.toString());
        });

        /*System.out.println("------------------------------------------");
        List<Patient> patients_search = patientRepository.searchByQuery("s");
        patients_search.forEach(p->{
            System.out.println(p.toString());
        });

        System.out.println("------------------------------------------");
        List<Patient> patients_date_naiss = patientRepository.findAllByDateNaissanecGreaterThan(new Date(2000,1,1));
        patients_date_naiss.forEach(p->{
            System.out.println(p.toString());
        });

        System.out.println("------------------------------------------");
        patientRepository.updateScoreByName(2,"Saad");
        List<Patient> patients_updated = patientRepository.findAll();
        patients_updated.forEach(p->{
            System.out.println(p.toString());
        });
        */
    }

    // ou à place d'implementer cette interface on peut utiliser le code suivant
    /*
    @Bean
    CommandLineRunner start () {
        // TO DO
    }
     */
}
