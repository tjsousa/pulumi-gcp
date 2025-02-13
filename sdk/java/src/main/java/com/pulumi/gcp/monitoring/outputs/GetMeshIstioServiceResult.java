// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceTelemetry;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMeshIstioServiceResult {
    /**
     * @return Name used for UI elements listing this (Monitoring) Service.
     * 
     */
    private String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String meshUid;
    /**
     * @return The full REST resource name for this channel. The syntax is:
     * `projects/[PROJECT_ID]/services/[SERVICE_ID]`.
     * 
     */
    private String name;
    private @Nullable String project;
    private String serviceId;
    private String serviceName;
    private String serviceNamespace;
    /**
     * @return Configuration for how to query telemetry on the Service. Structure is documented below.
     * 
     */
    private List<GetMeshIstioServiceTelemetry> telemetries;
    private Map<String,String> userLabels;

    private GetMeshIstioServiceResult() {}
    /**
     * @return Name used for UI elements listing this (Monitoring) Service.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String meshUid() {
        return this.meshUid;
    }
    /**
     * @return The full REST resource name for this channel. The syntax is:
     * `projects/[PROJECT_ID]/services/[SERVICE_ID]`.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String serviceId() {
        return this.serviceId;
    }
    public String serviceName() {
        return this.serviceName;
    }
    public String serviceNamespace() {
        return this.serviceNamespace;
    }
    /**
     * @return Configuration for how to query telemetry on the Service. Structure is documented below.
     * 
     */
    public List<GetMeshIstioServiceTelemetry> telemetries() {
        return this.telemetries;
    }
    public Map<String,String> userLabels() {
        return this.userLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshIstioServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String id;
        private String meshUid;
        private String name;
        private @Nullable String project;
        private String serviceId;
        private String serviceName;
        private String serviceNamespace;
        private List<GetMeshIstioServiceTelemetry> telemetries;
        private Map<String,String> userLabels;
        public Builder() {}
        public Builder(GetMeshIstioServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.meshUid = defaults.meshUid;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.telemetries = defaults.telemetries;
    	      this.userLabels = defaults.userLabels;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder meshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
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
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder serviceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }
        @CustomType.Setter
        public Builder telemetries(List<GetMeshIstioServiceTelemetry> telemetries) {
            this.telemetries = Objects.requireNonNull(telemetries);
            return this;
        }
        public Builder telemetries(GetMeshIstioServiceTelemetry... telemetries) {
            return telemetries(List.of(telemetries));
        }
        @CustomType.Setter
        public Builder userLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }
        public GetMeshIstioServiceResult build() {
            final var o = new GetMeshIstioServiceResult();
            o.displayName = displayName;
            o.id = id;
            o.meshUid = meshUid;
            o.name = name;
            o.project = project;
            o.serviceId = serviceId;
            o.serviceName = serviceName;
            o.serviceNamespace = serviceNamespace;
            o.telemetries = telemetries;
            o.userLabels = userLabels;
            return o;
        }
    }
}
