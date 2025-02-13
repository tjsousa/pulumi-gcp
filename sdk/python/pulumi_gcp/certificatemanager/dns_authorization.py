# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DnsAuthorizationArgs', 'DnsAuthorization']

@pulumi.input_type
class DnsAuthorizationArgs:
    def __init__(__self__, *,
                 domain: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DnsAuthorization resource.
        :param pulumi.Input[str] domain: A domain which is being authorized. A DnsAuthorization resource covers a
               single domain and its wildcard, e.g. authorization for "example.com" can
               be used to issue certificates for "example.com" and "*.example.com".
        :param pulumi.Input[str] description: A human-readable description of the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the DNS Authorization resource.
        :param pulumi.Input[str] name: Name of the resource; provided by the client when the resource is created.
               The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
               and all following characters must be a dash, underscore, letter or digit.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "domain", domain)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        A domain which is being authorized. A DnsAuthorization resource covers a
        single domain and its wildcard, e.g. authorization for "example.com" can
        be used to issue certificates for "example.com" and "*.example.com".
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A human-readable description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Set of label tags associated with the DNS Authorization resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource; provided by the client when the resource is created.
        The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
        and all following characters must be a dash, underscore, letter or digit.
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


@pulumi.input_type
class _DnsAuthorizationState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 dns_resource_records: Optional[pulumi.Input[Sequence[pulumi.Input['DnsAuthorizationDnsResourceRecordArgs']]]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DnsAuthorization resources.
        :param pulumi.Input[str] description: A human-readable description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input['DnsAuthorizationDnsResourceRecordArgs']]] dns_resource_records: The structure describing the DNS Resource Record that needs to be added
               to DNS configuration for the authorization to be usable by
               certificate.
               Structure is documented below.
        :param pulumi.Input[str] domain: A domain which is being authorized. A DnsAuthorization resource covers a
               single domain and its wildcard, e.g. authorization for "example.com" can
               be used to issue certificates for "example.com" and "*.example.com".
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the DNS Authorization resource.
        :param pulumi.Input[str] name: Name of the resource; provided by the client when the resource is created.
               The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
               and all following characters must be a dash, underscore, letter or digit.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dns_resource_records is not None:
            pulumi.set(__self__, "dns_resource_records", dns_resource_records)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A human-readable description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dnsResourceRecords")
    def dns_resource_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DnsAuthorizationDnsResourceRecordArgs']]]]:
        """
        The structure describing the DNS Resource Record that needs to be added
        to DNS configuration for the authorization to be usable by
        certificate.
        Structure is documented below.
        """
        return pulumi.get(self, "dns_resource_records")

    @dns_resource_records.setter
    def dns_resource_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DnsAuthorizationDnsResourceRecordArgs']]]]):
        pulumi.set(self, "dns_resource_records", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        A domain which is being authorized. A DnsAuthorization resource covers a
        single domain and its wildcard, e.g. authorization for "example.com" can
        be used to issue certificates for "example.com" and "*.example.com".
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Set of label tags associated with the DNS Authorization resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource; provided by the client when the resource is created.
        The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
        and all following characters must be a dash, underscore, letter or digit.
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


class DnsAuthorization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        DnsAuthorization represents a HTTP-reachable backend for a DnsAuthorization.

        ## Example Usage
        ### Certificate Manager Dns Authorization Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.certificatemanager.DnsAuthorization("default",
            description="The default dnss",
            domain="%{random_suffix}.hashicorptest.com")
        pulumi.export("recordNameToInsert", {
            "google_certificate_manager_dns_authorization.default.dns_resource_record.0.name": [{}],
            "value": "",
        })
        pulumi.export("recordTypeToInsert", {
            "google_certificate_manager_dns_authorization.default.dns_resource_record.0.type": [{}],
            "value": "",
        })
        pulumi.export("recordDataToInsert", {
            "google_certificate_manager_dns_authorization.default.dns_resource_record.0.data": [{}],
            "value": "",
        })
        ```

        ## Import

        DnsAuthorization can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:certificatemanager/dnsAuthorization:DnsAuthorization default projects/{{project}}/locations/global/dnsAuthorizations/{{name}}
        ```

        ```sh
         $ pulumi import gcp:certificatemanager/dnsAuthorization:DnsAuthorization default {{project}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:certificatemanager/dnsAuthorization:DnsAuthorization default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A human-readable description of the resource.
        :param pulumi.Input[str] domain: A domain which is being authorized. A DnsAuthorization resource covers a
               single domain and its wildcard, e.g. authorization for "example.com" can
               be used to issue certificates for "example.com" and "*.example.com".
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the DNS Authorization resource.
        :param pulumi.Input[str] name: Name of the resource; provided by the client when the resource is created.
               The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
               and all following characters must be a dash, underscore, letter or digit.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DnsAuthorizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        DnsAuthorization represents a HTTP-reachable backend for a DnsAuthorization.

        ## Example Usage
        ### Certificate Manager Dns Authorization Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.certificatemanager.DnsAuthorization("default",
            description="The default dnss",
            domain="%{random_suffix}.hashicorptest.com")
        pulumi.export("recordNameToInsert", {
            "google_certificate_manager_dns_authorization.default.dns_resource_record.0.name": [{}],
            "value": "",
        })
        pulumi.export("recordTypeToInsert", {
            "google_certificate_manager_dns_authorization.default.dns_resource_record.0.type": [{}],
            "value": "",
        })
        pulumi.export("recordDataToInsert", {
            "google_certificate_manager_dns_authorization.default.dns_resource_record.0.data": [{}],
            "value": "",
        })
        ```

        ## Import

        DnsAuthorization can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:certificatemanager/dnsAuthorization:DnsAuthorization default projects/{{project}}/locations/global/dnsAuthorizations/{{name}}
        ```

        ```sh
         $ pulumi import gcp:certificatemanager/dnsAuthorization:DnsAuthorization default {{project}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:certificatemanager/dnsAuthorization:DnsAuthorization default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param DnsAuthorizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DnsAuthorizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DnsAuthorizationArgs.__new__(DnsAuthorizationArgs)

            __props__.__dict__["description"] = description
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["dns_resource_records"] = None
        super(DnsAuthorization, __self__).__init__(
            'gcp:certificatemanager/dnsAuthorization:DnsAuthorization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            dns_resource_records: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DnsAuthorizationDnsResourceRecordArgs']]]]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None) -> 'DnsAuthorization':
        """
        Get an existing DnsAuthorization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A human-readable description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DnsAuthorizationDnsResourceRecordArgs']]]] dns_resource_records: The structure describing the DNS Resource Record that needs to be added
               to DNS configuration for the authorization to be usable by
               certificate.
               Structure is documented below.
        :param pulumi.Input[str] domain: A domain which is being authorized. A DnsAuthorization resource covers a
               single domain and its wildcard, e.g. authorization for "example.com" can
               be used to issue certificates for "example.com" and "*.example.com".
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the DNS Authorization resource.
        :param pulumi.Input[str] name: Name of the resource; provided by the client when the resource is created.
               The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
               and all following characters must be a dash, underscore, letter or digit.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DnsAuthorizationState.__new__(_DnsAuthorizationState)

        __props__.__dict__["description"] = description
        __props__.__dict__["dns_resource_records"] = dns_resource_records
        __props__.__dict__["domain"] = domain
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        return DnsAuthorization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A human-readable description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="dnsResourceRecords")
    def dns_resource_records(self) -> pulumi.Output[Sequence['outputs.DnsAuthorizationDnsResourceRecord']]:
        """
        The structure describing the DNS Resource Record that needs to be added
        to DNS configuration for the authorization to be usable by
        certificate.
        Structure is documented below.
        """
        return pulumi.get(self, "dns_resource_records")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        A domain which is being authorized. A DnsAuthorization resource covers a
        single domain and its wildcard, e.g. authorization for "example.com" can
        be used to issue certificates for "example.com" and "*.example.com".
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Set of label tags associated with the DNS Authorization resource.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the resource; provided by the client when the resource is created.
        The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
        and all following characters must be a dash, underscore, letter or digit.
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

