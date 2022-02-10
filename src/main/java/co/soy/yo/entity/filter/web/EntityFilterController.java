package co.soy.yo.entity.filter.web;

import co.soy.yo.entity.filter.business.EntityFilterService;
import co.soy.yo.entity.filter.model.api.Entity;
import co.soy.yo.entity.filter.model.api.Filter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/entities/filter")
public class EntityFilterController {

    private final EntityFilterService service;

    @PostMapping
    Mono<List<Entity>> filterResponse(@RequestBody Filter request){
        return service.filterResponse(request);
    }
}
