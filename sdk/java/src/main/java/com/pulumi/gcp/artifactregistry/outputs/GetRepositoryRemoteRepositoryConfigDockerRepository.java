// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRepositoryRemoteRepositoryConfigDockerRepository {
    private String publicRepository;

    private GetRepositoryRemoteRepositoryConfigDockerRepository() {}
    public String publicRepository() {
        return this.publicRepository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryRemoteRepositoryConfigDockerRepository defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String publicRepository;
        public Builder() {}
        public Builder(GetRepositoryRemoteRepositoryConfigDockerRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicRepository = defaults.publicRepository;
        }

        @CustomType.Setter
        public Builder publicRepository(String publicRepository) {
            this.publicRepository = Objects.requireNonNull(publicRepository);
            return this;
        }
        public GetRepositoryRemoteRepositoryConfigDockerRepository build() {
            final var o = new GetRepositoryRemoteRepositoryConfigDockerRepository();
            o.publicRepository = publicRepository;
            return o;
        }
    }
}
