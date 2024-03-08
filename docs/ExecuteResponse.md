

# ExecuteResponse

This is a summary of the results given the action that was executed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the execution log. |  |
|**actionUsed** | **String** | The name of the action that was executed. |  |
|**inputParams** | **Object** | The params we used / will use to execute the action. |  |
|**reviewUrl** | **String** | The URL to run the action or review the AI choices the AI made for input_params given instructions. |  |
|**result** | **Object** | A trimmed down result of the first item of the full results. Ideal for humans and language models! |  [optional] |
|**additionalResults** | **List&lt;Object&gt;** | The rest of the full results. Always returns an array of objects |  |
|**resultFieldLabels** | **Object** | Human readable labels for some of the keys in the result. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the execution. |  [optional] |
|**error** | **String** | The error message if the execution failed. |  [optional] |
|**assistantHint** | **String** | A hint for the assistant on what to do next. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| ERROR | &quot;error&quot; |
| EMPTY | &quot;empty&quot; |
| PREVIEW | &quot;preview&quot; |



