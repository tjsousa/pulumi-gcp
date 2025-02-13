// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFromTemplateBootDiskInitializeParams {
    private @Nullable String image;
    private @Nullable Map<String,Object> labels;
    private @Nullable Integer size;
    private @Nullable String type;

    private InstanceFromTemplateBootDiskInitializeParams() {}
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateBootDiskInitializeParams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String image;
        private @Nullable Map<String,Object> labels;
        private @Nullable Integer size;
        private @Nullable String type;
        public Builder() {}
        public Builder(InstanceFromTemplateBootDiskInitializeParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.labels = defaults.labels;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public InstanceFromTemplateBootDiskInitializeParams build() {
            final var o = new InstanceFromTemplateBootDiskInitializeParams();
            o.image = image;
            o.labels = labels;
            o.size = size;
            o.type = type;
            return o;
        }
    }
}
