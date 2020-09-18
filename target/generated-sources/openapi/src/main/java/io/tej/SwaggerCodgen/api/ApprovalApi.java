/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.tej.SwaggerCodgen.api;

import io.tej.SwaggerCodgen.model.ApprovalDto;
import io.tej.SwaggerCodgen.model.GenericResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-18T09:30:42.801557+05:30[Asia/Calcutta]")

@Validated
@Api(value = "approval", description = "the approval API")
public interface ApprovalApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /approval : Send approval to group admins
     *
     * @param approvalDto Send approval to admin (optional)
     * @return Approval Message (status code 200)
     */
    @ApiOperation(value = "Send approval to group admins", nickname = "sendApproval", notes = "", response = GenericResponse.class, tags={ "group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Approval Message", response = GenericResponse.class) })
    @RequestMapping(value = "/approval",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<GenericResponse> _sendApproval(@ApiParam(value = "Send approval to admin"  )  @Valid @RequestBody(required = false) ApprovalDto approvalDto) {
        return sendApproval(approvalDto);
    }

    // Override this method
    default  ResponseEntity<GenericResponse> sendApproval(ApprovalDto approvalDto) {
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

}
