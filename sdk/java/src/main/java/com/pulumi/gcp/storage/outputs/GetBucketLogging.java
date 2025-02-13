// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBucketLogging {
    private String logBucket;
    private String logObjectPrefix;

    private GetBucketLogging() {}
    public String logBucket() {
        return this.logBucket;
    }
    public String logObjectPrefix() {
        return this.logObjectPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketLogging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String logBucket;
        private String logObjectPrefix;
        public Builder() {}
        public Builder(GetBucketLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        @CustomType.Setter
        public Builder logBucket(String logBucket) {
            this.logBucket = Objects.requireNonNull(logBucket);
            return this;
        }
        @CustomType.Setter
        public Builder logObjectPrefix(String logObjectPrefix) {
            this.logObjectPrefix = Objects.requireNonNull(logObjectPrefix);
            return this;
        }
        public GetBucketLogging build() {
            final var o = new GetBucketLogging();
            o.logBucket = logBucket;
            o.logObjectPrefix = logObjectPrefix;
            return o;
        }
    }
}
