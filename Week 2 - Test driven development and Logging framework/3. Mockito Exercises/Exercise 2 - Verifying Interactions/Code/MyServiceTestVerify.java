package com.example.junit_basics;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class MyServiceTestVerify {

    @Test
    public void testVerifyGetDataCalled() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Assert
        verify(mockApi).getData();
        System.out.println("Verified");  
    }
}
