// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class BucketAutoclass
    {
        /// <summary>
        /// While set to `true`, autoclass automatically transitions objects in your bucket to appropriate storage classes based on each object's access pattern.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private BucketAutoclass(bool enabled)
        {
            Enabled = enabled;
        }
    }
}
