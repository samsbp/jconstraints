/*
 * Copyright (C) 2015, United States Government, as represented by the 
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * The PSYCO: A Predicate-based Symbolic Compositional Reasoning environment 
 * platform is licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. You may obtain a 
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software distributed 
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 */

package gov.nasa.jpf.constraints.types;

import java.math.BigDecimal;

public abstract class ConcreteNumericType<T> extends ConcreteType<T> implements NumericType<T> {

  private final boolean signed;
  private final BigDecimal min;
  private final BigDecimal max;
  
  public ConcreteNumericType(String name, Class<T> canonicalClass,
      T defaultValue, boolean signed, BigDecimal min, BigDecimal max, Type<?> superType, String[] otherNames,
      Class<?> ...otherClasses) {
    super(name, canonicalClass, defaultValue, superType, otherNames, otherClasses);
    this.signed = signed;
    this.min = min;
    this.max = max;
  }


  @Override
  public boolean isSigned() {
    return signed;
  }


  @Override
  public BigDecimal getMin() {
    return min;
  }

  @Override
  public BigDecimal getMax() {
    return max;
  }

  @Override
  public String toPlainString(T value) {
    return value.toString();
  }
}
