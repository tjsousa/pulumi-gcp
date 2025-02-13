// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs();

    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    @Import(name="gcePdKmsKeyName")
    private @Nullable Output<String> gcePdKmsKeyName;

    /**
     * @return Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    public Optional<Output<String>> gcePdKmsKeyName() {
        return Optional.ofNullable(this.gcePdKmsKeyName);
    }

    private WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs $) {
        this.gcePdKmsKeyName = $.gcePdKmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcePdKmsKeyName Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder gcePdKmsKeyName(@Nullable Output<String> gcePdKmsKeyName) {
            $.gcePdKmsKeyName = gcePdKmsKeyName;
            return this;
        }

        /**
         * @param gcePdKmsKeyName Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder gcePdKmsKeyName(String gcePdKmsKeyName) {
            return gcePdKmsKeyName(Output.of(gcePdKmsKeyName));
        }

        public WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs build() {
            return $;
        }
    }

}
