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

__all__ = [
    'FolderFeedCondition',
    'FolderFeedFeedOutputConfig',
    'FolderFeedFeedOutputConfigPubsubDestination',
    'OrganizationFeedCondition',
    'OrganizationFeedFeedOutputConfig',
    'OrganizationFeedFeedOutputConfigPubsubDestination',
    'ProjectFeedCondition',
    'ProjectFeedFeedOutputConfig',
    'ProjectFeedFeedOutputConfigPubsubDestination',
    'GetResourcesSearchAllResultResult',
]

@pulumi.output_type
class FolderFeedCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 description: Optional[str] = None,
                 location: Optional[str] = None,
                 title: Optional[str] = None):
        """
        :param str expression: Textual representation of an expression in Common Expression Language syntax.
        :param str description: Description of the expression. This is a longer text which describes the expression,
               e.g. when hovered over it in a UI.
        :param str location: String indicating the location of the expression for error reporting, e.g. a file
               name and a position in the file.
        :param str title: Title for the expression, i.e. a short string describing its purpose.
               This can be used e.g. in UIs which allow to enter the expression.
        """
        pulumi.set(__self__, "expression", expression)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter
    def expression(self) -> str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description of the expression. This is a longer text which describes the expression,
        e.g. when hovered over it in a UI.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def location(self) -> Optional[str]:
        """
        String indicating the location of the expression for error reporting, e.g. a file
        name and a position in the file.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def title(self) -> Optional[str]:
        """
        Title for the expression, i.e. a short string describing its purpose.
        This can be used e.g. in UIs which allow to enter the expression.
        """
        return pulumi.get(self, "title")


@pulumi.output_type
class FolderFeedFeedOutputConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "pubsubDestination":
            suggest = "pubsub_destination"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FolderFeedFeedOutputConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FolderFeedFeedOutputConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FolderFeedFeedOutputConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pubsub_destination: 'outputs.FolderFeedFeedOutputConfigPubsubDestination'):
        """
        :param 'FolderFeedFeedOutputConfigPubsubDestinationArgs' pubsub_destination: Destination on Cloud Pubsub.
               Structure is documented below.
        """
        pulumi.set(__self__, "pubsub_destination", pubsub_destination)

    @property
    @pulumi.getter(name="pubsubDestination")
    def pubsub_destination(self) -> 'outputs.FolderFeedFeedOutputConfigPubsubDestination':
        """
        Destination on Cloud Pubsub.
        Structure is documented below.
        """
        return pulumi.get(self, "pubsub_destination")


@pulumi.output_type
class FolderFeedFeedOutputConfigPubsubDestination(dict):
    def __init__(__self__, *,
                 topic: str):
        """
        :param str topic: Destination on Cloud Pubsub topic.
        """
        pulumi.set(__self__, "topic", topic)

    @property
    @pulumi.getter
    def topic(self) -> str:
        """
        Destination on Cloud Pubsub topic.
        """
        return pulumi.get(self, "topic")


@pulumi.output_type
class OrganizationFeedCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 description: Optional[str] = None,
                 location: Optional[str] = None,
                 title: Optional[str] = None):
        """
        :param str expression: Textual representation of an expression in Common Expression Language syntax.
        :param str description: Description of the expression. This is a longer text which describes the expression,
               e.g. when hovered over it in a UI.
        :param str location: String indicating the location of the expression for error reporting, e.g. a file
               name and a position in the file.
        :param str title: Title for the expression, i.e. a short string describing its purpose.
               This can be used e.g. in UIs which allow to enter the expression.
        """
        pulumi.set(__self__, "expression", expression)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter
    def expression(self) -> str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description of the expression. This is a longer text which describes the expression,
        e.g. when hovered over it in a UI.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def location(self) -> Optional[str]:
        """
        String indicating the location of the expression for error reporting, e.g. a file
        name and a position in the file.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def title(self) -> Optional[str]:
        """
        Title for the expression, i.e. a short string describing its purpose.
        This can be used e.g. in UIs which allow to enter the expression.
        """
        return pulumi.get(self, "title")


@pulumi.output_type
class OrganizationFeedFeedOutputConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "pubsubDestination":
            suggest = "pubsub_destination"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OrganizationFeedFeedOutputConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OrganizationFeedFeedOutputConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OrganizationFeedFeedOutputConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pubsub_destination: 'outputs.OrganizationFeedFeedOutputConfigPubsubDestination'):
        """
        :param 'OrganizationFeedFeedOutputConfigPubsubDestinationArgs' pubsub_destination: Destination on Cloud Pubsub.
               Structure is documented below.
        """
        pulumi.set(__self__, "pubsub_destination", pubsub_destination)

    @property
    @pulumi.getter(name="pubsubDestination")
    def pubsub_destination(self) -> 'outputs.OrganizationFeedFeedOutputConfigPubsubDestination':
        """
        Destination on Cloud Pubsub.
        Structure is documented below.
        """
        return pulumi.get(self, "pubsub_destination")


