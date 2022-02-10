package co.soy.yo.entity.filter.model.api;

import co.soy.yo.entity.filter.model.api.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServerEntity {

        private String code;
        private String message;
        private String type;
        private Data data;
        private String traceId;

}
