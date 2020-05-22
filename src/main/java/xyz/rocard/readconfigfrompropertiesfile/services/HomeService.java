package xyz.rocard.readconfigfrompropertiesfile.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    Environment env;

    public String greetings() {
        String configData = env.getProperty("xyz.someconfig").trim();
        String[] configDataArr = configData.split("_");

        for (int i = 0; i < configDataArr.length; i++) {
            System.out.println("configDataArr " + configDataArr[i]);
        }

        return "Hello from home service! ";
    }
}
