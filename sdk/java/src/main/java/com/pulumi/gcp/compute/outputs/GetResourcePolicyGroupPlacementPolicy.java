// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourcePolicyGroupPlacementPolicy {
    private Integer availabilityDomainCount;
    private String collocation;
    private Integer maxDistance;
    private Integer vmCount;

    private GetResourcePolicyGroupPlacementPolicy() {}
    public Integer availabilityDomainCount() {
        return this.availabilityDomainCount;
    }
    public String collocation() {
        return this.collocation;
    }
    public Integer maxDistance() {
        return this.maxDistance;
    }
    public Integer vmCount() {
        return this.vmCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyGroupPlacementPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer availabilityDomainCount;
        private String collocation;
        private Integer maxDistance;
        private Integer vmCount;
        public Builder() {}
        public Builder(GetResourcePolicyGroupPlacementPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.maxDistance = defaults.maxDistance;
    	      this.vmCount = defaults.vmCount;
        }

        @CustomType.Setter
        public Builder availabilityDomainCount(Integer availabilityDomainCount) {
            this.availabilityDomainCount = Objects.requireNonNull(availabilityDomainCount);
            return this;
        }
        @CustomType.Setter
        public Builder collocation(String collocation) {
            this.collocation = Objects.requireNonNull(collocation);
            return this;
        }
        @CustomType.Setter
        public Builder maxDistance(Integer maxDistance) {
            this.maxDistance = Objects.requireNonNull(maxDistance);
            return this;
        }
        @CustomType.Setter
        public Builder vmCount(Integer vmCount) {
            this.vmCount = Objects.requireNonNull(vmCount);
            return this;
        }
        public GetResourcePolicyGroupPlacementPolicy build() {
            final var o = new GetResourcePolicyGroupPlacementPolicy();
            o.availabilityDomainCount = availabilityDomainCount;
            o.collocation = collocation;
            o.maxDistance = maxDistance;
            o.vmCount = vmCount;
            return o;
        }
    }
}
