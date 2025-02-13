// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheOriginOriginOverrideActionHeaderAction;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheOriginOriginOverrideActionUrlRewrite;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheOriginOriginOverrideAction {
    /**
     * @return The header actions, including adding and removing
     * headers, for request handled by this origin.
     * Structure is documented below.
     * 
     */
    private @Nullable EdgeCacheOriginOriginOverrideActionHeaderAction headerAction;
    /**
     * @return The URL rewrite configuration for request that are
     * handled by this origin.
     * Structure is documented below.
     * 
     */
    private @Nullable EdgeCacheOriginOriginOverrideActionUrlRewrite urlRewrite;

    private EdgeCacheOriginOriginOverrideAction() {}
    /**
     * @return The header actions, including adding and removing
     * headers, for request handled by this origin.
     * Structure is documented below.
     * 
     */
    public Optional<EdgeCacheOriginOriginOverrideActionHeaderAction> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * @return The URL rewrite configuration for request that are
     * handled by this origin.
     * Structure is documented below.
     * 
     */
    public Optional<EdgeCacheOriginOriginOverrideActionUrlRewrite> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheOriginOriginOverrideAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable EdgeCacheOriginOriginOverrideActionHeaderAction headerAction;
        private @Nullable EdgeCacheOriginOriginOverrideActionUrlRewrite urlRewrite;
        public Builder() {}
        public Builder(EdgeCacheOriginOriginOverrideAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.urlRewrite = defaults.urlRewrite;
        }

        @CustomType.Setter
        public Builder headerAction(@Nullable EdgeCacheOriginOriginOverrideActionHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        @CustomType.Setter
        public Builder urlRewrite(@Nullable EdgeCacheOriginOriginOverrideActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public EdgeCacheOriginOriginOverrideAction build() {
            final var o = new EdgeCacheOriginOriginOverrideAction();
            o.headerAction = headerAction;
            o.urlRewrite = urlRewrite;
            return o;
        }
    }
}
