package korproject.model.entity;

import jakarta.persistence.*;
import korproject.model.dto.AppointmentDto;
import lombok.*;

@Getter@Setter@Builder
@AllArgsConstructor@NoArgsConstructor
@Entity(name="appointment")
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentid;

    @ManyToOne
    @JoinColumn(name="patientid")
    private PatientEntity patientEntity;

    @ManyToOne
    @JoinColumn(name="doctorid")
    private DoctorEntity doctorEntity;

    @Column(nullable = false)
    private String appointmentdate;

    @Column(nullable = false)
    private String appointmenttime;

    @Column(columnDefinition = "int")
    private int status;

    AppointmentDto toDto(){
        return AppointmentDto.builder()
                .appointmentdate(this.appointmentdate)
                .appointmentid(this.appointmentid)
                .appointmenttime(this.appointmenttime)
                .doctorid(this.doctorEntity.getDoctorid())
                .patinentid(this.patientEntity.getPatientid())
                .status(this.status).build();
    }


}
