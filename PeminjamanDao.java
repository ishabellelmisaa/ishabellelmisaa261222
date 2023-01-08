public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int index, Peminjaman peminjaman);
    void delete (int index); 
    Peminjaman getPeminjaman(int index);
    List<Peminjaman>getAll();
}
