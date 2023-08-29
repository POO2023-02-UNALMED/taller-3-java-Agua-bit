public class Control{

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTV(){
        return tv;
    }

    public void setTV(TV tv){
        this.tv = tv;
    }

    public void turnOn(){
        tv.turnOn();
    }

    public void turnOff(){
        tv.turnOff();
    }

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumeUp(){
        tv.volumeUp();
    }

    public void volumeDown(){
        tv.volumeDown();
    }

    public void setVolume(int volume){
        if(estado == True && 0<= this.volume <= 7){
            this.volume = volume;
        }
    }


}