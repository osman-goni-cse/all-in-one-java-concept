package FileHandling.JavaNIO;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class CharsetTut {
    public static void main(String[] args) {
        System.out.println(" ******* Exploring Charset Encode/Decode Scheme");

        String data = "চল! চল! চল! ওই বাতাসের ধারায় একা চল। চলে যাই চলে যাই, বসন্তের আসের পথে,";
        
        System.out.println(data);

        Charset cs = Charset.forName("UTF-8");
        CharBuffer cb = CharBuffer.wrap("হ্যালো ওয়ার্ল্ড");
        ByteBuffer encodedData = cs.encode(cb);
        CharBuffer decodedData = cs.decode(encodedData);

        System.out.println(decodedData);
    }
}
