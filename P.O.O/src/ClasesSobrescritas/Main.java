package ClasesSobrescritas;
import java.util.Scanner;
public class Main {
    public static void main(String[]arg){
        Scanner leer = new Scanner(System.in);
        int op, opDo;
        do{
        System.out.println("Que clases deseas mostrar: "
        +"\n1.-Ser vivo\n2.-Metodos de transporte\n3.-Lima afladora\n4.-Grupo sanguineo\n5.-Tipos de transporte\n6.-Estatus de gama"
        +"\n7.-Tipos de comunicacion\n8.-Tamaños de raza canina\n9.-Clasificacion de las comidas\n10.-Tipos de puertas");
            op=leer.nextInt();
        switch(op){
            case 1:
                SerVivo  objSerVivo=new SerVivo();
                Carnivoro objCarnivoro=new Carnivoro();
                Herbivoro objHevivoro=new Herbivoro();
                Omnivoro objOmnivoro=new Omnivoro();
                //Referencia a la clase Padre
                SerVivo ref1;
                ref1 = objSerVivo;
                ref1.m1();
                //ref hace referencia al objeto de la clase A
                ref1 = objCarnivoro;
                ref1.m1();
                //Ahora ref hace referencia al objeto de la clase B
                ref1 = objHevivoro;
                ref1.m1();
                //Ahora ref hace referencia al objeto de la clase C
                ref1 = objOmnivoro;
                ref1.m1();
            break;
            case 2:
                Transporte  objTransporte=new Transporte();
                Terrestre objTerrestre=new Terrestre();
                Acuatico objAcuatico=new Acuatico();
                Aereo objAereo=new Aereo();
                //Referencia a la clase Padre
                Transporte ref2;
                ref2 = objTransporte;
                ref2.m2();
                //ref hace referencia al objeto de la clase A
                ref2 = objTerrestre;
                ref2.m2();
                //Ahora ref hace referencia al objeto de la clase B
                ref2 = objAcuatico;
                ref2.m2();
                //Ahora ref hace referencia al objeto de la clase C
                ref2 = objAereo;
                ref2.m2();
            break;
            case 3:
                LimaAfiladora  objLimaAfiladora=new LimaAfiladora();
                LimaTriangular objLimaTriangular=new LimaTriangular();
                LimaRedonda objLimaRedonda=new LimaRedonda();
                LimaPlana objLimaPlana=new LimaPlana();
                //Referencia a la clase Padre
                LimaAfiladora ref3;
                ref3 = objLimaAfiladora;
                ref3.m3();
                //ref hace referencia al objeto de la clase A
                ref3 = objLimaTriangular;
                ref3.m3();
                //Ahora ref hace referencia al objeto de la clase B
                ref3 = objLimaRedonda;
                ref3.m3();
                //Ahora ref hace referencia al objeto de la clase C
                ref3 = objLimaPlana;
                ref3.m3();
            break;
            case 4:
                GrupoSanguineo  objGrupoSanguineo=new GrupoSanguineo();
                GpoAPos objGpoAPos=new GpoAPos();
                GpoBPos objGpoBPos=new GpoBPos();
                GpoOPos objGpoOPos=new GpoOPos();
                //Referencia a la clase Padre
                GrupoSanguineo ref4;
                ref4 = objGrupoSanguineo;
                ref4.m4();
                //ref hace referencia al objeto de la clase A
                ref4 = objGpoAPos;
                ref4.m4();
                //Ahora ref hace referencia al objeto de la clase B
                ref4 = objGpoBPos;
                ref4.m4();
                //Ahora ref hace referencia al objeto de la clase C
                ref4 = objGpoOPos;
                ref4.m4();
            break;
            case 5:
                TiposTransporte  objTiposTransporte=new TiposTransporte();
                TranspPublico objTranspPublico=new TranspPublico();
                TranspFamiliar objTranspFamiliar=new TranspFamiliar();
                TranspPrivado objTranspPrivado=new TranspPrivado();
                //Referencia a la clase Padre
                TiposTransporte ref5;
                ref5 = objTiposTransporte;
                ref5.m5();
                //ref hace referencia al objeto de la clase A
                ref5 = objTranspPublico;
                ref5.m5();
                //Ahora ref hace referencia al objeto de la clase B
                ref5 = objTranspFamiliar;
                ref5.m5();
                //Ahora ref hace referencia al objeto de la clase C
                ref5 = objTranspPrivado;
                ref5.m5();
                
            break;
            case 6:
                EstatusDeGama objEstatusDeGama=new EstatusDeGama();
                GamaAlta objGamaAlta=new GamaAlta();
                GamaMedia objGamaMedia=new GamaMedia();
                GamaBaja objGamaBaja=new GamaBaja();
                //Referencia a la clase Padre
                EstatusDeGama ref6;
                ref6 = objEstatusDeGama;
                ref6.m6();
                //ref hace referencia al objeto de la clase A
                ref6 = objGamaAlta;
                ref6.m6();
                //Ahora ref hace referencia al objeto de la clase B
                ref6 = objGamaMedia;
                ref6.m6();
                //Ahora ref hace referencia al objeto de la clase C
                ref6 = objGamaBaja;
                ref6.m6();
            break;
            case 7:
                Comunicacion objComunicacion=new Comunicacion();
                ComEscrita objComEscrita=new ComEscrita();
                ComOral objComOral=new ComOral();
                ComCorporal objComCorporal=new ComCorporal();
                //Referencia a la clase Padre
                Comunicacion ref7;
                ref7 = objComunicacion;
                ref7.m7();
                //ref hace referencia al objeto de la clase A
                ref7 = objComEscrita;
                ref7.m7();
                //Ahora ref hace referencia al objeto de la clase B
                ref7 = objComOral;
                ref7.m7();
                //Ahora ref hace referencia al objeto de la clase C
                ref7 = objComCorporal;
                ref7.m7();
            break;
            case 8:
                TamañoRazaCanina objTamañoRazaCanina=new TamañoRazaCanina();
                RazaPequeña objRazaPequeña=new RazaPequeña();
                RazaMediana objRazaMediana=new RazaMediana();
                RazaGrande objRazaGrande=new RazaGrande();
                //Referencia a la clase Padre
                TamañoRazaCanina ref8;
                ref8 = objTamañoRazaCanina;
                ref8.m8();
                //ref hace referencia al objeto de la clase A
                ref8 = objRazaPequeña;
                ref8.m8();
                //Ahora ref hace referencia al objeto de la clase B
                ref8 = objRazaMediana;
                ref8.m8();
                //Ahora ref hace referencia al objeto de la clase C
                ref8 = objRazaGrande;
                ref8.m8();
            break;
            case 9:
                TipoComida objTipoComida=new TipoComida();
                ComRapida objComRapida=new ComRapida();
                ComSencilla objComSencilla=new ComSencilla();
                ComEnlatada objComEnlatada=new ComEnlatada();
                //Referencia a la clase Padre
                TipoComida ref9;
                ref9 = objTipoComida;
                ref9.m9();
                //ref hace referencia al objeto de la clase A
                ref9 = objComRapida;
                ref9.m9();
                //Ahora ref hace referencia al objeto de la clase B
                ref9 = objComSencilla;
                ref9.m9();
                //Ahora ref hace referencia al objeto de la clase C
                ref9 = objComEnlatada;
                ref9.m9();
            break;
            case 10:
                TipoPuerta objTipoPuerta=new TipoPuerta();
                PuertaMadera objPuertaMadera=new PuertaMadera();
                PuertaMetalica objPuertaMetalica=new PuertaMetalica();
                PuertaCristal objPuertaCristal=new PuertaCristal();
                //Referencia a la clase Padre
                TipoPuerta ref10;
                ref10 = objTipoPuerta;
                ref10.m10();
                //ref hace referencia al objeto de la clase A
                ref10 = objPuertaMadera;
                ref10.m10();
                //Ahora ref hace referencia al objeto de la clase B
                ref10 = objPuertaMetalica;
                ref10.m10();
                //Ahora ref hace referencia al objeto de la clase C
                ref10 = objPuertaCristal;
                ref10.m10();
            break;
        }
    System.out.println("\nDesea realizar otra operacion\n1.-Si\n2.-No");
      opDo = leer.nextInt();
     }while( opDo == 1 );
    System.out.println("Hasta pronto");
    }
}
