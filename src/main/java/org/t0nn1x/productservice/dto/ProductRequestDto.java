package org.t0nn1x.productservice.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto implements Serializable {

  private String name;
  private String description;
  private BigDecimal price;
}