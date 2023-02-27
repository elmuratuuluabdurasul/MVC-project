package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_id_gen")
    @SequenceGenerator(name = "doctor_id_gen", sequenceName = "doctor_id_seq", allocationSize = 1,initialValue = 10)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String position;
    private String email;
    @ManyToMany(mappedBy = "doctor")
    private List<Department> departments;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;
    @ManyToOne()
    private Hospital hospital;

}
