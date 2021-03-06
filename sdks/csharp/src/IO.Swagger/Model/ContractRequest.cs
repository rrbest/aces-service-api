/* 
 * Aces Service API
 *
 * API Specification for Aces Services for blockchain interoperability. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// ContractRequest
    /// </summary>
    [DataContract]
    public partial class ContractRequest :  IEquatable<ContractRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContractRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ContractRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ContractRequest" /> class.
        /// </summary>
        /// <param name="CorrelationId">Requestor generated globally unique identifier for correleating requests. (required).</param>
        /// <param name="Arguments">Arguments.</param>
        public ContractRequest(string CorrelationId = default(string), List<Argument> Arguments = default(List<Argument>))
        {
            // to ensure "CorrelationId" is required (not null)
            if (CorrelationId == null)
            {
                throw new InvalidDataException("CorrelationId is a required property for ContractRequest and cannot be null");
            }
            else
            {
                this.CorrelationId = CorrelationId;
            }
            this.Arguments = Arguments;
        }
        
        /// <summary>
        /// Requestor generated globally unique identifier for correleating requests.
        /// </summary>
        /// <value>Requestor generated globally unique identifier for correleating requests.</value>
        [DataMember(Name="correlationId", EmitDefaultValue=false)]
        public string CorrelationId { get; set; }

        /// <summary>
        /// Gets or Sets Arguments
        /// </summary>
        [DataMember(Name="arguments", EmitDefaultValue=false)]
        public List<Argument> Arguments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContractRequest {\n");
            sb.Append("  CorrelationId: ").Append(CorrelationId).Append("\n");
            sb.Append("  Arguments: ").Append(Arguments).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ContractRequest);
        }

        /// <summary>
        /// Returns true if ContractRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of ContractRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContractRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CorrelationId == input.CorrelationId ||
                    (this.CorrelationId != null &&
                    this.CorrelationId.Equals(input.CorrelationId))
                ) && 
                (
                    this.Arguments == input.Arguments ||
                    this.Arguments != null &&
                    this.Arguments.SequenceEqual(input.Arguments)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.CorrelationId != null)
                    hashCode = hashCode * 59 + this.CorrelationId.GetHashCode();
                if (this.Arguments != null)
                    hashCode = hashCode * 59 + this.Arguments.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
