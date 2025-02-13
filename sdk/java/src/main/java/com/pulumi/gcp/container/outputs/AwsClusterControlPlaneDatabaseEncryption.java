// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsClusterControlPlaneDatabaseEncryption {
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    private String kmsKeyArn;

    private AwsClusterControlPlaneDatabaseEncryption() {}
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    public String kmsKeyArn() {
        return this.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneDatabaseEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyArn;
        public Builder() {}
        public Builder(AwsClusterControlPlaneDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        @CustomType.Setter
        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        public AwsClusterControlPlaneDatabaseEncryption build() {
            final var o = new AwsClusterControlPlaneDatabaseEncryption();
            o.kmsKeyArn = kmsKeyArn;
            return o;
        }
    }
}
