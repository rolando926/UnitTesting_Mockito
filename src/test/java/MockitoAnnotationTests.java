import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class MockitoAnnotationTests {
    @Mock
    MockitoMath mathObj;

    @Before
    public void initializeObjectsRules(){
        initMocks(this);
        //when(mathObj.add(2,4)).thenReturn(100);
        //when(mathObj.add(5,10)).thenReturn(200);
        when(mathObj.add(anyInt(),eq(5))).thenReturn(200);
    }

    @Test
    public void validateAdd(){
        Assert.assertEquals(200,mathObj.add(1111,5));
        //Assert.assertEquals(200,mathObj.add(5,10));
    }

}

