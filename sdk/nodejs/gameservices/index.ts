// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GameServerClusterArgs, GameServerClusterState } from "./gameServerCluster";
export type GameServerCluster = import("./gameServerCluster").GameServerCluster;
export const GameServerCluster: typeof import("./gameServerCluster").GameServerCluster = null as any;
utilities.lazyLoad(exports, ["GameServerCluster"], () => require("./gameServerCluster"));

export { GameServerConfigArgs, GameServerConfigState } from "./gameServerConfig";
export type GameServerConfig = import("./gameServerConfig").GameServerConfig;
export const GameServerConfig: typeof import("./gameServerConfig").GameServerConfig = null as any;
utilities.lazyLoad(exports, ["GameServerConfig"], () => require("./gameServerConfig"));

export { GameServerDeploymentArgs, GameServerDeploymentState } from "./gameServerDeployment";
export type GameServerDeployment = import("./gameServerDeployment").GameServerDeployment;
export const GameServerDeployment: typeof import("./gameServerDeployment").GameServerDeployment = null as any;
utilities.lazyLoad(exports, ["GameServerDeployment"], () => require("./gameServerDeployment"));

export { GameServerDeploymentRolloutArgs, GameServerDeploymentRolloutState } from "./gameServerDeploymentRollout";
export type GameServerDeploymentRollout = import("./gameServerDeploymentRollout").GameServerDeploymentRollout;
export const GameServerDeploymentRollout: typeof import("./gameServerDeploymentRollout").GameServerDeploymentRollout = null as any;
utilities.lazyLoad(exports, ["GameServerDeploymentRollout"], () => require("./gameServerDeploymentRollout"));

export { GetGameServerDeploymentRolloutArgs, GetGameServerDeploymentRolloutResult, GetGameServerDeploymentRolloutOutputArgs } from "./getGameServerDeploymentRollout";
export const getGameServerDeploymentRollout: typeof import("./getGameServerDeploymentRollout").getGameServerDeploymentRollout = null as any;
export const getGameServerDeploymentRolloutOutput: typeof import("./getGameServerDeploymentRollout").getGameServerDeploymentRolloutOutput = null as any;
utilities.lazyLoad(exports, ["getGameServerDeploymentRollout","getGameServerDeploymentRolloutOutput"], () => require("./getGameServerDeploymentRollout"));

export { RealmArgs, RealmState } from "./realm";
export type Realm = import("./realm").Realm;
export const Realm: typeof import("./realm").Realm = null as any;
utilities.lazyLoad(exports, ["Realm"], () => require("./realm"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:gameservices/gameServerCluster:GameServerCluster":
                return new GameServerCluster(name, <any>undefined, { urn })
            case "gcp:gameservices/gameServerConfig:GameServerConfig":
                return new GameServerConfig(name, <any>undefined, { urn })
            case "gcp:gameservices/gameServerDeployment:GameServerDeployment":
                return new GameServerDeployment(name, <any>undefined, { urn })
            case "gcp:gameservices/gameServerDeploymentRollout:GameServerDeploymentRollout":
                return new GameServerDeploymentRollout(name, <any>undefined, { urn })
            case "gcp:gameservices/realm:Realm":
                return new Realm(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "gameservices/gameServerCluster", _module)
pulumi.runtime.registerResourceModule("gcp", "gameservices/gameServerConfig", _module)
pulumi.runtime.registerResourceModule("gcp", "gameservices/gameServerDeployment", _module)
pulumi.runtime.registerResourceModule("gcp", "gameservices/gameServerDeploymentRollout", _module)
pulumi.runtime.registerResourceModule("gcp", "gameservices/realm", _module)
