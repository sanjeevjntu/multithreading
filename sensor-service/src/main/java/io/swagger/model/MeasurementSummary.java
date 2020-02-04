package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasurementSummaryHumidity;
import io.swagger.model.MeasurementSummaryPressure;
import io.swagger.model.MeasurementSummaryTemperature;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasurementSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-01T17:48:42.711Z[GMT]")
public class MeasurementSummary   {
  @JsonProperty("humidity")
  private MeasurementSummaryHumidity humidity = null;

  @JsonProperty("pressure")
  private MeasurementSummaryPressure pressure = null;

  @JsonProperty("temperature")
  private MeasurementSummaryTemperature temperature = null;

  public MeasurementSummary humidity(MeasurementSummaryHumidity humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * Get humidity
   * @return humidity
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementSummaryHumidity getHumidity() {
    return humidity;
  }

  public void setHumidity(MeasurementSummaryHumidity humidity) {
    this.humidity = humidity;
  }

  public MeasurementSummary pressure(MeasurementSummaryPressure pressure) {
    this.pressure = pressure;
    return this;
  }

  /**
   * Get pressure
   * @return pressure
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementSummaryPressure getPressure() {
    return pressure;
  }

  public void setPressure(MeasurementSummaryPressure pressure) {
    this.pressure = pressure;
  }

  public MeasurementSummary temperature(MeasurementSummaryTemperature temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementSummaryTemperature getTemperature() {
    return temperature;
  }

  public void setTemperature(MeasurementSummaryTemperature temperature) {
    this.temperature = temperature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementSummary measurementSummary = (MeasurementSummary) o;
    return Objects.equals(this.humidity, measurementSummary.humidity) &&
        Objects.equals(this.pressure, measurementSummary.pressure) &&
        Objects.equals(this.temperature, measurementSummary.temperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humidity, pressure, temperature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementSummary {\n");
    
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
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
