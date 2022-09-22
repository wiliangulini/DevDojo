package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {

    public static void main(String[] args) {

        //Producer producer = Producer.builder().name("Castiel").build();
        //ProducerService.save(producer);
        //ProducerService.delete(3);
        //ProducerService.update(Producer.builder().id(2).name("NHK").build());
        //List<Producer> producers = ProducerService.findAll();
        //List<Producer> producers = ProducerService.findByName("Dean");
        //log.info(producers);
        //ProducerService.showProducerMetaData();
        //ProducerService.showDriverMetaData();
        //ProducerService.showTypeScrollWorking();
        //ProducerService.findByNameAndUpdateToUpperCase("Dean");
        //List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Fulano");
        List<Producer> producers = ProducerService.findByNamePreparedStatement("B or X'='X");
        log.info("Producers found '{}'", producers);

//        log.info("info");
//        log.debug("debug");
//        log.warn("warn");
//        log.error("error");
//        log.trace("trace");

    }
  }
