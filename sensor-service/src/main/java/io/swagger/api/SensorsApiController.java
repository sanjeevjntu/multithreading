package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.model.Measurement;
import io.swagger.model.MeasurementSummary;
import io.swagger.model.Sensor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.
        bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.threeten.bp.OffsetDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-01T17:48:42.711Z[GMT]")
@Controller
public class SensorsApiController implements SensorsApi {

    private static final Logger log = LoggerFactory.getLogger(SensorsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SensorsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMeasurement(@ApiParam(value = "The measurement to store.", required = true)
                                               @Valid @RequestBody Measurement body,
                                               @ApiParam(value = "The ID of the sensor which is reporting the measurement.", required = true)
                                               @PathVariable("sensorId") String sensorId
    ) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Measurement>> getMeasurements(@ApiParam(value = "The ID of the sensor to which the measurement relates.", required = true) @PathVariable("sensorId") String sensorId, @ApiParam(value = "The timestamp for the beginning of the date range to get the measurements for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to 24 hours before the toDate parameter.") @Valid @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate, @ApiParam(value = "The timestamp for the end of the date range to get the measurements for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to now.") @Valid @RequestParam(value = "toDate", required = false) OffsetDateTime toDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Measurement>>(objectMapper.readValue("[ {\n  \"temperature\" : 21.44,\n  \"humidity\" : 65.32,\n  \"pressure\" : 1012.41,\n  \"timestamp\" : \"2019-09-30T12:41:07.894Z\"\n}, {\n  \"temperature\" : 21.44,\n  \"humidity\" : 65.32,\n  \"pressure\" : 1012.41,\n  \"timestamp\" : \"2019-09-30T12:41:07.894Z\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Measurement>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Measurement>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Sensor>> getSensors() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Sensor>>(objectMapper.readValue("[ {\n  \"alias\" : \"Attic\",\n  \"id\" : \"bme280-attic\"\n}, {\n  \"alias\" : \"Attic\",\n  \"id\" : \"bme280-attic\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Sensor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Sensor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MeasurementSummary> getSummaryMeasurements(@ApiParam(value = "The ID of the sensor to which the measurement summary relates.", required = true) @PathVariable("sensorId") String sensorId, @ApiParam(value = "The timestamp for the beginning of the date range to get the measurement summary for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to 24 hours before the toDate parameter.") @Valid @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate, @ApiParam(value = "The timestamp for the end of the date range to get the measurement summary for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to now.") @Valid @RequestParam(value = "toDate", required = false) OffsetDateTime toDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MeasurementSummary>(objectMapper.readValue("{\n  \"temperature\" : {\n    \"average\" : 21.44,\n    \"latest\" : { }\n  },\n  \"humidity\" : {\n    \"average\" : 65.32,\n    \"latest\" : {\n      \"timestamp\" : \"2019-09-30T12:41:07.894Z\"\n    }\n  },\n  \"pressure\" : {\n    \"average\" : 1012.41,\n    \"latest\" : { }\n  }\n}", MeasurementSummary.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MeasurementSummary>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MeasurementSummary>(HttpStatus.NOT_IMPLEMENTED);
    }

}
