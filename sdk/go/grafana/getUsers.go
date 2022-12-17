// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// * [Official documentation](https://grafana.com/docs/grafana/latest/administration/manage-users-and-permissions/manage-server-users/)
// * [HTTP API](https://grafana.com/docs/grafana/latest/http_api/user/)
//
// This data source uses Grafana's admin APIs for reading users which
// does not currently work with API Tokens. You must use basic auth.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-grafana/sdk/go/grafana"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := grafana.NewUser(ctx, "testAllUsers", &grafana.UserArgs{
//				Email:    pulumi.String("all_users@example.com"),
//				Login:    pulumi.String("test-grafana-users"),
//				Password: pulumi.String("my-password"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = grafana.GetUsers(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetUsers(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetUsersResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetUsersResult
	err := ctx.Invoke("grafana:index/getUsers:getUsers", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getUsers.
type GetUsersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Grafana instance's users.
	Users []GetUsersUser `pulumi:"users"`
}