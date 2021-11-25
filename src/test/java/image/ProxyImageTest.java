package image;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage image;

    @BeforeEach
    void setUp() {
        image = new ProxyImage("oles.jpg");
    }

    @Test
    void display() {
        assertNull(image.getRealImage());
        image.display();
        assertNotNull(image.getRealImage());
    }
}