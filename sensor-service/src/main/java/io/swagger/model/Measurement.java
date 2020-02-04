package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Measurement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-01T17:48:42.711Z[GMT]")
public class Measurement   {
  @JsonProperty("humidity")
  private Double humidity = null;

  @JsonProperty("pressure")
  private Double pressure = null;

  @JsonProperty("temperature")
  private Double temperature = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public Measurement humidity(Double humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * Get humidity
   * @return humidity
  **/
  @ApiModelProperty(value = "")
  
    public Double getHumidity() {
    return humidity;
  }

  public void setHumidity(Double humidity) {
    this.humidity = humidity;
  }

  public Measurement pressure(Double pressure) {
    this.pressure = pressure;
    return this;
  }

  /**
   * Get pressure
   * @return pressure
  **/
  @ApiModelProperty(value = "")
  
    public Double getPressure() {
    return pressure;
  }

  public void setPressure(Double pressure) {
    this.pressure = pressure;
  }

  public Measurement temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  **/
  @ApiModelProperty(value = "")
  
    public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public Measurement timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measurement measurement = (Measurement) o;
    return Objects.equals(this.humidity, measurement.humidity) &&
        Objects.equals(this.pressure, measurement.pressure) &&
        Objects.equals(this.temperature, measurement.temperature) &&
        Objects.equals(this.timestamp, measurement.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humidity, pressure, temperature, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
