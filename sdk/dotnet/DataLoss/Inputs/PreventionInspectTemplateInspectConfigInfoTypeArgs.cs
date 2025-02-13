// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionInspectTemplateInspectConfigInfoTypeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the information type. Either a name of your choosing when creating a CustomInfoType, or one of the names listed
        /// at https://cloud.google.com/dlp/docs/infotypes-reference when specifying a built-in type.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Version of the information type to use. By default, the version is set to stable
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public PreventionInspectTemplateInspectConfigInfoTypeArgs()
        {
        }
        public static new PreventionInspectTemplateInspectConfigInfoTypeArgs Empty => new PreventionInspectTemplateInspectConfigInfoTypeArgs();
    }
}
