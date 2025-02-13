// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A managed metastore service that serves metadata queries.
 *
 * To get more information about Service, see:
 *
 * * [API documentation](https://cloud.google.com/dataproc-metastore/docs/reference/rest/v1/projects.locations.services)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dataproc-metastore/docs/overview)
 *
 * ## Example Usage
 * ### Dataproc Metastore Service Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.dataproc.MetastoreService("default", {
 *     hiveMetastoreConfig: {
 *         version: "2.3.6",
 *     },
 *     location: "us-central1",
 *     maintenanceWindow: {
 *         dayOfWeek: "SUNDAY",
 *         hourOfDay: 2,
 *     },
 *     port: 9080,
 *     serviceId: "metastore-srv",
 *     tier: "DEVELOPER",
 * });
 * ```
 * ### Dataproc Metastore Service Cmek Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const keyRing = new gcp.kms.KeyRing("keyRing", {location: "us-central1"}, {
 *     provider: google_beta,
 * });
 * const cryptoKey = new gcp.kms.CryptoKey("cryptoKey", {
 *     keyRing: keyRing.id,
 *     purpose: "ENCRYPT_DECRYPT",
 * }, {
 *     provider: google_beta,
 * });
 * const _default = new gcp.dataproc.MetastoreService("default", {
 *     serviceId: "example-service",
 *     location: "us-central1",
 *     encryptionConfig: {
 *         kmsKey: cryptoKey.id,
 *     },
 *     hiveMetastoreConfig: {
 *         version: "3.1.2",
 *     },
 * });
 * ```
 * ### Dataproc Metastore Service Private Service Connect
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const net = new gcp.compute.Network("net", {autoCreateSubnetworks: false});
 * const subnet = new gcp.compute.Subnetwork("subnet", {
 *     region: "us-central1",
 *     network: net.id,
 *     ipCidrRange: "10.0.0.0/22",
 *     privateIpGoogleAccess: true,
 * });
 * const _default = new gcp.dataproc.MetastoreService("default", {
 *     serviceId: "metastore-srv",
 *     location: "us-central1",
 *     hiveMetastoreConfig: {
 *         version: "3.1.2",
 *     },
 *     networkConfig: {
 *         consumers: [{
 *             subnetwork: subnet.id,
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Service can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:dataproc/metastoreService:MetastoreService default projects/{{project}}/locations/{{location}}/services/{{service_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:dataproc/metastoreService:MetastoreService default {{project}}/{{location}}/{{service_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:dataproc/metastoreService:MetastoreService default {{location}}/{{service_id}}
 * ```
 */
export class MetastoreService extends pulumi.CustomResource {
    /**
     * Get an existing MetastoreService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MetastoreServiceState, opts?: pulumi.CustomResourceOptions): MetastoreService {
        return new MetastoreService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:dataproc/metastoreService:MetastoreService';

    /**
     * Returns true if the given object is an instance of MetastoreService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MetastoreService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MetastoreService.__pulumiType;
    }

    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     */
    public /*out*/ readonly artifactGcsUri!: pulumi.Output<string>;
    /**
     * The database type that the Metastore service stores its data.
     * Default value is `MYSQL`.
     * Possible values are `MYSQL` and `SPANNER`.
     */
    public readonly databaseType!: pulumi.Output<string | undefined>;
    /**
     * Information used to configure the Dataproc Metastore service to encrypt
     * customer data at rest.
     * Structure is documented below.
     */
    public readonly encryptionConfig!: pulumi.Output<outputs.dataproc.MetastoreServiceEncryptionConfig | undefined>;
    /**
     * (Output)
     * The URI of the endpoint used to access the metastore service.
     */
    public /*out*/ readonly endpointUri!: pulumi.Output<string>;
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     */
    public readonly hiveMetastoreConfig!: pulumi.Output<outputs.dataproc.MetastoreServiceHiveMetastoreConfig | undefined>;
    /**
     * User-defined labels for the metastore service.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the metastore service should reside.
     * The default value is `global`.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Maintenance window is not needed for services with the `SPANNER` database type.
     * Structure is documented below.
     */
    public readonly maintenanceWindow!: pulumi.Output<outputs.dataproc.MetastoreServiceMaintenanceWindow | undefined>;
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     */
    public readonly metadataIntegration!: pulumi.Output<outputs.dataproc.MetastoreServiceMetadataIntegration | undefined>;
    /**
     * The relative resource name of the metastore service.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     */
    public readonly network!: pulumi.Output<string>;
    /**
     * The configuration specifying the network settings for the Dataproc Metastore service.
     * Structure is documented below.
     */
    public readonly networkConfig!: pulumi.Output<outputs.dataproc.MetastoreServiceNetworkConfig | undefined>;
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The release channel of the service. If unspecified, defaults to `STABLE`.
     * Default value is `STABLE`.
     * Possible values are `CANARY` and `STABLE`.
     */
    public readonly releaseChannel!: pulumi.Output<string | undefined>;
    /**
     * The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     */
    public readonly serviceId!: pulumi.Output<string>;
    /**
     * The current state of the metastore service.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Additional information about the current state of the metastore service, if available.
     */
    public /*out*/ readonly stateMessage!: pulumi.Output<string>;
    /**
     * The configuration specifying telemetry settings for the Dataproc Metastore service. If unspecified defaults to JSON.
     * Structure is documented below.
     */
    public readonly telemetryConfig!: pulumi.Output<outputs.dataproc.MetastoreServiceTelemetryConfig>;
    /**
     * The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     */
    public readonly tier!: pulumi.Output<string>;
    /**
     * The globally unique resource identifier of the metastore service.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;

    /**
     * Create a MetastoreService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MetastoreServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MetastoreServiceArgs | MetastoreServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MetastoreServiceState | undefined;
            resourceInputs["artifactGcsUri"] = state ? state.artifactGcsUri : undefined;
            resourceInputs["databaseType"] = state ? state.databaseType : undefined;
            resourceInputs["encryptionConfig"] = state ? state.encryptionConfig : undefined;
            resourceInputs["endpointUri"] = state ? state.endpointUri : undefined;
            resourceInputs["hiveMetastoreConfig"] = state ? state.hiveMetastoreConfig : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["maintenanceWindow"] = state ? state.maintenanceWindow : undefined;
            resourceInputs["metadataIntegration"] = state ? state.metadataIntegration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["networkConfig"] = state ? state.networkConfig : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["releaseChannel"] = state ? state.releaseChannel : undefined;
            resourceInputs["serviceId"] = state ? state.serviceId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["stateMessage"] = state ? state.stateMessage : undefined;
            resourceInputs["telemetryConfig"] = state ? state.telemetryConfig : undefined;
            resourceInputs["tier"] = state ? state.tier : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
        } else {
            const args = argsOrState as MetastoreServiceArgs | undefined;
            if ((!args || args.serviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceId'");
            }
            resourceInputs["databaseType"] = args ? args.databaseType : undefined;
            resourceInputs["encryptionConfig"] = args ? args.encryptionConfig : undefined;
            resourceInputs["hiveMetastoreConfig"] = args ? args.hiveMetastoreConfig : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["maintenanceWindow"] = args ? args.maintenanceWindow : undefined;
            resourceInputs["metadataIntegration"] = args ? args.metadataIntegration : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["networkConfig"] = args ? args.networkConfig : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["releaseChannel"] = args ? args.releaseChannel : undefined;
            resourceInputs["serviceId"] = args ? args.serviceId : undefined;
            resourceInputs["telemetryConfig"] = args ? args.telemetryConfig : undefined;
            resourceInputs["tier"] = args ? args.tier : undefined;
            resourceInputs["artifactGcsUri"] = undefined /*out*/;
            resourceInputs["endpointUri"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["stateMessage"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MetastoreService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MetastoreService resources.
 */
export interface MetastoreServiceState {
    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     */
    artifactGcsUri?: pulumi.Input<string>;
    /**
     * The database type that the Metastore service stores its data.
     * Default value is `MYSQL`.
     * Possible values are `MYSQL` and `SPANNER`.
     */
    databaseType?: pulumi.Input<string>;
    /**
     * Information used to configure the Dataproc Metastore service to encrypt
     * customer data at rest.
     * Structure is documented below.
     */
    encryptionConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceEncryptionConfig>;
    /**
     * (Output)
     * The URI of the endpoint used to access the metastore service.
     */
    endpointUri?: pulumi.Input<string>;
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     */
    hiveMetastoreConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceHiveMetastoreConfig>;
    /**
     * User-defined labels for the metastore service.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the metastore service should reside.
     * The default value is `global`.
     */
    location?: pulumi.Input<string>;
    /**
     * The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Maintenance window is not needed for services with the `SPANNER` database type.
     * Structure is documented below.
     */
    maintenanceWindow?: pulumi.Input<inputs.dataproc.MetastoreServiceMaintenanceWindow>;
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     */
    metadataIntegration?: pulumi.Input<inputs.dataproc.MetastoreServiceMetadataIntegration>;
    /**
     * The relative resource name of the metastore service.
     */
    name?: pulumi.Input<string>;
    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     */
    network?: pulumi.Input<string>;
    /**
     * The configuration specifying the network settings for the Dataproc Metastore service.
     * Structure is documented below.
     */
    networkConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceNetworkConfig>;
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     */
    port?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The release channel of the service. If unspecified, defaults to `STABLE`.
     * Default value is `STABLE`.
     * Possible values are `CANARY` and `STABLE`.
     */
    releaseChannel?: pulumi.Input<string>;
    /**
     * The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     */
    serviceId?: pulumi.Input<string>;
    /**
     * The current state of the metastore service.
     */
    state?: pulumi.Input<string>;
    /**
     * Additional information about the current state of the metastore service, if available.
     */
    stateMessage?: pulumi.Input<string>;
    /**
     * The configuration specifying telemetry settings for the Dataproc Metastore service. If unspecified defaults to JSON.
     * Structure is documented below.
     */
    telemetryConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceTelemetryConfig>;
    /**
     * The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     */
    tier?: pulumi.Input<string>;
    /**
     * The globally unique resource identifier of the metastore service.
     */
    uid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MetastoreService resource.
 */
export interface MetastoreServiceArgs {
    /**
     * The database type that the Metastore service stores its data.
     * Default value is `MYSQL`.
     * Possible values are `MYSQL` and `SPANNER`.
     */
    databaseType?: pulumi.Input<string>;
    /**
     * Information used to configure the Dataproc Metastore service to encrypt
     * customer data at rest.
     * Structure is documented below.
     */
    encryptionConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceEncryptionConfig>;
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     */
    hiveMetastoreConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceHiveMetastoreConfig>;
    /**
     * User-defined labels for the metastore service.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the metastore service should reside.
     * The default value is `global`.
     */
    location?: pulumi.Input<string>;
    /**
     * The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Maintenance window is not needed for services with the `SPANNER` database type.
     * Structure is documented below.
     */
    maintenanceWindow?: pulumi.Input<inputs.dataproc.MetastoreServiceMaintenanceWindow>;
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     */
    metadataIntegration?: pulumi.Input<inputs.dataproc.MetastoreServiceMetadataIntegration>;
    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     */
    network?: pulumi.Input<string>;
    /**
     * The configuration specifying the network settings for the Dataproc Metastore service.
     * Structure is documented below.
     */
    networkConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceNetworkConfig>;
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     */
    port?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The release channel of the service. If unspecified, defaults to `STABLE`.
     * Default value is `STABLE`.
     * Possible values are `CANARY` and `STABLE`.
     */
    releaseChannel?: pulumi.Input<string>;
    /**
     * The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     */
    serviceId: pulumi.Input<string>;
    /**
     * The configuration specifying telemetry settings for the Dataproc Metastore service. If unspecified defaults to JSON.
     * Structure is documented below.
     */
    telemetryConfig?: pulumi.Input<inputs.dataproc.MetastoreServiceTelemetryConfig>;
    /**
     * The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     */
    tier?: pulumi.Input<string>;
}
