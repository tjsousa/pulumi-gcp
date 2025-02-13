// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabaseResult {
    private String charset;
    private String collation;
    private String deletionPolicy;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instance;
    private String name;
    private @Nullable String project;
    private String selfLink;

    private GetDatabaseResult() {}
    public String charset() {
        return this.charset;
    }
    public String collation() {
        return this.collation;
    }
    public String deletionPolicy() {
        return this.deletionPolicy;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instance() {
        return this.instance;
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

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String charset;
        private String collation;
        private String deletionPolicy;
        private String id;
        private String instance;
        private String name;
        private @Nullable String project;
        private String selfLink;
        public Builder() {}
        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.collation = defaults.collation;
    	      this.deletionPolicy = defaults.deletionPolicy;
    	      this.id = defaults.id;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        @CustomType.Setter
        public Builder charset(String charset) {
            this.charset = Objects.requireNonNull(charset);
            return this;
        }
        @CustomType.Setter
        public Builder collation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }
        @CustomType.Setter
        public Builder deletionPolicy(String deletionPolicy) {
            this.deletionPolicy = Objects.requireNonNull(deletionPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
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
        public GetDatabaseResult build() {
            final var o = new GetDatabaseResult();
            o.charset = charset;
            o.collation = collation;
            o.deletionPolicy = deletionPolicy;
            o.id = id;
            o.instance = instance;
            o.name = name;
            o.project = project;
            o.selfLink = selfLink;
            return o;
        }
    }
}
