public static int getInteger(DataInputStream is) throws IOException {
    return is.readInt() & 0xFFFFFFFL; // mask with 32 one-bits
}