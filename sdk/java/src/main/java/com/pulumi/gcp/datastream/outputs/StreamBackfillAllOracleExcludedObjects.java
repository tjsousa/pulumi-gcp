// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllOracleExcludedObjectsOracleSchema;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StreamBackfillAllOracleExcludedObjects {
    /**
     * @return Oracle schemas/databases in the database server
     * Structure is documented below.
     * 
     */
    private List<StreamBackfillAllOracleExcludedObjectsOracleSchema> oracleSchemas;

    private StreamBackfillAllOracleExcludedObjects() {}
    /**
     * @return Oracle schemas/databases in the database server
     * Structure is documented below.
     * 
     */
    public List<StreamBackfillAllOracleExcludedObjectsOracleSchema> oracleSchemas() {
        return this.oracleSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillAllOracleExcludedObjects defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<StreamBackfillAllOracleExcludedObjectsOracleSchema> oracleSchemas;
        public Builder() {}
        public Builder(StreamBackfillAllOracleExcludedObjects defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleSchemas = defaults.oracleSchemas;
        }

        @CustomType.Setter
        public Builder oracleSchemas(List<StreamBackfillAllOracleExcludedObjectsOracleSchema> oracleSchemas) {
            this.oracleSchemas = Objects.requireNonNull(oracleSchemas);
            return this;
        }
        public Builder oracleSchemas(StreamBackfillAllOracleExcludedObjectsOracleSchema... oracleSchemas) {
            return oracleSchemas(List.of(oracleSchemas));
        }
        public StreamBackfillAllOracleExcludedObjects build() {
            final var o = new StreamBackfillAllOracleExcludedObjects();
            o.oracleSchemas = oracleSchemas;
            return o;
        }
    }
}
