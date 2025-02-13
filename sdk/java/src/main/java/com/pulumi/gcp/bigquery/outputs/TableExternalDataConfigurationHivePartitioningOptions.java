// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableExternalDataConfigurationHivePartitioningOptions {
    /**
     * @return When set, what mode of hive partitioning to use when
     * reading data. The following modes are supported.
     * * AUTO: automatically infer partition key name(s) and type(s).
     * * STRINGS: automatically infer partition key name(s). All types are
     *   Not all storage formats support hive partitioning. Requesting hive
     *   partitioning on an unsupported format will lead to an error.
     *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
     * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    private @Nullable String mode;
    /**
     * @return If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    private @Nullable Boolean requirePartitionFilter;
    /**
     * @return When hive partition detection is requested,
     * a common for all source uris must be required. The prefix must end immediately
     * before the partition key encoding begins. For example, consider files following
     * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
     * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
     * partitioning is requested with either AUTO or STRINGS detection, the common prefix
     * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
     * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    private @Nullable String sourceUriPrefix;

    private TableExternalDataConfigurationHivePartitioningOptions() {}
    /**
     * @return When set, what mode of hive partitioning to use when
     * reading data. The following modes are supported.
     * * AUTO: automatically infer partition key name(s) and type(s).
     * * STRINGS: automatically infer partition key name(s). All types are
     *   Not all storage formats support hive partitioning. Requesting hive
     *   partitioning on an unsupported format will lead to an error.
     *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
     * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    public Optional<Boolean> requirePartitionFilter() {
        return Optional.ofNullable(this.requirePartitionFilter);
    }
    /**
     * @return When hive partition detection is requested,
     * a common for all source uris must be required. The prefix must end immediately
     * before the partition key encoding begins. For example, consider files following
     * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
     * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
     * partitioning is requested with either AUTO or STRINGS detection, the common prefix
     * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
     * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    public Optional<String> sourceUriPrefix() {
        return Optional.ofNullable(this.sourceUriPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationHivePartitioningOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private @Nullable Boolean requirePartitionFilter;
        private @Nullable String sourceUriPrefix;
        public Builder() {}
        public Builder(TableExternalDataConfigurationHivePartitioningOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.sourceUriPrefix = defaults.sourceUriPrefix;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder requirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }
        @CustomType.Setter
        public Builder sourceUriPrefix(@Nullable String sourceUriPrefix) {
            this.sourceUriPrefix = sourceUriPrefix;
            return this;
        }
        public TableExternalDataConfigurationHivePartitioningOptions build() {
            final var o = new TableExternalDataConfigurationHivePartitioningOptions();
            o.mode = mode;
            o.requirePartitionFilter = requirePartitionFilter;
            o.sourceUriPrefix = sourceUriPrefix;
            return o;
        }
    }
}
