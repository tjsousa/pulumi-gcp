// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceGroupManagerInstanceLifecyclePolicy {
    private String forceUpdateOnRepair;

    private GetInstanceGroupManagerInstanceLifecyclePolicy() {}
    public String forceUpdateOnRepair() {
        return this.forceUpdateOnRepair;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupManagerInstanceLifecyclePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String forceUpdateOnRepair;
        public Builder() {}
        public Builder(GetInstanceGroupManagerInstanceLifecyclePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceUpdateOnRepair = defaults.forceUpdateOnRepair;
        }

        @CustomType.Setter
        public Builder forceUpdateOnRepair(String forceUpdateOnRepair) {
            this.forceUpdateOnRepair = Objects.requireNonNull(forceUpdateOnRepair);
            return this;
        }
        public GetInstanceGroupManagerInstanceLifecyclePolicy build() {
            final var o = new GetInstanceGroupManagerInstanceLifecyclePolicy();
            o.forceUpdateOnRepair = forceUpdateOnRepair;
            return o;
        }
    }
}
