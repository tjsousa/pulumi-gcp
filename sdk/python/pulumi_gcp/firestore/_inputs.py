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
    'IndexFieldArgs',
]

@pulumi.input_type
class IndexFieldArgs:
    def __init__(__self__, *,
                 array_config: Optional[pulumi.Input[str]] = None,
                 field_path: Optional[pulumi.Input[str]] = None,
                 order: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] array_config: Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
               be specified.
               Possible values are `CONTAINS`.
        :param pulumi.Input[str] field_path: Name of the field.
        :param pulumi.Input[str] order: Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
               Only one of `order` and `arrayConfig` can be specified.
               Possible values are `ASCENDING` and `DESCENDING`.
        """
        if array_config is not None:
            pulumi.set(__self__, "array_config", array_config)
        if field_path is not None:
            pulumi.set(__self__, "field_path", field_path)
        if order is not None:
            pulumi.set(__self__, "order", order)

    @property
    @pulumi.getter(name="arrayConfig")
    def array_config(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
        be specified.
        Possible values are `CONTAINS`.
        """
        return pulumi.get(self, "array_config")

    @array_config.setter
    def array_config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "array_config", value)

    @property
    @pulumi.getter(name="fieldPath")
    def field_path(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the field.
        """
        return pulumi.get(self, "field_path")

    @field_path.setter
    def field_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "field_path", value)

    @property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
        Only one of `order` and `arrayConfig` can be specified.
        Possible values are `ASCENDING` and `DESCENDING`.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "order", value)


