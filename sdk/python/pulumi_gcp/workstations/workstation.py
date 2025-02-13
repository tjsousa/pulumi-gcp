# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['WorkstationArgs', 'Workstation']

@pulumi.input_type
class WorkstationArgs:
    def __init__(__self__, *,
                 location: pulumi.Input[str],
                 workstation_cluster_id: pulumi.Input[str],
                 workstation_config_id: pulumi.Input[str],
                 workstation_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Workstation resource.
        :param pulumi.Input[str] location: The location where the workstation cluster config should reside.
        :param pulumi.Input[str] workstation_cluster_id: The name of the workstation cluster.
        :param pulumi.Input[str] workstation_config_id: The ID of the workstation cluster config.
        :param pulumi.Input[str] workstation_id: ID to use for the workstation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Client-specified annotations. This is distinct from labels.
        :param pulumi.Input[str] display_name: Human-readable name for this resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "workstation_cluster_id", workstation_cluster_id)
        pulumi.set(__self__, "workstation_config_id", workstation_config_id)
        pulumi.set(__self__, "workstation_id", workstation_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def location(self) -> pulumi.Input[str]:
        """
        The location where the workstation cluster config should reside.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[str]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="workstationClusterId")
    def workstation_cluster_id(self) -> pulumi.Input[str]:
        """
        The name of the workstation cluster.
        """
        return pulumi.get(self, "workstation_cluster_id")

    @workstation_cluster_id.setter
    def workstation_cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workstation_cluster_id", value)

    @property
    @pulumi.getter(name="workstationConfigId")
    def workstation_config_id(self) -> pulumi.Input[str]:
        """
        The ID of the workstation cluster config.
        """
        return pulumi.get(self, "workstation_config_id")

    @workstation_config_id.setter
    def workstation_config_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workstation_config_id", value)

    @property
    @pulumi.getter(name="workstationId")
    def workstation_id(self) -> pulumi.Input[str]:
        """
        ID to use for the workstation.
        """
        return pulumi.get(self, "workstation_id")

    @workstation_id.setter
    def workstation_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workstation_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Client-specified annotations. This is distinct from labels.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable name for this resource.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _WorkstationState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 workstation_cluster_id: Optional[pulumi.Input[str]] = None,
                 workstation_config_id: Optional[pulumi.Input[str]] = None,
                 workstation_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Workstation resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Client-specified annotations. This is distinct from labels.
        :param pulumi.Input[str] create_time: Time the Instance was created in UTC.
        :param pulumi.Input[str] display_name: Human-readable name for this resource.
        :param pulumi.Input[str] host: Host to which clients can send HTTPS traffic that will be received by the workstation.
               Authorized traffic will be received to the workstation as HTTP on port 80.
               To send traffic to a different port, clients may prefix the host with the destination port in the format "{port}-{host}".
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        :param pulumi.Input[str] location: The location where the workstation cluster config should reside.
        :param pulumi.Input[str] name: The name of the cluster resource.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] state: Current state of the workstation.
        :param pulumi.Input[str] uid: The system-generated UID of the resource.
        :param pulumi.Input[str] workstation_cluster_id: The name of the workstation cluster.
        :param pulumi.Input[str] workstation_config_id: The ID of the workstation cluster config.
        :param pulumi.Input[str] workstation_id: ID to use for the workstation.
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)
        if workstation_cluster_id is not None:
            pulumi.set(__self__, "workstation_cluster_id", workstation_cluster_id)
        if workstation_config_id is not None:
            pulumi.set(__self__, "workstation_config_id", workstation_config_id)
        if workstation_id is not None:
            pulumi.set(__self__, "workstation_id", workstation_id)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Client-specified annotations. This is distinct from labels.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Time the Instance was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable name for this resource.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[str]]:
        """
        Host to which clients can send HTTPS traffic that will be received by the workstation.
        Authorized traffic will be received to the workstation as HTTP on port 80.
        To send traffic to a different port, clients may prefix the host with the destination port in the format "{port}-{host}".
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location where the workstation cluster config should reside.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cluster resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Current state of the workstation.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[str]]:
        """
        The system-generated UID of the resource.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uid", value)

    @property
    @pulumi.getter(name="workstationClusterId")
    def workstation_cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the workstation cluster.
        """
        return pulumi.get(self, "workstation_cluster_id")

    @workstation_cluster_id.setter
    def workstation_cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workstation_cluster_id", value)

    @property
    @pulumi.getter(name="workstationConfigId")
    def workstation_config_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the workstation cluster config.
        """
        return pulumi.get(self, "workstation_config_id")

    @workstation_config_id.setter
    def workstation_config_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workstation_config_id", value)

    @property
    @pulumi.getter(name="workstationId")
    def workstation_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID to use for the workstation.
        """
        return pulumi.get(self, "workstation_id")

    @workstation_id.setter
    def workstation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workstation_id", value)


