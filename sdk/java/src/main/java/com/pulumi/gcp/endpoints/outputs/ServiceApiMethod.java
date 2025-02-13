// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceApiMethod {
    /**
     * @return The simple name of the endpoint as described in the config.
     * 
     */
    private @Nullable String name;
    /**
     * @return The type URL for the request to this API.
     * 
     */
    private @Nullable String requestType;
    /**
     * @return The type URL for the response from this API.
     * 
     */
    private @Nullable String responseType;
    /**
     * @return `SYNTAX_PROTO2` or `SYNTAX_PROTO3`.
     * 
     */
    private @Nullable String syntax;

    private ServiceApiMethod() {}
    /**
     * @return The simple name of the endpoint as described in the config.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type URL for the request to this API.
     * 
     */
    public Optional<String> requestType() {
        return Optional.ofNullable(this.requestType);
    }
    /**
     * @return The type URL for the response from this API.
     * 
     */
    public Optional<String> responseType() {
        return Optional.ofNullable(this.responseType);
    }
    /**
     * @return `SYNTAX_PROTO2` or `SYNTAX_PROTO3`.
     * 
     */
    public Optional<String> syntax() {
        return Optional.ofNullable(this.syntax);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceApiMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String requestType;
        private @Nullable String responseType;
        private @Nullable String syntax;
        public Builder() {}
        public Builder(ServiceApiMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.requestType = defaults.requestType;
    	      this.responseType = defaults.responseType;
    	      this.syntax = defaults.syntax;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder requestType(@Nullable String requestType) {
            this.requestType = requestType;
            return this;
        }
        @CustomType.Setter
        public Builder responseType(@Nullable String responseType) {
            this.responseType = responseType;
            return this;
        }
        @CustomType.Setter
        public Builder syntax(@Nullable String syntax) {
            this.syntax = syntax;
            return this;
        }
        public ServiceApiMethod build() {
            final var o = new ServiceApiMethod();
            o.name = name;
            o.requestType = requestType;
            o.responseType = responseType;
            o.syntax = syntax;
            return o;
        }
    }
}
