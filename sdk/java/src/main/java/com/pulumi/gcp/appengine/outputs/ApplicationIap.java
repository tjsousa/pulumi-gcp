// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationIap {
    /**
     * @return (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * (default is false)
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return OAuth2 client ID to use for the authentication flow.
     * 
     */
    private String oauth2ClientId;
    /**
     * @return OAuth2 client secret to use for the authentication flow.
     * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
     * 
     */
    private String oauth2ClientSecret;
    /**
     * @return Hex-encoded SHA-256 hash of the client secret.
     * 
     */
    private @Nullable String oauth2ClientSecretSha256;

    private ApplicationIap() {}
    /**
     * @return (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * (default is false)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return OAuth2 client ID to use for the authentication flow.
     * 
     */
    public String oauth2ClientId() {
        return this.oauth2ClientId;
    }
    /**
     * @return OAuth2 client secret to use for the authentication flow.
     * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
     * 
     */
    public String oauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }
    /**
     * @return Hex-encoded SHA-256 hash of the client secret.
     * 
     */
    public Optional<String> oauth2ClientSecretSha256() {
        return Optional.ofNullable(this.oauth2ClientSecretSha256);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationIap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private String oauth2ClientId;
        private String oauth2ClientSecret;
        private @Nullable String oauth2ClientSecretSha256;
        public Builder() {}
        public Builder(ApplicationIap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder oauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }
        @CustomType.Setter
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder oauth2ClientSecretSha256(@Nullable String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }
        public ApplicationIap build() {
            final var o = new ApplicationIap();
            o.enabled = enabled;
            o.oauth2ClientId = oauth2ClientId;
            o.oauth2ClientSecret = oauth2ClientSecret;
            o.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return o;
        }
    }
}
