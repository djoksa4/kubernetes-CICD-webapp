package org.cloudifysource.examples;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Files;
import static org.junit.jupiter.api.Assertions.*;

class IndexJspTest {

    @Test
    void testIndexJspStructure() throws Exception {
        File file = new File("src/main/webapp/index.jsp");
        String content = new String(Files.readAllBytes(file.toPath()));
        
        assertTrue(content.contains("<h2>"), "JSP should contain an opening h2 tag");
        assertTrue(content.contains("</h2>"), "JSP should contain a closing h2 tag");
    }
}