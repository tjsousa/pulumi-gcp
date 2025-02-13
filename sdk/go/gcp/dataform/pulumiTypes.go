// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type RepositoryGitRemoteSettings struct {
	// The name of the Secret Manager secret version to use as an authentication token for Git operations. Must be in the format projects/*/secrets/*/versions/*.
	AuthenticationTokenSecretVersion string `pulumi:"authenticationTokenSecretVersion"`
	// The Git remote's default branch name.
	DefaultBranch string `pulumi:"defaultBranch"`
	// (Output)
	// Indicates the status of the Git access token. https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories#TokenStatus
	TokenStatus *string `pulumi:"tokenStatus"`
	// The Git remote's URL.
	Url string `pulumi:"url"`
}

// RepositoryGitRemoteSettingsInput is an input type that accepts RepositoryGitRemoteSettingsArgs and RepositoryGitRemoteSettingsOutput values.
// You can construct a concrete instance of `RepositoryGitRemoteSettingsInput` via:
//
//	RepositoryGitRemoteSettingsArgs{...}
type RepositoryGitRemoteSettingsInput interface {
	pulumi.Input

	ToRepositoryGitRemoteSettingsOutput() RepositoryGitRemoteSettingsOutput
	ToRepositoryGitRemoteSettingsOutputWithContext(context.Context) RepositoryGitRemoteSettingsOutput
}

type RepositoryGitRemoteSettingsArgs struct {
	// The name of the Secret Manager secret version to use as an authentication token for Git operations. Must be in the format projects/*/secrets/*/versions/*.
	AuthenticationTokenSecretVersion pulumi.StringInput `pulumi:"authenticationTokenSecretVersion"`
	// The Git remote's default branch name.
	DefaultBranch pulumi.StringInput `pulumi:"defaultBranch"`
	// (Output)
	// Indicates the status of the Git access token. https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories#TokenStatus
	TokenStatus pulumi.StringPtrInput `pulumi:"tokenStatus"`
	// The Git remote's URL.
	Url pulumi.StringInput `pulumi:"url"`
}

func (RepositoryGitRemoteSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*RepositoryGitRemoteSettings)(nil)).Elem()
}

func (i RepositoryGitRemoteSettingsArgs) ToRepositoryGitRemoteSettingsOutput() RepositoryGitRemoteSettingsOutput {
	return i.ToRepositoryGitRemoteSettingsOutputWithContext(context.Background())
}

func (i RepositoryGitRemoteSettingsArgs) ToRepositoryGitRemoteSettingsOutputWithContext(ctx context.Context) RepositoryGitRemoteSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGitRemoteSettingsOutput)
}

func (i RepositoryGitRemoteSettingsArgs) ToRepositoryGitRemoteSettingsPtrOutput() RepositoryGitRemoteSettingsPtrOutput {
	return i.ToRepositoryGitRemoteSettingsPtrOutputWithContext(context.Background())
}

func (i RepositoryGitRemoteSettingsArgs) ToRepositoryGitRemoteSettingsPtrOutputWithContext(ctx context.Context) RepositoryGitRemoteSettingsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGitRemoteSettingsOutput).ToRepositoryGitRemoteSettingsPtrOutputWithContext(ctx)
}

// RepositoryGitRemoteSettingsPtrInput is an input type that accepts RepositoryGitRemoteSettingsArgs, RepositoryGitRemoteSettingsPtr and RepositoryGitRemoteSettingsPtrOutput values.
// You can construct a concrete instance of `RepositoryGitRemoteSettingsPtrInput` via:
//
//	        RepositoryGitRemoteSettingsArgs{...}
//
//	or:
//
//	        nil
type RepositoryGitRemoteSettingsPtrInput interface {
	pulumi.Input

	ToRepositoryGitRemoteSettingsPtrOutput() RepositoryGitRemoteSettingsPtrOutput
	ToRepositoryGitRemoteSettingsPtrOutputWithContext(context.Context) RepositoryGitRemoteSettingsPtrOutput
}

type repositoryGitRemoteSettingsPtrType RepositoryGitRemoteSettingsArgs

func RepositoryGitRemoteSettingsPtr(v *RepositoryGitRemoteSettingsArgs) RepositoryGitRemoteSettingsPtrInput {
	return (*repositoryGitRemoteSettingsPtrType)(v)
}

func (*repositoryGitRemoteSettingsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryGitRemoteSettings)(nil)).Elem()
}

func (i *repositoryGitRemoteSettingsPtrType) ToRepositoryGitRemoteSettingsPtrOutput() RepositoryGitRemoteSettingsPtrOutput {
	return i.ToRepositoryGitRemoteSettingsPtrOutputWithContext(context.Background())
}

func (i *repositoryGitRemoteSettingsPtrType) ToRepositoryGitRemoteSettingsPtrOutputWithContext(ctx context.Context) RepositoryGitRemoteSettingsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGitRemoteSettingsPtrOutput)
}

