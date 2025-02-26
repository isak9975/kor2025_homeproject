package korproject.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter@Getter @Builder
@AllArgsConstructor@NoArgsConstructor
@Entity(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientid;

    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String name;

    @Column(nullable = false )
    private String birthdate;

    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String phone;

    @Column(columnDefinition = "varchar(100)",nullable = false)
    private String address;

}
