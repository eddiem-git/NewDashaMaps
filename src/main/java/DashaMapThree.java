public class DashaMapThree implements HashMapX {
    @Override
    public void set(String key, Integer value) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public String get(String key) {
        Node head = find(key);
        while(head != null){
            if(head.getKey().equals(key)){
                return head.getKey();
            }
            head = head.getNext();
        }
        return null;    }

    private Node find(String key) {
        return null;
    }

    @Override
    public Boolean isEmpty() {
        return null;
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Integer bucketSize(String key) {
        return null;
    }
}
