package com.example.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;

@ConfigurationPropertiesBinding
public class LocalDateConverter implements Converter<String, LocalDate> {
  @Override
  public LocalDate convert(String source) {
      if(source==null){
          return null;
      }
      return LocalDate.parse(source, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
  }
}
