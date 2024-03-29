/*
 * Zapier AI Actions API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * This is a summary of the results given the action that was executed.
 */
@ApiModel(description = "This is a summary of the results given the action that was executed.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExecuteResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACTION_USED = "action_used";
  @SerializedName(SERIALIZED_NAME_ACTION_USED)
  private String actionUsed;

  public static final String SERIALIZED_NAME_INPUT_PARAMS = "input_params";
  @SerializedName(SERIALIZED_NAME_INPUT_PARAMS)
  private Object inputParams;

  public static final String SERIALIZED_NAME_REVIEW_URL = "review_url";
  @SerializedName(SERIALIZED_NAME_REVIEW_URL)
  private String reviewUrl;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result;

  public static final String SERIALIZED_NAME_ADDITIONAL_RESULTS = "additional_results";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_RESULTS)
  private List<Object> additionalResults = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULT_FIELD_LABELS = "result_field_labels";
  @SerializedName(SERIALIZED_NAME_RESULT_FIELD_LABELS)
  private Object resultFieldLabels;

  /**
   * The status of the execution.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    SUCCESS("success"),
    
    ERROR("error"),
    
    EMPTY("empty"),
    
    PREVIEW("preview");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.SUCCESS;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ASSISTANT_HINT = "assistant_hint";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_HINT)
  private String assistantHint;

  public ExecuteResponse() {
  }

  public ExecuteResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The id of the execution log.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the execution log.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ExecuteResponse actionUsed(String actionUsed) {
    
    
    
    
    this.actionUsed = actionUsed;
    return this;
  }

   /**
   * The name of the action that was executed.
   * @return actionUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the action that was executed.")

  public String getActionUsed() {
    return actionUsed;
  }


  public void setActionUsed(String actionUsed) {
    
    
    
    this.actionUsed = actionUsed;
  }


  public ExecuteResponse inputParams(Object inputParams) {
    
    
    
    
    this.inputParams = inputParams;
    return this;
  }

   /**
   * The params we used / will use to execute the action.
   * @return inputParams
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The params we used / will use to execute the action.")

  public Object getInputParams() {
    return inputParams;
  }


  public void setInputParams(Object inputParams) {
    
    
    
    this.inputParams = inputParams;
  }


  public ExecuteResponse reviewUrl(String reviewUrl) {
    
    
    
    
    this.reviewUrl = reviewUrl;
    return this;
  }

   /**
   * The URL to run the action or review the AI choices the AI made for input_params given instructions.
   * @return reviewUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL to run the action or review the AI choices the AI made for input_params given instructions.")

  public String getReviewUrl() {
    return reviewUrl;
  }


  public void setReviewUrl(String reviewUrl) {
    
    
    
    this.reviewUrl = reviewUrl;
  }


  public ExecuteResponse result(Object result) {
    
    
    
    
    this.result = result;
    return this;
  }

   /**
   * A trimmed down result of the first item of the full results. Ideal for humans and language models!
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A trimmed down result of the first item of the full results. Ideal for humans and language models!")

  public Object getResult() {
    return result;
  }


  public void setResult(Object result) {
    
    
    
    this.result = result;
  }


  public ExecuteResponse additionalResults(List<Object> additionalResults) {
    
    
    
    
    this.additionalResults = additionalResults;
    return this;
  }

  public ExecuteResponse addAdditionalResultsItem(Object additionalResultsItem) {
    this.additionalResults.add(additionalResultsItem);
    return this;
  }

   /**
   * The rest of the full results. Always returns an array of objects
   * @return additionalResults
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The rest of the full results. Always returns an array of objects")

  public List<Object> getAdditionalResults() {
    return additionalResults;
  }


  public void setAdditionalResults(List<Object> additionalResults) {
    
    
    
    this.additionalResults = additionalResults;
  }


  public ExecuteResponse resultFieldLabels(Object resultFieldLabels) {
    
    
    
    
    this.resultFieldLabels = resultFieldLabels;
    return this;
  }

   /**
   * Human readable labels for some of the keys in the result.
   * @return resultFieldLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human readable labels for some of the keys in the result.")

  public Object getResultFieldLabels() {
    return resultFieldLabels;
  }


  public void setResultFieldLabels(Object resultFieldLabels) {
    
    
    
    this.resultFieldLabels = resultFieldLabels;
  }


  public ExecuteResponse status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the execution.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "The status of the execution.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public ExecuteResponse error(String error) {
    
    
    
    
    this.error = error;
    return this;
  }

   /**
   * The error message if the execution failed.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error message if the execution failed.")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    
    
    
    this.error = error;
  }


  public ExecuteResponse assistantHint(String assistantHint) {
    
    
    
    
    this.assistantHint = assistantHint;
    return this;
  }

   /**
   * A hint for the assistant on what to do next.
   * @return assistantHint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A hint for the assistant on what to do next.")

  public String getAssistantHint() {
    return assistantHint;
  }


  public void setAssistantHint(String assistantHint) {
    
    
    
    this.assistantHint = assistantHint;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ExecuteResponse instance itself
   */
  public ExecuteResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteResponse executeResponse = (ExecuteResponse) o;
    return Objects.equals(this.id, executeResponse.id) &&
        Objects.equals(this.actionUsed, executeResponse.actionUsed) &&
        Objects.equals(this.inputParams, executeResponse.inputParams) &&
        Objects.equals(this.reviewUrl, executeResponse.reviewUrl) &&
        Objects.equals(this.result, executeResponse.result) &&
        Objects.equals(this.additionalResults, executeResponse.additionalResults) &&
        Objects.equals(this.resultFieldLabels, executeResponse.resultFieldLabels) &&
        Objects.equals(this.status, executeResponse.status) &&
        Objects.equals(this.error, executeResponse.error) &&
        Objects.equals(this.assistantHint, executeResponse.assistantHint)&&
        Objects.equals(this.additionalProperties, executeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionUsed, inputParams, reviewUrl, result, additionalResults, resultFieldLabels, status, error, assistantHint, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actionUsed: ").append(toIndentedString(actionUsed)).append("\n");
    sb.append("    inputParams: ").append(toIndentedString(inputParams)).append("\n");
    sb.append("    reviewUrl: ").append(toIndentedString(reviewUrl)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    additionalResults: ").append(toIndentedString(additionalResults)).append("\n");
    sb.append("    resultFieldLabels: ").append(toIndentedString(resultFieldLabels)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    assistantHint: ").append(toIndentedString(assistantHint)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("action_used");
    openapiFields.add("input_params");
    openapiFields.add("review_url");
    openapiFields.add("result");
    openapiFields.add("additional_results");
    openapiFields.add("result_field_labels");
    openapiFields.add("status");
    openapiFields.add("error");
    openapiFields.add("assistant_hint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("action_used");
    openapiRequiredFields.add("input_params");
    openapiRequiredFields.add("review_url");
    openapiRequiredFields.add("additional_results");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExecuteResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExecuteResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteResponse is not found in the empty JSON string", ExecuteResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExecuteResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("action_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_used").toString()));
      }
      if (!jsonObj.get("review_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_url").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("additional_results") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("additional_results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_results` to be an array in the JSON string but got `%s`", jsonObj.get("additional_results").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("assistant_hint") != null && !jsonObj.get("assistant_hint").isJsonNull()) && !jsonObj.get("assistant_hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_hint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteResponse>() {
           @Override
           public void write(JsonWriter out, ExecuteResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExecuteResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteResponse
  * @throws IOException if the JSON string is invalid with respect to ExecuteResponse
  */
  public static ExecuteResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteResponse.class);
  }

 /**
  * Convert an instance of ExecuteResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

