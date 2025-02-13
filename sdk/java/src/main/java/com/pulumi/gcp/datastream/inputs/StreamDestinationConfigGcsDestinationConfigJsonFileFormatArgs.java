// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs Empty = new StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs();

    /**
     * Compression of the loaded JSON file.
     * Possible values are `NO_COMPRESSION` and `GZIP`.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<String> compression;

    /**
     * @return Compression of the loaded JSON file.
     * Possible values are `NO_COMPRESSION` and `GZIP`.
     * 
     */
    public Optional<Output<String>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * The schema file format along JSON data files.
     * Possible values are `NO_SCHEMA_FILE` and `AVRO_SCHEMA_FILE`.
     * 
     */
    @Import(name="schemaFileFormat")
    private @Nullable Output<String> schemaFileFormat;

    /**
     * @return The schema file format along JSON data files.
     * Possible values are `NO_SCHEMA_FILE` and `AVRO_SCHEMA_FILE`.
     * 
     */
    public Optional<Output<String>> schemaFileFormat() {
        return Optional.ofNullable(this.schemaFileFormat);
    }

    private StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs() {}

    private StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs(StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs $) {
        this.compression = $.compression;
        this.schemaFileFormat = $.schemaFileFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs $;

        public Builder() {
            $ = new StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs();
        }

        public Builder(StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs defaults) {
            $ = new StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compression Compression of the loaded JSON file.
         * Possible values are `NO_COMPRESSION` and `GZIP`.
         * 
         * @return builder
         * 
         */
        public Builder compression(@Nullable Output<String> compression) {
            $.compression = compression;
            return this;
        }

        /**
         * @param compression Compression of the loaded JSON file.
         * Possible values are `NO_COMPRESSION` and `GZIP`.
         * 
         * @return builder
         * 
         */
        public Builder compression(String compression) {
            return compression(Output.of(compression));
        }

        /**
         * @param schemaFileFormat The schema file format along JSON data files.
         * Possible values are `NO_SCHEMA_FILE` and `AVRO_SCHEMA_FILE`.
         * 
         * @return builder
         * 
         */
        public Builder schemaFileFormat(@Nullable Output<String> schemaFileFormat) {
            $.schemaFileFormat = schemaFileFormat;
            return this;
        }

        /**
         * @param schemaFileFormat The schema file format along JSON data files.
         * Possible values are `NO_SCHEMA_FILE` and `AVRO_SCHEMA_FILE`.
         * 
         * @return builder
         * 
         */
        public Builder schemaFileFormat(String schemaFileFormat) {
            return schemaFileFormat(Output.of(schemaFileFormat));
        }

        public StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs build() {
            return $;
        }
    }

}
