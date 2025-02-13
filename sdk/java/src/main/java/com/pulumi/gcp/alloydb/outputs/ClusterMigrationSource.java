// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterMigrationSource {
    /**
     * @return The host and port of the on-premises instance in host:port format
     * 
     */
    private @Nullable String hostPort;
    /**
     * @return Place holder for the external source identifier(e.g DMS job name) that created the cluster.
     * 
     */
    private @Nullable String referenceId;
    /**
     * @return Type of migration source.
     * 
     */
    private @Nullable String sourceType;

    private ClusterMigrationSource() {}
    /**
     * @return The host and port of the on-premises instance in host:port format
     * 
     */
    public Optional<String> hostPort() {
        return Optional.ofNullable(this.hostPort);
    }
    /**
     * @return Place holder for the external source identifier(e.g DMS job name) that created the cluster.
     * 
     */
    public Optional<String> referenceId() {
        return Optional.ofNullable(this.referenceId);
    }
    /**
     * @return Type of migration source.
     * 
     */
    public Optional<String> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMigrationSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hostPort;
        private @Nullable String referenceId;
        private @Nullable String sourceType;
        public Builder() {}
        public Builder(ClusterMigrationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPort = defaults.hostPort;
    	      this.referenceId = defaults.referenceId;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder hostPort(@Nullable String hostPort) {
            this.hostPort = hostPort;
            return this;
        }
        @CustomType.Setter
        public Builder referenceId(@Nullable String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public ClusterMigrationSource build() {
            final var o = new ClusterMigrationSource();
            o.hostPort = hostPort;
            o.referenceId = referenceId;
            o.sourceType = sourceType;
            return o;
        }
    }
}
