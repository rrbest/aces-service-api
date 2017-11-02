/*
 * Aces Service API
 * API Specification for Aces Services for blockchain interoperability. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Capacity;
import io.swagger.client.model.Feature;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Info
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T18:09:46.787-07:00")
public class Info {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("instructions")
  private String instructions = null;

  @SerializedName("capacities")
  private List<Capacity> capacities = null;

  @SerializedName("flatFee")
  private String flatFee = null;

  @SerializedName("contractSchema")
  private Object contractSchema = null;

  @SerializedName("features")
  private List<Feature> features = null;

  public Info name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the contract service.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the contract service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Info description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the contract service.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the contract service.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Info instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Service usage instructions in markdown format.
   * @return instructions
  **/
  @ApiModelProperty(value = "Service usage instructions in markdown format.")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public Info capacities(List<Capacity> capacities) {
    this.capacities = capacities;
    return this;
  }

  public Info addCapacitiesItem(Capacity capacitiesItem) {
    if (this.capacities == null) {
      this.capacities = new ArrayList<Capacity>();
    }
    this.capacities.add(capacitiesItem);
    return this;
  }

   /**
   * Get capacities
   * @return capacities
  **/
  @ApiModelProperty(value = "")
  public List<Capacity> getCapacities() {
    return capacities;
  }

  public void setCapacities(List<Capacity> capacities) {
    this.capacities = capacities;
  }

  public Info flatFee(String flatFee) {
    this.flatFee = flatFee;
    return this;
  }

   /**
   * Get flatFee
   * @return flatFee
  **/
  @ApiModelProperty(value = "")
  public String getFlatFee() {
    return flatFee;
  }

  public void setFlatFee(String flatFee) {
    this.flatFee = flatFee;
  }

  public Info contractSchema(Object contractSchema) {
    this.contractSchema = contractSchema;
    return this;
  }

   /**
   * Contract input schema in JSON Schema format.
   * @return contractSchema
  **/
  @ApiModelProperty(value = "Contract input schema in JSON Schema format.")
  public Object getContractSchema() {
    return contractSchema;
  }

  public void setContractSchema(Object contractSchema) {
    this.contractSchema = contractSchema;
  }

  public Info features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public Info addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<Feature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.name, info.name) &&
        Objects.equals(this.description, info.description) &&
        Objects.equals(this.instructions, info.instructions) &&
        Objects.equals(this.capacities, info.capacities) &&
        Objects.equals(this.flatFee, info.flatFee) &&
        Objects.equals(this.contractSchema, info.contractSchema) &&
        Objects.equals(this.features, info.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, instructions, capacities, flatFee, contractSchema, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    capacities: ").append(toIndentedString(capacities)).append("\n");
    sb.append("    flatFee: ").append(toIndentedString(flatFee)).append("\n");
    sb.append("    contractSchema: ").append(toIndentedString(contractSchema)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

