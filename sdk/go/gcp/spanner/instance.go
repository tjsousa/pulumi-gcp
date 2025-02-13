// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spanner

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An isolated set of Cloud Spanner resources on which databases can be
// hosted.
//
// To get more information about Instance, see:
//
// * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/spanner/)
//
// ## Example Usage
// ### Spanner Instance Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewInstance(ctx, "example", &spanner.InstanceArgs{
//				Config:      pulumi.String("regional-us-central1"),
//				DisplayName: pulumi.String("Test Spanner Instance"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				NumNodes: pulumi.Int(2),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Spanner Instance Processing Units
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewInstance(ctx, "example", &spanner.InstanceArgs{
//				Config:      pulumi.String("regional-us-central1"),
//				DisplayName: pulumi.String("Test Spanner Instance"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				ProcessingUnits: pulumi.Int(200),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Spanner Instance Multi Regional
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewInstance(ctx, "example", &spanner.InstanceArgs{
//				Config:      pulumi.String("nam-eur-asia1"),
//				DisplayName: pulumi.String("Multi Regional Instance"),
//				Labels: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				NumNodes: pulumi.Int(2),
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
// # Instance can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:spanner/instance:Instance default projects/{{project}}/instances/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:spanner/instance:Instance default {{project}}/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:spanner/instance:Instance default {{name}}
//
// ```
type Instance struct {
	pulumi.CustomResourceState

	// The name of the instance's configuration (similar but not
	// quite the same as a region) which defines the geographic placement and
	// replication of your databases in this instance. It determines where your data
	// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
	// In order to obtain a valid list please consult the
	// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
	Config pulumi.StringOutput `pulumi:"config"`
	// The descriptive name for this instance as it appears in UIs. Must be
	// unique per project and between 4 and 30 characters in length.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// When deleting a spanner instance, this boolean option will delete all backups of this instance.
	// This must be set to true if you created a backup manually in the console.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// A unique identifier for the instance, which cannot be changed after
	// the instance is created. The name must be between 6 and 30 characters
	// in length.
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
	// terraform.
	NumNodes pulumi.IntOutput `pulumi:"numNodes"`
	// The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
	// in terraform.
	ProcessingUnits pulumi.IntOutput `pulumi:"processingUnits"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Instance status: `CREATING` or `READY`.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	var resource Instance
	err := ctx.RegisterResource("gcp:spanner/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("gcp:spanner/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// The name of the instance's configuration (similar but not
	// quite the same as a region) which defines the geographic placement and
	// replication of your databases in this instance. It determines where your data
	// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
	// In order to obtain a valid list please consult the
	// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
	Config *string `pulumi:"config"`
	// The descriptive name for this instance as it appears in UIs. Must be
	// unique per project and between 4 and 30 characters in length.
	DisplayName *string `pulumi:"displayName"`
	// When deleting a spanner instance, this boolean option will delete all backups of this instance.
	// This must be set to true if you created a backup manually in the console.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels map[string]string `pulumi:"labels"`
	// A unique identifier for the instance, which cannot be changed after
	// the instance is created. The name must be between 6 and 30 characters
	// in length.
	Name *string `pulumi:"name"`
	// The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
	// terraform.
	NumNodes *int `pulumi:"numNodes"`
	// The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
	// in terraform.
	ProcessingUnits *int `pulumi:"processingUnits"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Instance status: `CREATING` or `READY`.
	State *string `pulumi:"state"`
}

type InstanceState struct {
	// The name of the instance's configuration (similar but not
	// quite the same as a region) which defines the geographic placement and
	// replication of your databases in this instance. It determines where your data
	// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
	// In order to obtain a valid list please consult the
	// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
	Config pulumi.StringPtrInput
	// The descriptive name for this instance as it appears in UIs. Must be
	// unique per project and between 4 and 30 characters in length.
	DisplayName pulumi.StringPtrInput
	// When deleting a spanner instance, this boolean option will delete all backups of this instance.
	// This must be set to true if you created a backup manually in the console.
	ForceDestroy pulumi.BoolPtrInput
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels pulumi.StringMapInput
	// A unique identifier for the instance, which cannot be changed after
	// the instance is created. The name must be between 6 and 30 characters
	// in length.
	Name pulumi.StringPtrInput
	// The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
	// terraform.
	NumNodes pulumi.IntPtrInput
	// The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
	// in terraform.
	ProcessingUnits pulumi.IntPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Instance status: `CREATING` or `READY`.
	State pulumi.StringPtrInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// The name of the instance's configuration (similar but not
	// quite the same as a region) which defines the geographic placement and
	// replication of your databases in this instance. It determines where your data
	// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
	// In order to obtain a valid list please consult the
	// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
	Config string `pulumi:"config"`
	// The descriptive name for this instance as it appears in UIs. Must be
	// unique per project and between 4 and 30 characters in length.
	DisplayName string `pulumi:"displayName"`
	// When deleting a spanner instance, this boolean option will delete all backups of this instance.
	// This must be set to true if you created a backup manually in the console.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels map[string]string `pulumi:"labels"`
	// A unique identifier for the instance, which cannot be changed after
	// the instance is created. The name must be between 6 and 30 characters
	// in length.
	Name *string `pulumi:"name"`
	// The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
	// terraform.
	NumNodes *int `pulumi:"numNodes"`
	// The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
	// in terraform.
	ProcessingUnits *int `pulumi:"processingUnits"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// The name of the instance's configuration (similar but not
	// quite the same as a region) which defines the geographic placement and
	// replication of your databases in this instance. It determines where your data
	// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
	// In order to obtain a valid list please consult the
	// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
	Config pulumi.StringInput
	// The descriptive name for this instance as it appears in UIs. Must be
	// unique per project and between 4 and 30 characters in length.
	DisplayName pulumi.StringInput
	// When deleting a spanner instance, this boolean option will delete all backups of this instance.
	// This must be set to true if you created a backup manually in the console.
	ForceDestroy pulumi.BoolPtrInput
	// An object containing a list of "key": value pairs.
	// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
	Labels pulumi.StringMapInput
	// A unique identifier for the instance, which cannot be changed after
	// the instance is created. The name must be between 6 and 30 characters
	// in length.
	Name pulumi.StringPtrInput
	// The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
	// terraform.
	NumNodes pulumi.IntPtrInput
	// The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
	// in terraform.
	ProcessingUnits pulumi.IntPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//	InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//	InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

type InstanceOutput struct{ *pulumi.OutputState }

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

// The name of the instance's configuration (similar but not
// quite the same as a region) which defines the geographic placement and
// replication of your databases in this instance. It determines where your data
// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
// In order to obtain a valid list please consult the
// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
func (o InstanceOutput) Config() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Config }).(pulumi.StringOutput)
}

// The descriptive name for this instance as it appears in UIs. Must be
// unique per project and between 4 and 30 characters in length.
func (o InstanceOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// When deleting a spanner instance, this boolean option will delete all backups of this instance.
// This must be set to true if you created a backup manually in the console.
func (o InstanceOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// An object containing a list of "key": value pairs.
// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
func (o InstanceOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// A unique identifier for the instance, which cannot be changed after
// the instance is created. The name must be between 6 and 30 characters
// in length.
func (o InstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
// terraform.
func (o InstanceOutput) NumNodes() pulumi.IntOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntOutput { return v.NumNodes }).(pulumi.IntOutput)
}

// The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
// in terraform.
func (o InstanceOutput) ProcessingUnits() pulumi.IntOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntOutput { return v.ProcessingUnits }).(pulumi.IntOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o InstanceOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Instance status: `CREATING` or `READY`.
func (o InstanceOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].([]*Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].(map[string]*Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceInput)(nil)).Elem(), &Instance{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceArrayInput)(nil)).Elem(), InstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceMapInput)(nil)).Elem(), InstanceMap{})
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
