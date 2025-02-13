// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceMaintenanceSchedule {
    private String endTime;
    private String scheduleDeadlineTime;
    private String startTime;

    private GetInstanceMaintenanceSchedule() {}
    public String endTime() {
        return this.endTime;
    }
    public String scheduleDeadlineTime() {
        return this.scheduleDeadlineTime;
    }
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMaintenanceSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTime;
        private String scheduleDeadlineTime;
        private String startTime;
        public Builder() {}
        public Builder(GetInstanceMaintenanceSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        @CustomType.Setter
        public Builder scheduleDeadlineTime(String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GetInstanceMaintenanceSchedule build() {
            final var o = new GetInstanceMaintenanceSchedule();
            o.endTime = endTime;
            o.scheduleDeadlineTime = scheduleDeadlineTime;
            o.startTime = startTime;
            return o;
        }
    }
}
