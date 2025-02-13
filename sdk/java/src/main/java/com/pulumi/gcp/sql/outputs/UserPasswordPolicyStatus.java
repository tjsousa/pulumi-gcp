// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPasswordPolicyStatus {
    /**
     * @return If true, user does not have login privileges.
     * 
     */
    private @Nullable Boolean locked;
    /**
     * @return Password expiration duration with one week grace period.
     * 
     */
    private @Nullable String passwordExpirationTime;

    private UserPasswordPolicyStatus() {}
    /**
     * @return If true, user does not have login privileges.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    /**
     * @return Password expiration duration with one week grace period.
     * 
     */
    public Optional<String> passwordExpirationTime() {
        return Optional.ofNullable(this.passwordExpirationTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPasswordPolicyStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String passwordExpirationTime;
        public Builder() {}
        public Builder(UserPasswordPolicyStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.passwordExpirationTime = defaults.passwordExpirationTime;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder passwordExpirationTime(@Nullable String passwordExpirationTime) {
            this.passwordExpirationTime = passwordExpirationTime;
            return this;
        }
        public UserPasswordPolicyStatus build() {
            final var o = new UserPasswordPolicyStatus();
            o.locked = locked;
            o.passwordExpirationTime = passwordExpirationTime;
            return o;
        }
    }
}
