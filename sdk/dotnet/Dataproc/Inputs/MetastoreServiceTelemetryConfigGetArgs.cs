// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class MetastoreServiceTelemetryConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The output format of the Dataproc Metastore service's logs.
        /// Default value is `JSON`.
        /// Possible values are `LEGACY` and `JSON`.
        /// </summary>
        [Input("logFormat")]
        public Input<string>? LogFormat { get; set; }

        public MetastoreServiceTelemetryConfigGetArgs()
        {
        }
        public static new MetastoreServiceTelemetryConfigGetArgs Empty => new MetastoreServiceTelemetryConfigGetArgs();
    }
}
