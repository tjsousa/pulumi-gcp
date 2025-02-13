// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.firebase.inputs.HostingVersionConfigRewriteRunArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingVersionConfigRewriteArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingVersionConfigRewriteArgs Empty = new HostingVersionConfigRewriteArgs();

    /**
     * The function to proxy requests to. Must match the exported function name exactly.
     * 
     */
    @Import(name="function")
    private @Nullable Output<String> function;

    /**
     * @return The function to proxy requests to. Must match the exported function name exactly.
     * 
     */
    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
    }

    /**
     * The user-supplied glob to match against the request URL path.
     * 
     */
    @Import(name="glob")
    private @Nullable Output<String> glob;

    /**
     * @return The user-supplied glob to match against the request URL path.
     * 
     */
    public Optional<Output<String>> glob() {
        return Optional.ofNullable(this.glob);
    }

    /**
     * The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * The request will be forwarded to Cloud Run.
     * Structure is documented below.
     * 
     */
    @Import(name="run")
    private @Nullable Output<HostingVersionConfigRewriteRunArgs> run;

    /**
     * @return The request will be forwarded to Cloud Run.
     * Structure is documented below.
     * 
     */
    public Optional<Output<HostingVersionConfigRewriteRunArgs>> run() {
        return Optional.ofNullable(this.run);
    }

    private HostingVersionConfigRewriteArgs() {}

    private HostingVersionConfigRewriteArgs(HostingVersionConfigRewriteArgs $) {
        this.function = $.function;
        this.glob = $.glob;
        this.regex = $.regex;
        this.run = $.run;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingVersionConfigRewriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingVersionConfigRewriteArgs $;

        public Builder() {
            $ = new HostingVersionConfigRewriteArgs();
        }

        public Builder(HostingVersionConfigRewriteArgs defaults) {
            $ = new HostingVersionConfigRewriteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param function The function to proxy requests to. Must match the exported function name exactly.
         * 
         * @return builder
         * 
         */
        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function The function to proxy requests to. Must match the exported function name exactly.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
        }

        /**
         * @param glob The user-supplied glob to match against the request URL path.
         * 
         * @return builder
         * 
         */
        public Builder glob(@Nullable Output<String> glob) {
            $.glob = glob;
            return this;
        }

        /**
         * @param glob The user-supplied glob to match against the request URL path.
         * 
         * @return builder
         * 
         */
        public Builder glob(String glob) {
            return glob(Output.of(glob));
        }

        /**
         * @param regex The user-supplied RE2 regular expression to match against the request URL path.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex The user-supplied RE2 regular expression to match against the request URL path.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param run The request will be forwarded to Cloud Run.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder run(@Nullable Output<HostingVersionConfigRewriteRunArgs> run) {
            $.run = run;
            return this;
        }

        /**
         * @param run The request will be forwarded to Cloud Run.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder run(HostingVersionConfigRewriteRunArgs run) {
            return run(Output.of(run));
        }

        public HostingVersionConfigRewriteArgs build() {
            return $;
        }
    }

}
