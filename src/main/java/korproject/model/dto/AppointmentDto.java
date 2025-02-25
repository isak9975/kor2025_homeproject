package korproject.model.dto;

import korproject.model.entity.AppointmentEntity;
import lombok.*;

@Getter@Setter@Builder
@AllArgsConstructor@NoArgsConstructor
public class AppointmentDto {

    private int appointmentid;

    private String appointmentdate;

    private String appointmenttime;

    private String createdat;

    private int status;

    private int patinentid;

    private int doctorid;

    AppointmentEntity toEntity(){
        return AppointmentEntity.builder()
                .appointmentid(this.appointmentid)
                .appointmentdate(this.appointmentdate)
                .appointmenttime(this.appointmenttime)
                .build();
    }
}
