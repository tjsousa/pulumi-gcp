// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRepositoryVirtualRepositoryConfigUpstreamPolicy {
    private String id;
    private Integer priority;
    private String repository;

    private GetRepositoryVirtualRepositoryConfigUpstreamPolicy() {}
    public String id() {
        return this.id;
    }
    public Integer priority() {
        return this.priority;
    }
    public String repository() {
        return this.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryVirtualRepositoryConfigUpstreamPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Integer priority;
        private String repository;
        public Builder() {}
        public Builder(GetRepositoryVirtualRepositoryConfigUpstreamPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.priority = defaults.priority;
    	      this.repository = defaults.repository;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public GetRepositoryVirtualRepositoryConfigUpstreamPolicy build() {
            final var o = new GetRepositoryVirtualRepositoryConfigUpstreamPolicy();
            o.id = id;
            o.priority = priority;
            o.repository = repository;
            return o;
        }
    }
}
