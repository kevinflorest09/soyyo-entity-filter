package co.soy.yo.entity.filter.model.api;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Entity {

        private String entityId;
        private String name;
        private String identificationNumber;
        private String expirationDate;
        private String contactName;
        private String contactEmail;
        private String logo;

}
