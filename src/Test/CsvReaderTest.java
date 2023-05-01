package Test;
import com.example.CsvReader;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class CsvReaderTest {
    @Test
    public void testReadCsv() {
        String csvFilePath = "data/foreign_names.csv";
        char separator = ';';

        CsvReader csvReader = new CsvReader();
        List<List<String>> peopleData = csvReader.readCsv(csvFilePath, separator);

        // Проверка наличия данных
        Assertions.assertFalse(peopleData.isEmpty(), "List should not be empty");

        // Проверка заголовков
        List<String> headers = peopleData.get(0);
        Assertions.assertEquals("id", headers.get(0), "Incorrect header at index 0");
        Assertions.assertEquals("name", headers.get(1), "Incorrect header at index 1");
        Assertions.assertEquals("gender", headers.get(2), "Incorrect header at index 2");
        Assertions.assertEquals("BirtDate", headers.get(3), "Incorrect header at index 3");
        Assertions.assertEquals("Division", headers.get(4), "Incorrect header at index 4");
        Assertions.assertEquals("Salary", headers.get(5), "Incorrect header at index 5");

        // Проверка данных
        Assertions.assertEquals("28281", peopleData.get(1).get(0), "Incorrect data at row 1, column 1");
        Assertions.assertEquals("Aahan", peopleData.get(1).get(1), "Incorrect data at row 1, column 2");
        Assertions.assertEquals("Male", peopleData.get(1).get(2), "Incorrect data at row 1, column 3");
        Assertions.assertEquals("15.05.1970", peopleData.get(1).get(3), "Incorrect data at row 1, column 4");
        Assertions.assertEquals("I", peopleData.get(1).get(4), "Incorrect data at row 1, column 5");
        Assertions.assertEquals("4800", peopleData.get(1).get(5), "Incorrect data at row 1, column 6");
    }
}
