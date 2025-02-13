// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * The App Engine integration mode to use for this database.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    @Import(name="appEngineIntegrationMode")
    private @Nullable Output<String> appEngineIntegrationMode;

    /**
     * @return The App Engine integration mode to use for this database.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    public Optional<Output<String>> appEngineIntegrationMode() {
        return Optional.ofNullable(this.appEngineIntegrationMode);
    }

    /**
     * The concurrency control mode to use for this database.
     * Possible values are `OPTIMISTIC`, `PESSIMISTIC`, and `OPTIMISTIC_WITH_ENTITY_GROUPS`.
     * 
     */
    @Import(name="concurrencyMode")
    private @Nullable Output<String> concurrencyMode;

    /**
     * @return The concurrency control mode to use for this database.
     * Possible values are `OPTIMISTIC`, `PESSIMISTIC`, and `OPTIMISTIC_WITH_ENTITY_GROUPS`.
     * 
     */
    public Optional<Output<String>> concurrencyMode() {
        return Optional.ofNullable(this.concurrencyMode);
    }

    /**
     * The location of the database. Available databases are listed at
     * https://cloud.google.com/firestore/docs/locations.
     * 
     */
    @Import(name="locationId", required=true)
    private Output<String> locationId;

    /**
     * @return The location of the database. Available databases are listed at
     * https://cloud.google.com/firestore/docs/locations.
     * 
     */
    public Output<String> locationId() {
        return this.locationId;
    }

    /**
     * Required. The ID to use for the database, which will become the final
     * component of the database&#39;s resource name. This value should be 4-63
     * characters. Valid characters are /[a-z][0-9]-/ with first character
     * a letter and the last a letter or a number. Must not be
     * UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * &#34;(default)&#34; database id is also valid.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required. The ID to use for the database, which will become the final
     * component of the database&#39;s resource name. This value should be 4-63
     * characters. Valid characters are /[a-z][0-9]-/ with first character
     * a letter and the last a letter or a number. Must not be
     * UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * &#34;(default)&#34; database id is also valid.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The type of the database.
     * See https://cloud.google.com/datastore/docs/firestore-or-datastore
     * for information about how to choose.
     * Possible values are `FIRESTORE_NATIVE` and `DATASTORE_MODE`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the database.
     * See https://cloud.google.com/datastore/docs/firestore-or-datastore
     * for information about how to choose.
     * Possible values are `FIRESTORE_NATIVE` and `DATASTORE_MODE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.appEngineIntegrationMode = $.appEngineIntegrationMode;
        this.concurrencyMode = $.concurrencyMode;
        this.locationId = $.locationId;
        this.name = $.name;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineIntegrationMode The App Engine integration mode to use for this database.
         * Possible values are `ENABLED` and `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder appEngineIntegrationMode(@Nullable Output<String> appEngineIntegrationMode) {
            $.appEngineIntegrationMode = appEngineIntegrationMode;
            return this;
        }

        /**
         * @param appEngineIntegrationMode The App Engine integration mode to use for this database.
         * Possible values are `ENABLED` and `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder appEngineIntegrationMode(String appEngineIntegrationMode) {
            return appEngineIntegrationMode(Output.of(appEngineIntegrationMode));
        }

        /**
         * @param concurrencyMode The concurrency control mode to use for this database.
         * Possible values are `OPTIMISTIC`, `PESSIMISTIC`, and `OPTIMISTIC_WITH_ENTITY_GROUPS`.
         * 
         * @return builder
         * 
         */
        public Builder concurrencyMode(@Nullable Output<String> concurrencyMode) {
            $.concurrencyMode = concurrencyMode;
            return this;
        }

        /**
         * @param concurrencyMode The concurrency control mode to use for this database.
         * Possible values are `OPTIMISTIC`, `PESSIMISTIC`, and `OPTIMISTIC_WITH_ENTITY_GROUPS`.
         * 
         * @return builder
         * 
         */
        public Builder concurrencyMode(String concurrencyMode) {
            return concurrencyMode(Output.of(concurrencyMode));
        }

        /**
         * @param locationId The location of the database. Available databases are listed at
         * https://cloud.google.com/firestore/docs/locations.
         * 
         * @return builder
         * 
         */
        public Builder locationId(Output<String> locationId) {
            $.locationId = locationId;
            return this;
        }

        /**
         * @param locationId The location of the database. Available databases are listed at
         * https://cloud.google.com/firestore/docs/locations.
         * 
         * @return builder
         * 
         */
        public Builder locationId(String locationId) {
            return locationId(Output.of(locationId));
        }

        /**
         * @param name Required. The ID to use for the database, which will become the final
         * component of the database&#39;s resource name. This value should be 4-63
         * characters. Valid characters are /[a-z][0-9]-/ with first character
         * a letter and the last a letter or a number. Must not be
         * UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
         * &#34;(default)&#34; database id is also valid.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required. The ID to use for the database, which will become the final
         * component of the database&#39;s resource name. This value should be 4-63
         * characters. Valid characters are /[a-z][0-9]-/ with first character
         * a letter and the last a letter or a number. Must not be
         * UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
         * &#34;(default)&#34; database id is also valid.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param type The type of the database.
         * See https://cloud.google.com/datastore/docs/firestore-or-datastore
         * for information about how to choose.
         * Possible values are `FIRESTORE_NATIVE` and `DATASTORE_MODE`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the database.
         * See https://cloud.google.com/datastore/docs/firestore-or-datastore
         * for information about how to choose.
         * Possible values are `FIRESTORE_NATIVE` and `DATASTORE_MODE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DatabaseArgs build() {
            $.locationId = Objects.requireNonNull($.locationId, "expected parameter 'locationId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
