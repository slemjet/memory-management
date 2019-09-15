import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
        Main main = new Main();
        main.start();
        assertThat(out.toString()).isEqualTo("AZB");
    }
}