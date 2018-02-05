package io.swagger.api;

import io.swagger.model.AvailablilityResponse;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class AvailablilityApiController implements AvailablilityApi {

    private static final Logger log = LoggerFactory.getLogger(AvailablilityApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AvailablilityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AvailablilityResponse> availablilityGet(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "merchantId", required = true) String merchantId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "serviceId", required = true) String serviceId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "startTime", required = true) String startTime) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                AvailablilityResponse result = new AvailablilityResponse();
                return new ResponseEntity<AvailablilityResponse>(objectMapper.readValue("{  \"availability\" : \"available\"}", AvailablilityResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AvailablilityResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AvailablilityResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
