package example.sunlight.contracts;

import com.c12e.agent.api.BaseSourcer;
import com.c12e.ardl.ARDLineage;
import com.c12e.ardl.StagingSpace;
import com.c12e.graph.GraphBuilder;
import com.c12e.util.FacilityHost;

import java.io.IOException;
import java.util.Calendar;

/**
 * @author dilum
 * @since 7/15/14
 */
public class FederalContractsSourcer extends BaseSourcer<ContractsConfig> {

    @Override
    public void source(FacilityHost facilityHost, ContractsConfig config, ARDLineage lineage) throws IOException {
        ContractsClient client = new ContractsClient();
        client.apiKey(config.apiKey);
        client.fiscalYear(Calendar.getInstance().get(Calendar.YEAR));
        client.perPage(1000);
        try (StagingSpace staging = lineage.staging()) {
            for (FederalContract contract : client.getPage(1)) {
                GraphBuilder builder = new GraphBuilder();
                builder.setCorrelationId(contract.recordId);
                builder.setModel(contract);
                staging.write(builder.toARDRecord());
            }
            staging.commit();
        }
    }
}
