import javax.print.attribute.standard.Sides;

public class BufferFile extends File{
    Byte[] bufferZapisu;
    Byte[] bufferOdczytu;
    int rozmiar;
    int kontrolka=0;
    int kontrolkaOdczytu = 0;

    public BufferFile(String name, int rozmiar) throws Exception{
        super(name);
        this.rozmiar = rozmiar;
        this.bufferOdczytu = new Byte[rozmiar];
        this.bufferZapisu = new Byte[rozmiar];
    }

    public void write(Byte b) throws Exception{

        if(kontrolka>= rozmiar){
            for(int i =0; i<rozmiar; i++){
                super.write(bufferZapisu[i]);
            }        
            bufferZapisu[0] = b;
            kontrolka = 1;
        }
        else{
            bufferZapisu[kontrolka] = b;
            this.kontrolka++;
        }
    }

    public Byte read() throws Exception{

        if(kontrolkaOdczytu==rozmiar){
            for(int i=0;i<rozmiar;i++){
                super.read(); 
            }
            kontrolkaOdczytu = 0;
        }
        else{
            
            return bufferOdczytu[kontrolkaOdczytu++];
        }

        return 0;
    }

}
