// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterMaintenancePolicyRecurringWindow {
    private String endTime;
    private String recurrence;
    private String startTime;

    private GetClusterMaintenancePolicyRecurringWindow() {}
    public String endTime() {
        return this.endTime;
    }
    public String recurrence() {
        return this.recurrence;
    }
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMaintenancePolicyRecurringWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTime;
        private String recurrence;
        private String startTime;
        public Builder() {}
        public Builder(GetClusterMaintenancePolicyRecurringWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        @CustomType.Setter
        public Builder recurrence(String recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GetClusterMaintenancePolicyRecurringWindow build() {
            final var o = new GetClusterMaintenancePolicyRecurringWindow();
            o.endTime = endTime;
            o.recurrence = recurrence;
            o.startTime = startTime;
            return o;
        }
    }
}
