package objetos;

import java.util.ArrayList;

import  Excepciones.*;

public class Palabras{
    private Integer num;
    private Integer comprobar;

    public void add(Integer p) throws Nosirve{
        if(p==1){
        }else{
            throw new Nosirve("No");
        }
    }

    /**
     * @param comprobar the comprobar to set
     */
    public void setComprobar(Integer comprobar) {
        this.comprobar = comprobar;
    }
    /**
     * @return the comprobar
     */
    public Integer getComprobar() {
        return comprobar;
    }
    /**
     * @return the num
     */
    public Integer getNum() {
        return num;
    }
    /**
     * @param num the num to set
     */
    public void setNum(Integer num) {
        this.num = num;
    }

  
}