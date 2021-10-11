package api;

import model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link UserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-11T17:38:32.686601800+07:00[Asia/Bangkok]")
public interface UserApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/{userId} : Find user by ID
     * Returns a single User
     *
     * @param userId ID of User to return (required)
     * @return successful operation (status code 200)
     *         or Invalid User ID supplied (status code 400)
     *         or User not found (status code 404)
     * @see UserApi#getUserDetailsById
     */
    default ResponseEntity<User> getUserDetailsById(Long userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /user : Save user
     * Save user and returns a single User
     *
     * @param user User (optional)
     * @return successful operation (status code 200)
     *         or Invalid User supplied (status code 400)
     *         or User id not unique (status code 409)
     * @see UserApi#saveUser
     */
    default ResponseEntity<User> saveUser(User user) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
