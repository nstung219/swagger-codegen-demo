# UserApi

All URIs are relative to *http://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserDetailsById**](UserApi.md#getUserDetailsById) | **GET** /user/{userId} | Find user by ID
[**saveUser**](UserApi.md#saveUser) | **POST** /user | Save user



## getUserDetailsById

> User getUserDetailsById(userId)

Find user by ID

Returns a single User

### Example

```java
// Import classes:
import com.ifi.codegen.server.api.ApiClient;
import com.ifi.codegen.server.api.ApiException;
import com.ifi.codegen.server.api.Configuration;
import com.ifi.codegen.server.api.models.*;
import com.ifi.codegen.server.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        Long userId = 56L; // Long | ID of User to return
        try {
            User result = apiInstance.getUserDetailsById(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserDetailsById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| ID of User to return |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid User ID supplied |  -  |
| **404** | User not found |  -  |


## saveUser

> User saveUser(user)

Save user

Save user and returns a single User

### Example

```java
// Import classes:
import com.ifi.codegen.server.api.ApiClient;
import com.ifi.codegen.server.api.ApiException;
import com.ifi.codegen.server.api.Configuration;
import com.ifi.codegen.server.api.models.*;
import com.ifi.codegen.server.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/v1");

        UserApi apiInstance = new UserApi(defaultClient);
        User user = new User(); // User | User
        try {
            User result = apiInstance.saveUser(user);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#saveUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| User | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid User supplied |  -  |
| **409** | User id not unique |  -  |

