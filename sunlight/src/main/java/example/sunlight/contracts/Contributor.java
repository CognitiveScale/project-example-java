package example.sunlight.contracts;

import com.c12e.plan.BaseContributor;

/**
 * @author dilum
 * @since 7/15/14
 */
public class Contributor extends BaseContributor {

    {
        addSourcer(FederalContractsSourcer.class, ContractsConfig.class);
    }
}
