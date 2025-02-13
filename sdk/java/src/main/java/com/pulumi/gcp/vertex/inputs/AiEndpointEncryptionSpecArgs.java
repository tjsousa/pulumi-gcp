// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AiEndpointEncryptionSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiEndpointEncryptionSpecArgs Empty = new AiEndpointEncryptionSpecArgs();

    /**
     * Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. The key needs to be in the same region as where the compute resource is created.
     * 
     */
    @Import(name="kmsKeyName", required=true)
    private Output<String> kmsKeyName;

    /**
     * @return Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. The key needs to be in the same region as where the compute resource is created.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    private AiEndpointEncryptionSpecArgs() {}

    private AiEndpointEncryptionSpecArgs(AiEndpointEncryptionSpecArgs $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiEndpointEncryptionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiEndpointEncryptionSpecArgs $;

        public Builder() {
            $ = new AiEndpointEncryptionSpecArgs();
        }

        public Builder(AiEndpointEncryptionSpecArgs defaults) {
            $ = new AiEndpointEncryptionSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. The key needs to be in the same region as where the compute resource is created.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. The key needs to be in the same region as where the compute resource is created.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public AiEndpointEncryptionSpecArgs build() {
            $.kmsKeyName = Objects.requireNonNull($.kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
            return $;
        }
    }

}
