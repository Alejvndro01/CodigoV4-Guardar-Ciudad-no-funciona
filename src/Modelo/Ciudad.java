package Modelo;

public class Ciudad {
    private int idCiudad;
    private String nombreCiudad;
    private int poblacionCiudad;
    private String codigoPais;
    private String distritoCiudad; 

    // Constructor por defecto
    public Ciudad() {
    }

    // Constructor con parámetros
    public Ciudad(int idCiudad, String nombreCiudad, int poblacionCiudad, String codigoPais, String distrito) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.poblacionCiudad = poblacionCiudad;
        this.codigoPais = codigoPais;
        this.distritoCiudad = distrito; 
    }

    // Getters y Setters
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getPoblacionCiudad() {
        return poblacionCiudad;
    }

    public void setPoblacionCiudad(int poblacionCiudad) {
        this.poblacionCiudad = poblacionCiudad;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDistrito() {
        return distritoCiudad; 
    }

    public void setDistrito(String distrito) {
        this.distritoCiudad = distrito; 
    }
}