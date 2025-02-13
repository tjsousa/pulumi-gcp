// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class PolicyRestorePolicy {
    /**
     * @return May only be set to true. If set, then the default Policy is restored.
     * 
     */
    private Boolean default_;

    private PolicyRestorePolicy() {}
    /**
     * @return May only be set to true. If set, then the default Policy is restored.
     * 
     */
    public Boolean default_() {
        return this.default_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRestorePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean default_;
        public Builder() {}
        public Builder(PolicyRestorePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
        }

        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        public PolicyRestorePolicy build() {
            final var o = new PolicyRestorePolicy();
            o.default_ = default_;
            return o;
        }
    }
}
