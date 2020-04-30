
package factoryMethod;

/**
 * @author Romao
 */

//Classe que servirá para encapsular a escolha da classe
public class ArmasFactory {
    
    //Opções das classes concretas
    public static final int AK47 = 1;
    public static final int M16 = 2;
    public static final int COLT = 3;
    public static final int DESERTEAGLE = 4;
    
    public Armas criarArma(int tipoArma){
        
        switch(tipoArma){
            case ArmasFactory.AK47:
                return new ArmaAK47();
            case ArmasFactory.M16:
                return new ArmaM16();
            case ArmasFactory.COLT:
                return new ArmaColt();
            case ArmasFactory.DESERTEAGLE:
                return new ArmaDesertEagle();
            default:
                throw new IllegalArgumentException("Arma não encontrada para fabricação.");
                    
        }
    }
    
}
