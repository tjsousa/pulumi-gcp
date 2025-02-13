// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelay;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay {
    /**
     * @return Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay;
    /**
     * @return The percentage of traffic (connections/operations/requests) on which delay will be introduced as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    private Double percentage;

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay() {}
    /**
     * @return Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay() {
        return this.fixedDelay;
    }
    /**
     * @return The percentage of traffic (connections/operations/requests) on which delay will be introduced as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    public Double percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay;
        private Double percentage;
        public Builder() {}
        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder fixedDelay(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay) {
            this.fixedDelay = Objects.requireNonNull(fixedDelay);
            return this;
        }
        @CustomType.Setter
        public Builder percentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay build() {
            final var o = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelay();
            o.fixedDelay = fixedDelay;
            o.percentage = percentage;
            return o;
        }
    }
}
