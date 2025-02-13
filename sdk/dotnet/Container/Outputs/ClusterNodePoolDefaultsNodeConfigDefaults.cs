// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class ClusterNodePoolDefaultsNodeConfigDefaults
    {
        /// <summary>
        /// ) The default Google Container Filesystem (GCFS) configuration at the cluster level. e.g. enable [image streaming](https://cloud.google.com/kubernetes-engine/docs/how-to/image-streaming) across all the node pools within the cluster. Structure is documented below.
        /// </summary>
        public readonly Outputs.ClusterNodePoolDefaultsNodeConfigDefaultsGcfsConfig? GcfsConfig;
        /// <summary>
        /// The type of logging agent that is deployed by default for newly created node pools in the cluster. Valid values include DEFAULT and MAX_THROUGHPUT. See [Increasing logging agent throughput](https://cloud.google.com/stackdriver/docs/solutions/gke/managing-logs#throughput) for more information.
        /// </summary>
        public readonly string? LoggingVariant;

        [OutputConstructor]
        private ClusterNodePoolDefaultsNodeConfigDefaults(
            Outputs.ClusterNodePoolDefaultsNodeConfigDefaultsGcfsConfig? gcfsConfig,

            string? loggingVariant)
        {
            GcfsConfig = gcfsConfig;
            LoggingVariant = loggingVariant;
        }
    }
}
