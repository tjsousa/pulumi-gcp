// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterMonitoringConfigManagedPrometheus;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterMonitoringConfig {
    /**
     * @return The GKE components exposing metrics. Supported values include: `SYSTEM_COMPONENTS`, `APISERVER`, `CONTROLLER_MANAGER`, and `SCHEDULER`. In beta provider, `WORKLOADS` is supported on top of those 4 values. (`WORKLOADS` is deprecated and removed in GKE 1.24.)
     * 
     */
    private @Nullable List<String> enableComponents;
    /**
     * @return Configuration for Managed Service for Prometheus. Structure is documented below.
     * 
     */
    private @Nullable ClusterMonitoringConfigManagedPrometheus managedPrometheus;

    private ClusterMonitoringConfig() {}
    /**
     * @return The GKE components exposing metrics. Supported values include: `SYSTEM_COMPONENTS`, `APISERVER`, `CONTROLLER_MANAGER`, and `SCHEDULER`. In beta provider, `WORKLOADS` is supported on top of those 4 values. (`WORKLOADS` is deprecated and removed in GKE 1.24.)
     * 
     */
    public List<String> enableComponents() {
        return this.enableComponents == null ? List.of() : this.enableComponents;
    }
    /**
     * @return Configuration for Managed Service for Prometheus. Structure is documented below.
     * 
     */
    public Optional<ClusterMonitoringConfigManagedPrometheus> managedPrometheus() {
        return Optional.ofNullable(this.managedPrometheus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMonitoringConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> enableComponents;
        private @Nullable ClusterMonitoringConfigManagedPrometheus managedPrometheus;
        public Builder() {}
        public Builder(ClusterMonitoringConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
    	      this.managedPrometheus = defaults.managedPrometheus;
        }

        @CustomType.Setter
        public Builder enableComponents(@Nullable List<String> enableComponents) {
            this.enableComponents = enableComponents;
            return this;
        }
        public Builder enableComponents(String... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }
        @CustomType.Setter
        public Builder managedPrometheus(@Nullable ClusterMonitoringConfigManagedPrometheus managedPrometheus) {
            this.managedPrometheus = managedPrometheus;
            return this;
        }
        public ClusterMonitoringConfig build() {
            final var o = new ClusterMonitoringConfig();
            o.enableComponents = enableComponents;
            o.managedPrometheus = managedPrometheus;
            return o;
        }
    }
}
