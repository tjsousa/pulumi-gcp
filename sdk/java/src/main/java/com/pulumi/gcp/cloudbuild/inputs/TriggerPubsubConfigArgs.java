// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerPubsubConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerPubsubConfigArgs Empty = new TriggerPubsubConfigArgs();

    /**
     * Service account that will make the push request.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    /**
     * @return Service account that will make the push request.
     * 
     */
    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    /**
     * (Output)
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * (Output)
     * Output only. Name of the subscription.
     * 
     */
    @Import(name="subscription")
    private @Nullable Output<String> subscription;

    /**
     * @return (Output)
     * Output only. Name of the subscription.
     * 
     */
    public Optional<Output<String>> subscription() {
        return Optional.ofNullable(this.subscription);
    }

    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return The name of the topic from which this subscription is receiving messages.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    private TriggerPubsubConfigArgs() {}

    private TriggerPubsubConfigArgs(TriggerPubsubConfigArgs $) {
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.state = $.state;
        this.subscription = $.subscription;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerPubsubConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerPubsubConfigArgs $;

        public Builder() {
            $ = new TriggerPubsubConfigArgs();
        }

        public Builder(TriggerPubsubConfigArgs defaults) {
            $ = new TriggerPubsubConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceAccountEmail Service account that will make the push request.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail Service account that will make the push request.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param state (Output)
         * Potential issues with the underlying Pub/Sub subscription configuration.
         * Only populated on get requests.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Output)
         * Potential issues with the underlying Pub/Sub subscription configuration.
         * Only populated on get requests.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subscription (Output)
         * Output only. Name of the subscription.
         * 
         * @return builder
         * 
         */
        public Builder subscription(@Nullable Output<String> subscription) {
            $.subscription = subscription;
            return this;
        }

        /**
         * @param subscription (Output)
         * Output only. Name of the subscription.
         * 
         * @return builder
         * 
         */
        public Builder subscription(String subscription) {
            return subscription(Output.of(subscription));
        }

        /**
         * @param topic The name of the topic from which this subscription is receiving messages.
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The name of the topic from which this subscription is receiving messages.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public TriggerPubsubConfigArgs build() {
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