type RepositoryGitRemoteSettingsOutput struct{ *pulumi.OutputState }

func (RepositoryGitRemoteSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RepositoryGitRemoteSettings)(nil)).Elem()
}

func (o RepositoryGitRemoteSettingsOutput) ToRepositoryGitRemoteSettingsOutput() RepositoryGitRemoteSettingsOutput {
	return o
}

func (o RepositoryGitRemoteSettingsOutput) ToRepositoryGitRemoteSettingsOutputWithContext(ctx context.Context) RepositoryGitRemoteSettingsOutput {
	return o
}

func (o RepositoryGitRemoteSettingsOutput) ToRepositoryGitRemoteSettingsPtrOutput() RepositoryGitRemoteSettingsPtrOutput {
	return o.ToRepositoryGitRemoteSettingsPtrOutputWithContext(context.Background())
}

func (o RepositoryGitRemoteSettingsOutput) ToRepositoryGitRemoteSettingsPtrOutputWithContext(ctx context.Context) RepositoryGitRemoteSettingsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RepositoryGitRemoteSettings) *RepositoryGitRemoteSettings {
		return &v
	}).(RepositoryGitRemoteSettingsPtrOutput)
}

// The name of the Secret Manager secret version to use as an authentication token for Git operations. Must be in the format projects/*/secrets/*/versions/*.
func (o RepositoryGitRemoteSettingsOutput) AuthenticationTokenSecretVersion() pulumi.StringOutput {
	return o.ApplyT(func(v RepositoryGitRemoteSettings) string { return v.AuthenticationTokenSecretVersion }).(pulumi.StringOutput)
}

// The Git remote's default branch name.
func (o RepositoryGitRemoteSettingsOutput) DefaultBranch() pulumi.StringOutput {
	return o.ApplyT(func(v RepositoryGitRemoteSettings) string { return v.DefaultBranch }).(pulumi.StringOutput)
}

// (Output)
// Indicates the status of the Git access token. https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories#TokenStatus
func (o RepositoryGitRemoteSettingsOutput) TokenStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RepositoryGitRemoteSettings) *string { return v.TokenStatus }).(pulumi.StringPtrOutput)
}

// The Git remote's URL.
func (o RepositoryGitRemoteSettingsOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v RepositoryGitRemoteSettings) string { return v.Url }).(pulumi.StringOutput)
}

type RepositoryGitRemoteSettingsPtrOutput struct{ *pulumi.OutputState }

func (RepositoryGitRemoteSettingsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryGitRemoteSettings)(nil)).Elem()
}

func (o RepositoryGitRemoteSettingsPtrOutput) ToRepositoryGitRemoteSettingsPtrOutput() RepositoryGitRemoteSettingsPtrOutput {
	return o
}

func (o RepositoryGitRemoteSettingsPtrOutput) ToRepositoryGitRemoteSettingsPtrOutputWithContext(ctx context.Context) RepositoryGitRemoteSettingsPtrOutput {
	return o
}

func (o RepositoryGitRemoteSettingsPtrOutput) Elem() RepositoryGitRemoteSettingsOutput {
	return o.ApplyT(func(v *RepositoryGitRemoteSettings) RepositoryGitRemoteSettings {
		if v != nil {
			return *v
		}
		var ret RepositoryGitRemoteSettings
		return ret
	}).(RepositoryGitRemoteSettingsOutput)
}

// The name of the Secret Manager secret version to use as an authentication token for Git operations. Must be in the format projects/*/secrets/*/versions/*.
func (o RepositoryGitRemoteSettingsPtrOutput) AuthenticationTokenSecretVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryGitRemoteSettings) *string {
		if v == nil {
			return nil
		}
		return &v.AuthenticationTokenSecretVersion
	}).(pulumi.StringPtrOutput)
}

// The Git remote's default branch name.
func (o RepositoryGitRemoteSettingsPtrOutput) DefaultBranch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryGitRemoteSettings) *string {
		if v == nil {
			return nil
		}
		return &v.DefaultBranch
	}).(pulumi.StringPtrOutput)
}

// (Output)
// Indicates the status of the Git access token. https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories#TokenStatus
func (o RepositoryGitRemoteSettingsPtrOutput) TokenStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryGitRemoteSettings) *string {
		if v == nil {
			return nil
		}
		return v.TokenStatus
	}).(pulumi.StringPtrOutput)
}

// The Git remote's URL.
func (o RepositoryGitRemoteSettingsPtrOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryGitRemoteSettings) *string {
		if v == nil {
			return nil
		}
		return &v.Url
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGitRemoteSettingsInput)(nil)).Elem(), RepositoryGitRemoteSettingsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGitRemoteSettingsPtrInput)(nil)).Elem(), RepositoryGitRemoteSettingsArgs{})
	pulumi.RegisterOutputType(RepositoryGitRemoteSettingsOutput{})
	pulumi.RegisterOutputType(RepositoryGitRemoteSettingsPtrOutput{})
}
