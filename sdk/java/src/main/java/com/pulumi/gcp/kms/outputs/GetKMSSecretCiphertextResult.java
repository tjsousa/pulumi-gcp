// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKMSSecretCiphertextResult {
    /**
     * @return Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    private String ciphertext;
    private String cryptoKey;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String plaintext;

    private GetKMSSecretCiphertextResult() {}
    /**
     * @return Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    public String ciphertext() {
        return this.ciphertext;
    }
    public String cryptoKey() {
        return this.cryptoKey;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String plaintext() {
        return this.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSSecretCiphertextResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ciphertext;
        private String cryptoKey;
        private String id;
        private String plaintext;
        public Builder() {}
        public Builder(GetKMSSecretCiphertextResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphertext = defaults.ciphertext;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.id = defaults.id;
    	      this.plaintext = defaults.plaintext;
        }

        @CustomType.Setter
        public Builder ciphertext(String ciphertext) {
            this.ciphertext = Objects.requireNonNull(ciphertext);
            return this;
        }
        @CustomType.Setter
        public Builder cryptoKey(String cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder plaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }
        public GetKMSSecretCiphertextResult build() {
            final var o = new GetKMSSecretCiphertextResult();
            o.ciphertext = ciphertext;
            o.cryptoKey = cryptoKey;
            o.id = id;
            o.plaintext = plaintext;
            return o;
        }
    }
}
