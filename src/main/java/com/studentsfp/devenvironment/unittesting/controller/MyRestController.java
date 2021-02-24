package com.studentsfp.devenvironment.unittesting.controller;

import com.studentsfp.devenvironment.unittesting.data.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * com.studentsfp.devenvironment.unittesting.controller
 * Class MyRestController
 * 09/09/2020
 * <p>
 * TODO 4 (1p): Haz las modificaciones necesarias para que el rest point incluya tu servicio según el comportamiento
 *  visto en clase. Prueba que tus puntos rest funcionan desde postman y que, en consecuencia, la página funciona adecuadamente
 *  Genera todos tus datos en el servicio e incluyelos adecuadamente
 *
 */
@RestController
@RequestMapping(value = "/rest/api/v1")
public class MyRestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * TODO 3 (1 pt) Genera un listado de ciudades turísticas que quieres mostrar en tu página
     *  Modifica el listado de ciudades para que te imprima el botón adecuadamente
     * @return
     */
    @RequestMapping(value = "cities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Item>> getCityInfo() {
        try {
            List<Item> items = new ArrayList<>();
            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("restController:cities/", e);
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     *
     * Todo 5 (1pt) Haz la busqueda en tu servicio para la ciudad seleccionada y devuelve el método adecuadamente.
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping(value = "city/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=*")
    public ResponseEntity<Item> getCity(HttpServletRequest request
            , @PathVariable Integer id) {
        try {
            Item item = new Item();
            item.setTodo(id.toString());
            return new ResponseEntity<>(item, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("register:save", e);
            return new ResponseEntity<>(new Item(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * TODO 6 (3 pt) Genera la lógica necesaria para que en postman puedas ver todas las veces que se ha buscado una
     *  ciudad y devuelve los resultados
     */

}
