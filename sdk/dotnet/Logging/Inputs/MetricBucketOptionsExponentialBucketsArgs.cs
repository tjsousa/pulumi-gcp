// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Logging.Inputs
{

    public sealed class MetricBucketOptionsExponentialBucketsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Must be greater than 1.
        /// </summary>
        [Input("growthFactor")]
        public Input<double>? GrowthFactor { get; set; }

        /// <summary>
        /// Must be greater than 0.
        /// </summary>
        [Input("numFiniteBuckets")]
        public Input<int>? NumFiniteBuckets { get; set; }

        /// <summary>
        /// Must be greater than 0.
        /// </summary>
        [Input("scale")]
        public Input<double>? Scale { get; set; }

        public MetricBucketOptionsExponentialBucketsArgs()
        {
        }
        public static new MetricBucketOptionsExponentialBucketsArgs Empty => new MetricBucketOptionsExponentialBucketsArgs();
    }
}
