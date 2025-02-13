// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workstations
{
    /// <summary>
    /// ## Example Usage
    /// ### Workstation Config Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultNetwork = new Gcp.Compute.Network("defaultNetwork", new()
    ///     {
    ///         AutoCreateSubnetworks = false,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("defaultSubnetwork", new()
    ///     {
    ///         IpCidrRange = "10.0.0.0/24",
    ///         Region = "us-central1",
    ///         Network = defaultNetwork.Name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationCluster = new Gcp.Workstations.WorkstationCluster("defaultWorkstationCluster", new()
    ///     {
    ///         WorkstationClusterId = "workstation-cluster",
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "label", "key" },
    ///         },
    ///         Annotations = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationConfig = new Gcp.Workstations.WorkstationConfig("defaultWorkstationConfig", new()
    ///     {
    ///         WorkstationConfigId = "workstation-config",
    ///         WorkstationClusterId = defaultWorkstationCluster.WorkstationClusterId,
    ///         Location = "us-central1",
    ///         Host = new Gcp.Workstations.Inputs.WorkstationConfigHostArgs
    ///         {
    ///             GceInstance = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceArgs
    ///             {
    ///                 MachineType = "e2-standard-4",
    ///                 BootDiskSizeGb = 35,
    ///                 DisablePublicIpAddresses = true,
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Workstation Config Container
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultNetwork = new Gcp.Compute.Network("defaultNetwork", new()
    ///     {
    ///         AutoCreateSubnetworks = false,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("defaultSubnetwork", new()
    ///     {
    ///         IpCidrRange = "10.0.0.0/24",
    ///         Region = "us-central1",
    ///         Network = defaultNetwork.Name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationCluster = new Gcp.Workstations.WorkstationCluster("defaultWorkstationCluster", new()
    ///     {
    ///         WorkstationClusterId = "workstation-cluster",
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "label", "key" },
    ///         },
    ///         Annotations = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationConfig = new Gcp.Workstations.WorkstationConfig("defaultWorkstationConfig", new()
    ///     {
    ///         WorkstationConfigId = "workstation-config",
    ///         WorkstationClusterId = defaultWorkstationCluster.WorkstationClusterId,
    ///         Location = "us-central1",
    ///         Host = new Gcp.Workstations.Inputs.WorkstationConfigHostArgs
    ///         {
    ///             GceInstance = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceArgs
    ///             {
    ///                 MachineType = "e2-standard-4",
    ///                 BootDiskSizeGb = 35,
    ///                 DisablePublicIpAddresses = true,
    ///             },
    ///         },
    ///         Container = new Gcp.Workstations.Inputs.WorkstationConfigContainerArgs
    ///         {
    ///             Image = "intellij",
    ///             Env = 
    ///             {
    ///                 { "NAME", "FOO" },
    ///                 { "BABE", "bar" },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Workstation Config Persistent Directories
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultNetwork = new Gcp.Compute.Network("defaultNetwork", new()
    ///     {
    ///         AutoCreateSubnetworks = false,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("defaultSubnetwork", new()
    ///     {
    ///         IpCidrRange = "10.0.0.0/24",
    ///         Region = "us-central1",
    ///         Network = defaultNetwork.Name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationCluster = new Gcp.Workstations.WorkstationCluster("defaultWorkstationCluster", new()
    ///     {
    ///         WorkstationClusterId = "workstation-cluster",
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "label", "key" },
    ///         },
    ///         Annotations = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationConfig = new Gcp.Workstations.WorkstationConfig("defaultWorkstationConfig", new()
    ///     {
    ///         WorkstationConfigId = "workstation-config",
    ///         WorkstationClusterId = defaultWorkstationCluster.WorkstationClusterId,
    ///         Location = "us-central1",
    ///         Host = new Gcp.Workstations.Inputs.WorkstationConfigHostArgs
    ///         {
    ///             GceInstance = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceArgs
    ///             {
    ///                 MachineType = "e2-standard-4",
    ///                 BootDiskSizeGb = 35,
    ///                 DisablePublicIpAddresses = true,
    ///                 ShieldedInstanceConfig = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceShieldedInstanceConfigArgs
    ///                 {
    ///                     EnableSecureBoot = true,
    ///                     EnableVtpm = true,
    ///                 },
    ///             },
    ///         },
    ///         PersistentDirectories = new[]
    ///         {
    ///             new Gcp.Workstations.Inputs.WorkstationConfigPersistentDirectoryArgs
    ///             {
    ///                 MountPath = "/home",
    ///                 GcePd = new Gcp.Workstations.Inputs.WorkstationConfigPersistentDirectoryGcePdArgs
    ///                 {
    ///                     SizeGb = 200,
    ///                     ReclaimPolicy = "DELETE",
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Workstation Config Shielded Instance Config
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultNetwork = new Gcp.Compute.Network("defaultNetwork", new()
    ///     {
    ///         AutoCreateSubnetworks = false,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("defaultSubnetwork", new()
    ///     {
    ///         IpCidrRange = "10.0.0.0/24",
    ///         Region = "us-central1",
    ///         Network = defaultNetwork.Name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationCluster = new Gcp.Workstations.WorkstationCluster("defaultWorkstationCluster", new()
    ///     {
    ///         WorkstationClusterId = "workstation-cluster",
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "label", "key" },
    ///         },
    ///         Annotations = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationConfig = new Gcp.Workstations.WorkstationConfig("defaultWorkstationConfig", new()
    ///     {
    ///         WorkstationConfigId = "workstation-config",
    ///         WorkstationClusterId = defaultWorkstationCluster.WorkstationClusterId,
    ///         Location = "us-central1",
    ///         Host = new Gcp.Workstations.Inputs.WorkstationConfigHostArgs
    ///         {
    ///             GceInstance = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceArgs
    ///             {
    ///                 MachineType = "e2-standard-4",
    ///                 BootDiskSizeGb = 35,
    ///                 DisablePublicIpAddresses = true,
    ///                 ShieldedInstanceConfig = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceShieldedInstanceConfigArgs
    ///                 {
    ///                     EnableSecureBoot = true,
    ///                     EnableVtpm = true,
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Workstation Config Encryption Key
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultNetwork = new Gcp.Compute.Network("defaultNetwork", new()
    ///     {
    ///         AutoCreateSubnetworks = false,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("defaultSubnetwork", new()
    ///     {
    ///         IpCidrRange = "10.0.0.0/24",
    ///         Region = "us-central1",
    ///         Network = defaultNetwork.Name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationCluster = new Gcp.Workstations.WorkstationCluster("defaultWorkstationCluster", new()
    ///     {
    ///         WorkstationClusterId = "workstation-cluster",
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "label", "key" },
    ///         },
    ///         Annotations = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultKeyRing = new Gcp.Kms.KeyRing("defaultKeyRing", new()
    ///     {
    ///         Location = "global",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultCryptoKey = new Gcp.Kms.CryptoKey("defaultCryptoKey", new()
    ///     {
    ///         KeyRing = defaultKeyRing.Id,
    ///         RotationPeriod = "100000s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultAccount = new Gcp.ServiceAccount.Account("defaultAccount", new()
    ///     {
    ///         AccountId = "my-account",
    ///         DisplayName = "Service Account",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var defaultWorkstationConfig = new Gcp.Workstations.WorkstationConfig("defaultWorkstationConfig", new()
    ///     {
    ///         WorkstationConfigId = "workstation-config",
    ///         WorkstationClusterId = defaultWorkstationCluster.WorkstationClusterId,
    ///         Location = "us-central1",
    ///         Host = new Gcp.Workstations.Inputs.WorkstationConfigHostArgs
    ///         {
    ///             GceInstance = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceArgs
    ///             {
    ///                 MachineType = "e2-standard-4",
    ///                 BootDiskSizeGb = 35,
    ///                 DisablePublicIpAddresses = true,
    ///                 ShieldedInstanceConfig = new Gcp.Workstations.Inputs.WorkstationConfigHostGceInstanceShieldedInstanceConfigArgs
    ///                 {
    ///                     EnableSecureBoot = true,
    ///                     EnableVtpm = true,
    ///                 },
    ///             },
    ///         },
    ///         EncryptionKey = new Gcp.Workstations.Inputs.WorkstationConfigEncryptionKeyArgs
    ///         {
    ///             KmsKey = defaultCryptoKey.Id,
    ///             KmsKeyServiceAccount = defaultAccount.Email,
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// WorkstationConfig can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:workstations/workstationConfig:WorkstationConfig default projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:workstations/workstationConfig:WorkstationConfig default {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:workstations/workstationConfig:WorkstationConfig default {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:workstations/workstationConfig:WorkstationConfig")]
    public partial class WorkstationConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Client-specified annotations. This is distinct from labels.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        /// <summary>
        /// Status conditions describing the current resource state.
        /// Structure is documented below.
        /// </summary>
        [Output("conditions")]
        public Output<ImmutableArray<Outputs.WorkstationConfigCondition>> Conditions { get; private set; } = null!;

        /// <summary>
        /// Container that will be run for each workstation using this configuration when that workstation is started.
        /// Structure is documented below.
        /// </summary>
        [Output("container")]
        public Output<Outputs.WorkstationConfigContainer> Container { get; private set; } = null!;

        /// <summary>
        /// Time the Instance was created in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Whether this resource is in degraded mode, in which case it may require user action to restore full functionality. Details can be found in the conditions field.
        /// </summary>
        [Output("degraded")]
        public Output<bool> Degraded { get; private set; } = null!;

        /// <summary>
        /// Human-readable name for this resource.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Encrypts resources of this workstation configuration using a customer-managed encryption key.
        /// If specified, the boot disk of the Compute Engine instance and the persistent disk are encrypted using this encryption key. If this field is not set, the disks are encrypted using a generated key. Customer-managed encryption keys do not protect disk metadata.
        /// If the customer-managed encryption key is rotated, when the workstation instance is stopped, the system attempts to recreate the persistent disk with the new version of the key. Be sure to keep older versions of the key until the persistent disk is recreated. Otherwise, data on the persistent disk will be lost.
        /// If the encryption key is revoked, the workstation session will automatically be stopped within 7 hours.
        /// Structure is documented below.
        /// </summary>
        [Output("encryptionKey")]
        public Output<Outputs.WorkstationConfigEncryptionKey?> EncryptionKey { get; private set; } = null!;

        /// <summary>
        /// Checksum computed by the server.
        /// May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Runtime host for a workstation.
        /// Structure is documented below.
        /// </summary>
        [Output("host")]
        public Output<Outputs.WorkstationConfigHost> Host { get; private set; } = null!;

        /// <summary>
        /// Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location where the workstation cluster config should reside.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Full name of this resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Directories to persist across workstation sessions.
        /// Structure is documented below.
        /// </summary>
        [Output("persistentDirectories")]
        public Output<ImmutableArray<Outputs.WorkstationConfigPersistentDirectory>> PersistentDirectories { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The system-generated UID of the resource.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// The name of the workstation cluster.
        /// </summary>
        [Output("workstationClusterId")]
        public Output<string> WorkstationClusterId { get; private set; } = null!;

        /// <summary>
        /// The ID of the workstation cluster config.
        /// </summary>
        [Output("workstationConfigId")]
        public Output<string> WorkstationConfigId { get; private set; } = null!;


        /// <summary>
        /// Create a WorkstationConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkstationConfig(string name, WorkstationConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:workstations/workstationConfig:WorkstationConfig", name, args ?? new WorkstationConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkstationConfig(string name, Input<string> id, WorkstationConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:workstations/workstationConfig:WorkstationConfig", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WorkstationConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkstationConfig Get(string name, Input<string> id, WorkstationConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkstationConfig(name, id, state, options);
        }
    }

    public sealed class WorkstationConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Client-specified annotations. This is distinct from labels.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Container that will be run for each workstation using this configuration when that workstation is started.
        /// Structure is documented below.
        /// </summary>
        [Input("container")]
        public Input<Inputs.WorkstationConfigContainerArgs>? Container { get; set; }

        /// <summary>
        /// Human-readable name for this resource.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Encrypts resources of this workstation configuration using a customer-managed encryption key.
        /// If specified, the boot disk of the Compute Engine instance and the persistent disk are encrypted using this encryption key. If this field is not set, the disks are encrypted using a generated key. Customer-managed encryption keys do not protect disk metadata.
        /// If the customer-managed encryption key is rotated, when the workstation instance is stopped, the system attempts to recreate the persistent disk with the new version of the key. Be sure to keep older versions of the key until the persistent disk is recreated. Otherwise, data on the persistent disk will be lost.
        /// If the encryption key is revoked, the workstation session will automatically be stopped within 7 hours.
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionKey")]
        public Input<Inputs.WorkstationConfigEncryptionKeyArgs>? EncryptionKey { get; set; }

        /// <summary>
        /// Runtime host for a workstation.
        /// Structure is documented below.
        /// </summary>
        [Input("host")]
        public Input<Inputs.WorkstationConfigHostArgs>? Host { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location where the workstation cluster config should reside.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("persistentDirectories")]
        private InputList<Inputs.WorkstationConfigPersistentDirectoryArgs>? _persistentDirectories;

        /// <summary>
        /// Directories to persist across workstation sessions.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkstationConfigPersistentDirectoryArgs> PersistentDirectories
        {
            get => _persistentDirectories ?? (_persistentDirectories = new InputList<Inputs.WorkstationConfigPersistentDirectoryArgs>());
            set => _persistentDirectories = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the workstation cluster.
        /// </summary>
        [Input("workstationClusterId", required: true)]
        public Input<string> WorkstationClusterId { get; set; } = null!;

        /// <summary>
        /// The ID of the workstation cluster config.
        /// </summary>
        [Input("workstationConfigId", required: true)]
        public Input<string> WorkstationConfigId { get; set; } = null!;

        public WorkstationConfigArgs()
        {
        }
        public static new WorkstationConfigArgs Empty => new WorkstationConfigArgs();
    }

    public sealed class WorkstationConfigState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Client-specified annotations. This is distinct from labels.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("conditions")]
        private InputList<Inputs.WorkstationConfigConditionGetArgs>? _conditions;

        /// <summary>
        /// Status conditions describing the current resource state.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkstationConfigConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.WorkstationConfigConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Container that will be run for each workstation using this configuration when that workstation is started.
        /// Structure is documented below.
        /// </summary>
        [Input("container")]
        public Input<Inputs.WorkstationConfigContainerGetArgs>? Container { get; set; }

        /// <summary>
        /// Time the Instance was created in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Whether this resource is in degraded mode, in which case it may require user action to restore full functionality. Details can be found in the conditions field.
        /// </summary>
        [Input("degraded")]
        public Input<bool>? Degraded { get; set; }

        /// <summary>
        /// Human-readable name for this resource.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Encrypts resources of this workstation configuration using a customer-managed encryption key.
        /// If specified, the boot disk of the Compute Engine instance and the persistent disk are encrypted using this encryption key. If this field is not set, the disks are encrypted using a generated key. Customer-managed encryption keys do not protect disk metadata.
        /// If the customer-managed encryption key is rotated, when the workstation instance is stopped, the system attempts to recreate the persistent disk with the new version of the key. Be sure to keep older versions of the key until the persistent disk is recreated. Otherwise, data on the persistent disk will be lost.
        /// If the encryption key is revoked, the workstation session will automatically be stopped within 7 hours.
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionKey")]
        public Input<Inputs.WorkstationConfigEncryptionKeyGetArgs>? EncryptionKey { get; set; }

        /// <summary>
        /// Checksum computed by the server.
        /// May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Runtime host for a workstation.
        /// Structure is documented below.
        /// </summary>
        [Input("host")]
        public Input<Inputs.WorkstationConfigHostGetArgs>? Host { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location where the workstation cluster config should reside.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Full name of this resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("persistentDirectories")]
        private InputList<Inputs.WorkstationConfigPersistentDirectoryGetArgs>? _persistentDirectories;

        /// <summary>
        /// Directories to persist across workstation sessions.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkstationConfigPersistentDirectoryGetArgs> PersistentDirectories
        {
            get => _persistentDirectories ?? (_persistentDirectories = new InputList<Inputs.WorkstationConfigPersistentDirectoryGetArgs>());
            set => _persistentDirectories = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The system-generated UID of the resource.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// The name of the workstation cluster.
        /// </summary>
        [Input("workstationClusterId")]
        public Input<string>? WorkstationClusterId { get; set; }

        /// <summary>
        /// The ID of the workstation cluster config.
        /// </summary>
        [Input("workstationConfigId")]
        public Input<string>? WorkstationConfigId { get; set; }

        public WorkstationConfigState()
        {
        }
        public static new WorkstationConfigState Empty => new WorkstationConfigState();
    }
}
