package demo.myObject;

public class RedisCounter {
    private String ipAddress;
    private String  port;
    public RedisCounter(String ipAddress, String port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    @Override
    public String toString() {
        return "RedisCounter{" +
                "ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                '}';
    }
}