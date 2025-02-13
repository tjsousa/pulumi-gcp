// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerSourceToBuildArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerSourceToBuildArgs Empty = new TriggerSourceToBuildArgs();

    /**
     * The full resource name of the github enterprise config.
     * Format: projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}. projects/{project}/githubEnterpriseConfigs/{id}.
     * 
     */
    @Import(name="githubEnterpriseConfig")
    private @Nullable Output<String> githubEnterpriseConfig;

    /**
     * @return The full resource name of the github enterprise config.
     * Format: projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}. projects/{project}/githubEnterpriseConfigs/{id}.
     * 
     */
    public Optional<Output<String>> githubEnterpriseConfig() {
        return Optional.ofNullable(this.githubEnterpriseConfig);
    }

    /**
     * The branch or tag to use. Must start with &#34;refs/&#34; (required).
     * 
     */
    @Import(name="ref", required=true)
    private Output<String> ref;

    /**
     * @return The branch or tag to use. Must start with &#34;refs/&#34; (required).
     * 
     */
    public Output<String> ref() {
        return this.ref;
    }

    /**
     * The type of the repo, since it may not be explicit from the repo field (e.g from a URL).
     * Values can be UNKNOWN, CLOUD_SOURCE_REPOSITORIES, GITHUB, BITBUCKET_SERVER
     * Possible values are `UNKNOWN`, `CLOUD_SOURCE_REPOSITORIES`, `GITHUB`, and `BITBUCKET_SERVER`.
     * 
     */
    @Import(name="repoType", required=true)
    private Output<String> repoType;

    /**
     * @return The type of the repo, since it may not be explicit from the repo field (e.g from a URL).
     * Values can be UNKNOWN, CLOUD_SOURCE_REPOSITORIES, GITHUB, BITBUCKET_SERVER
     * Possible values are `UNKNOWN`, `CLOUD_SOURCE_REPOSITORIES`, `GITHUB`, and `BITBUCKET_SERVER`.
     * 
     */
    public Output<String> repoType() {
        return this.repoType;
    }

    /**
     * The URI of the repo (required).
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The URI of the repo (required).
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private TriggerSourceToBuildArgs() {}

    private TriggerSourceToBuildArgs(TriggerSourceToBuildArgs $) {
        this.githubEnterpriseConfig = $.githubEnterpriseConfig;
        this.ref = $.ref;
        this.repoType = $.repoType;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerSourceToBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerSourceToBuildArgs $;

        public Builder() {
            $ = new TriggerSourceToBuildArgs();
        }

        public Builder(TriggerSourceToBuildArgs defaults) {
            $ = new TriggerSourceToBuildArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param githubEnterpriseConfig The full resource name of the github enterprise config.
         * Format: projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}. projects/{project}/githubEnterpriseConfigs/{id}.
         * 
         * @return builder
         * 
         */
        public Builder githubEnterpriseConfig(@Nullable Output<String> githubEnterpriseConfig) {
            $.githubEnterpriseConfig = githubEnterpriseConfig;
            return this;
        }

        /**
         * @param githubEnterpriseConfig The full resource name of the github enterprise config.
         * Format: projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}. projects/{project}/githubEnterpriseConfigs/{id}.
         * 
         * @return builder
         * 
         */
        public Builder githubEnterpriseConfig(String githubEnterpriseConfig) {
            return githubEnterpriseConfig(Output.of(githubEnterpriseConfig));
        }

        /**
         * @param ref The branch or tag to use. Must start with &#34;refs/&#34; (required).
         * 
         * @return builder
         * 
         */
        public Builder ref(Output<String> ref) {
            $.ref = ref;
            return this;
        }

        /**
         * @param ref The branch or tag to use. Must start with &#34;refs/&#34; (required).
         * 
         * @return builder
         * 
         */
        public Builder ref(String ref) {
            return ref(Output.of(ref));
        }

        /**
         * @param repoType The type of the repo, since it may not be explicit from the repo field (e.g from a URL).
         * Values can be UNKNOWN, CLOUD_SOURCE_REPOSITORIES, GITHUB, BITBUCKET_SERVER
         * Possible values are `UNKNOWN`, `CLOUD_SOURCE_REPOSITORIES`, `GITHUB`, and `BITBUCKET_SERVER`.
         * 
         * @return builder
         * 
         */
        public Builder repoType(Output<String> repoType) {
            $.repoType = repoType;
            return this;
        }

        /**
         * @param repoType The type of the repo, since it may not be explicit from the repo field (e.g from a URL).
         * Values can be UNKNOWN, CLOUD_SOURCE_REPOSITORIES, GITHUB, BITBUCKET_SERVER
         * Possible values are `UNKNOWN`, `CLOUD_SOURCE_REPOSITORIES`, `GITHUB`, and `BITBUCKET_SERVER`.
         * 
         * @return builder
         * 
         */
        public Builder repoType(String repoType) {
            return repoType(Output.of(repoType));
        }

        /**
         * @param uri The URI of the repo (required).
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI of the repo (required).
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public TriggerSourceToBuildArgs build() {
            $.ref = Objects.requireNonNull($.ref, "expected parameter 'ref' to be non-null");
            $.repoType = Objects.requireNonNull($.repoType, "expected parameter 'repoType' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
