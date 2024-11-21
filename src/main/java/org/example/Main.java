package org.example;

import java.io.*;
import java.util.Base64;

public class Main {

    public String serializeToString(byte[] arr) throws IOException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);

        objectStream.writeObject(arr);

        return Base64.getEncoder().encodeToString(byteStream.toByteArray());
    }

    public byte[] deserializeToArray(String str) {
        return Base64.getDecoder().decode(str);
    }
}