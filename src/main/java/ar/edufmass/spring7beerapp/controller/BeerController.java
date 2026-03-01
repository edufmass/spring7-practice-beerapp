package ar.edufmass.spring7beerapp.controller;

import ar.edufmass.spring7beerapp.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class BeerController {

    private final BeerService beerService;
}
