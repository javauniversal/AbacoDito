package abako.dito.co.sinmovil.Entities;


import java.util.List;

public class EntMenu {

    public String imageView;
    public String modulo;
    public String descripcion;
    public String presio;
    public String usuario;

    public EntMenu(String imageView, String modulo, String descripcion, String presio, String usuario) {
        this.imageView = imageView;
        this.modulo = modulo;
        this.descripcion = descripcion;
        this.presio = presio;
        this.usuario = usuario;
    }

    public static List<EntMenu> entMenuStatic;

    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresio() {
        return presio;
    }

    public void setPresio(String presio) {
        this.presio = presio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static List<EntMenu> getEntMenuStatic() {
        return entMenuStatic;
    }

    public static void setEntMenuStatic(List<EntMenu> entMenuStatic) {
        EntMenu.entMenuStatic = entMenuStatic;
    }

}
