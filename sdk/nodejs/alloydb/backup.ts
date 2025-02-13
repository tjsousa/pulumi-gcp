// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * An AlloyDB Backup.
 *
 * To get more information about Backup, see:
 *
 * * [API documentation](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.backups/create)
 * * How-to Guides
 *     * [AlloyDB](https://cloud.google.com/alloydb/docs/)
 *
 * ## Example Usage
 * ### Alloydb Backup Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = gcp.compute.getNetwork({
 *     name: "alloydb-network",
 * });
 * const defaultCluster = new gcp.alloydb.Cluster("defaultCluster", {
 *     clusterId: "alloydb-cluster",
 *     location: "us-central1",
 *     network: defaultNetwork.then(defaultNetwork => defaultNetwork.id),
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("privateIpAlloc", {
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: defaultNetwork.then(defaultNetwork => defaultNetwork.id),
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpcConnection", {
 *     network: defaultNetwork.then(defaultNetwork => defaultNetwork.id),
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const defaultInstance = new gcp.alloydb.Instance("defaultInstance", {
 *     cluster: defaultCluster.name,
 *     instanceId: "alloydb-instance",
 *     instanceType: "PRIMARY",
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const defaultBackup = new gcp.alloydb.Backup("defaultBackup", {
 *     location: "us-central1",
 *     backupId: "alloydb-backup",
 *     clusterName: defaultCluster.name,
 * }, {
 *     dependsOn: [defaultInstance],
 * });
 * ```
 * ### Alloydb Backup Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = gcp.compute.getNetwork({
 *     name: "alloydb-network",
 * });
 * const defaultCluster = new gcp.alloydb.Cluster("defaultCluster", {
 *     clusterId: "alloydb-cluster",
 *     location: "us-central1",
 *     network: defaultNetwork.then(defaultNetwork => defaultNetwork.id),
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("privateIpAlloc", {
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: defaultNetwork.then(defaultNetwork => defaultNetwork.id),
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpcConnection", {
 *     network: defaultNetwork.then(defaultNetwork => defaultNetwork.id),
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const defaultInstance = new gcp.alloydb.Instance("defaultInstance", {
 *     cluster: defaultCluster.name,
 *     instanceId: "alloydb-instance",
 *     instanceType: "PRIMARY",
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const defaultBackup = new gcp.alloydb.Backup("defaultBackup", {
 *     location: "us-central1",
 *     backupId: "alloydb-backup",
 *     clusterName: defaultCluster.name,
 *     description: "example description",
 *     labels: {
 *         label: "key",
 *     },
 * }, {
 *     dependsOn: [defaultInstance],
 * });
 * ```
 *
 * ## Import
 *
 * Backup can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/backup:Backup default projects/{{project}}/locations/{{location}}/backups/{{backup_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/backup:Backup default {{project}}/{{location}}/{{backup_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/backup:Backup default {{location}}/{{backup_id}}
 * ```
 */
export class Backup extends pulumi.CustomResource {
    /**
     * Get an existing Backup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupState, opts?: pulumi.CustomResourceOptions): Backup {
        return new Backup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:alloydb/backup:Backup';

    /**
     * Returns true if the given object is an instance of Backup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Backup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Backup.__pulumiType;
    }

    /**
     * The ID of the alloydb backup.
     */
    public readonly backupId!: pulumi.Output<string>;
    /**
     * The full resource name of the backup source cluster (e.g., projects/{project}/locations/{location}/clusters/{clusterId}).
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * Time the Backup was created in UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * User-provided description of the backup.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A hash of the resource.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * User-defined labels for the alloydb backup.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the alloydb backup should reside.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * Output only. The name of the backup resource with the format: * projects/{project}/locations/{region}/backups/{backupId}
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * If true, indicates that the service is actively updating the resource. This can happen due to user-triggered updates or system actions like failover or maintenance.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * The current state of the backup.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Output only. The system-generated UID of the resource. The UID is assigned when the resource is created, and it is retained until it is deleted.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * Time the Backup was updated in UTC.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Backup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackupArgs | BackupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackupState | undefined;
            resourceInputs["backupId"] = state ? state.backupId : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as BackupArgs | undefined;
            if ((!args || args.backupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backupId'");
            }
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            resourceInputs["backupId"] = args ? args.backupId : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Backup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Backup resources.
 */
export interface BackupState {
    /**
     * The ID of the alloydb backup.
     */
    backupId?: pulumi.Input<string>;
    /**
     * The full resource name of the backup source cluster (e.g., projects/{project}/locations/{location}/clusters/{clusterId}).
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Time the Backup was created in UTC.
     */
    createTime?: pulumi.Input<string>;
    /**
     * User-provided description of the backup.
     */
    description?: pulumi.Input<string>;
    /**
     * A hash of the resource.
     */
    etag?: pulumi.Input<string>;
    /**
     * User-defined labels for the alloydb backup.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the alloydb backup should reside.
     */
    location?: pulumi.Input<string>;
    /**
     * Output only. The name of the backup resource with the format: * projects/{project}/locations/{region}/backups/{backupId}
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * If true, indicates that the service is actively updating the resource. This can happen due to user-triggered updates or system actions like failover or maintenance.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * The current state of the backup.
     */
    state?: pulumi.Input<string>;
    /**
     * Output only. The system-generated UID of the resource. The UID is assigned when the resource is created, and it is retained until it is deleted.
     */
    uid?: pulumi.Input<string>;
    /**
     * Time the Backup was updated in UTC.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Backup resource.
 */
export interface BackupArgs {
    /**
     * The ID of the alloydb backup.
     */
    backupId: pulumi.Input<string>;
    /**
     * The full resource name of the backup source cluster (e.g., projects/{project}/locations/{location}/clusters/{clusterId}).
     */
    clusterName: pulumi.Input<string>;
    /**
     * User-provided description of the backup.
     */
    description?: pulumi.Input<string>;
    /**
     * User-defined labels for the alloydb backup.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the alloydb backup should reside.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