class Workstation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 workstation_cluster_id: Optional[pulumi.Input[str]] = None,
                 workstation_config_id: Optional[pulumi.Input[str]] = None,
                 workstation_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Workstation Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_network = gcp.compute.Network("defaultNetwork", auto_create_subnetworks=False,
        opts=pulumi.ResourceOptions(provider=google_beta))
        default_subnetwork = gcp.compute.Subnetwork("defaultSubnetwork",
            ip_cidr_range="10.0.0.0/24",
            region="us-central1",
            network=default_network.name,
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_workstation_cluster = gcp.workstations.WorkstationCluster("defaultWorkstationCluster",
            workstation_cluster_id="workstation-cluster",
            network=default_network.id,
            subnetwork=default_subnetwork.id,
            location="us-central1",
            labels={
                "label": "key",
            },
            annotations={
                "label-one": "value-one",
            },
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_workstation_config = gcp.workstations.WorkstationConfig("defaultWorkstationConfig",
            workstation_config_id="workstation-config",
            workstation_cluster_id=default_workstation_cluster.workstation_cluster_id,
            location="us-central1",
            host=gcp.workstations.WorkstationConfigHostArgs(
                gce_instance=gcp.workstations.WorkstationConfigHostGceInstanceArgs(
                    machine_type="e2-standard-4",
                    boot_disk_size_gb=35,
                    disable_public_ip_addresses=True,
                ),
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_workstation = gcp.workstations.Workstation("defaultWorkstation",
            workstation_id="workstation",
            workstation_config_id=default_workstation_config.workstation_config_id,
            workstation_cluster_id=default_workstation_cluster.workstation_cluster_id,
            location="us-central1",
            labels={
                "label": "key",
            },
            annotations={
                "label-one": "value-one",
            },
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        Workstation can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:workstations/workstation:Workstation default projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
        ```

        ```sh
         $ pulumi import gcp:workstations/workstation:Workstation default {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
        ```

        ```sh
         $ pulumi import gcp:workstations/workstation:Workstation default {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Client-specified annotations. This is distinct from labels.
        :param pulumi.Input[str] display_name: Human-readable name for this resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        :param pulumi.Input[str] location: The location where the workstation cluster config should reside.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] workstation_cluster_id: The name of the workstation cluster.
        :param pulumi.Input[str] workstation_config_id: The ID of the workstation cluster config.
        :param pulumi.Input[str] workstation_id: ID to use for the workstation.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkstationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Workstation Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_network = gcp.compute.Network("defaultNetwork", auto_create_subnetworks=False,
        opts=pulumi.ResourceOptions(provider=google_beta))
        default_subnetwork = gcp.compute.Subnetwork("defaultSubnetwork",
            ip_cidr_range="10.0.0.0/24",
            region="us-central1",
            network=default_network.name,
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_workstation_cluster = gcp.workstations.WorkstationCluster("defaultWorkstationCluster",
            workstation_cluster_id="workstation-cluster",
            network=default_network.id,
            subnetwork=default_subnetwork.id,
            location="us-central1",
            labels={
                "label": "key",
            },
            annotations={
                "label-one": "value-one",
            },
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_workstation_config = gcp.workstations.WorkstationConfig("defaultWorkstationConfig",
            workstation_config_id="workstation-config",
            workstation_cluster_id=default_workstation_cluster.workstation_cluster_id,
            location="us-central1",
            host=gcp.workstations.WorkstationConfigHostArgs(
                gce_instance=gcp.workstations.WorkstationConfigHostGceInstanceArgs(
                    machine_type="e2-standard-4",
                    boot_disk_size_gb=35,
                    disable_public_ip_addresses=True,
                ),
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_workstation = gcp.workstations.Workstation("defaultWorkstation",
            workstation_id="workstation",
            workstation_config_id=default_workstation_config.workstation_config_id,
            workstation_cluster_id=default_workstation_cluster.workstation_cluster_id,
            location="us-central1",
            labels={
                "label": "key",
            },
            annotations={
                "label-one": "value-one",
            },
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        Workstation can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:workstations/workstation:Workstation default projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
        ```

        ```sh
         $ pulumi import gcp:workstations/workstation:Workstation default {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
        ```

        ```sh
         $ pulumi import gcp:workstations/workstation:Workstation default {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
        ```

        :param str resource_name: The name of the resource.
        :param WorkstationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkstationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 workstation_cluster_id: Optional[pulumi.Input[str]] = None,
                 workstation_config_id: Optional[pulumi.Input[str]] = None,
                 workstation_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkstationArgs.__new__(WorkstationArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["labels"] = labels
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["project"] = project
            if workstation_cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'workstation_cluster_id'")
            __props__.__dict__["workstation_cluster_id"] = workstation_cluster_id
            if workstation_config_id is None and not opts.urn:
                raise TypeError("Missing required property 'workstation_config_id'")
            __props__.__dict__["workstation_config_id"] = workstation_config_id
            if workstation_id is None and not opts.urn:
                raise TypeError("Missing required property 'workstation_id'")
            __props__.__dict__["workstation_id"] = workstation_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["host"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["uid"] = None
        super(Workstation, __self__).__init__(
            'gcp:workstations/workstation:Workstation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            host: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            uid: Optional[pulumi.Input[str]] = None,
            workstation_cluster_id: Optional[pulumi.Input[str]] = None,
            workstation_config_id: Optional[pulumi.Input[str]] = None,
            workstation_id: Optional[pulumi.Input[str]] = None) -> 'Workstation':
        """
        Get an existing Workstation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Client-specified annotations. This is distinct from labels.
        :param pulumi.Input[str] create_time: Time the Instance was created in UTC.
        :param pulumi.Input[str] display_name: Human-readable name for this resource.
        :param pulumi.Input[str] host: Host to which clients can send HTTPS traffic that will be received by the workstation.
               Authorized traffic will be received to the workstation as HTTP on port 80.
               To send traffic to a different port, clients may prefix the host with the destination port in the format "{port}-{host}".
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        :param pulumi.Input[str] location: The location where the workstation cluster config should reside.
        :param pulumi.Input[str] name: The name of the cluster resource.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] state: Current state of the workstation.
        :param pulumi.Input[str] uid: The system-generated UID of the resource.
        :param pulumi.Input[str] workstation_cluster_id: The name of the workstation cluster.
        :param pulumi.Input[str] workstation_config_id: The ID of the workstation cluster config.
        :param pulumi.Input[str] workstation_id: ID to use for the workstation.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkstationState.__new__(_WorkstationState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["host"] = host
        __props__.__dict__["labels"] = labels
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["state"] = state
        __props__.__dict__["uid"] = uid
        __props__.__dict__["workstation_cluster_id"] = workstation_cluster_id
        __props__.__dict__["workstation_config_id"] = workstation_config_id
        __props__.__dict__["workstation_id"] = workstation_id
        return Workstation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Client-specified annotations. This is distinct from labels.
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Time the Instance was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        Human-readable name for this resource.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        """
        Host to which clients can send HTTPS traffic that will be received by the workstation.
        Authorized traffic will be received to the workstation as HTTP on port 80.
        To send traffic to a different port, clients may prefix the host with the destination port in the format "{port}-{host}".
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The location where the workstation cluster config should reside.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the cluster resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Current state of the workstation.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def uid(self) -> pulumi.Output[str]:
        """
        The system-generated UID of the resource.
        """
        return pulumi.get(self, "uid")

    @property
    @pulumi.getter(name="workstationClusterId")
    def workstation_cluster_id(self) -> pulumi.Output[str]:
        """
        The name of the workstation cluster.
        """
        return pulumi.get(self, "workstation_cluster_id")

    @property
    @pulumi.getter(name="workstationConfigId")
    def workstation_config_id(self) -> pulumi.Output[str]:
        """
        The ID of the workstation cluster config.
        """
        return pulumi.get(self, "workstation_config_id")

    @property
    @pulumi.getter(name="workstationId")
    def workstation_id(self) -> pulumi.Output[str]:
        """
        ID to use for the workstation.
        """
        return pulumi.get(self, "workstation_id")

