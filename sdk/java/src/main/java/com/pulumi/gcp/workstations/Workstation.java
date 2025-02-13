// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.workstations.WorkstationArgs;
import com.pulumi.gcp.workstations.inputs.WorkstationState;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Workstation Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.workstations.WorkstationCluster;
 * import com.pulumi.gcp.workstations.WorkstationClusterArgs;
 * import com.pulumi.gcp.workstations.WorkstationConfig;
 * import com.pulumi.gcp.workstations.WorkstationConfigArgs;
 * import com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs;
 * import com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs;
 * import com.pulumi.gcp.workstations.Workstation;
 * import com.pulumi.gcp.workstations.WorkstationArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultSubnetwork = new Subnetwork(&#34;defaultSubnetwork&#34;, SubnetworkArgs.builder()        
 *             .ipCidrRange(&#34;10.0.0.0/24&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .network(defaultNetwork.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultWorkstationCluster = new WorkstationCluster(&#34;defaultWorkstationCluster&#34;, WorkstationClusterArgs.builder()        
 *             .workstationClusterId(&#34;workstation-cluster&#34;)
 *             .network(defaultNetwork.id())
 *             .subnetwork(defaultSubnetwork.id())
 *             .location(&#34;us-central1&#34;)
 *             .labels(Map.of(&#34;label&#34;, &#34;key&#34;))
 *             .annotations(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultWorkstationConfig = new WorkstationConfig(&#34;defaultWorkstationConfig&#34;, WorkstationConfigArgs.builder()        
 *             .workstationConfigId(&#34;workstation-config&#34;)
 *             .workstationClusterId(defaultWorkstationCluster.workstationClusterId())
 *             .location(&#34;us-central1&#34;)
 *             .host(WorkstationConfigHostArgs.builder()
 *                 .gceInstance(WorkstationConfigHostGceInstanceArgs.builder()
 *                     .machineType(&#34;e2-standard-4&#34;)
 *                     .bootDiskSizeGb(35)
 *                     .disablePublicIpAddresses(true)
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultWorkstation = new Workstation(&#34;defaultWorkstation&#34;, WorkstationArgs.builder()        
 *             .workstationId(&#34;workstation&#34;)
 *             .workstationConfigId(defaultWorkstationConfig.workstationConfigId())
 *             .workstationClusterId(defaultWorkstationCluster.workstationClusterId())
 *             .location(&#34;us-central1&#34;)
 *             .labels(Map.of(&#34;label&#34;, &#34;key&#34;))
 *             .annotations(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Workstation can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:workstations/workstation:Workstation default projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:workstations/workstation:Workstation default {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:workstations/workstation:Workstation default {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:workstations/workstation:Workstation")
public class Workstation extends com.pulumi.resources.CustomResource {
    /**
     * Client-specified annotations. This is distinct from labels.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return Client-specified annotations. This is distinct from labels.
     * 
     */
    public Output<Optional<Map<String,String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * Time the Instance was created in UTC.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the Instance was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Human-readable name for this resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Human-readable name for this resource.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Host to which clients can send HTTPS traffic that will be received by the workstation.
     * Authorized traffic will be received to the workstation as HTTP on port 80.
     * To send traffic to a different port, clients may prefix the host with the destination port in the format &#34;{port}-{host}&#34;.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return Host to which clients can send HTTPS traffic that will be received by the workstation.
     * Authorized traffic will be received to the workstation as HTTP on port 80.
     * To send traffic to a different port, clients may prefix the host with the destination port in the format &#34;{port}-{host}&#34;.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location where the workstation cluster config should reside.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location where the workstation cluster config should reside.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the cluster resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cluster resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Current state of the workstation.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the workstation.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The system-generated UID of the resource.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return The system-generated UID of the resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * The name of the workstation cluster.
     * 
     */
    @Export(name="workstationClusterId", type=String.class, parameters={})
    private Output<String> workstationClusterId;

    /**
     * @return The name of the workstation cluster.
     * 
     */
    public Output<String> workstationClusterId() {
        return this.workstationClusterId;
    }
    /**
     * The ID of the workstation cluster config.
     * 
     */
    @Export(name="workstationConfigId", type=String.class, parameters={})
    private Output<String> workstationConfigId;

    /**
     * @return The ID of the workstation cluster config.
     * 
     */
    public Output<String> workstationConfigId() {
        return this.workstationConfigId;
    }
    /**
     * ID to use for the workstation.
     * 
     */
    @Export(name="workstationId", type=String.class, parameters={})
    private Output<String> workstationId;

    /**
     * @return ID to use for the workstation.
     * 
     */
    public Output<String> workstationId() {
        return this.workstationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workstation(String name) {
        this(name, WorkstationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workstation(String name, WorkstationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workstation(String name, WorkstationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:workstations/workstation:Workstation", name, args == null ? WorkstationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workstation(String name, Output<String> id, @Nullable WorkstationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:workstations/workstation:Workstation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Workstation get(String name, Output<String> id, @Nullable WorkstationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workstation(name, id, state, options);
    }
}
