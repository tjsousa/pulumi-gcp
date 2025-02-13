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
    'ClusterAutomatedBackupPolicyArgs',
    'ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs',
    'ClusterAutomatedBackupPolicyTimeBasedRetentionArgs',
    'ClusterAutomatedBackupPolicyWeeklyScheduleArgs',
    'ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs',
    'ClusterBackupSourceArgs',
    'ClusterInitialUserArgs',
    'ClusterMigrationSourceArgs',
    'InstanceMachineConfigArgs',
    'InstanceReadPoolConfigArgs',
]

@pulumi.input_type
class ClusterAutomatedBackupPolicyArgs:
    def __init__(__self__, *,
                 backup_window: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 quantity_based_retention: Optional[pulumi.Input['ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs']] = None,
                 time_based_retention: Optional[pulumi.Input['ClusterAutomatedBackupPolicyTimeBasedRetentionArgs']] = None,
                 weekly_schedule: Optional[pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleArgs']] = None):
        """
        :param pulumi.Input[str] backup_window: The length of the time window during which a backup can be taken. If a backup does not succeed within this time window, it will be canceled and considered failed.
               The backup window must be at least 5 minutes long. There is no upper bound on the window. If not set, it will default to 1 hour.
               A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        :param pulumi.Input[bool] enabled: Whether automated backups are enabled.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels to apply to backups created using this configuration.
        :param pulumi.Input[str] location: The location where the backup will be stored. Currently, the only supported option is to store the backup in the same region as the cluster.
        :param pulumi.Input['ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs'] quantity_based_retention: Quantity-based Backup retention policy to retain recent backups.
               Structure is documented below.
        :param pulumi.Input['ClusterAutomatedBackupPolicyTimeBasedRetentionArgs'] time_based_retention: Time-based Backup retention policy.
               Structure is documented below.
        :param pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleArgs'] weekly_schedule: Weekly schedule for the Backup.
               Structure is documented below.
        """
        if backup_window is not None:
            pulumi.set(__self__, "backup_window", backup_window)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if quantity_based_retention is not None:
            pulumi.set(__self__, "quantity_based_retention", quantity_based_retention)
        if time_based_retention is not None:
            pulumi.set(__self__, "time_based_retention", time_based_retention)
        if weekly_schedule is not None:
            pulumi.set(__self__, "weekly_schedule", weekly_schedule)

    @property
    @pulumi.getter(name="backupWindow")
    def backup_window(self) -> Optional[pulumi.Input[str]]:
        """
        The length of the time window during which a backup can be taken. If a backup does not succeed within this time window, it will be canceled and considered failed.
        The backup window must be at least 5 minutes long. There is no upper bound on the window. If not set, it will default to 1 hour.
        A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        """
        return pulumi.get(self, "backup_window")

    @backup_window.setter
    def backup_window(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_window", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether automated backups are enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Labels to apply to backups created using this configuration.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location where the backup will be stored. Currently, the only supported option is to store the backup in the same region as the cluster.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="quantityBasedRetention")
    def quantity_based_retention(self) -> Optional[pulumi.Input['ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs']]:
        """
        Quantity-based Backup retention policy to retain recent backups.
        Structure is documented below.
        """
        return pulumi.get(self, "quantity_based_retention")

    @quantity_based_retention.setter
    def quantity_based_retention(self, value: Optional[pulumi.Input['ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs']]):
        pulumi.set(self, "quantity_based_retention", value)

    @property
    @pulumi.getter(name="timeBasedRetention")
    def time_based_retention(self) -> Optional[pulumi.Input['ClusterAutomatedBackupPolicyTimeBasedRetentionArgs']]:
        """
        Time-based Backup retention policy.
        Structure is documented below.
        """
        return pulumi.get(self, "time_based_retention")

    @time_based_retention.setter
    def time_based_retention(self, value: Optional[pulumi.Input['ClusterAutomatedBackupPolicyTimeBasedRetentionArgs']]):
        pulumi.set(self, "time_based_retention", value)

    @property
    @pulumi.getter(name="weeklySchedule")
    def weekly_schedule(self) -> Optional[pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleArgs']]:
        """
        Weekly schedule for the Backup.
        Structure is documented below.
        """
        return pulumi.get(self, "weekly_schedule")

    @weekly_schedule.setter
    def weekly_schedule(self, value: Optional[pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleArgs']]):
        pulumi.set(self, "weekly_schedule", value)


@pulumi.input_type
class ClusterAutomatedBackupPolicyQuantityBasedRetentionArgs:
    def __init__(__self__, *,
                 count: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] count: The number of backups to retain.
        """
        if count is not None:
            pulumi.set(__self__, "count", count)

    @property
    @pulumi.getter
    def count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of backups to retain.
        """
        return pulumi.get(self, "count")

    @count.setter
    def count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "count", value)


@pulumi.input_type
class ClusterAutomatedBackupPolicyTimeBasedRetentionArgs:
    def __init__(__self__, *,
                 retention_period: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] retention_period: The retention period.
               A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        """
        if retention_period is not None:
            pulumi.set(__self__, "retention_period", retention_period)

    @property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> Optional[pulumi.Input[str]]:
        """
        The retention period.
        A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        """
        return pulumi.get(self, "retention_period")

    @retention_period.setter
    def retention_period(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "retention_period", value)


@pulumi.input_type
class ClusterAutomatedBackupPolicyWeeklyScheduleArgs:
    def __init__(__self__, *,
                 start_times: pulumi.Input[Sequence[pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs']]],
                 days_of_weeks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs']]] start_times: The times during the day to start a backup. At least one start time must be provided. The start times are assumed to be in UTC and to be an exact hour (e.g., 04:00:00).
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] days_of_weeks: The days of the week to perform a backup. At least one day of the week must be provided.
               Each value may be one of `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
        """
        pulumi.set(__self__, "start_times", start_times)
        if days_of_weeks is not None:
            pulumi.set(__self__, "days_of_weeks", days_of_weeks)

    @property
    @pulumi.getter(name="startTimes")
    def start_times(self) -> pulumi.Input[Sequence[pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs']]]:
        """
        The times during the day to start a backup. At least one start time must be provided. The start times are assumed to be in UTC and to be an exact hour (e.g., 04:00:00).
        Structure is documented below.
        """
        return pulumi.get(self, "start_times")

    @start_times.setter
    def start_times(self, value: pulumi.Input[Sequence[pulumi.Input['ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs']]]):
        pulumi.set(self, "start_times", value)

    @property
    @pulumi.getter(name="daysOfWeeks")
    def days_of_weeks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The days of the week to perform a backup. At least one day of the week must be provided.
        Each value may be one of `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
        """
        return pulumi.get(self, "days_of_weeks")

    @days_of_weeks.setter
    def days_of_weeks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "days_of_weeks", value)


@pulumi.input_type
class ClusterAutomatedBackupPolicyWeeklyScheduleStartTimeArgs:
    def __init__(__self__, *,
                 hours: Optional[pulumi.Input[int]] = None,
                 minutes: Optional[pulumi.Input[int]] = None,
                 nanos: Optional[pulumi.Input[int]] = None,
                 seconds: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] hours: Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
        :param pulumi.Input[int] minutes: Minutes of hour of day. Must be from 0 to 59.
        :param pulumi.Input[int] nanos: Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
        :param pulumi.Input[int] seconds: Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
        """
        if hours is not None:
            pulumi.set(__self__, "hours", hours)
        if minutes is not None:
            pulumi.set(__self__, "minutes", minutes)
        if nanos is not None:
            pulumi.set(__self__, "nanos", nanos)
        if seconds is not None:
            pulumi.set(__self__, "seconds", seconds)

    @property
    @pulumi.getter
    def hours(self) -> Optional[pulumi.Input[int]]:
        """
        Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
        """
        return pulumi.get(self, "hours")

    @hours.setter
    def hours(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "hours", value)

    @property
    @pulumi.getter
    def minutes(self) -> Optional[pulumi.Input[int]]:
        """
        Minutes of hour of day. Must be from 0 to 59.
        """
        return pulumi.get(self, "minutes")

    @minutes.setter
    def minutes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "minutes", value)

    @property
    @pulumi.getter
    def nanos(self) -> Optional[pulumi.Input[int]]:
        """
        Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
        """
        return pulumi.get(self, "nanos")

    @nanos.setter
    def nanos(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "nanos", value)

    @property
    @pulumi.getter
    def seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
        """
        return pulumi.get(self, "seconds")

    @seconds.setter
    def seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "seconds", value)


@pulumi.input_type
class ClusterBackupSourceArgs:
    def __init__(__self__, *,
                 backup_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] backup_name: The name of the backup resource.
        """
        if backup_name is not None:
            pulumi.set(__self__, "backup_name", backup_name)

    @property
    @pulumi.getter(name="backupName")
    def backup_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the backup resource.
        """
        return pulumi.get(self, "backup_name")

    @backup_name.setter
    def backup_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_name", value)


@pulumi.input_type
class ClusterInitialUserArgs:
    def __init__(__self__, *,
                 password: pulumi.Input[str],
                 user: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] password: The initial password for the user.
               **Note**: This property is sensitive and will not be displayed in the plan.
        :param pulumi.Input[str] user: The database username.
        """
        pulumi.set(__self__, "password", password)
        if user is not None:
            pulumi.set(__self__, "user", user)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        The initial password for the user.
        **Note**: This property is sensitive and will not be displayed in the plan.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def user(self) -> Optional[pulumi.Input[str]]:
        """
        The database username.
        """
        return pulumi.get(self, "user")

    @user.setter
    def user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user", value)


@pulumi.input_type
class ClusterMigrationSourceArgs:
    def __init__(__self__, *,
                 host_port: Optional[pulumi.Input[str]] = None,
                 reference_id: Optional[pulumi.Input[str]] = None,
                 source_type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] host_port: The host and port of the on-premises instance in host:port format
        :param pulumi.Input[str] reference_id: Place holder for the external source identifier(e.g DMS job name) that created the cluster.
        :param pulumi.Input[str] source_type: Type of migration source.
        """
        if host_port is not None:
            pulumi.set(__self__, "host_port", host_port)
        if reference_id is not None:
            pulumi.set(__self__, "reference_id", reference_id)
        if source_type is not None:
            pulumi.set(__self__, "source_type", source_type)

    @property
    @pulumi.getter(name="hostPort")
    def host_port(self) -> Optional[pulumi.Input[str]]:
        """
        The host and port of the on-premises instance in host:port format
        """
        return pulumi.get(self, "host_port")

    @host_port.setter
    def host_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_port", value)

    @property
    @pulumi.getter(name="referenceId")
    def reference_id(self) -> Optional[pulumi.Input[str]]:
        """
        Place holder for the external source identifier(e.g DMS job name) that created the cluster.
        """
        return pulumi.get(self, "reference_id")

    @reference_id.setter
    def reference_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reference_id", value)

    @property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of migration source.
        """
        return pulumi.get(self, "source_type")

    @source_type.setter
    def source_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_type", value)


@pulumi.input_type
class InstanceMachineConfigArgs:
    def __init__(__self__, *,
                 cpu_count: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] cpu_count: The number of CPU's in the VM instance.
        """
        if cpu_count is not None:
            pulumi.set(__self__, "cpu_count", cpu_count)

    @property
    @pulumi.getter(name="cpuCount")
    def cpu_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of CPU's in the VM instance.
        """
        return pulumi.get(self, "cpu_count")

    @cpu_count.setter
    def cpu_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cpu_count", value)


@pulumi.input_type
class InstanceReadPoolConfigArgs:
    def __init__(__self__, *,
                 node_count: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] node_count: Read capacity, i.e. number of nodes in a read pool instance.
        """
        if node_count is not None:
            pulumi.set(__self__, "node_count", node_count)

    @property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> Optional[pulumi.Input[int]]:
        """
        Read capacity, i.e. number of nodes in a read pool instance.
        """
        return pulumi.get(self, "node_count")

    @node_count.setter
    def node_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "node_count", value)


