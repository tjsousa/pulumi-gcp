// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionNetworkEndpointGroupAppEngine {
    private String service;
    private String urlMask;
    private String version;

    private GetRegionNetworkEndpointGroupAppEngine() {}
    public String service() {
        return this.service;
    }
    public String urlMask() {
        return this.urlMask;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionNetworkEndpointGroupAppEngine defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String service;
        private String urlMask;
        private String version;
        public Builder() {}
        public Builder(GetRegionNetworkEndpointGroupAppEngine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        @CustomType.Setter
        public Builder urlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetRegionNetworkEndpointGroupAppEngine build() {
            final var o = new GetRegionNetworkEndpointGroupAppEngine();
            o.service = service;
            o.urlMask = urlMask;
            o.version = version;
            return o;
        }
    }
}
