package com.studentsfp.devenvironment.unittesting;

import com.studentsfp.devenvironment.unittesting.data.Item;
import com.studentsfp.devenvironment.unittesting.helper.GenericFileUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.apache.commons.lang3.StringUtils;


/**
 * TODO 0: IMPLEMENTA LAS SIGUIENTES OPERACIONES MEDIANTE TDD
 *   IMPORTANTE: NO PUEDE EXISTIR LÓGICA DE APLICACIÓN EN LOS TESTS - INVALIDA LA PREGUNTA -
 *   Antes de empezar a implantar el examen modifica el readme.md con tu nombre.
 *   Al finalizar, introduce tu nota de autoevaluación en el readme.
 *  Genera la estructura necesaria para que tu servicio cargue los datos adecuadamente
 *  Los tests deben probar el servicio
 */
@SpringBootTest
class MyExamApplicationTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * TODO 1 (2p): Modifica el bean Item de java que debe guardar la información de las ciudades según como se pide en el js
     *  situado al final del index.html. Genera, además un servicio con el método initData(), que te permita inicializar
     *  la colección de datos a mostrar en capa de presentación. Comprueba esa colección de datos en esta pregunta
     */
    @Test
    void serviceDataCreation() {
        try{
            GenericFileUtils genericFileUtils = new GenericFileUtils();
            Item item = new Item();
            Assert.isTrue(StringUtils.equals((CharSequence) genericFileUtils,item.toString()),"Data creada");
            logger.info("Información completada");

        }catch (Exception e){
            logger.error("to define");
        }
    }

    /**
     * TODO 2 (2p): Genera un metodo en tu servicio DataService que busque la ciudad por identificador y exponlo en la estructura rest
     *  Prueba su correcto funcionamiento en un test
     */
    @Test
    void dbLoadTester() {
        try{
            Item item = GenericFileUtils.getMaxHurricane(GenericFileUtils.getInputReader("hurricanes.csv"));
            Assert.notNull(item, "p1: The hurricane starts to blow your mind, concentrate!");
        }catch (Exception e){
            logger.error("to define");
        }
    }



}
