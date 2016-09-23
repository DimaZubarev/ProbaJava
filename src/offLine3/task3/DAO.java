package offLine3.task3;


public interface DAO {
    Object save(Object object);
    Object update(Object object);
    boolean delete(Object object);
    Object find(long id);



}
