public class MultipleChannel implements Channel{

    MyChannel[] channels;
    int iloscKanalow;

    public MultipleChannel(int n, int id) throws Exception{
        this.iloscKanalow = n;
        this.channels = new MyChannel[n];
        id = id - 1;
        for(int i=0; i<n;i++){
            channels[i] = new MyChannel(id+1);
        }
    }
    
    public void send(Byte[] bytes) throws Exception {
        for(int i = 0; i <= bytes.length;i++){
            //za mocne jest te zadania
        }
        
    }

    
    public void receive(Byte[] bytes) throws Exception {
        // TODO Auto-generated method stub
        
    }
    
}
