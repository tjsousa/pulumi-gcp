// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package secretmanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A secret version resource.
//
// > **Warning:** All arguments including `payload.secret_data` will be stored in the raw
// state as plain-text.
//
// ## Example Usage
// ### Secret Version Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/secretmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretmanager.NewSecret(ctx, "secret-basic", &secretmanager.SecretArgs{
//				SecretId: pulumi.String("secret-version"),
//				Labels: pulumi.StringMap{
//					"label": pulumi.String("my-label"),
//				},
//				Replication: &secretmanager.SecretReplicationArgs{
//					Automatic: pulumi.Bool(true),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecretVersion(ctx, "secret-version-basic", &secretmanager.SecretVersionArgs{
//				Secret:     secret_basic.ID(),
//				SecretData: pulumi.String("secret-data"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # SecretVersion can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:secretmanager/secretVersion:SecretVersion default projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}
//
// ```
type SecretVersion struct {
	pulumi.CustomResourceState

	// The time at which the Secret was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The time at which the Secret was destroyed. Only present if state is DESTROYED.
	DestroyTime pulumi.StringOutput `pulumi:"destroyTime"`
	// The current state of the SecretVersion.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The resource name of the SecretVersion. Format:
	// `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
	Name pulumi.StringOutput `pulumi:"name"`
	// Secret Manager secret resource
	Secret pulumi.StringOutput `pulumi:"secret"`
	// The secret data. Must be no larger than 64KiB.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	SecretData pulumi.StringOutput `pulumi:"secretData"`
	// The version of the Secret.
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewSecretVersion registers a new resource with the given unique name, arguments, and options.
func NewSecretVersion(ctx *pulumi.Context,
	name string, args *SecretVersionArgs, opts ...pulumi.ResourceOption) (*SecretVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Secret == nil {
		return nil, errors.New("invalid value for required argument 'Secret'")
	}
	if args.SecretData == nil {
		return nil, errors.New("invalid value for required argument 'SecretData'")
	}
	if args.SecretData != nil {
		args.SecretData = pulumi.ToSecret(args.SecretData).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretData",
	})
	opts = append(opts, secrets)
	var resource SecretVersion
	err := ctx.RegisterResource("gcp:secretmanager/secretVersion:SecretVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretVersion gets an existing SecretVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretVersionState, opts ...pulumi.ResourceOption) (*SecretVersion, error) {
	var resource SecretVersion
	err := ctx.ReadResource("gcp:secretmanager/secretVersion:SecretVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretVersion resources.
type secretVersionState struct {
	// The time at which the Secret was created.
	CreateTime *string `pulumi:"createTime"`
	// The time at which the Secret was destroyed. Only present if state is DESTROYED.
	DestroyTime *string `pulumi:"destroyTime"`
	// The current state of the SecretVersion.
	Enabled *bool `pulumi:"enabled"`
	// The resource name of the SecretVersion. Format:
	// `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
	Name *string `pulumi:"name"`
	// Secret Manager secret resource
	Secret *string `pulumi:"secret"`
	// The secret data. Must be no larger than 64KiB.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	SecretData *string `pulumi:"secretData"`
	// The version of the Secret.
	Version *string `pulumi:"version"`
}

type SecretVersionState struct {
	// The time at which the Secret was created.
	CreateTime pulumi.StringPtrInput
	// The time at which the Secret was destroyed. Only present if state is DESTROYED.
	DestroyTime pulumi.StringPtrInput
	// The current state of the SecretVersion.
	Enabled pulumi.BoolPtrInput
	// The resource name of the SecretVersion. Format:
	// `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
	Name pulumi.StringPtrInput
	// Secret Manager secret resource
	Secret pulumi.StringPtrInput
	// The secret data. Must be no larger than 64KiB.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	SecretData pulumi.StringPtrInput
	// The version of the Secret.
	Version pulumi.StringPtrInput
}

func (SecretVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretVersionState)(nil)).Elem()
}

type secretVersionArgs struct {
	// The current state of the SecretVersion.
	Enabled *bool `pulumi:"enabled"`
	// Secret Manager secret resource
	Secret string `pulumi:"secret"`
	// The secret data. Must be no larger than 64KiB.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	SecretData string `pulumi:"secretData"`
}

// The set of arguments for constructing a SecretVersion resource.
type SecretVersionArgs struct {
	// The current state of the SecretVersion.
	Enabled pulumi.BoolPtrInput
	// Secret Manager secret resource
	Secret pulumi.StringInput
	// The secret data. Must be no larger than 64KiB.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	SecretData pulumi.StringInput
}

func (SecretVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretVersionArgs)(nil)).Elem()
}

type SecretVersionInput interface {
	pulumi.Input

	ToSecretVersionOutput() SecretVersionOutput
	ToSecretVersionOutputWithContext(ctx context.Context) SecretVersionOutput
}

func (*SecretVersion) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretVersion)(nil)).Elem()
}

