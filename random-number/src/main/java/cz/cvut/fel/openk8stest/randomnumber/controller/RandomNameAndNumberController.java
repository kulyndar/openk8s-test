package cz.cvut.fel.openk8stest.randomnumber.controller;

import cz.cvut.fel.openk8stest.randomnumber.service.RandomNameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/number")
public class RandomNameAndNumberController {

    private static final int randomNumber = new Random().nextInt(10000);
    private static final Logger LOGGER = LoggerFactory.getLogger(RandomNameAndNumberController.class);

    @Autowired
    private RandomNameService randomNameService;

    @GetMapping
    public ResponseEntity<RandomResource> getRandomNameAndNumber() {
        LOGGER.info("calling Random Name And Number controller");
        String name = randomNameService.getRandomName();
        return ResponseEntity.ok(new RandomResource(randomNumber, name));
    }

}
