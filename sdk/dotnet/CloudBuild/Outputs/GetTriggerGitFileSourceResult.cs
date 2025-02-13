// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Outputs
{

    [OutputType]
    public sealed class GetTriggerGitFileSourceResult
    {
        public readonly string GithubEnterpriseConfig;
        public readonly string Path;
        public readonly string RepoType;
        public readonly string Revision;
        public readonly string Uri;

        [OutputConstructor]
        private GetTriggerGitFileSourceResult(
            string githubEnterpriseConfig,

            string path,

            string repoType,

            string revision,

            string uri)
        {
            GithubEnterpriseConfig = githubEnterpriseConfig;
            Path = path;
            RepoType = repoType;
            Revision = revision;
            Uri = uri;
        }
    }
}
