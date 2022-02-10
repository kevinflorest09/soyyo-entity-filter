package co.soy.yo.entity.filter.business.impl;

import co.soy.yo.entity.filter.business.EntityFilterService;
import co.soy.yo.entity.filter.config.ApplicationProperties;
import co.soy.yo.entity.filter.model.api.Entity;
import co.soy.yo.entity.filter.model.assembler.EntityAssembler;
import co.soy.yo.entity.filter.model.api.Filter;
import co.soy.yo.entity.filter.model.api.ServerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EntityFilterServiceImpl implements EntityFilterService {

    private final WebClient webClient;

    private final ApplicationProperties properties;

    @Override
    public Mono<List<Entity>> filterResponse(Filter request) {

        return Flux.fromIterable(rango(request.getStartId(), request.getEndId()))
                .flatMap(entityId -> aux(entityId)).collectList()
                .map(list -> list.stream().sorted(Comparator.comparing(Entity::getName))
                        .collect(Collectors.toList()));
    }

     Mono<Entity> aux(Integer entityId){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("dev/entity/v2.1/entities/{entityId}")
                        .build(entityId))
                .retrieve()
                .bodyToMono(ServerEntity.class)
                .map(EntityAssembler::mapToResponse);

    }

     public List<Integer> rango(Integer start, Integer end){
        int entityId=0;
        List<Integer> rango = new ArrayList<>();
        for(int x = start; x <= end; x++) {
            entityId=x;
            rango.add(entityId);
        }
        return rango;
    }
}
