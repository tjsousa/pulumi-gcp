// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock
    {
        public readonly string CidrBlock;
        public readonly string? DisplayName;

        [OutputConstructor]
        private EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock(
            string cidrBlock,

            string? displayName)
        {
            CidrBlock = cidrBlock;
            DisplayName = displayName;
        }
    }
}
