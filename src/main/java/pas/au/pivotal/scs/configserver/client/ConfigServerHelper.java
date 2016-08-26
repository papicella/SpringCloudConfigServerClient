package pas.au.pivotal.scs.configserver.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ConfigServerHelper
{
    @Value("${name}")
    String name;

    public String getName()
    {
        return name;
    }

}
