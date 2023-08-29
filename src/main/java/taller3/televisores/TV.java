public class TV{

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public string getMarca(){
        return marca;
    }

    public void setCanal(int canal){
        if(estado == True && 1 <= canal <= 120){
            this.canal = canal;
    }}

    public int getCanal(){
        return canal;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }

    public void setVolumen(int volumen){
        if(estado == True && 0 <= volumen <=7){
            this.volumen = volumen;
    }}

    public int getVolumen(){
        return volumen;
    }

    public void setControl(Control control){
        this.control = control;
    }

    public Control getControl(){
        return control;
    }

    public void turnOn(){
        this.estado = True;
    }

    public void turnOff(){
        this.estado = False;
    }

    public boolean getEstado(){
        return estado;
    }

    public void canalUp(){
        if(estado == True && 1 <= canal && canal < 120){
            canal++;
        }
    }

    public void canalDown(){
        if(estado == True && 1 < canal && canal <= 120){
            canal--;
        }
    }

    public void volumeUp(){
        if(estado == True && 0 <= volumen  && volumen< 7){
            volumen++;
        }
    }

    public void volumeDown(){
        if(estado == True && 0 < volumen <= 7){
            volumen--;
        }
    }
}