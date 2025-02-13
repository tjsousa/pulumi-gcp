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
    'DataPolicyDataMaskingPolicyArgs',
    'DataPolicyIamBindingConditionArgs',
    'DataPolicyIamMemberConditionArgs',
]

@pulumi.input_type
class DataPolicyDataMaskingPolicyArgs:
    def __init__(__self__, *,
                 predefined_expression: pulumi.Input[str]):
        """
        :param pulumi.Input[str] predefined_expression: The available masking rules. Learn more here: https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
               Possible values are `SHA256`, `ALWAYS_NULL`, `DEFAULT_MASKING_VALUE`, `LAST_FOUR_CHARACTERS`, `FIRST_FOUR_CHARACTERS`, `EMAIL_MASK`, and `DATE_YEAR_MASK`.
        """
        pulumi.set(__self__, "predefined_expression", predefined_expression)

    @property
    @pulumi.getter(name="predefinedExpression")
    def predefined_expression(self) -> pulumi.Input[str]:
        """
        The available masking rules. Learn more here: https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
        Possible values are `SHA256`, `ALWAYS_NULL`, `DEFAULT_MASKING_VALUE`, `LAST_FOUR_CHARACTERS`, `FIRST_FOUR_CHARACTERS`, `EMAIL_MASK`, and `DATE_YEAR_MASK`.
        """
        return pulumi.get(self, "predefined_expression")

    @predefined_expression.setter
    def predefined_expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "predefined_expression", value)


@pulumi.input_type
class DataPolicyIamBindingConditionArgs:
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
class DataPolicyIamMemberConditionArgs:
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


