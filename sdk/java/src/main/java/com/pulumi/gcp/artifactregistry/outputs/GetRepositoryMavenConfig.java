// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRepositoryMavenConfig {
    private Boolean allowSnapshotOverwrites;
    private String versionPolicy;

    private GetRepositoryMavenConfig() {}
    public Boolean allowSnapshotOverwrites() {
        return this.allowSnapshotOverwrites;
    }
    public String versionPolicy() {
        return this.versionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryMavenConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowSnapshotOverwrites;
        private String versionPolicy;
        public Builder() {}
        public Builder(GetRepositoryMavenConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSnapshotOverwrites = defaults.allowSnapshotOverwrites;
    	      this.versionPolicy = defaults.versionPolicy;
        }

        @CustomType.Setter
        public Builder allowSnapshotOverwrites(Boolean allowSnapshotOverwrites) {
            this.allowSnapshotOverwrites = Objects.requireNonNull(allowSnapshotOverwrites);
            return this;
        }
        @CustomType.Setter
        public Builder versionPolicy(String versionPolicy) {
            this.versionPolicy = Objects.requireNonNull(versionPolicy);
            return this;
        }
        public GetRepositoryMavenConfig build() {
            final var o = new GetRepositoryMavenConfig();
            o.allowSnapshotOverwrites = allowSnapshotOverwrites;
            o.versionPolicy = versionPolicy;
            return o;
        }
    }
}
