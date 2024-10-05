package hospital;

public class Paciente extends InfoBasica {

    int diasHospitalizado;
    String diagnostico;
    String estado;
    int numRegistro;
    int talla;
    String tipoSangre;
    boolean vacunasComp;
    int nivelGlucosa;
    String diagDiabetes;
    int presionArterial;
    String diagPresion;
    boolean enfermCronicas;

    public Paciente() {
        setDiasHospitalizado(0);
        setDiagnostico("");
        setEstado("");
        setNumRegistro(0);
        setTalla(0);
        setTipoSangre("");
        setVacunasComp(false);
        setNivelGlucosa(0);
        setDiagDiabetes("");
        setPresionArterial(0);
        setDiagPresion("");
        setEnfermCronicas(false);
    }

    public Paciente(String nombre, String apellidoP, String apellidoM, String nacionalidad, int edad, String calle,
            String numCasa, String colonia, String ciudad, long numTelef, double peso, double estatura, double imc, 
            String diagImc, long nss, int diasHospitalizado, String diagnostico, String estado, int numRegistro,
            int talla, String tipoSangre,boolean vacunasComp, int nivelGlucosa, String diagDiabetes, int presionArterial,
            String diagPresion, boolean enfermCronicas) {
        
        super(nombre, apellidoP, apellidoM, nacionalidad, edad, calle, numCasa, colonia, ciudad, numTelef, peso, estatura, imc, diagImc, nss);
        setDiasHospitalizado(diasHospitalizado);
        setDiagnostico(diagnostico);
        setEstado(estado);
        setNumRegistro(numRegistro);
        setTalla(talla);
        setTipoSangre(tipoSangre);
        setVacunasComp(vacunasComp);
        setNivelGlucosa(nivelGlucosa);
        setDiagDiabetes(diagDiabetes);
        setPresionArterial(presionArterial);
        setDiagPresion(diagPresion);
        setEnfermCronicas(enfermCronicas);
    }

    public int getDiasHospitalizado() {
        return diasHospitalizado;
    }

    public void setDiasHospitalizado(int diasHospitalizado) {
        this.diasHospitalizado = diasHospitalizado;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public boolean isVacunasComp() {
        return vacunasComp;
    }

    public void setVacunasComp(boolean vacunasComp) {
        this.vacunasComp = vacunasComp;
    }

    public int getNivelGlucosa() {
        return nivelGlucosa;
    }

    public void setNivelGlucosa(int nivelGlucosa) {
        this.nivelGlucosa = nivelGlucosa;
    }

    public String getDiagDiabetes() {
        return diagDiabetes;
    }

    public void setDiagDiabetes(String diagDiabetes) {
        this.diagDiabetes = diagDiabetes;
    }

    public int getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(int presionArterial) {
        this.presionArterial = presionArterial;
    }

    public String getDiagPresion() {
        return diagPresion;
    }

    public void setDiagPresion(String diagPresion) {
        this.diagPresion = diagPresion;
    }

    public boolean isEnfermCronicas() {
        return enfermCronicas;
    }

    public void setEnfermCronicas(boolean enfermCronicas) {
        this.enfermCronicas = enfermCronicas;
    }

    public void diagnosticarGlucosa() {

    }

    public void diagnosticarPresion() {

    }

}
