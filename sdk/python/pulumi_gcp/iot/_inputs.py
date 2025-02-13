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
    'DeviceConfigArgs',
    'DeviceCredentialArgs',
    'DeviceCredentialPublicKeyArgs',
    'DeviceGatewayConfigArgs',
    'DeviceLastErrorStatusArgs',
    'DeviceStateArgs',
    'RegistryCredentialArgs',
    'RegistryEventNotificationConfigItemArgs',
    'RegistryIamBindingConditionArgs',
    'RegistryIamMemberConditionArgs',
]

@pulumi.input_type
class DeviceConfigArgs:
    def __init__(__self__, *,
                 binary_data: Optional[pulumi.Input[str]] = None,
                 cloud_update_time: Optional[pulumi.Input[str]] = None,
                 device_ack_time: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] binary_data: The device state data.
        :param pulumi.Input[str] cloud_update_time: (Output)
               The time at which this configuration version was updated in Cloud IoT Core.
        :param pulumi.Input[str] device_ack_time: (Output)
               The time at which Cloud IoT Core received the acknowledgment from the device,
               indicating that the device has received this configuration version.
        :param pulumi.Input[str] version: (Output)
               The version of this update.
        """
        if binary_data is not None:
            pulumi.set(__self__, "binary_data", binary_data)
        if cloud_update_time is not None:
            pulumi.set(__self__, "cloud_update_time", cloud_update_time)
        if device_ack_time is not None:
            pulumi.set(__self__, "device_ack_time", device_ack_time)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="binaryData")
    def binary_data(self) -> Optional[pulumi.Input[str]]:
        """
        The device state data.
        """
        return pulumi.get(self, "binary_data")

    @binary_data.setter
    def binary_data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "binary_data", value)

    @property
    @pulumi.getter(name="cloudUpdateTime")
    def cloud_update_time(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The time at which this configuration version was updated in Cloud IoT Core.
        """
        return pulumi.get(self, "cloud_update_time")

    @cloud_update_time.setter
    def cloud_update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud_update_time", value)

    @property
    @pulumi.getter(name="deviceAckTime")
    def device_ack_time(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The time at which Cloud IoT Core received the acknowledgment from the device,
        indicating that the device has received this configuration version.
        """
        return pulumi.get(self, "device_ack_time")

    @device_ack_time.setter
    def device_ack_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_ack_time", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The version of this update.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class DeviceCredentialArgs:
    def __init__(__self__, *,
                 public_key: pulumi.Input['DeviceCredentialPublicKeyArgs'],
                 expiration_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input['DeviceCredentialPublicKeyArgs'] public_key: A public key used to verify the signature of JSON Web Tokens (JWTs).
               Structure is documented below.
        :param pulumi.Input[str] expiration_time: The time at which this credential becomes invalid.
        """
        pulumi.set(__self__, "public_key", public_key)
        if expiration_time is not None:
            pulumi.set(__self__, "expiration_time", expiration_time)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Input['DeviceCredentialPublicKeyArgs']:
        """
        A public key used to verify the signature of JSON Web Tokens (JWTs).
        Structure is documented below.
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: pulumi.Input['DeviceCredentialPublicKeyArgs']):
        pulumi.set(self, "public_key", value)

    @property
    @pulumi.getter(name="expirationTime")
    def expiration_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time at which this credential becomes invalid.
        """
        return pulumi.get(self, "expiration_time")

    @expiration_time.setter
    def expiration_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_time", value)


@pulumi.input_type
class DeviceCredentialPublicKeyArgs:
    def __init__(__self__, *,
                 format: pulumi.Input[str],
                 key: pulumi.Input[str]):
        """
        :param pulumi.Input[str] format: The format of the key.
               Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
        :param pulumi.Input[str] key: The key data.
        """
        pulumi.set(__self__, "format", format)
        pulumi.set(__self__, "key", key)

    @property
    @pulumi.getter
    def format(self) -> pulumi.Input[str]:
        """
        The format of the key.
        Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: pulumi.Input[str]):
        pulumi.set(self, "format", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        The key data.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)


@pulumi.input_type
class DeviceGatewayConfigArgs:
    def __init__(__self__, *,
                 gateway_auth_method: Optional[pulumi.Input[str]] = None,
                 gateway_type: Optional[pulumi.Input[str]] = None,
                 last_accessed_gateway_id: Optional[pulumi.Input[str]] = None,
                 last_accessed_gateway_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] gateway_auth_method: Indicates whether the device is a gateway.
               Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
        :param pulumi.Input[str] gateway_type: Indicates whether the device is a gateway.
               Default value is `NON_GATEWAY`.
               Possible values are `GATEWAY` and `NON_GATEWAY`.
        :param pulumi.Input[str] last_accessed_gateway_id: (Output)
               The ID of the gateway the device accessed most recently.
        :param pulumi.Input[str] last_accessed_gateway_time: (Output)
               The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
        """
        if gateway_auth_method is not None:
            pulumi.set(__self__, "gateway_auth_method", gateway_auth_method)
        if gateway_type is not None:
            pulumi.set(__self__, "gateway_type", gateway_type)
        if last_accessed_gateway_id is not None:
            pulumi.set(__self__, "last_accessed_gateway_id", last_accessed_gateway_id)
        if last_accessed_gateway_time is not None:
            pulumi.set(__self__, "last_accessed_gateway_time", last_accessed_gateway_time)

    @property
    @pulumi.getter(name="gatewayAuthMethod")
    def gateway_auth_method(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether the device is a gateway.
        Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
        """
        return pulumi.get(self, "gateway_auth_method")

    @gateway_auth_method.setter
    def gateway_auth_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway_auth_method", value)

    @property
    @pulumi.getter(name="gatewayType")
    def gateway_type(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether the device is a gateway.
        Default value is `NON_GATEWAY`.
        Possible values are `GATEWAY` and `NON_GATEWAY`.
        """
        return pulumi.get(self, "gateway_type")

    @gateway_type.setter
    def gateway_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway_type", value)

    @property
    @pulumi.getter(name="lastAccessedGatewayId")
    def last_accessed_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The ID of the gateway the device accessed most recently.
        """
        return pulumi.get(self, "last_accessed_gateway_id")

    @last_accessed_gateway_id.setter
    def last_accessed_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_accessed_gateway_id", value)

    @property
    @pulumi.getter(name="lastAccessedGatewayTime")
    def last_accessed_gateway_time(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
        """
        return pulumi.get(self, "last_accessed_gateway_time")

    @last_accessed_gateway_time.setter
    def last_accessed_gateway_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_accessed_gateway_time", value)


@pulumi.input_type
class DeviceLastErrorStatusArgs:
    def __init__(__self__, *,
                 details: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, Any]]]]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 number: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[Mapping[str, Any]]]] details: A list of messages that carry the error details.
        :param pulumi.Input[str] message: A developer-facing error message, which should be in English.
        :param pulumi.Input[int] number: The status code, which should be an enum value of google.rpc.Code.
        """
        if details is not None:
            pulumi.set(__self__, "details", details)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if number is not None:
            pulumi.set(__self__, "number", number)

    @property
    @pulumi.getter
    def details(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, Any]]]]]:
        """
        A list of messages that carry the error details.
        """
        return pulumi.get(self, "details")

    @details.setter
    def details(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, Any]]]]]):
        pulumi.set(self, "details", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        A developer-facing error message, which should be in English.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter
    def number(self) -> Optional[pulumi.Input[int]]:
        """
        The status code, which should be an enum value of google.rpc.Code.
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "number", value)


