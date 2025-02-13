// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.artifactregistry.outputs.GetRepositoryVirtualRepositoryConfigUpstreamPolicy;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRepositoryVirtualRepositoryConfig {
    private List<GetRepositoryVirtualRepositoryConfigUpstreamPolicy> upstreamPolicies;

    private GetRepositoryVirtualRepositoryConfig() {}
    public List<GetRepositoryVirtualRepositoryConfigUpstreamPolicy> upstreamPolicies() {
        return this.upstreamPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryVirtualRepositoryConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRepositoryVirtualRepositoryConfigUpstreamPolicy> upstreamPolicies;
        public Builder() {}
        public Builder(GetRepositoryVirtualRepositoryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.upstreamPolicies = defaults.upstreamPolicies;
        }

        @CustomType.Setter
        public Builder upstreamPolicies(List<GetRepositoryVirtualRepositoryConfigUpstreamPolicy> upstreamPolicies) {
            this.upstreamPolicies = Objects.requireNonNull(upstreamPolicies);
            return this;
        }
        public Builder upstreamPolicies(GetRepositoryVirtualRepositoryConfigUpstreamPolicy... upstreamPolicies) {
            return upstreamPolicies(List.of(upstreamPolicies));
        }
        public GetRepositoryVirtualRepositoryConfig build() {
            final var o = new GetRepositoryVirtualRepositoryConfig();
            o.upstreamPolicies = upstreamPolicies;
            return o;
        }
    }
}
