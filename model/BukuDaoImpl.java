import java.util.ArrayList;
import java.util.List;


public class BukuDaoImpl implements BukuDao {
     List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("123","Pascal","Ishabell","Mawar"));
        data.add(new Buku("1221","algoritma","Elmisa","Rahma"));
        data.add(new Buku("1342","basis data","Putri","Jaya"));
    }  

    public void save(Buku buku){
        data.add(buku);
    }
    public void update(int index,Buku buku){
        data.set(index, buku);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku>getAll(){
        return data;
    }
}
