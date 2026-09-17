package pt.ipb.sd.components.country;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String capital;
    private Long population;
    private String region;

    @Setter
    @Column(length = 1000)
    private String notes;
}
