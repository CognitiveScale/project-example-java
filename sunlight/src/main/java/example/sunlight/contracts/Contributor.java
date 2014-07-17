package example.sunlight.contracts;

import com.c12e.plan.ContributorInterest;
import com.c12e.plan.PlanContributor;
import com.c12e.plan.PlanStep;

/**
 * @author dilum
 * @since 7/15/14
 */
public class Contributor extends BaseContributor {

    {
        addSourcer(FederalContractsSourcer.class, ContractsConfig.class);
    }
}
