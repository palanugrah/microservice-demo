package playground;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

public class TestJasypt {
    public static void main(String[] args) {
        StandardPBEStringEncryptor standardPBESStringEncryptor = new StandardPBEStringEncryptor();
        standardPBESStringEncryptor.setPassword("Demo_Pwd!2020");
        standardPBESStringEncryptor.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        standardPBESStringEncryptor.setIvGenerator(new RandomIvGenerator());
        String result = standardPBESStringEncryptor.encrypt("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");
        System.out.println(result);
        System.out.println(standardPBESStringEncryptor.decrypt(result));
    }

}
