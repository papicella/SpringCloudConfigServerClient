package pas.au.pivotal.scs.configserver.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pas.au.pivotal.scs.configserver.client.ConfigServerHelper;

@RestController
public class ConfigServerClientRest
{
    @Autowired
    ConfigServerHelper configServerHelper;

    @RequestMapping("/sayhello")
    public String restaurant() {
        return String.format("Hello %s", configServerHelper.getName());
    }
}
