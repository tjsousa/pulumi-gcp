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
    public sealed class GetClusterNodePoolAutoscalingResult
    {
        public readonly string LocationPolicy;
        public readonly int MaxNodeCount;
        public readonly int MinNodeCount;
        public readonly int TotalMaxNodeCount;
        public readonly int TotalMinNodeCount;

        [OutputConstructor]
        private GetClusterNodePoolAutoscalingResult(
            string locationPolicy,

            int maxNodeCount,

            int minNodeCount,

            int totalMaxNodeCount,

            int totalMinNodeCount)
        {
            LocationPolicy = locationPolicy;
            MaxNodeCount = maxNodeCount;
            MinNodeCount = minNodeCount;
            TotalMaxNodeCount = totalMaxNodeCount;
            TotalMinNodeCount = totalMinNodeCount;
        }
    }
}
