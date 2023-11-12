package br.com.mrb.staticwithparams;

import br.com.mrb.utils.MyUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;

public class MyUtilsTest {
    @Test
    void shouldMockStaticMethodWithParams() {
        try(MockedStatic<MyUtils> mockedStatic = mockStatic(MyUtils.class)){
            mockedStatic.when(
                    () -> MyUtils.getWelcomeMessage(
                            eq("Mauro"),
                            anyBoolean())).thenReturn("Howdy Mauro!");

            String result = MyUtils.getWelcomeMessage("Mauro", false);

            assertEquals("Howdy Mauro!", result);
        }
    }
}
