// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigEphemeralStorageConfig;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigGcfsConfig;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigGuestAccelerator;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigGvnic;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigKubeletConfig;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigLinuxNodeConfig;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigReservationAffinity;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigSandboxConfig;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigShieldedInstanceConfig;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigTaint;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigWorkloadMetadataConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNodeConfig {
    private @Nullable String bootDiskKmsKey;
    private @Nullable Integer diskSizeGb;
    private @Nullable String diskType;
    private @Nullable NodePoolNodeConfigEphemeralStorageConfig ephemeralStorageConfig;
    private @Nullable NodePoolNodeConfigGcfsConfig gcfsConfig;
    private @Nullable List<NodePoolNodeConfigGuestAccelerator> guestAccelerators;
    private @Nullable NodePoolNodeConfigGvnic gvnic;
    private @Nullable String imageType;
    private @Nullable NodePoolNodeConfigKubeletConfig kubeletConfig;
    private @Nullable Map<String,String> labels;
    private @Nullable NodePoolNodeConfigLinuxNodeConfig linuxNodeConfig;
    private @Nullable Integer localSsdCount;
    private @Nullable String loggingVariant;
    private @Nullable String machineType;
    private @Nullable Map<String,String> metadata;
    private @Nullable String minCpuPlatform;
    private @Nullable String nodeGroup;
    private @Nullable List<String> oauthScopes;
    private @Nullable Boolean preemptible;
    private @Nullable NodePoolNodeConfigReservationAffinity reservationAffinity;
    private @Nullable Map<String,String> resourceLabels;
    private @Nullable NodePoolNodeConfigSandboxConfig sandboxConfig;
    private @Nullable String serviceAccount;
    private @Nullable NodePoolNodeConfigShieldedInstanceConfig shieldedInstanceConfig;
    private @Nullable Boolean spot;
    private @Nullable List<String> tags;
    private @Nullable List<NodePoolNodeConfigTaint> taints;
    private @Nullable NodePoolNodeConfigWorkloadMetadataConfig workloadMetadataConfig;

    private NodePoolNodeConfig() {}
    public Optional<String> bootDiskKmsKey() {
        return Optional.ofNullable(this.bootDiskKmsKey);
    }
    public Optional<Integer> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }
    public Optional<NodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfig() {
        return Optional.ofNullable(this.ephemeralStorageConfig);
    }
    public Optional<NodePoolNodeConfigGcfsConfig> gcfsConfig() {
        return Optional.ofNullable(this.gcfsConfig);
    }
    public List<NodePoolNodeConfigGuestAccelerator> guestAccelerators() {
        return this.guestAccelerators == null ? List.of() : this.guestAccelerators;
    }
    public Optional<NodePoolNodeConfigGvnic> gvnic() {
        return Optional.ofNullable(this.gvnic);
    }
    public Optional<String> imageType() {
        return Optional.ofNullable(this.imageType);
    }
    public Optional<NodePoolNodeConfigKubeletConfig> kubeletConfig() {
        return Optional.ofNullable(this.kubeletConfig);
    }
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<NodePoolNodeConfigLinuxNodeConfig> linuxNodeConfig() {
        return Optional.ofNullable(this.linuxNodeConfig);
    }
    public Optional<Integer> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }
    public Optional<String> loggingVariant() {
        return Optional.ofNullable(this.loggingVariant);
    }
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    public Optional<String> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }
    public Optional<String> nodeGroup() {
        return Optional.ofNullable(this.nodeGroup);
    }
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }
    public Optional<Boolean> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }
    public Optional<NodePoolNodeConfigReservationAffinity> reservationAffinity() {
        return Optional.ofNullable(this.reservationAffinity);
    }
    public Map<String,String> resourceLabels() {
        return this.resourceLabels == null ? Map.of() : this.resourceLabels;
    }
    public Optional<NodePoolNodeConfigSandboxConfig> sandboxConfig() {
        return Optional.ofNullable(this.sandboxConfig);
    }
    public Optional<String> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    public Optional<NodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }
    public Optional<Boolean> spot() {
        return Optional.ofNullable(this.spot);
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<NodePoolNodeConfigTaint> taints() {
        return this.taints == null ? List.of() : this.taints;
    }
    public Optional<NodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfig() {
        return Optional.ofNullable(this.workloadMetadataConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bootDiskKmsKey;
        private @Nullable Integer diskSizeGb;
        private @Nullable String diskType;
        private @Nullable NodePoolNodeConfigEphemeralStorageConfig ephemeralStorageConfig;
        private @Nullable NodePoolNodeConfigGcfsConfig gcfsConfig;
        private @Nullable List<NodePoolNodeConfigGuestAccelerator> guestAccelerators;
        private @Nullable NodePoolNodeConfigGvnic gvnic;
        private @Nullable String imageType;
        private @Nullable NodePoolNodeConfigKubeletConfig kubeletConfig;
        private @Nullable Map<String,String> labels;
        private @Nullable NodePoolNodeConfigLinuxNodeConfig linuxNodeConfig;
        private @Nullable Integer localSsdCount;
        private @Nullable String loggingVariant;
        private @Nullable String machineType;
        private @Nullable Map<String,String> metadata;
        private @Nullable String minCpuPlatform;
        private @Nullable String nodeGroup;
        private @Nullable List<String> oauthScopes;
        private @Nullable Boolean preemptible;
        private @Nullable NodePoolNodeConfigReservationAffinity reservationAffinity;
        private @Nullable Map<String,String> resourceLabels;
        private @Nullable NodePoolNodeConfigSandboxConfig sandboxConfig;
        private @Nullable String serviceAccount;
        private @Nullable NodePoolNodeConfigShieldedInstanceConfig shieldedInstanceConfig;
        private @Nullable Boolean spot;
        private @Nullable List<String> tags;
        private @Nullable List<NodePoolNodeConfigTaint> taints;
        private @Nullable NodePoolNodeConfigWorkloadMetadataConfig workloadMetadataConfig;
        public Builder() {}
        public Builder(NodePoolNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfig = defaults.ephemeralStorageConfig;
    	      this.gcfsConfig = defaults.gcfsConfig;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.gvnic = defaults.gvnic;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfig = defaults.linuxNodeConfig;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.loggingVariant = defaults.loggingVariant;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourceLabels = defaults.resourceLabels;
    	      this.sandboxConfig = defaults.sandboxConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfig = defaults.workloadMetadataConfig;
        }

        @CustomType.Setter
        public Builder bootDiskKmsKey(@Nullable String bootDiskKmsKey) {
            this.bootDiskKmsKey = bootDiskKmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        @CustomType.Setter
        public Builder ephemeralStorageConfig(@Nullable NodePoolNodeConfigEphemeralStorageConfig ephemeralStorageConfig) {
            this.ephemeralStorageConfig = ephemeralStorageConfig;
            return this;
        }
        @CustomType.Setter
        public Builder gcfsConfig(@Nullable NodePoolNodeConfigGcfsConfig gcfsConfig) {
            this.gcfsConfig = gcfsConfig;
            return this;
        }
        @CustomType.Setter
        public Builder guestAccelerators(@Nullable List<NodePoolNodeConfigGuestAccelerator> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(NodePoolNodeConfigGuestAccelerator... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        @CustomType.Setter
        public Builder gvnic(@Nullable NodePoolNodeConfigGvnic gvnic) {
            this.gvnic = gvnic;
            return this;
        }
        @CustomType.Setter
        public Builder imageType(@Nullable String imageType) {
            this.imageType = imageType;
            return this;
        }
        @CustomType.Setter
        public Builder kubeletConfig(@Nullable NodePoolNodeConfigKubeletConfig kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder linuxNodeConfig(@Nullable NodePoolNodeConfigLinuxNodeConfig linuxNodeConfig) {
            this.linuxNodeConfig = linuxNodeConfig;
            return this;
        }
        @CustomType.Setter
        public Builder localSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }
        @CustomType.Setter
        public Builder loggingVariant(@Nullable String loggingVariant) {
            this.loggingVariant = loggingVariant;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        @CustomType.Setter
        public Builder nodeGroup(@Nullable String nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }
        @CustomType.Setter
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        @CustomType.Setter
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        @CustomType.Setter
        public Builder reservationAffinity(@Nullable NodePoolNodeConfigReservationAffinity reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        @CustomType.Setter
        public Builder resourceLabels(@Nullable Map<String,String> resourceLabels) {
            this.resourceLabels = resourceLabels;
            return this;
        }
        @CustomType.Setter
        public Builder sandboxConfig(@Nullable NodePoolNodeConfigSandboxConfig sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder shieldedInstanceConfig(@Nullable NodePoolNodeConfigShieldedInstanceConfig shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        @CustomType.Setter
        public Builder spot(@Nullable Boolean spot) {
            this.spot = spot;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder taints(@Nullable List<NodePoolNodeConfigTaint> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(NodePoolNodeConfigTaint... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder workloadMetadataConfig(@Nullable NodePoolNodeConfigWorkloadMetadataConfig workloadMetadataConfig) {
            this.workloadMetadataConfig = workloadMetadataConfig;
            return this;
        }
        public NodePoolNodeConfig build() {
            final var o = new NodePoolNodeConfig();
            o.bootDiskKmsKey = bootDiskKmsKey;
            o.diskSizeGb = diskSizeGb;
            o.diskType = diskType;
            o.ephemeralStorageConfig = ephemeralStorageConfig;
            o.gcfsConfig = gcfsConfig;
            o.guestAccelerators = guestAccelerators;
            o.gvnic = gvnic;
            o.imageType = imageType;
            o.kubeletConfig = kubeletConfig;
            o.labels = labels;
            o.linuxNodeConfig = linuxNodeConfig;
            o.localSsdCount = localSsdCount;
            o.loggingVariant = loggingVariant;
            o.machineType = machineType;
            o.metadata = metadata;
            o.minCpuPlatform = minCpuPlatform;
            o.nodeGroup = nodeGroup;
            o.oauthScopes = oauthScopes;
            o.preemptible = preemptible;
            o.reservationAffinity = reservationAffinity;
            o.resourceLabels = resourceLabels;
            o.sandboxConfig = sandboxConfig;
            o.serviceAccount = serviceAccount;
            o.shieldedInstanceConfig = shieldedInstanceConfig;
            o.spot = spot;
            o.tags = tags;
            o.taints = taints;
            o.workloadMetadataConfig = workloadMetadataConfig;
            return o;
        }
    }
}
