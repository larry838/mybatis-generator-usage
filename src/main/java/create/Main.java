package create;
import org.mybatis.generator.api.ShellRunner;
public class Main extends ShellRunner{

    /** 
     * @param args
     */
    public static void main(String[] args) {
        String[]arg={"-configfile","src/main/resource/generatorConfig.xml","-overwrite"};
        
          ShellRunner.main(arg);
        
    }

}
