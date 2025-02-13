// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class ServiceTemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// KRM-style annotations for the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("containers")]
        private InputList<Inputs.ServiceTemplateContainerArgs>? _containers;

        /// <summary>
        /// Holds the single container that defines the unit of execution for this task.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceTemplateContainerArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.ServiceTemplateContainerArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
        /// </summary>
        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        /// <summary>
        /// The sandbox environment to host this Revision.
        /// Possible values are `EXECUTION_ENVIRONMENT_GEN1` and `EXECUTION_ENVIRONMENT_GEN2`.
        /// </summary>
        [Input("executionEnvironment")]
        public Input<string>? ExecutionEnvironment { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// KRM-style labels for the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Sets the maximum number of requests that each serving instance can receive.
        /// </summary>
        [Input("maxInstanceRequestConcurrency")]
        public Input<int>? MaxInstanceRequestConcurrency { get; set; }

        /// <summary>
        /// The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
        /// </summary>
        [Input("revision")]
        public Input<string>? Revision { get; set; }

        /// <summary>
        /// Scaling settings for this Revision.
        /// Structure is documented below.
        /// </summary>
        [Input("scaling")]
        public Input<Inputs.ServiceTemplateScalingArgs>? Scaling { get; set; }

        /// <summary>
        /// Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// Max allowed time for an instance to respond to a request.
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        [Input("timeout")]
        public Input<string>? Timeout { get; set; }

        [Input("volumes")]
        private InputList<Inputs.ServiceTemplateVolumeArgs>? _volumes;

        /// <summary>
        /// A list of Volumes to make available to containers.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceTemplateVolumeArgs> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<Inputs.ServiceTemplateVolumeArgs>());
            set => _volumes = value;
        }

        /// <summary>
        /// VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
        /// Structure is documented below.
        /// </summary>
        [Input("vpcAccess")]
        public Input<Inputs.ServiceTemplateVpcAccessArgs>? VpcAccess { get; set; }

        public ServiceTemplateArgs()
        {
        }
        public static new ServiceTemplateArgs Empty => new ServiceTemplateArgs();
    }
}
