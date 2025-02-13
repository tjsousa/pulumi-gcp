// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterDefaultSnatStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterDefaultSnatStatusArgs Empty = new ClusterDefaultSnatStatusArgs();

    /**
     * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when defaultSnatStatus is disabled.When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic
     * 
     */
    @Import(name="disabled", required=true)
    private Output<Boolean> disabled;

    /**
     * @return Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when defaultSnatStatus is disabled.When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }

    private ClusterDefaultSnatStatusArgs() {}

    private ClusterDefaultSnatStatusArgs(ClusterDefaultSnatStatusArgs $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterDefaultSnatStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDefaultSnatStatusArgs $;

        public Builder() {
            $ = new ClusterDefaultSnatStatusArgs();
        }

        public Builder(ClusterDefaultSnatStatusArgs defaults) {
            $ = new ClusterDefaultSnatStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when defaultSnatStatus is disabled.When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic
         * 
         * @return builder
         * 
         */
        public Builder disabled(Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when defaultSnatStatus is disabled.When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public ClusterDefaultSnatStatusArgs build() {
            $.disabled = Objects.requireNonNull($.disabled, "expected parameter 'disabled' to be non-null");
            return $;
        }
    }

}
