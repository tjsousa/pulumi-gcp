// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceFromTemplateScratchDisk {
    private String interface_;

    private InstanceFromTemplateScratchDisk() {}
    public String interface_() {
        return this.interface_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateScratchDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String interface_;
        public Builder() {}
        public Builder(InstanceFromTemplateScratchDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
        }

        @CustomType.Setter("interface")
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public InstanceFromTemplateScratchDisk build() {
            final var o = new InstanceFromTemplateScratchDisk();
            o.interface_ = interface_;
            return o;
        }
    }
}
