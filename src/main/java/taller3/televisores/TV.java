public class TV{

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marcaX, boolean estadoY){
        this.marca = marcaX;
        this.estado = estadoY;
        numTV++;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca(){
        return marca;
    }

    public void setCanal(int canal){
        if(estado == true && 1 <= canal && canal <= 120){
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
        if(estado == true && 0 <= volumen && volumen <= 7){
            this.volumen = volumen;
        }
    }

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
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return estado;
    }

    public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

    public static int getNumTV() {
		return numTV;
	}

    public void canalUp(){
        if(estado == true && canal < 120){
            canal++;
        }
    }

    public void canalDown(){
        if(estado == true && 1 < canal){
            canal--;
        }
    }

    public void volumeUp(){
        if(estado == true && volumen< 7){
            volumen++;
        }
    }

    public void volumeDown(){
        if(estado == true && 0 < volumen ){
            volumen--;
        }
    }
}