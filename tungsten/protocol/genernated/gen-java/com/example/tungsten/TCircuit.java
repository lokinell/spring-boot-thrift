/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.example.tungsten;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TCircuit implements org.apache.thrift.TEnum {
  PARALLEL(0),
  SERIES(1);

  private final int value;

  private TCircuit(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TCircuit findByValue(int value) { 
    switch (value) {
      case 0:
        return PARALLEL;
      case 1:
        return SERIES;
      default:
        return null;
    }
  }
}
