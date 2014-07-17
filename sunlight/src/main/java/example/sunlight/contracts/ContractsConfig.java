package example.sunlight.contracts;

import com.c12e.agent.api.BasicConfig;
import com.c12e.annotations.Configuration;
import com.c12e.annotations.Presentation;

/**
* @author dilum
* @since 7/16/14
*/
public class ContractsConfig extends BasicConfig {

    @Configuration
    @Presentation(displayText = "API_KEY")
    public String apiKey;

}
