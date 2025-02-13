# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'AppConnectionApplicationEndpointArgs',
    'AppConnectionGatewayArgs',
    'AppConnectorPrincipalInfoArgs',
    'AppConnectorPrincipalInfoServiceAccountArgs',
    'AppGatewayAllocatedConnectionArgs',
]

@pulumi.input_type
class AppConnectionApplicationEndpointArgs:
    def __init__(__self__, *,
                 host: pulumi.Input[str],
                 port: pulumi.Input[int]):
        """
        :param pulumi.Input[str] host: Hostname or IP address of the remote application endpoint.
        :param pulumi.Input[int] port: Port of the remote application endpoint.
        """
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "port", port)

    @property
    @pulumi.getter
    def host(self) -> pulumi.Input[str]:
        """
        Hostname or IP address of the remote application endpoint.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: pulumi.Input[str]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[int]:
        """
        Port of the remote application endpoint.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[int]):
        pulumi.set(self, "port", value)


@pulumi.input_type
class AppConnectionGatewayArgs:
    def __init__(__self__, *,
                 app_gateway: pulumi.Input[str],
                 ingress_port: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uri: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] app_gateway: AppGateway name in following format: projects/{project_id}/locations/{locationId}/appgateways/{gateway_id}.
        :param pulumi.Input[int] ingress_port: (Output)
               Ingress port reserved on the gateways for this AppConnection, if not specified or zero, the default port is 19443.
        :param pulumi.Input[str] type: The type of hosting used by the gateway. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
               for a list of possible values.
        :param pulumi.Input[str] uri: (Output)
               Server-defined URI for this resource.
        """
        pulumi.set(__self__, "app_gateway", app_gateway)
        if ingress_port is not None:
            pulumi.set(__self__, "ingress_port", ingress_port)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter(name="appGateway")
    def app_gateway(self) -> pulumi.Input[str]:
        """
        AppGateway name in following format: projects/{project_id}/locations/{locationId}/appgateways/{gateway_id}.
        """
        return pulumi.get(self, "app_gateway")

    @app_gateway.setter
    def app_gateway(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_gateway", value)

    @property
    @pulumi.getter(name="ingressPort")
    def ingress_port(self) -> Optional[pulumi.Input[int]]:
        """
        (Output)
        Ingress port reserved on the gateways for this AppConnection, if not specified or zero, the default port is 19443.
        """
        return pulumi.get(self, "ingress_port")

    @ingress_port.setter
    def ingress_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ingress_port", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of hosting used by the gateway. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
        for a list of possible values.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        Server-defined URI for this resource.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)


@pulumi.input_type
class AppConnectorPrincipalInfoArgs:
    def __init__(__self__, *,
                 service_account: pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs']):
        """
        :param pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs'] service_account: ServiceAccount represents a GCP service account.
               Structure is documented below.
        """
        pulumi.set(__self__, "service_account", service_account)

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs']:
        """
        ServiceAccount represents a GCP service account.
        Structure is documented below.
        """
        return pulumi.get(self, "service_account")

    @service_account.setter
    def service_account(self, value: pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs']):
        pulumi.set(self, "service_account", value)


@pulumi.input_type
class AppConnectorPrincipalInfoServiceAccountArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str]):
        """
        :param pulumi.Input[str] email: Email address of the service account.
        """
        pulumi.set(__self__, "email", email)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Email address of the service account.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)


@pulumi.input_type
class AppGatewayAllocatedConnectionArgs:
    def __init__(__self__, *,
                 ingress_port: Optional[pulumi.Input[int]] = None,
                 psc_uri: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[int] ingress_port: The ingress port of an allocated connection.
        :param pulumi.Input[str] psc_uri: The PSC uri of an allocated connection.
        """
        if ingress_port is not None:
            pulumi.set(__self__, "ingress_port", ingress_port)
        if psc_uri is not None:
            pulumi.set(__self__, "psc_uri", psc_uri)

    @property
    @pulumi.getter(name="ingressPort")
    def ingress_port(self) -> Optional[pulumi.Input[int]]:
        """
        The ingress port of an allocated connection.
        """
        return pulumi.get(self, "ingress_port")

    @ingress_port.setter
    def ingress_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ingress_port", value)

    @property
    @pulumi.getter(name="pscUri")
    def psc_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The PSC uri of an allocated connection.
        """
        return pulumi.get(self, "psc_uri")

    @psc_uri.setter
    def psc_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "psc_uri", value)


