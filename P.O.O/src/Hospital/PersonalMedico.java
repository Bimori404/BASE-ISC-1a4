package hospital;

public class PersonalMedico extends InfoBasica {

    int id;
    String tipoPersonal;
    long cedula;
    String gradoEstudios;
    String especialidad;
    int sueldo;

    public PersonalMedico(String nombre, String apellidoP, String apellidoM, String nacionalidad, int edad, String calle,
            String numCasa, String colonia, String ciudad, long numTelef, double peso, double estatura, double imc,
            String diagImc, String clasifImc, long nss, int id, String tipoPersonal, long cedula, String gradoEstudios,
            String especialidad, int sueldo) {
        super(nombre, apellidoP, apellidoM, nacionalidad, edad, calle, numCasa, colonia, ciudad, numTelef, peso, estatura, imc, diagImc, nss);
        setId(id);
        setTipoPersonal(tipoPersonal);
        setCedula(cedula);
        setGradoEstudios(gradoEstudios);
        setEspecialidad(especialidad);
        setSueldo(sueldo);
    }

    public PersonalMedico() {
        setId(0);
        setTipoPersonal("");
        setCedula(0);
        setGradoEstudios("");
        setEspecialidad("");
        setSueldo(0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getGradoEstudios() {
        return gradoEstudios;
    }

    public void setGradoEstudios(String gradoEstudios) {
        this.gradoEstudios = gradoEstudios;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

}
