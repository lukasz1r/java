public interface Channel{
    
    void send(Byte bytes[])throws Exception;

    void receive(Byte bytes[])throws Exception;
}
