package com.company;

public class Remote {

    TV telewizor = new TV();

    public void wlacztv(){
        if(telewizor.on == false){
            telewizor.on = true;
        }
        else{
            telewizor.on = false;
        }
    }
    public void kanal(int x){
       if((telewizor.isOn() == true)&&(telewizor.channel > 1)&&(telewizor.channel < 20)){
           if(x == 0){
               telewizor.channel -= 1;

           }
           else if (x == 1) {
               telewizor.channel += 1;
           }
       }
    }
    public void glosnosc(int x) {
        if((telewizor.isOn() == true)&&(telewizor.volume > 1)&&(telewizor.volume < 10)){
            if (x == 0) {
                telewizor.volume -= 1;

            } else if (x == 1) {
                telewizor.volume += 1;
            }
        }
    }
}
