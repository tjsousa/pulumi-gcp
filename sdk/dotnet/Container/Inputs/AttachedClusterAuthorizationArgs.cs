// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AttachedClusterAuthorizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminUsers")]
        private InputList<string>? _adminUsers;

        /// <summary>
        /// Users that can perform operations as a cluster admin. A managed
        /// ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
        /// to the users. Up to ten admin users can be provided.
        /// For more info on RBAC, see
        /// https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
        /// </summary>
        public InputList<string> AdminUsers
        {
            get => _adminUsers ?? (_adminUsers = new InputList<string>());
            set => _adminUsers = value;
        }

        public AttachedClusterAuthorizationArgs()
        {
        }
        public static new AttachedClusterAuthorizationArgs Empty => new AttachedClusterAuthorizationArgs();
    }
}
