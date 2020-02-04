package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasurementTypeTemperatureWithTimestamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasurementSummaryTemperature
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-01T17:48:42.711Z[GMT]")
public class MeasurementSummaryTemperature   {
  @JsonProperty("average")
  private Double average = null;

  @JsonProperty("latest")
  private MeasurementTypeTemperatureWithTimestamp latest = null;

  @JsonProperty("minimum")
  private MeasurementTypeTemperatureWithTimestamp minimum = null;

  @JsonProperty("maximum")
  private MeasurementTypeTemperatureWithTimestamp maximum = null;

  public MeasurementSummaryTemperature average(Double average) {
    this.average = average;
    return this;
  }

  /**
   * Get average
   * @return average
  **/
  @ApiModelProperty(value = "")
  
    public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }

  public MeasurementSummaryTemperature latest(MeasurementTypeTemperatureWithTimestamp latest) {
    this.latest = latest;
    return this;
  }

  /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementTypeTemperatureWithTimestamp getLatest() {
    return latest;
  }

  public void setLatest(MeasurementTypeTemperatureWithTimestamp latest) {
    this.latest = latest;
  }

  public MeasurementSummaryTemperature minimum(MeasurementTypeTemperatureWithTimestamp minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementTypeTemperatureWithTimestamp getMinimum() {
    return minimum;
  }

  public void setMinimum(MeasurementTypeTemperatureWithTimestamp minimum) {
    this.minimum = minimum;
  }

  public MeasurementSummaryTemperature maximum(MeasurementTypeTemperatureWithTimestamp maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementTypeTemperatureWithTimestamp getMaximum() {
    return maximum;
  }

  public void setMaximum(MeasurementTypeTemperatureWithTimestamp maximum) {
    this.maximum = maximum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementSummaryTemperature measurementSummaryTemperature = (MeasurementSummaryTemperature) o;
    return Objects.equals(this.average, measurementSummaryTemperature.average) &&
        Objects.equals(this.latest, measurementSummaryTemperature.latest) &&
        Objects.equals(this.minimum, measurementSummaryTemperature.minimum) &&
        Objects.equals(this.maximum, measurementSummaryTemperature.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, latest, minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementSummaryTemperature {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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
