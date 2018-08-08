package com.test.testapplication;

import com.test.testapplication.repository.dto.CountryDTO;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("countries")
@Getter
public class InformationProperties {
    private final List<CountryDTO> list = new ArrayList<>();
}
