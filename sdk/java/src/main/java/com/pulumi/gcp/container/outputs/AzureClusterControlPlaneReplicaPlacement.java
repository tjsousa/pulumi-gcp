// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureClusterControlPlaneReplicaPlacement {
    /**
     * @return For a given replica, the Azure availability zone where to provision the control plane VM and the ETCD disk.
     * 
     */
    private String azureAvailabilityZone;
    /**
     * @return For a given replica, the ARM ID of the subnet where the control plane VM is deployed. Make sure it&#39;s a subnet under the virtual network in the cluster configuration.
     * 
     */
    private String subnetId;

    private AzureClusterControlPlaneReplicaPlacement() {}
    /**
     * @return For a given replica, the Azure availability zone where to provision the control plane VM and the ETCD disk.
     * 
     */
    public String azureAvailabilityZone() {
        return this.azureAvailabilityZone;
    }
    /**
     * @return For a given replica, the ARM ID of the subnet where the control plane VM is deployed. Make sure it&#39;s a subnet under the virtual network in the cluster configuration.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneReplicaPlacement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String azureAvailabilityZone;
        private String subnetId;
        public Builder() {}
        public Builder(AzureClusterControlPlaneReplicaPlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureAvailabilityZone = defaults.azureAvailabilityZone;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder azureAvailabilityZone(String azureAvailabilityZone) {
            this.azureAvailabilityZone = Objects.requireNonNull(azureAvailabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public AzureClusterControlPlaneReplicaPlacement build() {
            final var o = new AzureClusterControlPlaneReplicaPlacement();
            o.azureAvailabilityZone = azureAvailabilityZone;
            o.subnetId = subnetId;
            return o;
        }
    }
}
