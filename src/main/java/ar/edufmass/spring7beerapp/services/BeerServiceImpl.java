package ar.edufmass.spring7beerapp.services;

import ar.edufmass.spring7beerapp.model.Beer;
import ar.edufmass.spring7beerapp.model.BeerStyle;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Kalaf IPA")
                .beerStyle(BeerStyle.IPA)
                .upc("12356")
                .price(new BigDecimal("10.99"))
                .quantityOnHand(10)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
