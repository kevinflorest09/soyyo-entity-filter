package co.soy.yo.entity.filter;

import co.soy.yo.entity.filter.business.impl.EntityFilterServiceImpl;
import co.soy.yo.entity.filter.model.api.Entity;
import co.soy.yo.entity.filter.model.api.Filter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FilterRequestFilterApiApplicationTests {

	@InjectMocks
	EntityFilterServiceImpl service;

	@Test
	public void entityFilterService() {
		Filter filter = new Filter();
		filter.setEndId(10);
		filter.setStartId(2);
		List<Integer> numbers = service.rango(filter.getStartId(),filter.getEndId());

		assertEquals(numbers.get(1),3);


	}
}
