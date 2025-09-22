import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxPolicyResolver {
    private final Map<String, TaxPolicy> policies = new HashMap<>();
    private final TaxPolicy defaultPolicy = new DefaultTaxPolicy();

    public TaxPolicyResolver(List<TaxPolicy> policyList) {
        for (TaxPolicy policy : policyList) {
            policies.put(policy.countryCode(), policy);
        }
    }

    public TaxPolicy resolve(String countryCode) {
        return policies.getOrDefault(countryCode, defaultPolicy);
    }
}
