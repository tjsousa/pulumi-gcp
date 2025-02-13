// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iot.Inputs
{

    public sealed class DeviceGatewayConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the device is a gateway.
        /// Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
        /// </summary>
        [Input("gatewayAuthMethod")]
        public Input<string>? GatewayAuthMethod { get; set; }

        /// <summary>
        /// Indicates whether the device is a gateway.
        /// Default value is `NON_GATEWAY`.
        /// Possible values are `GATEWAY` and `NON_GATEWAY`.
        /// </summary>
        [Input("gatewayType")]
        public Input<string>? GatewayType { get; set; }

        /// <summary>
        /// (Output)
        /// The ID of the gateway the device accessed most recently.
        /// </summary>
        [Input("lastAccessedGatewayId")]
        public Input<string>? LastAccessedGatewayId { get; set; }

        /// <summary>
        /// (Output)
        /// The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
        /// </summary>
        [Input("lastAccessedGatewayTime")]
        public Input<string>? LastAccessedGatewayTime { get; set; }

        public DeviceGatewayConfigGetArgs()
        {
        }
        public static new DeviceGatewayConfigGetArgs Empty => new DeviceGatewayConfigGetArgs();
    }
}
