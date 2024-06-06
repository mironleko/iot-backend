package her.fer.iot.projektbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DataDto {
    private String deviceId;
    private Double latitude;

    private Double longitude;

    private Integer num_people;

    private String status;

    private Integer route;

    private String next_stop;

}
