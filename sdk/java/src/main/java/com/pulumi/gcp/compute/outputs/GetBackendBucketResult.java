// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendBucketCdnPolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackendBucketResult {
    private String bucketName;
    private List<GetBackendBucketCdnPolicy> cdnPolicies;
    private String compressionMode;
    private String creationTimestamp;
    private List<String> customResponseHeaders;
    private String description;
    private String edgeSecurityPolicy;
    private Boolean enableCdn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private @Nullable String project;
    private String selfLink;

    private GetBackendBucketResult() {}
    public String bucketName() {
        return this.bucketName;
    }
    public List<GetBackendBucketCdnPolicy> cdnPolicies() {
        return this.cdnPolicies;
    }
    public String compressionMode() {
        return this.compressionMode;
    }
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    public List<String> customResponseHeaders() {
        return this.customResponseHeaders;
    }
    public String description() {
        return this.description;
    }
    public String edgeSecurityPolicy() {
        return this.edgeSecurityPolicy;
    }
    public Boolean enableCdn() {
        return this.enableCdn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String selfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private List<GetBackendBucketCdnPolicy> cdnPolicies;
        private String compressionMode;
        private String creationTimestamp;
        private List<String> customResponseHeaders;
        private String description;
        private String edgeSecurityPolicy;
        private Boolean enableCdn;
        private String id;
        private String name;
        private @Nullable String project;
        private String selfLink;
        public Builder() {}
        public Builder(GetBackendBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cdnPolicies = defaults.cdnPolicies;
    	      this.compressionMode = defaults.compressionMode;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.edgeSecurityPolicy = defaults.edgeSecurityPolicy;
    	      this.enableCdn = defaults.enableCdn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder cdnPolicies(List<GetBackendBucketCdnPolicy> cdnPolicies) {
            this.cdnPolicies = Objects.requireNonNull(cdnPolicies);
            return this;
        }
        public Builder cdnPolicies(GetBackendBucketCdnPolicy... cdnPolicies) {
            return cdnPolicies(List.of(cdnPolicies));
        }
        @CustomType.Setter
        public Builder compressionMode(String compressionMode) {
            this.compressionMode = Objects.requireNonNull(compressionMode);
            return this;
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        @CustomType.Setter
        public Builder customResponseHeaders(List<String> customResponseHeaders) {
            this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
            return this;
        }
        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder edgeSecurityPolicy(String edgeSecurityPolicy) {
            this.edgeSecurityPolicy = Objects.requireNonNull(edgeSecurityPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder enableCdn(Boolean enableCdn) {
            this.enableCdn = Objects.requireNonNull(enableCdn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetBackendBucketResult build() {
            final var o = new GetBackendBucketResult();
            o.bucketName = bucketName;
            o.cdnPolicies = cdnPolicies;
            o.compressionMode = compressionMode;
            o.creationTimestamp = creationTimestamp;
            o.customResponseHeaders = customResponseHeaders;
            o.description = description;
            o.edgeSecurityPolicy = edgeSecurityPolicy;
            o.enableCdn = enableCdn;
            o.id = id;
            o.name = name;
            o.project = project;
            o.selfLink = selfLink;
            return o;
        }
    }
}
