// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPubSubArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishFindingsToCloudDataCatalogArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishSummaryToCsccArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionArgs Empty = new PreventionJobTriggerInspectJobActionArgs();

    /**
     * Publish a message into a given Pub/Sub topic when the job completes.
     * Structure is documented below.
     * 
     */
    @Import(name="pubSub")
    private @Nullable Output<PreventionJobTriggerInspectJobActionPubSubArgs> pubSub;

    /**
     * @return Publish a message into a given Pub/Sub topic when the job completes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobActionPubSubArgs>> pubSub() {
        return Optional.ofNullable(this.pubSub);
    }

    /**
     * Publish findings of a DlpJob to Data Catalog.
     * 
     */
    @Import(name="publishFindingsToCloudDataCatalog")
    private @Nullable Output<PreventionJobTriggerInspectJobActionPublishFindingsToCloudDataCatalogArgs> publishFindingsToCloudDataCatalog;

    /**
     * @return Publish findings of a DlpJob to Data Catalog.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobActionPublishFindingsToCloudDataCatalogArgs>> publishFindingsToCloudDataCatalog() {
        return Optional.ofNullable(this.publishFindingsToCloudDataCatalog);
    }

    /**
     * Publish the result summary of a DlpJob to the Cloud Security Command Center.
     * 
     */
    @Import(name="publishSummaryToCscc")
    private @Nullable Output<PreventionJobTriggerInspectJobActionPublishSummaryToCsccArgs> publishSummaryToCscc;

    /**
     * @return Publish the result summary of a DlpJob to the Cloud Security Command Center.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobActionPublishSummaryToCsccArgs>> publishSummaryToCscc() {
        return Optional.ofNullable(this.publishSummaryToCscc);
    }

    /**
     * If set, the detailed findings will be persisted to the specified OutputStorageConfig. Only a single instance of this action can be specified. Compatible with: Inspect, Risk
     * Structure is documented below.
     * 
     */
    @Import(name="saveFindings")
    private @Nullable Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings;

    /**
     * @return If set, the detailed findings will be persisted to the specified OutputStorageConfig. Only a single instance of this action can be specified. Compatible with: Inspect, Risk
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs>> saveFindings() {
        return Optional.ofNullable(this.saveFindings);
    }

    private PreventionJobTriggerInspectJobActionArgs() {}

    private PreventionJobTriggerInspectJobActionArgs(PreventionJobTriggerInspectJobActionArgs $) {
        this.pubSub = $.pubSub;
        this.publishFindingsToCloudDataCatalog = $.publishFindingsToCloudDataCatalog;
        this.publishSummaryToCscc = $.publishSummaryToCscc;
        this.saveFindings = $.saveFindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobActionArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobActionArgs();
        }

        public Builder(PreventionJobTriggerInspectJobActionArgs defaults) {
            $ = new PreventionJobTriggerInspectJobActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pubSub Publish a message into a given Pub/Sub topic when the job completes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pubSub(@Nullable Output<PreventionJobTriggerInspectJobActionPubSubArgs> pubSub) {
            $.pubSub = pubSub;
            return this;
        }

        /**
         * @param pubSub Publish a message into a given Pub/Sub topic when the job completes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pubSub(PreventionJobTriggerInspectJobActionPubSubArgs pubSub) {
            return pubSub(Output.of(pubSub));
        }

        /**
         * @param publishFindingsToCloudDataCatalog Publish findings of a DlpJob to Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder publishFindingsToCloudDataCatalog(@Nullable Output<PreventionJobTriggerInspectJobActionPublishFindingsToCloudDataCatalogArgs> publishFindingsToCloudDataCatalog) {
            $.publishFindingsToCloudDataCatalog = publishFindingsToCloudDataCatalog;
            return this;
        }

        /**
         * @param publishFindingsToCloudDataCatalog Publish findings of a DlpJob to Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder publishFindingsToCloudDataCatalog(PreventionJobTriggerInspectJobActionPublishFindingsToCloudDataCatalogArgs publishFindingsToCloudDataCatalog) {
            return publishFindingsToCloudDataCatalog(Output.of(publishFindingsToCloudDataCatalog));
        }

        /**
         * @param publishSummaryToCscc Publish the result summary of a DlpJob to the Cloud Security Command Center.
         * 
         * @return builder
         * 
         */
        public Builder publishSummaryToCscc(@Nullable Output<PreventionJobTriggerInspectJobActionPublishSummaryToCsccArgs> publishSummaryToCscc) {
            $.publishSummaryToCscc = publishSummaryToCscc;
            return this;
        }

        /**
         * @param publishSummaryToCscc Publish the result summary of a DlpJob to the Cloud Security Command Center.
         * 
         * @return builder
         * 
         */
        public Builder publishSummaryToCscc(PreventionJobTriggerInspectJobActionPublishSummaryToCsccArgs publishSummaryToCscc) {
            return publishSummaryToCscc(Output.of(publishSummaryToCscc));
        }

        /**
         * @param saveFindings If set, the detailed findings will be persisted to the specified OutputStorageConfig. Only a single instance of this action can be specified. Compatible with: Inspect, Risk
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder saveFindings(@Nullable Output<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings) {
            $.saveFindings = saveFindings;
            return this;
        }

        /**
         * @param saveFindings If set, the detailed findings will be persisted to the specified OutputStorageConfig. Only a single instance of this action can be specified. Compatible with: Inspect, Risk
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder saveFindings(PreventionJobTriggerInspectJobActionSaveFindingsArgs saveFindings) {
            return saveFindings(Output.of(saveFindings));
        }

        public PreventionJobTriggerInspectJobActionArgs build() {
            return $;
        }
    }

}
