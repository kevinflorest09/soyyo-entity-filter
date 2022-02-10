package co.soy.yo.entity.filter.business;

import co.soy.yo.entity.filter.model.api.Entity;
import co.soy.yo.entity.filter.model.api.Filter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


public interface EntityFilterService {

   Mono<List<Entity>> filterResponse(Filter request);

}
