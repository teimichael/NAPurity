package stu.napls.napurity;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encoder {
    @Test
    public void bCryptPasswordEncoding() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("ding");
        System.out.println(encode);
    }
}
