// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetInstanceGroupManagerVersionResult
    {
        public readonly string InstanceTemplate;
        /// <summary>
        /// The name of the instance group. Either `name` or `self_link` must be provided.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetInstanceGroupManagerVersionTargetSizeResult> TargetSizes;

        [OutputConstructor]
        private GetInstanceGroupManagerVersionResult(
            string instanceTemplate,

            string name,

            ImmutableArray<Outputs.GetInstanceGroupManagerVersionTargetSizeResult> targetSizes)
        {
            InstanceTemplate = instanceTemplate;
            Name = name;
            TargetSizes = targetSizes;
        }
    }
}
