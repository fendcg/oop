public class Database {
    private java.util.Map<String, Object> storage;


    public Database() {
        this.storage = new java.util.HashMap<>();
    }



    public void create(String key, Object value) {
        storage.put(key, value);
    }

    public Object read(String key) {
        return storage.get(key);
    }

    public void update(String key, Object value) {
        storage.put(key, value);
    }

    public void delete(String key) {
        storage.remove(key);
    }

    public boolean exists(String key) {
        return storage.containsKey(key);
    }

    public int getSize() {
        return storage.size();
    }
}