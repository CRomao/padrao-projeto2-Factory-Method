package factoryMethod;

/**
 *
 * @author Romao
 */
public class App {

    public static void main(String[] args) {
        
        ArmasFactory factory = new ArmasFactory();
        
        Armas desertEagle = factory.criarArma(ArmasFactory.DESERTEAGLE);
        Armas m16 = factory.criarArma(ArmasFactory.M16);
        Armas colt = factory.criarArma(ArmasFactory.COLT);
        Armas ak47 = factory.criarArma(ArmasFactory.AK47);
        
        ak47.informacoes();
        m16.informacoes();
        colt.informacoes();
        desertEagle.informacoes();
    }
    
}
