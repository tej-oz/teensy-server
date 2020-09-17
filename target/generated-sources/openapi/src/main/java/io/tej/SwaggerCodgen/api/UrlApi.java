/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.tej.SwaggerCodgen.api;

import io.tej.SwaggerCodgen.model.UrlRequestDto;
import io.tej.SwaggerCodgen.model.UrlResponseDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-17T22:31:46.515415700+05:30[Asia/Calcutta]")

@Validated
@Api(value = "url", description = "the url API")
public interface UrlApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /url : Crate Tiny Url
     *
     * @param urlRequestDto Create Tiny Url (required)
     * @return Url Created (status code 200)
     */
    @ApiOperation(value = "Crate Tiny Url", nickname = "createTinyUrl", notes = "", response = UrlResponseDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Url Created", response = UrlResponseDto.class) })
    @RequestMapping(value = "/url",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<UrlResponseDto> _createTinyUrl(@ApiParam(value = "Create Tiny Url" ,required=true )  @Valid @RequestBody UrlRequestDto urlRequestDto) {
        return createTinyUrl(urlRequestDto);
    }

    // Override this method
    default  ResponseEntity<UrlResponseDto> createTinyUrl(UrlRequestDto urlRequestDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expirydate\" : \"expirydate\", \"shorturl\" : \"shorturl\", \"longurl\" : \"longurl\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /url/{shortUrl} : Get Long Url
     *
     * @param shortUrl Short Url (required)
     * @return Return Long Url (status code 200)
     */
    @ApiOperation(value = "Get Long Url", nickname = "getLongUrl", notes = "", response = UrlResponseDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Return Long Url", response = UrlResponseDto.class) })
    @RequestMapping(value = "/url/{shortUrl}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<UrlResponseDto> _getLongUrl(@ApiParam(value = "Short Url",required=true) @PathVariable("shortUrl") String shortUrl) {
        return getLongUrl(shortUrl);
    }

    // Override this method
    default  ResponseEntity<UrlResponseDto> getLongUrl(String shortUrl) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expirydate\" : \"expirydate\", \"shorturl\" : \"shorturl\", \"longurl\" : \"longurl\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
