// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.activedirectory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The name of delegated administrator account used to perform Active Directory operations.
     * If not specified, setupadmin will be used.
     * 
     */
    @Import(name="admin")
    private @Nullable Output<String> admin;

    /**
     * @return The name of delegated administrator account used to perform Active Directory operations.
     * If not specified, setupadmin will be used.
     * 
     */
    public Optional<Output<String>> admin() {
        return Optional.ofNullable(this.admin);
    }

    /**
     * The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
     * If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    @Import(name="authorizedNetworks")
    private @Nullable Output<List<String>> authorizedNetworks;

    /**
     * @return The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
     * If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    public Optional<Output<List<String>>> authorizedNetworks() {
        return Optional.ofNullable(this.authorizedNetworks);
    }

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The fully-qualified domain name of the exposed domain used by clients to connect to the service.
     * Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    /**
     * @return The fully-qualified domain name of the exposed domain used by clients to connect to the service.
     * Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    /**
     * Resource labels that can contain user-provided metadata
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels that can contain user-provided metadata
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
     * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
     * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * The unique name of the domain using the format: `projects/{project}/locations/global/domains/{domainName}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the domain using the format: `projects/{project}/locations/global/domains/{domainName}`.
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
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger.
     * Ranges must be unique and non-overlapping with existing subnets in authorizedNetworks
     * 
     */
    @Import(name="reservedIpRange")
    private @Nullable Output<String> reservedIpRange;

    /**
     * @return The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger.
     * Ranges must be unique and non-overlapping with existing subnets in authorizedNetworks
     * 
     */
    public Optional<Output<String>> reservedIpRange() {
        return Optional.ofNullable(this.reservedIpRange);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.admin = $.admin;
        this.authorizedNetworks = $.authorizedNetworks;
        this.domainName = $.domainName;
        this.fqdn = $.fqdn;
        this.labels = $.labels;
        this.locations = $.locations;
        this.name = $.name;
        this.project = $.project;
        this.reservedIpRange = $.reservedIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param admin The name of delegated administrator account used to perform Active Directory operations.
         * If not specified, setupadmin will be used.
         * 
         * @return builder
         * 
         */
        public Builder admin(@Nullable Output<String> admin) {
            $.admin = admin;
            return this;
        }

        /**
         * @param admin The name of delegated administrator account used to perform Active Directory operations.
         * If not specified, setupadmin will be used.
         * 
         * @return builder
         * 
         */
        public Builder admin(String admin) {
            return admin(Output.of(admin));
        }

        /**
         * @param authorizedNetworks The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
         * If CIDR subnets overlap between networks, domain creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(@Nullable Output<List<String>> authorizedNetworks) {
            $.authorizedNetworks = authorizedNetworks;
            return this;
        }

        /**
         * @param authorizedNetworks The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
         * If CIDR subnets overlap between networks, domain creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(List<String> authorizedNetworks) {
            return authorizedNetworks(Output.of(authorizedNetworks));
        }

        /**
         * @param authorizedNetworks The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
         * If CIDR subnets overlap between networks, domain creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(String... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }

        /**
         * @param domainName The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
         * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
         * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param fqdn The fully-qualified domain name of the exposed domain used by clients to connect to the service.
         * Similar to what would be chosen for an Active Directory set up on an internal network.
         * 
         * @return builder
         * 
         */
        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn The fully-qualified domain name of the exposed domain used by clients to connect to the service.
         * Similar to what would be chosen for an Active Directory set up on an internal network.
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        /**
         * @param labels Resource labels that can contain user-provided metadata
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels that can contain user-provided metadata
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param locations Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
         * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
         * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
         * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param name The unique name of the domain using the format: `projects/{project}/locations/global/domains/{domainName}`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the domain using the format: `projects/{project}/locations/global/domains/{domainName}`.
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
         * @param reservedIpRange The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger.
         * Ranges must be unique and non-overlapping with existing subnets in authorizedNetworks
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            $.reservedIpRange = reservedIpRange;
            return this;
        }

        /**
         * @param reservedIpRange The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger.
         * Ranges must be unique and non-overlapping with existing subnets in authorizedNetworks
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(String reservedIpRange) {
            return reservedIpRange(Output.of(reservedIpRange));
        }

        public DomainState build() {
            return $;
        }
    }

}
