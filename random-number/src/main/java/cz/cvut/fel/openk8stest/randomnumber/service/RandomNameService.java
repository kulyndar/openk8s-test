package cz.cvut.fel.openk8stest.randomnumber.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RandomNameService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomNameService.class);

    @Value("${random.service.name.address}")
    private String nameServiceUri;

    @Autowired
    private RestTemplate restTemplate;

    public String getRandomName() {
        LOGGER.info("Calling random name service with URI " + nameServiceUri);
        try {
            return restTemplate.getForObject(nameServiceUri + "/name", String.class);
        } catch (Exception e) {
            LOGGER.error("Exception caught during call", e);
        }
        return "Dummy Name";
    }
}
