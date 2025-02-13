// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketWebsite {
    /**
     * @return Behaves as the bucket&#39;s directory index where
     * missing objects are treated as potential directories.
     * 
     */
    private @Nullable String mainPageSuffix;
    /**
     * @return The custom object to return when a requested
     * resource is not found.
     * 
     */
    private @Nullable String notFoundPage;

    private BucketWebsite() {}
    /**
     * @return Behaves as the bucket&#39;s directory index where
     * missing objects are treated as potential directories.
     * 
     */
    public Optional<String> mainPageSuffix() {
        return Optional.ofNullable(this.mainPageSuffix);
    }
    /**
     * @return The custom object to return when a requested
     * resource is not found.
     * 
     */
    public Optional<String> notFoundPage() {
        return Optional.ofNullable(this.notFoundPage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mainPageSuffix;
        private @Nullable String notFoundPage;
        public Builder() {}
        public Builder(BucketWebsite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        @CustomType.Setter
        public Builder mainPageSuffix(@Nullable String mainPageSuffix) {
            this.mainPageSuffix = mainPageSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder notFoundPage(@Nullable String notFoundPage) {
            this.notFoundPage = notFoundPage;
            return this;
        }
        public BucketWebsite build() {
            final var o = new BucketWebsite();
            o.mainPageSuffix = mainPageSuffix;
            o.notFoundPage = notFoundPage;
            return o;
        }
    }
}
