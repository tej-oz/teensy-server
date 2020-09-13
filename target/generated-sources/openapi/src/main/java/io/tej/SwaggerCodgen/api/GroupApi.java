/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.tej.SwaggerCodgen.api;

import io.tej.SwaggerCodgen.model.GenericResponse;
import io.tej.SwaggerCodgen.model.GroupDto;
import io.tej.SwaggerCodgen.model.GroupResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-13T23:25:30.030587700+05:30[Asia/Calcutta]")

@Validated
@Api(value = "group", description = "the group API")
public interface GroupApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /group : Crate New Group
     *
     * @param groupDto Create New Group (required)
     * @return New Group Response (status code 200)
     */
    @ApiOperation(value = "Crate New Group", nickname = "createGroup", notes = "", response = GroupResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "New Group Response", response = GroupResponse.class) })
    @RequestMapping(value = "/group",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<GroupResponse> _createGroup(@ApiParam(value = "Create New Group" ,required=true )  @Valid @RequestBody GroupDto groupDto) {
        return createGroup(groupDto);
    }

    // Override this method
    default  ResponseEntity<GroupResponse> createGroup(GroupDto groupDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /group : Delete selected card
     *
     * @param groupId Id of Group (required)
     * @return Delete Group (status code 200)
     */
    @ApiOperation(value = "Delete selected card", nickname = "deleteGroup", notes = "", response = GenericResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delete Group", response = GenericResponse.class) })
    @RequestMapping(value = "/group",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<GenericResponse> _deleteGroup(@NotNull @ApiParam(value = "Id of Group", required = true) @Valid @RequestParam(value = "groupId", required = true) Integer groupId) {
        return deleteGroup(groupId);
    }

    // Override this method
    default  ResponseEntity<GenericResponse> deleteGroup(Integer groupId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /group/all : Get all groups of user
     *
     * @return Get all Groups (status code 200)
     */
    @ApiOperation(value = "Get all groups of user", nickname = "getAllGroups", notes = "", response = GroupResponse.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get all Groups", response = GroupResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/group/all",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<GroupResponse>> _getAllGroups() {
        return getAllGroups();
    }

    // Override this method
    default  ResponseEntity<List<GroupResponse>> getAllGroups() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /group : Get all groups of user
     *
     * @return Get user cards (status code 200)
     */
    @ApiOperation(value = "Get all groups of user", nickname = "getUserGroups", notes = "", response = GroupResponse.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get user cards", response = GroupResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/group",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<GroupResponse>> _getUserGroups() {
        return getUserGroups();
    }

    // Override this method
    default  ResponseEntity<List<GroupResponse>> getUserGroups() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
