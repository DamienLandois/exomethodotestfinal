package com.example.demo;

import com.example.demo.controller.DemoMVCController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TestDemoMVCController {

    @Test
    void testDisplayMessage() {
        DemoMVCController controller = new DemoMVCController();
        String result = controller.displayMessage();
        assertThat(result).isEqualTo("Hello Ynov");
    }
}
