
package manejodearchivos;

/**
 *
 * @author Gallego
 */
public class Persona {
    private String nombre;
    private String cedula;
    private int diaNacimiento;
    private String diaBinario;
    private String mesBinario;

    private int mesNacimiento;
    private short anoNacimiento;
    private String telefono; 

    public Persona(String nombre, String cedula, int diaNacimiento, int mesNacimiento, short anoNacimiento, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.telefono = telefono;
    }

    public Persona() {
    }
    
    

    public Persona(String nombre, String cedula, String diaBinario, String mesBinario, short anioNacimiento, String telefono) {
       this.nombre = nombre;
        this.cedula = cedula;
        this.diaBinario = diaBinario;
        this.mesBinario = mesBinario;
        this.anoNacimiento = anioNacimiento;
        this.telefono = telefono;
    }
    
    
    public String getDiaBinario() {
        return diaBinario;
    }

    public void setDiaBinario(String diaBinario) {
        this.diaBinario = diaBinario;
    }

    public String getMesBinario() {
        return mesBinario;
    }

    public void setMesBinario(String mesBinario) {
        this.mesBinario = mesBinario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public short getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(short anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
     @Override
    public String toString() {
        return nombre+"|"+cedula+"|"+diaNacimiento+"|"+mesNacimiento+"|"+anoNacimiento+"|"+telefono;
    }
}
