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
    'SecretIamBindingConditionArgs',
    'SecretIamMemberConditionArgs',
    'SecretReplicationArgs',
    'SecretReplicationUserManagedArgs',
    'SecretReplicationUserManagedReplicaArgs',
    'SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs',
    'SecretRotationArgs',
    'SecretTopicArgs',
]

@pulumi.input_type
class SecretIamBindingConditionArgs:
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
class SecretIamMemberConditionArgs:
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
class SecretReplicationArgs:
    def __init__(__self__, *,
                 automatic: Optional[pulumi.Input[bool]] = None,
                 user_managed: Optional[pulumi.Input['SecretReplicationUserManagedArgs']] = None):
        """
        :param pulumi.Input[bool] automatic: The Secret will automatically be replicated without any restrictions.
        :param pulumi.Input['SecretReplicationUserManagedArgs'] user_managed: The Secret will automatically be replicated without any restrictions.
               Structure is documented below.
        """
        if automatic is not None:
            pulumi.set(__self__, "automatic", automatic)
        if user_managed is not None:
            pulumi.set(__self__, "user_managed", user_managed)

    @property
    @pulumi.getter
    def automatic(self) -> Optional[pulumi.Input[bool]]:
        """
        The Secret will automatically be replicated without any restrictions.
        """
        return pulumi.get(self, "automatic")

    @automatic.setter
    def automatic(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "automatic", value)

    @property
    @pulumi.getter(name="userManaged")
    def user_managed(self) -> Optional[pulumi.Input['SecretReplicationUserManagedArgs']]:
        """
        The Secret will automatically be replicated without any restrictions.
        Structure is documented below.
        """
        return pulumi.get(self, "user_managed")

    @user_managed.setter
    def user_managed(self, value: Optional[pulumi.Input['SecretReplicationUserManagedArgs']]):
        pulumi.set(self, "user_managed", value)


@pulumi.input_type
class SecretReplicationUserManagedArgs:
    def __init__(__self__, *,
                 replicas: pulumi.Input[Sequence[pulumi.Input['SecretReplicationUserManagedReplicaArgs']]]):
        """
        :param pulumi.Input[Sequence[pulumi.Input['SecretReplicationUserManagedReplicaArgs']]] replicas: The list of Replicas for this Secret. Cannot be empty.
               Structure is documented below.
        """
        pulumi.set(__self__, "replicas", replicas)

    @property
    @pulumi.getter
    def replicas(self) -> pulumi.Input[Sequence[pulumi.Input['SecretReplicationUserManagedReplicaArgs']]]:
        """
        The list of Replicas for this Secret. Cannot be empty.
        Structure is documented below.
        """
        return pulumi.get(self, "replicas")

    @replicas.setter
    def replicas(self, value: pulumi.Input[Sequence[pulumi.Input['SecretReplicationUserManagedReplicaArgs']]]):
        pulumi.set(self, "replicas", value)


@pulumi.input_type
class SecretReplicationUserManagedReplicaArgs:
    def __init__(__self__, *,
                 location: pulumi.Input[str],
                 customer_managed_encryption: Optional[pulumi.Input['SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs']] = None):
        """
        :param pulumi.Input[str] location: The canonical IDs of the location to replicate data. For example: "us-east1".
        :param pulumi.Input['SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs'] customer_managed_encryption: Customer Managed Encryption for the secret.
               Structure is documented below.
        """
        pulumi.set(__self__, "location", location)
        if customer_managed_encryption is not None:
            pulumi.set(__self__, "customer_managed_encryption", customer_managed_encryption)

    @property
    @pulumi.getter
    def location(self) -> pulumi.Input[str]:
        """
        The canonical IDs of the location to replicate data. For example: "us-east1".
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[str]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="customerManagedEncryption")
    def customer_managed_encryption(self) -> Optional[pulumi.Input['SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs']]:
        """
        Customer Managed Encryption for the secret.
        Structure is documented below.
        """
        return pulumi.get(self, "customer_managed_encryption")

    @customer_managed_encryption.setter
    def customer_managed_encryption(self, value: Optional[pulumi.Input['SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs']]):
        pulumi.set(self, "customer_managed_encryption", value)


@pulumi.input_type
class SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs:
    def __init__(__self__, *,
                 kms_key_name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] kms_key_name: Describes the Cloud KMS encryption key that will be used to protect destination secret.
        """
        pulumi.set(__self__, "kms_key_name", kms_key_name)

    @property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> pulumi.Input[str]:
        """
        Describes the Cloud KMS encryption key that will be used to protect destination secret.
        """
        return pulumi.get(self, "kms_key_name")

    @kms_key_name.setter
    def kms_key_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "kms_key_name", value)


@pulumi.input_type
class SecretRotationArgs:
    def __init__(__self__, *,
                 next_rotation_time: Optional[pulumi.Input[str]] = None,
                 rotation_period: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] next_rotation_time: Timestamp in UTC at which the Secret is scheduled to rotate.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] rotation_period: The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
               If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
        """
        if next_rotation_time is not None:
            pulumi.set(__self__, "next_rotation_time", next_rotation_time)
        if rotation_period is not None:
            pulumi.set(__self__, "rotation_period", rotation_period)

    @property
    @pulumi.getter(name="nextRotationTime")
    def next_rotation_time(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in UTC at which the Secret is scheduled to rotate.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "next_rotation_time")

    @next_rotation_time.setter
    def next_rotation_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "next_rotation_time", value)

    @property
    @pulumi.getter(name="rotationPeriod")
    def rotation_period(self) -> Optional[pulumi.Input[str]]:
        """
        The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
        If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
        """
        return pulumi.get(self, "rotation_period")

    @rotation_period.setter
    def rotation_period(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rotation_period", value)


@pulumi.input_type
class SecretTopicArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*/topics/*.
               For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
        """
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*/topics/*.
        For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)


