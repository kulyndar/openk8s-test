package cz.cvut.fel.openk8stest.randomname.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/name")
public class RandomNameController {

    private static final String[] names = {"Anna", "Philip"};

    @GetMapping
    public ResponseEntity<String> getRandomName() {
        int rnd = new Random().nextInt(names.length);
        return ResponseEntity.ok(names[rnd]);
    }
}