@pulumi.input_type
class DeviceStateArgs:
    def __init__(__self__, *,
                 binary_data: Optional[pulumi.Input[str]] = None,
                 update_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] binary_data: The device state data.
        :param pulumi.Input[str] update_time: The time at which this state version was updated in Cloud IoT Core.
        """
        if binary_data is not None:
            pulumi.set(__self__, "binary_data", binary_data)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter(name="binaryData")
    def binary_data(self) -> Optional[pulumi.Input[str]]:
        """
        The device state data.
        """
        return pulumi.get(self, "binary_data")

    @binary_data.setter
    def binary_data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "binary_data", value)

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time at which this state version was updated in Cloud IoT Core.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)


@pulumi.input_type
class RegistryCredentialArgs:
    def __init__(__self__, *,
                 public_key_certificate: pulumi.Input[Mapping[str, Any]]):
        """
        :param pulumi.Input[Mapping[str, Any]] public_key_certificate: A public key certificate format and data.
        """
        pulumi.set(__self__, "public_key_certificate", public_key_certificate)

    @property
    @pulumi.getter(name="publicKeyCertificate")
    def public_key_certificate(self) -> pulumi.Input[Mapping[str, Any]]:
        """
        A public key certificate format and data.
        """
        return pulumi.get(self, "public_key_certificate")

    @public_key_certificate.setter
    def public_key_certificate(self, value: pulumi.Input[Mapping[str, Any]]):
        pulumi.set(self, "public_key_certificate", value)


@pulumi.input_type
class RegistryEventNotificationConfigItemArgs:
    def __init__(__self__, *,
                 pubsub_topic_name: pulumi.Input[str],
                 subfolder_matches: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] pubsub_topic_name: PubSub topic name to publish device events.
        :param pulumi.Input[str] subfolder_matches: If the subfolder name matches this string exactly, this
               configuration will be used. The string must not include the
               leading '/' character. If empty, all strings are matched. Empty
               value can only be used for the last `event_notification_configs`
               item.
        """
        pulumi.set(__self__, "pubsub_topic_name", pubsub_topic_name)
        if subfolder_matches is not None:
            pulumi.set(__self__, "subfolder_matches", subfolder_matches)

    @property
    @pulumi.getter(name="pubsubTopicName")
    def pubsub_topic_name(self) -> pulumi.Input[str]:
        """
        PubSub topic name to publish device events.
        """
        return pulumi.get(self, "pubsub_topic_name")

    @pubsub_topic_name.setter
    def pubsub_topic_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "pubsub_topic_name", value)

    @property
    @pulumi.getter(name="subfolderMatches")
    def subfolder_matches(self) -> Optional[pulumi.Input[str]]:
        """
        If the subfolder name matches this string exactly, this
        configuration will be used. The string must not include the
        leading '/' character. If empty, all strings are matched. Empty
        value can only be used for the last `event_notification_configs`
        item.
        """
        return pulumi.get(self, "subfolder_matches")

    @subfolder_matches.setter
    def subfolder_matches(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subfolder_matches", value)


@pulumi.input_type
class RegistryIamBindingConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class RegistryIamMemberConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


