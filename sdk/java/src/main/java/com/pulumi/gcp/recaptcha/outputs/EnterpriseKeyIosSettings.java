// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.recaptcha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnterpriseKeyIosSettings {
    /**
     * @return If set to true, it means allowed_bundle_ids will not be enforced.
     * 
     */
    private @Nullable Boolean allowAllBundleIds;
    /**
     * @return iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    private @Nullable List<String> allowedBundleIds;

    private EnterpriseKeyIosSettings() {}
    /**
     * @return If set to true, it means allowed_bundle_ids will not be enforced.
     * 
     */
    public Optional<Boolean> allowAllBundleIds() {
        return Optional.ofNullable(this.allowAllBundleIds);
    }
    /**
     * @return iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    public List<String> allowedBundleIds() {
        return this.allowedBundleIds == null ? List.of() : this.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyIosSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowAllBundleIds;
        private @Nullable List<String> allowedBundleIds;
        public Builder() {}
        public Builder(EnterpriseKeyIosSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllBundleIds = defaults.allowAllBundleIds;
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        @CustomType.Setter
        public Builder allowAllBundleIds(@Nullable Boolean allowAllBundleIds) {
            this.allowAllBundleIds = allowAllBundleIds;
            return this;
        }
        @CustomType.Setter
        public Builder allowedBundleIds(@Nullable List<String> allowedBundleIds) {
            this.allowedBundleIds = allowedBundleIds;
            return this;
        }
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }
        public EnterpriseKeyIosSettings build() {
            final var o = new EnterpriseKeyIosSettings();
            o.allowAllBundleIds = allowAllBundleIds;
            o.allowedBundleIds = allowedBundleIds;
            return o;
        }
    }
}
