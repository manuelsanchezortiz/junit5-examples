package net.petrikainulainen.junit5;

import org.junit.jupiter.api.Test;

class JUnit5ExampleTest4 {

    @Test
    void justAnExample() throws InterruptedException {

        Thread.currentThread().sleep(10000);
    }
}
