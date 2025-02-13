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
    public sealed class GetClusterNodePoolNodeConfigGuestAcceleratorGpuSharingConfigResult
    {
        public readonly string GpuSharingStrategy;
        public readonly int MaxSharedClientsPerGpu;

        [OutputConstructor]
        private GetClusterNodePoolNodeConfigGuestAcceleratorGpuSharingConfigResult(
            string gpuSharingStrategy,

            int maxSharedClientsPerGpu)
        {
            GpuSharingStrategy = gpuSharingStrategy;
            MaxSharedClientsPerGpu = maxSharedClientsPerGpu;
        }
    }
}
