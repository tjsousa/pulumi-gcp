// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterBinaryAuthorization {
    private Boolean enabled;
    private String evaluationMode;

    private GetClusterBinaryAuthorization() {}
    public Boolean enabled() {
        return this.enabled;
    }
    public String evaluationMode() {
        return this.evaluationMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterBinaryAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String evaluationMode;
        public Builder() {}
        public Builder(GetClusterBinaryAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.evaluationMode = defaults.evaluationMode;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder evaluationMode(String evaluationMode) {
            this.evaluationMode = Objects.requireNonNull(evaluationMode);
            return this;
        }
        public GetClusterBinaryAuthorization build() {
            final var o = new GetClusterBinaryAuthorization();
            o.enabled = enabled;
            o.evaluationMode = evaluationMode;
            return o;
        }
    }
}
