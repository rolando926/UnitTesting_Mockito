/**
 * Created by RXC8414 on 3/22/2017.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoStaticImportTests {
    MockitoMath mathObj;

    @Before
    public void initializeObjectsRules(){
        mathObj = mock(MockitoMath.class);
        when(mathObj.add(2,3)).thenReturn(100);
    }

    @Test
    public void validateAdd(){
        Assert.assertSame(100,mathObj.add(2,3));
    }
}