func (i *SecretVersion) ToSecretVersionOutput() SecretVersionOutput {
	return i.ToSecretVersionOutputWithContext(context.Background())
}

func (i *SecretVersion) ToSecretVersionOutputWithContext(ctx context.Context) SecretVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretVersionOutput)
}

// SecretVersionArrayInput is an input type that accepts SecretVersionArray and SecretVersionArrayOutput values.
// You can construct a concrete instance of `SecretVersionArrayInput` via:
//
//	SecretVersionArray{ SecretVersionArgs{...} }
type SecretVersionArrayInput interface {
	pulumi.Input

	ToSecretVersionArrayOutput() SecretVersionArrayOutput
	ToSecretVersionArrayOutputWithContext(context.Context) SecretVersionArrayOutput
}

type SecretVersionArray []SecretVersionInput

func (SecretVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretVersion)(nil)).Elem()
}

func (i SecretVersionArray) ToSecretVersionArrayOutput() SecretVersionArrayOutput {
	return i.ToSecretVersionArrayOutputWithContext(context.Background())
}

func (i SecretVersionArray) ToSecretVersionArrayOutputWithContext(ctx context.Context) SecretVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretVersionArrayOutput)
}

// SecretVersionMapInput is an input type that accepts SecretVersionMap and SecretVersionMapOutput values.
// You can construct a concrete instance of `SecretVersionMapInput` via:
//
//	SecretVersionMap{ "key": SecretVersionArgs{...} }
type SecretVersionMapInput interface {
	pulumi.Input

	ToSecretVersionMapOutput() SecretVersionMapOutput
	ToSecretVersionMapOutputWithContext(context.Context) SecretVersionMapOutput
}

type SecretVersionMap map[string]SecretVersionInput

func (SecretVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretVersion)(nil)).Elem()
}

func (i SecretVersionMap) ToSecretVersionMapOutput() SecretVersionMapOutput {
	return i.ToSecretVersionMapOutputWithContext(context.Background())
}

func (i SecretVersionMap) ToSecretVersionMapOutputWithContext(ctx context.Context) SecretVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretVersionMapOutput)
}

type SecretVersionOutput struct{ *pulumi.OutputState }

func (SecretVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretVersion)(nil)).Elem()
}

func (o SecretVersionOutput) ToSecretVersionOutput() SecretVersionOutput {
	return o
}

func (o SecretVersionOutput) ToSecretVersionOutputWithContext(ctx context.Context) SecretVersionOutput {
	return o
}

// The time at which the Secret was created.
func (o SecretVersionOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The time at which the Secret was destroyed. Only present if state is DESTROYED.
func (o SecretVersionOutput) DestroyTime() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.DestroyTime }).(pulumi.StringOutput)
}

// The current state of the SecretVersion.
func (o SecretVersionOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The resource name of the SecretVersion. Format:
// `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
func (o SecretVersionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Secret Manager secret resource
func (o SecretVersionOutput) Secret() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.Secret }).(pulumi.StringOutput)
}

// The secret data. Must be no larger than 64KiB.
// **Note**: This property is sensitive and will not be displayed in the plan.
func (o SecretVersionOutput) SecretData() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.SecretData }).(pulumi.StringOutput)
}

// The version of the Secret.
func (o SecretVersionOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type SecretVersionArrayOutput struct{ *pulumi.OutputState }

func (SecretVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretVersion)(nil)).Elem()
}

func (o SecretVersionArrayOutput) ToSecretVersionArrayOutput() SecretVersionArrayOutput {
	return o
}

func (o SecretVersionArrayOutput) ToSecretVersionArrayOutputWithContext(ctx context.Context) SecretVersionArrayOutput {
	return o
}

func (o SecretVersionArrayOutput) Index(i pulumi.IntInput) SecretVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecretVersion {
		return vs[0].([]*SecretVersion)[vs[1].(int)]
	}).(SecretVersionOutput)
}

type SecretVersionMapOutput struct{ *pulumi.OutputState }

func (SecretVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretVersion)(nil)).Elem()
}

func (o SecretVersionMapOutput) ToSecretVersionMapOutput() SecretVersionMapOutput {
	return o
}

func (o SecretVersionMapOutput) ToSecretVersionMapOutputWithContext(ctx context.Context) SecretVersionMapOutput {
	return o
}

func (o SecretVersionMapOutput) MapIndex(k pulumi.StringInput) SecretVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecretVersion {
		return vs[0].(map[string]*SecretVersion)[vs[1].(string)]
	}).(SecretVersionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretVersionInput)(nil)).Elem(), &SecretVersion{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretVersionArrayInput)(nil)).Elem(), SecretVersionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretVersionMapInput)(nil)).Elem(), SecretVersionMap{})
	pulumi.RegisterOutputType(SecretVersionOutput{})
	pulumi.RegisterOutputType(SecretVersionArrayOutput{})
	pulumi.RegisterOutputType(SecretVersionMapOutput{})
}
