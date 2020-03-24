import ServiceClient.LotrBook;
import ServiceClient.LotrDao;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotrDaoTest {
    @Test
    public void testLotrApiJson() throws Exception {
        LotrDao dao = new LotrDao();
        List<LotrBook> books = dao.getLotrBooks();

        assertEquals("The Fellowship Of The Ring", books.get(0).getName());
        assertEquals("The Two Towers", books.get(1).getName());
        assertEquals("The Return Of The King", books.get(2).getName());
    }
}
