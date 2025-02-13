// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.GetClusterPrivateClusterConfigMasterGlobalAccessConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterPrivateClusterConfig {
    private Boolean enablePrivateEndpoint;
    private Boolean enablePrivateNodes;
    private List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs;
    private String masterIpv4CidrBlock;
    private String peeringName;
    private String privateEndpoint;
    private String privateEndpointSubnetwork;
    private String publicEndpoint;

    private GetClusterPrivateClusterConfig() {}
    public Boolean enablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    public Boolean enablePrivateNodes() {
        return this.enablePrivateNodes;
    }
    public List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs() {
        return this.masterGlobalAccessConfigs;
    }
    public String masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }
    public String peeringName() {
        return this.peeringName;
    }
    public String privateEndpoint() {
        return this.privateEndpoint;
    }
    public String privateEndpointSubnetwork() {
        return this.privateEndpointSubnetwork;
    }
    public String publicEndpoint() {
        return this.publicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterPrivateClusterConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enablePrivateEndpoint;
        private Boolean enablePrivateNodes;
        private List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs;
        private String masterIpv4CidrBlock;
        private String peeringName;
        private String privateEndpoint;
        private String privateEndpointSubnetwork;
        private String publicEndpoint;
        public Builder() {}
        public Builder(GetClusterPrivateClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfigs = defaults.masterGlobalAccessConfigs;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.peeringName = defaults.peeringName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointSubnetwork = defaults.privateEndpointSubnetwork;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        @CustomType.Setter
        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder enablePrivateNodes(Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes);
            return this;
        }
        @CustomType.Setter
        public Builder masterGlobalAccessConfigs(List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs) {
            this.masterGlobalAccessConfigs = Objects.requireNonNull(masterGlobalAccessConfigs);
            return this;
        }
        public Builder masterGlobalAccessConfigs(GetClusterPrivateClusterConfigMasterGlobalAccessConfig... masterGlobalAccessConfigs) {
            return masterGlobalAccessConfigs(List.of(masterGlobalAccessConfigs));
        }
        @CustomType.Setter
        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder peeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointSubnetwork(String privateEndpointSubnetwork) {
            this.privateEndpointSubnetwork = Objects.requireNonNull(privateEndpointSubnetwork);
            return this;
        }
        @CustomType.Setter
        public Builder publicEndpoint(String publicEndpoint) {
            this.publicEndpoint = Objects.requireNonNull(publicEndpoint);
            return this;
        }
        public GetClusterPrivateClusterConfig build() {
            final var o = new GetClusterPrivateClusterConfig();
            o.enablePrivateEndpoint = enablePrivateEndpoint;
            o.enablePrivateNodes = enablePrivateNodes;
            o.masterGlobalAccessConfigs = masterGlobalAccessConfigs;
            o.masterIpv4CidrBlock = masterIpv4CidrBlock;
            o.peeringName = peeringName;
            o.privateEndpoint = privateEndpoint;
            o.privateEndpointSubnetwork = privateEndpointSubnetwork;
            o.publicEndpoint = publicEndpoint;
            return o;
        }
    }
}
