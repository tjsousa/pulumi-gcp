// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions {
    /**
     * @return Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    private @Nullable String target;
    /**
     * @return Type of the redirect action.
     * 
     */
    private String type;

    private SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions() {}
    /**
     * @return Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * @return Type of the redirect action.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String target;
        private String type;
        public Builder() {}
        public Builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions build() {
            final var o = new SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions();
            o.target = target;
            o.type = type;
            return o;
        }
    }
}
