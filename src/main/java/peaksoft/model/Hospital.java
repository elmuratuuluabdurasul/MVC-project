package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "hospitals")
public class Hospital {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_id_gen")
    @SequenceGenerator(name = "hospital_id_gen", sequenceName = "hospital_id_seq", allocationSize = 1,initialValue = 10)
    private Long Id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctors;
    @OneToMany(mappedBy = "hospital")
    private List<Patient> patients;
    @OneToMany(mappedBy = "hospital")
    private List<Department> departments;
    @OneToMany()
    private List<Appointment> appointments;
}
