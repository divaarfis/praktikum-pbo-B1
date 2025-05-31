package program;

import model.Mahasiswa;
import service.MysqlMahasiswaService;

import java.sql.SQLException;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        MysqlMahasiswaService service = new MysqlMahasiswaService();
        try {
            // Tambah
            service.insert(new Mahasiswa(0, "Nina"));

            // Tampilkan
            List<Mahasiswa> list = service.getAll();
            for (Mahasiswa m : list) {
                System.out.println(m);
            }

            // Update Rudi jadi Agus
            Mahasiswa update = new Mahasiswa(2, "Agus");
            service.update(update);

            // Delete Beni (misal ID 3)
            service.delete(3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
