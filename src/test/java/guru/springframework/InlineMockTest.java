package guru.springframework;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;


@Tag("inline")
public class InlineMockTest {

    @Test
    void testInlineMock(){
        Map mapMock=  mock(Map.class);

        assertEquals(mapMock.size() ,0);
    }


}
