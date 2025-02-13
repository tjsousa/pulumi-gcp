// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterMaintenancePolicyDailyMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyDailyMaintenanceWindowArgs Empty = new ClusterMaintenancePolicyDailyMaintenanceWindowArgs();

    @Import(name="duration")
    private @Nullable Output<String> duration;

    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="startTime", required=true)
    private Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime;
    }

    private ClusterMaintenancePolicyDailyMaintenanceWindowArgs() {}

    private ClusterMaintenancePolicyDailyMaintenanceWindowArgs(ClusterMaintenancePolicyDailyMaintenanceWindowArgs $) {
        this.duration = $.duration;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMaintenancePolicyDailyMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMaintenancePolicyDailyMaintenanceWindowArgs $;

        public Builder() {
            $ = new ClusterMaintenancePolicyDailyMaintenanceWindowArgs();
        }

        public Builder(ClusterMaintenancePolicyDailyMaintenanceWindowArgs defaults) {
            $ = new ClusterMaintenancePolicyDailyMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ClusterMaintenancePolicyDailyMaintenanceWindowArgs build() {
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
