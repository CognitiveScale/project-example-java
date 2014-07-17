package contracts;

import com.c12e.util.GsonUtils;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static example.sunlight.contracts.ContractsClient.ContractsList;

/**
 * @author dilum
 * @since 7/15/14
 */
public class TestDeserialization {

    @Test
    public void testAgainstReference() throws IOException {
        String message = Resources.toString(Resources.getResource("contracts/sample-results.json"),
                                            Charsets.UTF_8);
        ContractsList list = GsonUtils.toPojo(message, ContractsList.class);
        Assert.assertFalse(list.isEmpty());
    }
}
