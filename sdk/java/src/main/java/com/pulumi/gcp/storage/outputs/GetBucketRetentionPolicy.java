// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetBucketRetentionPolicy {
    private Boolean isLocked;
    private Integer retentionPeriod;

    private GetBucketRetentionPolicy() {}
    public Boolean isLocked() {
        return this.isLocked;
    }
    public Integer retentionPeriod() {
        return this.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketRetentionPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean isLocked;
        private Integer retentionPeriod;
        public Builder() {}
        public Builder(GetBucketRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLocked = defaults.isLocked;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        @CustomType.Setter
        public Builder isLocked(Boolean isLocked) {
            this.isLocked = Objects.requireNonNull(isLocked);
            return this;
        }
        @CustomType.Setter
        public Builder retentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }
        public GetBucketRetentionPolicy build() {
            final var o = new GetBucketRetentionPolicy();
            o.isLocked = isLocked;
            o.retentionPeriod = retentionPeriod;
            return o;
        }
    }
}
