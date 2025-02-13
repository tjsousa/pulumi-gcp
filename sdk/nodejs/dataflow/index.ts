// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { FlexTemplateJobArgs, FlexTemplateJobState } from "./flexTemplateJob";
export type FlexTemplateJob = import("./flexTemplateJob").FlexTemplateJob;
export const FlexTemplateJob: typeof import("./flexTemplateJob").FlexTemplateJob = null as any;
utilities.lazyLoad(exports, ["FlexTemplateJob"], () => require("./flexTemplateJob"));

export { JobArgs, JobState } from "./job";
export type Job = import("./job").Job;
export const Job: typeof import("./job").Job = null as any;
utilities.lazyLoad(exports, ["Job"], () => require("./job"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:dataflow/flexTemplateJob:FlexTemplateJob":
                return new FlexTemplateJob(name, <any>undefined, { urn })
            case "gcp:dataflow/job:Job":
                return new Job(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "dataflow/flexTemplateJob", _module)
pulumi.runtime.registerResourceModule("gcp", "dataflow/job", _module)
