// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkPeeringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkPeeringArgs Empty = new GetNetworkPeeringArgs();

    /**
     * Name of the peering.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the peering.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The primary network of the peering.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The primary network of the peering.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    private GetNetworkPeeringArgs() {}

    private GetNetworkPeeringArgs(GetNetworkPeeringArgs $) {
        this.name = $.name;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkPeeringArgs $;

        public Builder() {
            $ = new GetNetworkPeeringArgs();
        }

        public Builder(GetNetworkPeeringArgs defaults) {
            $ = new GetNetworkPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The primary network of the peering.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The primary network of the peering.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        public GetNetworkPeeringArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}