@pulumi.output_type
class OrganizationFeedFeedOutputConfigPubsubDestination(dict):
    def __init__(__self__, *,
                 topic: str):
        """
        :param str topic: Destination on Cloud Pubsub topic.
        """
        pulumi.set(__self__, "topic", topic)

    @property
    @pulumi.getter
    def topic(self) -> str:
        """
        Destination on Cloud Pubsub topic.
        """
        return pulumi.get(self, "topic")


@pulumi.output_type
class ProjectFeedCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 description: Optional[str] = None,
                 location: Optional[str] = None,
                 title: Optional[str] = None):
        """
        :param str expression: Textual representation of an expression in Common Expression Language syntax.
        :param str description: Description of the expression. This is a longer text which describes the expression,
               e.g. when hovered over it in a UI.
        :param str location: String indicating the location of the expression for error reporting, e.g. a file
               name and a position in the file.
        :param str title: Title for the expression, i.e. a short string describing its purpose.
               This can be used e.g. in UIs which allow to enter the expression.
        """
        pulumi.set(__self__, "expression", expression)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter
    def expression(self) -> str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description of the expression. This is a longer text which describes the expression,
        e.g. when hovered over it in a UI.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def location(self) -> Optional[str]:
        """
        String indicating the location of the expression for error reporting, e.g. a file
        name and a position in the file.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def title(self) -> Optional[str]:
        """
        Title for the expression, i.e. a short string describing its purpose.
        This can be used e.g. in UIs which allow to enter the expression.
        """
        return pulumi.get(self, "title")


@pulumi.output_type
class ProjectFeedFeedOutputConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "pubsubDestination":
            suggest = "pubsub_destination"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProjectFeedFeedOutputConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProjectFeedFeedOutputConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProjectFeedFeedOutputConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pubsub_destination: 'outputs.ProjectFeedFeedOutputConfigPubsubDestination'):
        """
        :param 'ProjectFeedFeedOutputConfigPubsubDestinationArgs' pubsub_destination: Destination on Cloud Pubsub.
               Structure is documented below.
        """
        pulumi.set(__self__, "pubsub_destination", pubsub_destination)

    @property
    @pulumi.getter(name="pubsubDestination")
    def pubsub_destination(self) -> 'outputs.ProjectFeedFeedOutputConfigPubsubDestination':
        """
        Destination on Cloud Pubsub.
        Structure is documented below.
        """
        return pulumi.get(self, "pubsub_destination")


@pulumi.output_type
class ProjectFeedFeedOutputConfigPubsubDestination(dict):
    def __init__(__self__, *,
                 topic: str):
        """
        :param str topic: Destination on Cloud Pubsub topic.
        """
        pulumi.set(__self__, "topic", topic)

    @property
    @pulumi.getter
    def topic(self) -> str:
        """
        Destination on Cloud Pubsub topic.
        """
        return pulumi.get(self, "topic")


@pulumi.output_type
class GetResourcesSearchAllResultResult(dict):
    def __init__(__self__, *,
                 additional_attributes: Sequence[str],
                 asset_type: str,
                 description: str,
                 display_name: str,
                 labels: Mapping[str, str],
                 location: str,
                 name: str,
                 network_tags: Sequence[str],
                 project: str):
        """
        :param Sequence[str] additional_attributes: Additional searchable attributes of this resource. Informational only. The exact set of attributes is subject to change. For example: project id, DNS name etc.
        :param str asset_type: The type of this resource.
        :param str description: One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
        :param str display_name: The display name of this resource.
        :param Mapping[str, str] labels: Labels associated with this resource.
        :param str location: Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`.
        :param str name: The full resource name. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
        :param Sequence[str] network_tags: Network tags associated with this resource.
        :param str project: The project that this resource belongs to, in the form of `projects/{project_number}`.
        """
        pulumi.set(__self__, "additional_attributes", additional_attributes)
        pulumi.set(__self__, "asset_type", asset_type)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "labels", labels)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "network_tags", network_tags)
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="additionalAttributes")
    def additional_attributes(self) -> Sequence[str]:
        """
        Additional searchable attributes of this resource. Informational only. The exact set of attributes is subject to change. For example: project id, DNS name etc.
        """
        return pulumi.get(self, "additional_attributes")

    @property
    @pulumi.getter(name="assetType")
    def asset_type(self) -> str:
        """
        The type of this resource.
        """
        return pulumi.get(self, "asset_type")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        The display name of this resource.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, str]:
        """
        Labels associated with this resource.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The full resource name. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkTags")
    def network_tags(self) -> Sequence[str]:
        """
        Network tags associated with this resource.
        """
        return pulumi.get(self, "network_tags")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        The project that this resource belongs to, in the form of `projects/{project_number}`.
        """
        return pulumi.get(self, "project")


