import org.testng.annotations.Test;

public class registrarUsuario {

    @Test
    public void CingresaWeb(){
        System.out.println("ingresaWeb PASO1");
    }
    @Test(dependsOnMethods = {"CingresaWeb"})
    public void AingresarARegistrarNuevoUsuario(){
        System.out.println("ingresarARegistrarNuevoUsuario PASO2");

    }
    @Test(dependsOnMethods = {"AingresarARegistrarNuevoUsuario"})
    public void DllenarFormularioDeNuevoUsuario(){
        System.out.println("llenarFormularioDeNuevoUsuario PASO3");
    }
    @Test(dependsOnMethods = {"DllenarFormularioDeNuevoUsuario", "AingresarARegistrarNuevoUsuario"})
    public void BrecibeCorreoDeExito(){
        System.out.println("recibeCorreoDeExito PASO4");
    }
}
