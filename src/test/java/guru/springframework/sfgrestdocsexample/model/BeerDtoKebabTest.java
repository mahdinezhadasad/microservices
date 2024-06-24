package guru.springframework.sfgrestdocsexample.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.sfgrestdocsexample.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
@ActiveProfiles("kebab")
public class BeerDtoKebabTest extends BaseTest {
    
    @Autowired
    ObjectMapper objectMapper;
    
    
    @Test
    void testKebab() throws JsonProcessingException {
    
        BeerDto dto = getDto();
        
        String json = objectMapper.writeValueAsString (dto);
    
        System.out.println (json);
        
    }
}