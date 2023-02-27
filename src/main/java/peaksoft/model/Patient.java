package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.model.enums.Gender;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "patients")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_id_gen")
    @SequenceGenerator(name = "patient_id_gen", sequenceName = "patient_id_seq", allocationSize = 1,initialValue = 10)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")

    private String lastName;
    @Column(name = "phone_number")

    private String phoneNumber;
    private Gender gender;
    private String email;
    @ManyToOne
    private Hospital hospital;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appoitmentList;
}
