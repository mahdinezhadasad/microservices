package guru.springframework.sfgrestdocsexample.model;

import guru.springframework.sfgrestdocsexample.web.model.BeerDto;
import guru.springframework.sfgrestdocsexample.web.model.BeerStyleEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by jt on 2019-06-02.
 */
public class BaseTest {
    BeerDto getDto(){
        return  BeerDto.builder()
                .beerName("BeerName")
                .beerStyle(BeerStyleEnum.valueOf ("ALE"))
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate (OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .mylocalDate (LocalDate.now ())
                .upc(123123123123L)
                .build();
    }
}