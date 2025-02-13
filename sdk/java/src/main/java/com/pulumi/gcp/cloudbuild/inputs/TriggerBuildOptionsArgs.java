// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsVolumeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerBuildOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerBuildOptionsArgs Empty = new TriggerBuildOptionsArgs();

    /**
     * Requested disk size for the VM that runs the build. Note that this is NOT &#34;disk free&#34;;
     * some of the space will be used by the operating system and build utilities.
     * Also note that this is the minimum disk size that will be allocated for the build --
     * the build may run with a larger disk than requested. At present, the maximum disk size
     * is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Requested disk size for the VM that runs the build. Note that this is NOT &#34;disk free&#34;;
     * some of the space will be used by the operating system and build utilities.
     * Also note that this is the minimum disk size that will be allocated for the build --
     * the build may run with a larger disk than requested. At present, the maximum disk size
     * is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Option to specify whether or not to apply bash style string operations to the substitutions.
     * NOTE this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @Import(name="dynamicSubstitutions")
    private @Nullable Output<Boolean> dynamicSubstitutions;

    /**
     * @return Option to specify whether or not to apply bash style string operations to the substitutions.
     * NOTE this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    public Optional<Output<Boolean>> dynamicSubstitutions() {
        return Optional.ofNullable(this.dynamicSubstitutions);
    }

    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
     * 
     */
    @Import(name="envs")
    private @Nullable Output<List<String>> envs;

    /**
     * @return A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
     * 
     */
    public Optional<Output<List<String>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * Option to define build log streaming behavior to Google Cloud Storage.
     * Possible values are `STREAM_DEFAULT`, `STREAM_ON`, and `STREAM_OFF`.
     * 
     */
    @Import(name="logStreamingOption")
    private @Nullable Output<String> logStreamingOption;

    /**
     * @return Option to define build log streaming behavior to Google Cloud Storage.
     * Possible values are `STREAM_DEFAULT`, `STREAM_ON`, and `STREAM_OFF`.
     * 
     */
    public Optional<Output<String>> logStreamingOption() {
        return Optional.ofNullable(this.logStreamingOption);
    }

    /**
     * Option to specify the logging mode, which determines if and where build logs are stored.
     * Possible values are `LOGGING_UNSPECIFIED`, `LEGACY`, `GCS_ONLY`, `STACKDRIVER_ONLY`, `CLOUD_LOGGING_ONLY`, and `NONE`.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<String> logging;

    /**
     * @return Option to specify the logging mode, which determines if and where build logs are stored.
     * Possible values are `LOGGING_UNSPECIFIED`, `LEGACY`, `GCS_ONLY`, `STACKDRIVER_ONLY`, `CLOUD_LOGGING_ONLY`, and `NONE`.
     * 
     */
    public Optional<Output<String>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * Compute Engine machine type on which to run the build.
     * Possible values are `UNSPECIFIED`, `N1_HIGHCPU_8`, `N1_HIGHCPU_32`, `E2_HIGHCPU_8`, and `E2_HIGHCPU_32`.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Compute Engine machine type on which to run the build.
     * Possible values are `UNSPECIFIED`, `N1_HIGHCPU_8`, `N1_HIGHCPU_32`, `E2_HIGHCPU_8`, and `E2_HIGHCPU_32`.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Requested verifiability options.
     * Possible values are `NOT_VERIFIED` and `VERIFIED`.
     * 
     */
    @Import(name="requestedVerifyOption")
    private @Nullable Output<String> requestedVerifyOption;

    /**
     * @return Requested verifiability options.
     * Possible values are `NOT_VERIFIED` and `VERIFIED`.
     * 
     */
    public Optional<Output<String>> requestedVerifyOption() {
        return Optional.ofNullable(this.requestedVerifyOption);
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    @Import(name="secretEnvs")
    private @Nullable Output<List<String>> secretEnvs;

    /**
     * @return A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    public Optional<Output<List<String>>> secretEnvs() {
        return Optional.ofNullable(this.secretEnvs);
    }

    /**
     * Requested hash for SourceProvenance.
     * Each value may be one of `NONE`, `SHA256`, and `MD5`.
     * 
     */
    @Import(name="sourceProvenanceHashes")
    private @Nullable Output<List<String>> sourceProvenanceHashes;

    /**
     * @return Requested hash for SourceProvenance.
     * Each value may be one of `NONE`, `SHA256`, and `MD5`.
     * 
     */
    public Optional<Output<List<String>>> sourceProvenanceHashes() {
        return Optional.ofNullable(this.sourceProvenanceHashes);
    }

    /**
     * Option to specify behavior when there is an error in the substitution checks.
     * NOTE this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden
     * in the build configuration file.
     * Possible values are `MUST_MATCH` and `ALLOW_LOOSE`.
     * 
     */
    @Import(name="substitutionOption")
    private @Nullable Output<String> substitutionOption;

    /**
     * @return Option to specify behavior when there is an error in the substitution checks.
     * NOTE this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden
     * in the build configuration file.
     * Possible values are `MUST_MATCH` and `ALLOW_LOOSE`.
     * 
     */
    public Optional<Output<String>> substitutionOption() {
        return Optional.ofNullable(this.substitutionOption);
    }

    /**
     * Global list of volumes to mount for ALL build steps
     * Each volume is created as an empty volume prior to starting the build process.
     * Upon completion of the build, volumes and their contents are discarded. Global
     * volume names and paths cannot conflict with the volumes defined a build step.
     * Using a global volume in a build with only one step is not valid as it is indicative
     * of a build request with an incorrect configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<TriggerBuildOptionsVolumeArgs>> volumes;

    /**
     * @return Global list of volumes to mount for ALL build steps
     * Each volume is created as an empty volume prior to starting the build process.
     * Upon completion of the build, volumes and their contents are discarded. Global
     * volume names and paths cannot conflict with the volumes defined a build step.
     * Using a global volume in a build with only one step is not valid as it is indicative
     * of a build request with an incorrect configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<TriggerBuildOptionsVolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    /**
     * Option to specify a WorkerPool for the build. Format projects/{project}/workerPools/{workerPool}
     * This field is experimental.
     * 
     */
    @Import(name="workerPool")
    private @Nullable Output<String> workerPool;

    /**
     * @return Option to specify a WorkerPool for the build. Format projects/{project}/workerPools/{workerPool}
     * This field is experimental.
     * 
     */
    public Optional<Output<String>> workerPool() {
        return Optional.ofNullable(this.workerPool);
    }

    private TriggerBuildOptionsArgs() {}

    private TriggerBuildOptionsArgs(TriggerBuildOptionsArgs $) {
        this.diskSizeGb = $.diskSizeGb;
        this.dynamicSubstitutions = $.dynamicSubstitutions;
        this.envs = $.envs;
        this.logStreamingOption = $.logStreamingOption;
        this.logging = $.logging;
        this.machineType = $.machineType;
        this.requestedVerifyOption = $.requestedVerifyOption;
        this.secretEnvs = $.secretEnvs;
        this.sourceProvenanceHashes = $.sourceProvenanceHashes;
        this.substitutionOption = $.substitutionOption;
        this.volumes = $.volumes;
        this.workerPool = $.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerBuildOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerBuildOptionsArgs $;

        public Builder() {
            $ = new TriggerBuildOptionsArgs();
        }

        public Builder(TriggerBuildOptionsArgs defaults) {
            $ = new TriggerBuildOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskSizeGb Requested disk size for the VM that runs the build. Note that this is NOT &#34;disk free&#34;;
         * some of the space will be used by the operating system and build utilities.
         * Also note that this is the minimum disk size that will be allocated for the build --
         * the build may run with a larger disk than requested. At present, the maximum disk size
         * is 1000GB; builds that request more than the maximum are rejected with an error.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Requested disk size for the VM that runs the build. Note that this is NOT &#34;disk free&#34;;
         * some of the space will be used by the operating system and build utilities.
         * Also note that this is the minimum disk size that will be allocated for the build --
         * the build may run with a larger disk than requested. At present, the maximum disk size
         * is 1000GB; builds that request more than the maximum are rejected with an error.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param dynamicSubstitutions Option to specify whether or not to apply bash style string operations to the substitutions.
         * NOTE this is always enabled for triggered builds and cannot be overridden in the build configuration file.
         * 
         * @return builder
         * 
         */
        public Builder dynamicSubstitutions(@Nullable Output<Boolean> dynamicSubstitutions) {
            $.dynamicSubstitutions = dynamicSubstitutions;
            return this;
        }

        /**
         * @param dynamicSubstitutions Option to specify whether or not to apply bash style string operations to the substitutions.
         * NOTE this is always enabled for triggered builds and cannot be overridden in the build configuration file.
         * 
         * @return builder
         * 
         */
        public Builder dynamicSubstitutions(Boolean dynamicSubstitutions) {
            return dynamicSubstitutions(Output.of(dynamicSubstitutions));
        }

        /**
         * @param envs A list of global environment variable definitions that will exist for all build steps
         * in this build. If a variable is defined in both globally and in a build step,
         * the variable will use the build step value.
         * The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder envs(@Nullable Output<List<String>> envs) {
            $.envs = envs;
            return this;
        }

        /**
         * @param envs A list of global environment variable definitions that will exist for all build steps
         * in this build. If a variable is defined in both globally and in a build step,
         * the variable will use the build step value.
         * The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder envs(List<String> envs) {
            return envs(Output.of(envs));
        }

        /**
         * @param envs A list of global environment variable definitions that will exist for all build steps
         * in this build. If a variable is defined in both globally and in a build step,
         * the variable will use the build step value.
         * The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder envs(String... envs) {
            return envs(List.of(envs));
        }

        /**
         * @param logStreamingOption Option to define build log streaming behavior to Google Cloud Storage.
         * Possible values are `STREAM_DEFAULT`, `STREAM_ON`, and `STREAM_OFF`.
         * 
         * @return builder
         * 
         */
        public Builder logStreamingOption(@Nullable Output<String> logStreamingOption) {
            $.logStreamingOption = logStreamingOption;
            return this;
        }

        /**
         * @param logStreamingOption Option to define build log streaming behavior to Google Cloud Storage.
         * Possible values are `STREAM_DEFAULT`, `STREAM_ON`, and `STREAM_OFF`.
         * 
         * @return builder
         * 
         */
        public Builder logStreamingOption(String logStreamingOption) {
            return logStreamingOption(Output.of(logStreamingOption));
        }

        /**
         * @param logging Option to specify the logging mode, which determines if and where build logs are stored.
         * Possible values are `LOGGING_UNSPECIFIED`, `LEGACY`, `GCS_ONLY`, `STACKDRIVER_ONLY`, `CLOUD_LOGGING_ONLY`, and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<String> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging Option to specify the logging mode, which determines if and where build logs are stored.
         * Possible values are `LOGGING_UNSPECIFIED`, `LEGACY`, `GCS_ONLY`, `STACKDRIVER_ONLY`, `CLOUD_LOGGING_ONLY`, and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder logging(String logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param machineType Compute Engine machine type on which to run the build.
         * Possible values are `UNSPECIFIED`, `N1_HIGHCPU_8`, `N1_HIGHCPU_32`, `E2_HIGHCPU_8`, and `E2_HIGHCPU_32`.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Compute Engine machine type on which to run the build.
         * Possible values are `UNSPECIFIED`, `N1_HIGHCPU_8`, `N1_HIGHCPU_32`, `E2_HIGHCPU_8`, and `E2_HIGHCPU_32`.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param requestedVerifyOption Requested verifiability options.
         * Possible values are `NOT_VERIFIED` and `VERIFIED`.
         * 
         * @return builder
         * 
         */
        public Builder requestedVerifyOption(@Nullable Output<String> requestedVerifyOption) {
            $.requestedVerifyOption = requestedVerifyOption;
            return this;
        }

        /**
         * @param requestedVerifyOption Requested verifiability options.
         * Possible values are `NOT_VERIFIED` and `VERIFIED`.
         * 
         * @return builder
         * 
         */
        public Builder requestedVerifyOption(String requestedVerifyOption) {
            return requestedVerifyOption(Output.of(requestedVerifyOption));
        }

        /**
         * @param secretEnvs A list of global environment variables, which are encrypted using a Cloud Key Management
         * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
         * will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvs(@Nullable Output<List<String>> secretEnvs) {
            $.secretEnvs = secretEnvs;
            return this;
        }

        /**
         * @param secretEnvs A list of global environment variables, which are encrypted using a Cloud Key Management
         * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
         * will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvs(List<String> secretEnvs) {
            return secretEnvs(Output.of(secretEnvs));
        }

        /**
         * @param secretEnvs A list of global environment variables, which are encrypted using a Cloud Key Management
         * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
         * will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvs(String... secretEnvs) {
            return secretEnvs(List.of(secretEnvs));
        }

        /**
         * @param sourceProvenanceHashes Requested hash for SourceProvenance.
         * Each value may be one of `NONE`, `SHA256`, and `MD5`.
         * 
         * @return builder
         * 
         */
        public Builder sourceProvenanceHashes(@Nullable Output<List<String>> sourceProvenanceHashes) {
            $.sourceProvenanceHashes = sourceProvenanceHashes;
            return this;
        }

        /**
         * @param sourceProvenanceHashes Requested hash for SourceProvenance.
         * Each value may be one of `NONE`, `SHA256`, and `MD5`.
         * 
         * @return builder
         * 
         */
        public Builder sourceProvenanceHashes(List<String> sourceProvenanceHashes) {
            return sourceProvenanceHashes(Output.of(sourceProvenanceHashes));
        }

        /**
         * @param sourceProvenanceHashes Requested hash for SourceProvenance.
         * Each value may be one of `NONE`, `SHA256`, and `MD5`.
         * 
         * @return builder
         * 
         */
        public Builder sourceProvenanceHashes(String... sourceProvenanceHashes) {
            return sourceProvenanceHashes(List.of(sourceProvenanceHashes));
        }

        /**
         * @param substitutionOption Option to specify behavior when there is an error in the substitution checks.
         * NOTE this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden
         * in the build configuration file.
         * Possible values are `MUST_MATCH` and `ALLOW_LOOSE`.
         * 
         * @return builder
         * 
         */
        public Builder substitutionOption(@Nullable Output<String> substitutionOption) {
            $.substitutionOption = substitutionOption;
            return this;
        }

        /**
         * @param substitutionOption Option to specify behavior when there is an error in the substitution checks.
         * NOTE this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden
         * in the build configuration file.
         * Possible values are `MUST_MATCH` and `ALLOW_LOOSE`.
         * 
         * @return builder
         * 
         */
        public Builder substitutionOption(String substitutionOption) {
            return substitutionOption(Output.of(substitutionOption));
        }

        /**
         * @param volumes Global list of volumes to mount for ALL build steps
         * Each volume is created as an empty volume prior to starting the build process.
         * Upon completion of the build, volumes and their contents are discarded. Global
         * volume names and paths cannot conflict with the volumes defined a build step.
         * Using a global volume in a build with only one step is not valid as it is indicative
         * of a build request with an incorrect configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<TriggerBuildOptionsVolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes Global list of volumes to mount for ALL build steps
         * Each volume is created as an empty volume prior to starting the build process.
         * Upon completion of the build, volumes and their contents are discarded. Global
         * volume names and paths cannot conflict with the volumes defined a build step.
         * Using a global volume in a build with only one step is not valid as it is indicative
         * of a build request with an incorrect configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<TriggerBuildOptionsVolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes Global list of volumes to mount for ALL build steps
         * Each volume is created as an empty volume prior to starting the build process.
         * Upon completion of the build, volumes and their contents are discarded. Global
         * volume names and paths cannot conflict with the volumes defined a build step.
         * Using a global volume in a build with only one step is not valid as it is indicative
         * of a build request with an incorrect configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(TriggerBuildOptionsVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        /**
         * @param workerPool Option to specify a WorkerPool for the build. Format projects/{project}/workerPools/{workerPool}
         * This field is experimental.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(@Nullable Output<String> workerPool) {
            $.workerPool = workerPool;
            return this;
        }

        /**
         * @param workerPool Option to specify a WorkerPool for the build. Format projects/{project}/workerPools/{workerPool}
         * This field is experimental.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(String workerPool) {
            return workerPool(Output.of(workerPool));
        }

        public TriggerBuildOptionsArgs build() {
            return $;
        }
    }

}
