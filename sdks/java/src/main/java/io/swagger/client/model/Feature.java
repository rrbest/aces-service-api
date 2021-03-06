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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Feature
 */
@JsonAdapter(Feature.Adapter.class)
public enum Feature {
  
  ARKSMARTBRIDGEPAYABLE("arkSmartbridgePayable"),
  
  ARKRETURNABLE("arkReturnable");

  private String value;

  Feature(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Feature fromValue(String text) {
    for (Feature b : Feature.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Feature> {
    @Override
    public void write(final JsonWriter jsonWriter, final Feature enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Feature read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Feature.fromValue(String.valueOf(value));
    }
  }
}

