
public class FileExc {
    
    File plik = new File();

    void open(String name) throws Exception{
        if(!plik.open(name)){
            throw new Exception();
        }  
    }

    void write(int value) throws Exception{
            if(!plik.write(value)){
                throw new Exception();
            }        
    }

    void close() throws Exception{
        if(!plik.close()){
            throw new Exception();
        }  
    }
}
