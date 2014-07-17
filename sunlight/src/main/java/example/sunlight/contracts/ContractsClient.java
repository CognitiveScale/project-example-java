package example.sunlight.contracts;

import scout.engine.util.RestfulClient;

import javax.ws.rs.client.WebTarget;
import java.util.ArrayList;

/**
 * @author dilum
 * @since 7/15/14
 */
public class ContractsClient extends RestfulClient {

    private static final String BASE_URI = "http://transparencydata.com/api/1.0/contracts.json";
    private String _apiKey;
    private int _fiscalYear = 2010;
    private int _resultsPerPage = 20;

    public ContractsClient() {
        super(BASE_URI);
    }

    public ContractsClient apiKey(String apiKey) {
        _apiKey = apiKey;
        return this;
    }

    public ContractsClient fiscalYear(int year) {
        _fiscalYear = year;
        return this;
    }

    public ContractsClient perPage(int resultsPerPage) {
        _resultsPerPage = resultsPerPage;
        return this;
    }

    public ContractsList getPage(int page) {
        WebTarget t = createTarget();
        t = t.queryParam("page", page);
        t = t.queryParam("per_page", _resultsPerPage);
        t = t.queryParam("fiscal_year", _fiscalYear);
        t = t.queryParam("apiKey", _apiKey);

        return executeGet(t, ContractsList.class);
    }

    public static class ContractsList extends ArrayList<FederalContract> {
    }

    // http://transparencydata.com/api/1.0/contracts.json?page=1&per_page=20&fiscal_year=2012&apikey=0899ad230010ed0
}
