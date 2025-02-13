// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Outputs
{

    [OutputType]
    public sealed class StreamDestinationConfigGcsDestinationConfigJsonFileFormat
    {
        /// <summary>
        /// Compression of the loaded JSON file.
        /// Possible values are `NO_COMPRESSION` and `GZIP`.
        /// </summary>
        public readonly string? Compression;
        /// <summary>
        /// The schema file format along JSON data files.
        /// Possible values are `NO_SCHEMA_FILE` and `AVRO_SCHEMA_FILE`.
        /// </summary>
        public readonly string? SchemaFileFormat;

        [OutputConstructor]
        private StreamDestinationConfigGcsDestinationConfigJsonFileFormat(
            string? compression,

            string? schemaFileFormat)
        {
            Compression = compression;
            SchemaFileFormat = schemaFileFormat;
        }
    }
}
