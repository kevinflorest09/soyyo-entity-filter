package co.soy.yo.entity.filter.model.assembler;


import co.soy.yo.entity.filter.model.api.Entity;
import co.soy.yo.entity.filter.model.api.ServerEntity;

public class EntityAssembler {

    public static Entity mapToResponse(ServerEntity entity) {
        return Entity.builder().entityId(entity.getData().getEntityId())
                .name(entity.getData().getName())
                .identificationNumber(entity.getData().getIdentificationNumber())
                .expirationDate(entity.getData().getExpirationDate())
                .contactName(entity.getData().getContactName())
                .contactEmail(entity.getData().getContactMail())
                .logo(entity.getData().getLogo())
                .build();
    }

}
