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
import java.io.IOException;

/**
 * Argument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T18:09:46.787-07:00")
public class Argument {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private Object value = null;

  public Argument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Argument name matching a parameter in service contract schema.
   * @return name
  **/
  @ApiModelProperty(value = "Argument name matching a parameter in service contract schema.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Argument value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Arugment value.
   * @return value
  **/
  @ApiModelProperty(value = "Arugment value.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Argument argument = (Argument) o;
    return Objects.equals(this.name, argument.name) &&
        Objects.equals(this.value, argument.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Argument {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
