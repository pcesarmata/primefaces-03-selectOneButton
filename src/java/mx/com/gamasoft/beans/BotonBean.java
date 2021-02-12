package mx.com.gamasoft.beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cesar
 */
@ManagedBean(name="botonBean")
public class BotonBean {
    
    private String opcion;

    public String getOpcion() {
        System.out.println("La opción elegida es: " + opcion);
        return opcion;
    }

    public void setOpcion(String opcion) {
        System.out.println("La opción setteada es: " + opcion);
        this.opcion = opcion;
    }
    
}