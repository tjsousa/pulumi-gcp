// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class MetastoreServiceMetadataIntegrationDataCatalogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceMetadataIntegrationDataCatalogConfigArgs Empty = new MetastoreServiceMetadataIntegrationDataCatalogConfigArgs();

    /**
     * Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private MetastoreServiceMetadataIntegrationDataCatalogConfigArgs() {}

    private MetastoreServiceMetadataIntegrationDataCatalogConfigArgs(MetastoreServiceMetadataIntegrationDataCatalogConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreServiceMetadataIntegrationDataCatalogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreServiceMetadataIntegrationDataCatalogConfigArgs $;

        public Builder() {
            $ = new MetastoreServiceMetadataIntegrationDataCatalogConfigArgs();
        }

        public Builder(MetastoreServiceMetadataIntegrationDataCatalogConfigArgs defaults) {
            $ = new MetastoreServiceMetadataIntegrationDataCatalogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public MetastoreServiceMetadataIntegrationDataCatalogConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
