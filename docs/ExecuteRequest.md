

# ExecuteRequest

This extends from ExecuteRequestBase to add the preview_only option.  (1) Providers who allow side effects or (2) actions that do not have a side effect should use this class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instructions** | **String** | Plain english instructions. Provide as much detail as possible, even if other fields are present. |  |
|**previewOnly** | **Boolean** | If true, we will not execute the action, but will return the params of the preview. |  [optional] |



