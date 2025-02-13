// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectAccessControlProjectTeamArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectAccessControlProjectTeamArgs Empty = new ObjectAccessControlProjectTeamArgs();

    /**
     * The project team associated with the entity
     * 
     */
    @Import(name="projectNumber")
    private @Nullable Output<String> projectNumber;

    /**
     * @return The project team associated with the entity
     * 
     */
    public Optional<Output<String>> projectNumber() {
        return Optional.ofNullable(this.projectNumber);
    }

    /**
     * The team.
     * Possible values are `editors`, `owners`, and `viewers`.
     * 
     */
    @Import(name="team")
    private @Nullable Output<String> team;

    /**
     * @return The team.
     * Possible values are `editors`, `owners`, and `viewers`.
     * 
     */
    public Optional<Output<String>> team() {
        return Optional.ofNullable(this.team);
    }

    private ObjectAccessControlProjectTeamArgs() {}

    private ObjectAccessControlProjectTeamArgs(ObjectAccessControlProjectTeamArgs $) {
        this.projectNumber = $.projectNumber;
        this.team = $.team;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectAccessControlProjectTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectAccessControlProjectTeamArgs $;

        public Builder() {
            $ = new ObjectAccessControlProjectTeamArgs();
        }

        public Builder(ObjectAccessControlProjectTeamArgs defaults) {
            $ = new ObjectAccessControlProjectTeamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectNumber The project team associated with the entity
         * 
         * @return builder
         * 
         */
        public Builder projectNumber(@Nullable Output<String> projectNumber) {
            $.projectNumber = projectNumber;
            return this;
        }

        /**
         * @param projectNumber The project team associated with the entity
         * 
         * @return builder
         * 
         */
        public Builder projectNumber(String projectNumber) {
            return projectNumber(Output.of(projectNumber));
        }

        /**
         * @param team The team.
         * Possible values are `editors`, `owners`, and `viewers`.
         * 
         * @return builder
         * 
         */
        public Builder team(@Nullable Output<String> team) {
            $.team = team;
            return this;
        }

        /**
         * @param team The team.
         * Possible values are `editors`, `owners`, and `viewers`.
         * 
         * @return builder
         * 
         */
        public Builder team(String team) {
            return team(Output.of(team));
        }

        public ObjectAccessControlProjectTeamArgs build() {
            return $;
        }
    }

}
