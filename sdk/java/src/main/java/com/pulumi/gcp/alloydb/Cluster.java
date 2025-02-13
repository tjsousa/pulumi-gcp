// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.alloydb.ClusterArgs;
import com.pulumi.gcp.alloydb.inputs.ClusterState;
import com.pulumi.gcp.alloydb.outputs.ClusterAutomatedBackupPolicy;
import com.pulumi.gcp.alloydb.outputs.ClusterBackupSource;
import com.pulumi.gcp.alloydb.outputs.ClusterInitialUser;
import com.pulumi.gcp.alloydb.outputs.ClusterMigrationSource;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Alloydb Cluster Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.alloydb.Cluster;
 * import com.pulumi.gcp.alloydb.ClusterArgs;
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
 *         final var project = OrganizationsFunctions.getProject();
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;);
 * 
 *         var defaultCluster = new Cluster(&#34;defaultCluster&#34;, ClusterArgs.builder()        
 *             .clusterId(&#34;alloydb-cluster&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .network(defaultNetwork.name().applyValue(name -&gt; String.format(&#34;projects/%s/global/networks/%s&#34;, project.applyValue(getProjectResult -&gt; getProjectResult.number()),name)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Alloydb Cluster Full
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.alloydb.Cluster;
 * import com.pulumi.gcp.alloydb.ClusterArgs;
 * import com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs;
 * import com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs;
 * import com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyWeeklyScheduleArgs;
 * import com.pulumi.gcp.alloydb.inputs.ClusterInitialUserArgs;
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
 *         final var project = OrganizationsFunctions.getProject();
 * 
 *         var default_ = new Network(&#34;default&#34;);
 * 
 *         var full = new Cluster(&#34;full&#34;, ClusterArgs.builder()        
 *             .automatedBackupPolicy(ClusterAutomatedBackupPolicyArgs.builder()
 *                 .backupWindow(&#34;1800s&#34;)
 *                 .enabled(true)
 *                 .labels(Map.of(&#34;test&#34;, &#34;alloydb-cluster-full&#34;))
 *                 .location(&#34;us-central1&#34;)
 *                 .quantityBasedRetention(ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs.builder()
 *                     .count(1)
 *                     .build())
 *                 .weeklySchedule(ClusterAutomatedBackupPolicyWeeklyScheduleArgs.builder()
 *                     .daysOfWeek(&#34;MONDAY&#34;)
 *                     .startTimes(ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs.builder()
 *                         .hours(23)
 *                         .minutes(0)
 *                         .nanos(0)
 *                         .seconds(0)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .clusterId(&#34;alloydb-cluster-full&#34;)
 *             .initialUser(ClusterInitialUserArgs.builder()
 *                 .password(&#34;alloydb-cluster-full&#34;)
 *                 .user(&#34;alloydb-cluster-full&#34;)
 *                 .build())
 *             .labels(Map.of(&#34;test&#34;, &#34;alloydb-cluster-full&#34;))
 *             .location(&#34;us-central1&#34;)
 *             .network(default_.name().applyValue(name -&gt; String.format(&#34;projects/%s/global/networks/%s&#34;, project.applyValue(getProjectResult -&gt; getProjectResult.number()),name)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cluster can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default projects/{{project}}/locations/{{location}}/clusters/{{cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{project}}/{{location}}/{{cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{location}}/{{cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{cluster_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:alloydb/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The automated backup policy for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
     * Structure is documented below.
     * 
     */
    @Export(name="automatedBackupPolicy", type=ClusterAutomatedBackupPolicy.class, parameters={})
    private Output<ClusterAutomatedBackupPolicy> automatedBackupPolicy;

    /**
     * @return The automated backup policy for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
     * Structure is documented below.
     * 
     */
    public Output<ClusterAutomatedBackupPolicy> automatedBackupPolicy() {
        return this.automatedBackupPolicy;
    }
    /**
     * Cluster created from backup.
     * Structure is documented below.
     * 
     */
    @Export(name="backupSources", type=List.class, parameters={ClusterBackupSource.class})
    private Output<List<ClusterBackupSource>> backupSources;

    /**
     * @return Cluster created from backup.
     * Structure is documented below.
     * 
     */
    public Output<List<ClusterBackupSource>> backupSources() {
        return this.backupSources;
    }
    /**
     * The ID of the alloydb cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID of the alloydb cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The database engine major version. This is an output-only field and it&#39;s populated at the Cluster creation time. This field cannot be changed after cluster creation.
     * 
     */
    @Export(name="databaseVersion", type=String.class, parameters={})
    private Output<String> databaseVersion;

    /**
     * @return The database engine major version. This is an output-only field and it&#39;s populated at the Cluster creation time. This field cannot be changed after cluster creation.
     * 
     */
    public Output<String> databaseVersion() {
        return this.databaseVersion;
    }
    /**
     * User-settable and human-readable display name for the Cluster.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User-settable and human-readable display name for the Cluster.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     * 
     */
    @Export(name="initialUser", type=ClusterInitialUser.class, parameters={})
    private Output</* @Nullable */ ClusterInitialUser> initialUser;

    /**
     * @return Initial user to setup during cluster creation.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ClusterInitialUser>> initialUser() {
        return Codegen.optional(this.initialUser);
    }
    /**
     * User-defined labels for the alloydb cluster.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-defined labels for the alloydb cluster.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location where the alloydb cluster should reside.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location where the alloydb cluster should reside.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Cluster created via DMS migration.
     * Structure is documented below.
     * 
     */
    @Export(name="migrationSources", type=List.class, parameters={ClusterMigrationSource.class})
    private Output<List<ClusterMigrationSource>> migrationSources;

    /**
     * @return Cluster created via DMS migration.
     * Structure is documented below.
     * 
     */
    public Output<List<ClusterMigrationSource>> migrationSources() {
        return this.migrationSources;
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
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    public Output<String> network() {
        return this.network;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:alloydb/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:alloydb/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
