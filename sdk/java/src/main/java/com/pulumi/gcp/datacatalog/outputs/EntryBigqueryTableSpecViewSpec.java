// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntryBigqueryTableSpecViewSpec {
    /**
     * @return (Output)
     * The query that defines the table view.
     * 
     */
    private @Nullable String viewQuery;

    private EntryBigqueryTableSpecViewSpec() {}
    /**
     * @return (Output)
     * The query that defines the table view.
     * 
     */
    public Optional<String> viewQuery() {
        return Optional.ofNullable(this.viewQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecViewSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String viewQuery;
        public Builder() {}
        public Builder(EntryBigqueryTableSpecViewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        @CustomType.Setter
        public Builder viewQuery(@Nullable String viewQuery) {
            this.viewQuery = viewQuery;
            return this;
        }
        public EntryBigqueryTableSpecViewSpec build() {
            final var o = new EntryBigqueryTableSpecViewSpec();
            o.viewQuery = viewQuery;
            return o;
        }
    }
}
